package dev.lpsmods.morefood.block;

import dev.lpsmods.morefood.block.cauldron.MoreFoodCauldronBehavior;
import com.mojang.serialization.MapCodec;
import net.minecraft.block.AbstractCauldronBlock;
import net.minecraft.block.BlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;

public class SapCauldronBlock extends AbstractCauldronBlock {
    public static final MapCodec<SapCauldronBlock> CODEC = createCodec(SapCauldronBlock::new);

    public SapCauldronBlock(Settings settings) {
        super(settings, MoreFoodCauldronBehavior.SAP_CAULDRON_BEHAVIOR);
    }

    @Override
    protected MapCodec<? extends AbstractCauldronBlock> getCodec() {
        return CODEC;
    }

    @Override
    protected double getFluidHeight(BlockState state) {
        return 0.9375;
    }

    @Override
    public boolean isFull(BlockState state) {
        return true;
    }

    @Override
    public int getComparatorOutput(BlockState state, World world, BlockPos pos) {return 3;}

    @Override
    public ItemStack getPickStack(WorldView world, BlockPos pos, BlockState state) {
        return new ItemStack(Items.CAULDRON);
    }
}
