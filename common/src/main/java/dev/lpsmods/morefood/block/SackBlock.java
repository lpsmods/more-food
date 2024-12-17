package dev.lpsmods.morefood.block;

import net.minecraft.block.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class SackBlock extends Block {
    private static final VoxelShape OUTLINE_SHAPE = Block.createCuboidShape(0.5,0,0.5,15.5,14,15.5);
    public SackBlock(Settings settings) {
        super(settings);
    }

    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return OUTLINE_SHAPE;
    }
}
