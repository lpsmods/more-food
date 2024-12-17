package dev.lpsmods.morefood.block;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import dev.lpsmods.morefood.core.ModBlocks;
import dev.lpsmods.morefood.core.ModItems;
import net.minecraft.block.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.IntProperty;
import net.minecraft.util.ActionResult;
import net.minecraft.util.BlockMirror;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;
import net.minecraft.world.event.GameEvent;
import org.jetbrains.annotations.Nullable;

import java.util.Map;

public class TreeTapBlock extends Block {
    public static final int MAX_LEVEL = 5;
    public static final IntProperty LEVEL = IntProperty.of("level", 0, MAX_LEVEL);;
    public static final DirectionProperty FACING = HorizontalFacingBlock.FACING;
    private static final Map<Direction, VoxelShape> BOUNDING_SHAPES = Maps.newEnumMap(ImmutableMap.of(
            Direction.NORTH, Block.createCuboidShape(4.5,3,8,11.5,9,16),
            Direction.SOUTH, Block.createCuboidShape(4.5,3,0,11.5,9,8),
            Direction.WEST, Block.createCuboidShape(8,3,4.5,16,9,11.5),
            Direction.EAST, Block.createCuboidShape(0,3,4.5,8,9,11.5)
    ));


    public TreeTapBlock(Settings settings) {
        super(settings);
        this.setDefaultState((BlockState)((BlockState)((BlockState)this.stateManager.getDefaultState()).with(FACING, Direction.NORTH)).with(LEVEL, 0));
    }

    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        int i = state.get(LEVEL);
        Direction direction = state.get(FACING);
        BlockPos blockPos = pos.offset(direction.getOpposite());
        BlockState neighborBlockState = world.getBlockState(blockPos);
        BlockState neighborBlockStateUp = world.getBlockState(blockPos.up());
        BlockState neighborBlockStateDown = world.getBlockState(blockPos.down());
        boolean j = neighborBlockState.isIn(BlockTags.LOGS) && (neighborBlockStateUp.isIn(BlockTags.LOGS) || neighborBlockStateDown.isIn(BlockTags.LOGS));

        if (i < MAX_LEVEL && random.nextInt(5) == 0 && j) {
            BlockState blockState = (BlockState)state.with(LEVEL, i + 1);
            world.setBlockState(pos, blockState, Block.NOTIFY_LISTENERS);
            world.emitGameEvent(GameEvent.BLOCK_CHANGE, pos, GameEvent.Emitter.of(blockState));
        }

        if (i == MAX_LEVEL && world.getBlockState(pos.down()).getBlock() == Blocks.CAULDRON) {
            BlockState blockState = (BlockState)state.with(LEVEL, 0);
            world.setBlockState(pos, blockState, Block.NOTIFY_LISTENERS);
            world.setBlockState(pos.down(), ModBlocks.SAP_CAULDRON.getDefaultState(), Block.NOTIFY_LISTENERS);
        }
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        int i = (Integer)state.get(LEVEL);
        boolean bl = i == MAX_LEVEL;
        ItemStack item = player.getStackInHand(hand);
        if (bl && item.isOf(Items.BUCKET)) {
            if (!player.getAbilities().creativeMode) {item.decrement(1);}
            player.giveItemStack(new ItemStack(ModItems.MAPLE_SAP_BUCKET));

            world.playSound((PlayerEntity)null, pos, SoundEvents.ITEM_BUCKET_FILL, SoundCategory.BLOCKS, 1.0F, 0.8F + world.random.nextFloat() * 0.4F);
            BlockState blockState = (BlockState)state.with(LEVEL, 0);
            world.setBlockState(pos, blockState, 2);
            world.emitGameEvent(GameEvent.BLOCK_CHANGE, pos, GameEvent.Emitter.of(player, blockState));

            return ActionResult.success(world.isClient);
        } else {
            return super.onUse(state, world, pos, player, hand, hit);
        }
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return TreeTapBlock.getBoundingShape(state);
    }

    public static VoxelShape getBoundingShape(BlockState state) {
        return BOUNDING_SHAPES.get(state.get(FACING));
    }

    @Override
    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        Direction direction = state.get(FACING);
        BlockPos blockPos = pos.offset(direction.getOpposite());
        BlockState blockState = world.getBlockState(blockPos);
        return blockState.isSideSolidFullSquare(world, blockPos, direction) && blockState.isIn(BlockTags.LOGS);
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
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        if (direction.getOpposite() == state.get(FACING) && !state.canPlaceAt(world, pos)) {
            return Blocks.AIR.getDefaultState();
        }
        return state;
    }

    @Override
    public BlockState rotate(BlockState state, BlockRotation rotation) {
        return (BlockState)state.with(FACING, rotation.rotate(state.get(FACING)));
    }

    @Override
    public BlockState mirror(BlockState state, BlockMirror mirror) {
        return state.rotate(mirror.getRotation(state.get(FACING)));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING).add(LEVEL);
    }

}
