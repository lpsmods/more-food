package dev.lpsmods.morefood.block;

import dev.lpsmods.morefood.block.entity.SmallPaleBlockEntity;
import dev.lpsmods.morefood.core.ModItemTags;
import com.mojang.serialization.MapCodec;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.pathing.NavigationType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.IntProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.ItemScatterer;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;
import net.minecraft.world.event.GameEvent;
import org.jetbrains.annotations.Nullable;

public class SmallPaleBlock extends BlockWithEntity implements Waterloggable {
    public static final MapCodec<SmallPaleBlock> CODEC = createCodec(SmallPaleBlock::new);
    public static IntProperty LEVEL = IntProperty.of("level", 0, 3);
    public static BooleanProperty WATERLOGGED = Properties.WATERLOGGED;
    public static DirectionProperty FACING = Properties.HORIZONTAL_FACING;
    private static final VoxelShape BOUNDING_SHAPE = Block.createCuboidShape(1,0,1,15,9,15);

    public SmallPaleBlock(Settings settings) {
        super(settings);
        this.setDefaultState((BlockState)((BlockState)((BlockState)((BlockState)this.stateManager.getDefaultState()).with(LEVEL, 0)).with(FACING, Direction.SOUTH)).with(WATERLOGGED, false));
    }

    @Override
    protected MapCodec<? extends BlockWithEntity> getCodec() {
        return CODEC;
    }

    // BLOCKENTITY
    @Override
    public BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.MODEL;
    }

    // WATERLOGGED
    @Override
    public FluidState getFluidState(BlockState state) {
        if (state.get(WATERLOGGED).booleanValue()) {
            return Fluids.WATER.getStill(false);
        }
        return super.getFluidState(state);
    }

    @Override
    public boolean tryFillWithFluid(WorldAccess world, BlockPos pos, BlockState state, FluidState fluidState) {
        if (state.get(WATERLOGGED).booleanValue() || fluidState.getFluid() != Fluids.WATER) {
            return false;
        }
        BlockState blockState = (BlockState)state.with(WATERLOGGED, true);
        world.setBlockState(pos, blockState, Block.NOTIFY_ALL);
        world.scheduleFluidTick(pos, fluidState.getFluid(), fluidState.getFluid().getTickRate(world));
        return true;
    }

    // Pale
    @Override
    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        Direction direction = state.get(FACING);
        BlockPos blockPos = pos.down();
        BlockState blockState = world.getBlockState(blockPos);
        return blockState.isSolidBlock(world, blockPos);
    }

    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        if (!state.canPlaceAt(world, pos)) {
            return Blocks.AIR.getDefaultState();
        }
        return state;
    }

    @Override
    public void onStateReplaced(BlockState state, World world, BlockPos pos, BlockState newState, boolean moved) {
        if (state.isOf(newState.getBlock())) {
            return;
        }
        BlockEntity blockEntity = world.getBlockEntity(pos);
        if (blockEntity instanceof Inventory) {
            ItemScatterer.spawn(world, pos, (Inventory)((Object)blockEntity));
            world.updateComparators(pos, this);
        }
        super.onStateReplaced(state, world, pos, newState, moved);
    }

    public boolean addStack(SmallPaleBlockEntity blockEntity, ItemStack stack) {
        for (int i = 0; i < blockEntity.size(); i++) {
            ItemStack blockEntityStack = blockEntity.getStack(i);
            if (blockEntityStack.getItem() == stack.getItem() && blockEntityStack.getCount() < blockEntityStack.getMaxCount()) {
                blockEntityStack.increment(1);
                return true;
            }

            if (blockEntityStack.isEmpty()) {
                blockEntity.setStack(i, stack.copyWithCount(1));
                return true;
            }
        }
        return false;
    }

    public void onPlaced(World world, BlockPos pos, BlockState state, LivingEntity placer, ItemStack itemStack) {
        if (itemStack.hasCustomName()) {
            BlockEntity blockEntity = world.getBlockEntity(pos);
            if (blockEntity instanceof SmallPaleBlockEntity) {
                ((SmallPaleBlockEntity)blockEntity).setCustomName(itemStack.getName());
            }
        }

    }

    // COMMON

    @Override
    public boolean canPathfindThrough(BlockState state, BlockView world, BlockPos pos, NavigationType type) {
        return false;
    }

    public int getLevel(SmallPaleBlockEntity blockEntity) {
        int totalCount = 0;
        int count = 0;
        for (int i = 0; i < blockEntity.size(); i++) {
            ItemStack stack = blockEntity.getStack(i);
            if (!stack.isEmpty()) {
                count += stack.getCount();
                totalCount += stack.getMaxCount();
            } else {
                totalCount += 64;
            }
        }
        int res = (count * 100 / totalCount) * blockEntity.size() / 100;
        return Math.round((float)res);
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (world.isClient) {return ActionResult.PASS;}
        ItemStack stack = player.getStackInHand(hand);
        if (stack.isIn(ModItemTags.CANDY)) {
            SmallPaleBlockEntity blockEntity = (SmallPaleBlockEntity) world.getBlockEntity(pos);
            if (blockEntity != null) {
                if (this.addStack(blockEntity, stack)) {
                    stack.decrement(1);
                    int level = this.getLevel(blockEntity);
                    BlockState blockState = state.with(LEVEL, level);
                    world.setBlockState(pos, blockState, Block.NOTIFY_LISTENERS);
                    world.emitGameEvent(GameEvent.BLOCK_CHANGE, pos, GameEvent.Emitter.of(blockState));
                    return ActionResult.SUCCESS;
                }
            }
        }
        return super.onUse(state, world, pos, player, hand, hit);
    }

    @Override
    @Nullable
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        Direction[] directions;
        BlockState blockState = this.getDefaultState();
        World worldView = ctx.getWorld();
        BlockPos blockPos = ctx.getBlockPos();
        for (Direction direction : directions = ctx.getPlacementDirections()) {
            Direction direction2;
            if (!direction.getAxis().isHorizontal() || !(blockState = (BlockState)blockState.with(FACING, direction2 = direction.getOpposite())).canPlaceAt(worldView, blockPos)) continue;
            return blockState;
        }
        return null;
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return BOUNDING_SHAPE;
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING, WATERLOGGED, LEVEL);
    }

    @Nullable
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new SmallPaleBlockEntity(pos, state);
    }
}
