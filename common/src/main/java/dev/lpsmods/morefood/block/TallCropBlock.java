package dev.lpsmods.morefood.block;

import com.mojang.serialization.MapCodec;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.enums.DoubleBlockHalf;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.state.property.Property;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;
import org.jetbrains.annotations.Nullable;

public class TallCropBlock extends MoreFoodCropBlock {
    public static final MapCodec<TallCropBlock> CODEC = createCodec(TallCropBlock::new);
    public static final EnumProperty<DoubleBlockHalf> HALF;
    private static final VoxelShape[] AGE_TO_SHAPE_UPPER;
    private static final VoxelShape[] AGE_TO_SHAPE_LOWER;

    public TallCropBlock(Settings settings) {
        super(settings);
        this.setDefaultState((BlockState)((BlockState)this.stateManager.getDefaultState()).with(HALF, DoubleBlockHalf.LOWER));
    }
    public boolean isLower(BlockState state) {
        return state.get(HALF) == DoubleBlockHalf.LOWER;
    }

    public boolean isFertilizable(WorldView world, BlockPos pos, BlockState state) {
        return !this.isMature(state) && this.isLower(state);
    }

    public boolean canGrow(World world, Random random, BlockPos pos, BlockState state) {
        return this.isLower(state);
    }

    public boolean hasRandomTicks(BlockState state) {
        return !this.isMature(state) && this.isLower(state);
    }

    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        int age = this.getAge(state);
        return state.get(HALF) == DoubleBlockHalf.UPPER ? AGE_TO_SHAPE_UPPER[age] : AGE_TO_SHAPE_LOWER[age];
    }

    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        DoubleBlockHalf doubleBlockHalf = (DoubleBlockHalf)state.get(HALF);
        if (direction.getAxis() == Direction.Axis.Y && doubleBlockHalf == DoubleBlockHalf.LOWER == (direction == Direction.UP)) {
            return neighborState.getBlock() instanceof TallCropBlock && neighborState.get(HALF) != doubleBlockHalf ? (BlockState)neighborState.with(HALF, doubleBlockHalf) : Blocks.AIR.getDefaultState();
        } else {
            return doubleBlockHalf == DoubleBlockHalf.LOWER && direction == Direction.DOWN && !state.canPlaceAt(world, pos) ? Blocks.AIR.getDefaultState() : super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
        }
    }

    @Nullable
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        BlockPos blockPos = ctx.getBlockPos();
        World world = ctx.getWorld();
        return blockPos.getY() < world.getTopY() - 1 && world.getBlockState(blockPos.up()).canReplace(ctx) ? super.getPlacementState(ctx) : null;
    }

    public void onPlaced(World world, BlockPos pos, BlockState state, LivingEntity placer, ItemStack itemStack) {
        world.setBlockState(pos.up(), (BlockState)state.with(HALF, DoubleBlockHalf.UPPER), 3);
    }

    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        if (state.get(HALF) != DoubleBlockHalf.UPPER) {
            return super.canPlaceAt(state, world, pos);
        } else {
            BlockState blockState = world.getBlockState(pos.down());
            return blockState.isOf(this) && blockState.get(HALF) == DoubleBlockHalf.LOWER;
        }
    }

    public static void placeAt(WorldAccess world, BlockState state, BlockPos pos, int flags) {
        BlockPos blockPos = pos.up();
        world.setBlockState(pos, withWaterloggedState(world, pos, (BlockState)state.with(HALF, DoubleBlockHalf.LOWER)), flags);
        world.setBlockState(blockPos, withWaterloggedState(world, blockPos, (BlockState)state.with(HALF, DoubleBlockHalf.UPPER)), flags);
    }

    public static BlockState withWaterloggedState(WorldView world, BlockPos pos, BlockState state) {
        return state.contains(Properties.WATERLOGGED) ? (BlockState)state.with(Properties.WATERLOGGED, world.isWater(pos)) : state;
    }

    public BlockState onBreak(World world, BlockPos pos, BlockState state, PlayerEntity player) {
        if (!world.isClient) {
            if (player.isCreative()) {
                onBreakInCreative(world, pos, state, player);
            } else {
                dropStacks(state, world, pos, (BlockEntity)null, player, player.getMainHandStack());
            }
        }

        return super.onBreak(world, pos, state, player);
    }

    public void afterBreak(World world, PlayerEntity player, BlockPos pos, BlockState state, @Nullable BlockEntity blockEntity, ItemStack tool) {
        super.afterBreak(world, player, pos, Blocks.AIR.getDefaultState(), blockEntity, tool);
    }

    protected static void onBreakInCreative(World world, BlockPos pos, BlockState state, PlayerEntity player) {
        DoubleBlockHalf doubleBlockHalf = (DoubleBlockHalf)state.get(HALF);
        if (doubleBlockHalf == DoubleBlockHalf.UPPER) {
            BlockPos blockPos = pos.down();
            BlockState blockState = world.getBlockState(blockPos);
            if (blockState.isOf(state.getBlock()) && blockState.get(HALF) == DoubleBlockHalf.LOWER) {
                BlockState blockState2 = blockState.getFluidState().isOf(Fluids.WATER) ? Blocks.WATER.getDefaultState() : Blocks.AIR.getDefaultState();
                world.setBlockState(blockPos, blockState2, 35);
                world.syncWorldEvent(player, 2001, blockPos, getRawIdFromState(blockState));
            }
        }
    }

    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(new Property[]{HALF, AGE});
    }

    static {
        HALF = Properties.DOUBLE_BLOCK_HALF;
        AGE_TO_SHAPE_UPPER = new VoxelShape[]{VoxelShapes.empty(), VoxelShapes.empty(), VoxelShapes.empty(), VoxelShapes.empty(), VoxelShapes.empty(), createCuboidShape(0.0, 0.0, 0.0, 16.0, 7.0, 16.0), createCuboidShape(0.0, 0.0, 0.0, 16.0, 10.0, 16.0), createCuboidShape(0.0, 0.0, 0.0, 16.0, 13.0, 16.0)};
        AGE_TO_SHAPE_LOWER = new VoxelShape[]{createCuboidShape(0.0, 0.0, 0.0, 16.0, 2.0, 16.0), createCuboidShape(0.0, 0.0, 0.0, 16.0, 2.0, 16.0), createCuboidShape(0.0, 0.0, 0.0, 16.0, 8.0, 16.0), createCuboidShape(0.0, 0.0, 0.0, 16.0, 8.0, 16.0), createCuboidShape(0.0, 0.0, 0.0, 16.0, 14.0, 16.0), VoxelShapes.fullCube(), VoxelShapes.fullCube(), VoxelShapes.fullCube()};
    }
}
