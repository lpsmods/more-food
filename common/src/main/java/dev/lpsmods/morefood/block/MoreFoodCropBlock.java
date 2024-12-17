package dev.lpsmods.morefood.block;


import net.minecraft.core.BlockPos;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;

public class MoreFoodCropBlock extends CropBlock {
    public MoreFoodCropBlock(BlockBehaviour.Properties settings) {
        super(settings);
    }

    @Override
    public ItemStack getCloneItemStack(LevelReader pLevel, BlockPos pPos, BlockState pState) {
        return new ItemStack(this);
    }
}
