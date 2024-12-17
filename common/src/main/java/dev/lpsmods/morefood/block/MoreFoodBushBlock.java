package dev.lpsmods.morefood.block;


import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.SweetBerryBushBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.phys.BlockHitResult;

public class MoreFoodBushBlock extends SweetBerryBushBlock {
    private final String CROP_ITEM;

    public MoreFoodBushBlock(String cropItem, BlockBehaviour.Properties settings) {
        super(settings);
        this.CROP_ITEM = cropItem;
    }

    public Item getCropItem() {
        Item item = BuiltInRegistries.ITEM.get(ResourceLocation.tryParse(this.CROP_ITEM));
        if (item == null) {return Items.SWEET_BERRIES;}
        return item;
    }

    @Override
    public ItemStack getCloneItemStack(LevelReader pLevel, BlockPos pPos, BlockState pState) {
        return new ItemStack(this);
    }

    @Override
    protected InteractionResult useWithoutItem(BlockState pState, Level pLevel, BlockPos pPos, Player pPlayer, BlockHitResult pHitResult) {
        int i = pState.getValue(AGE);
        boolean flag = i == 3;
        if (i > 1) {
            int j = 1 + pLevel.random.nextInt(2);
            popResource(pLevel, pPos, new ItemStack(this.getCropItem(), j + (flag ? 1 : 0)));
            pLevel.playSound(
                    null, pPos, SoundEvents.SWEET_BERRY_BUSH_PICK_BERRIES, SoundSource.BLOCKS, 1.0F, 0.8F + pLevel.random.nextFloat() * 0.4F
            );
            BlockState blockstate = pState.setValue(AGE, Integer.valueOf(1));
            pLevel.setBlock(pPos, blockstate, 2);
            pLevel.gameEvent(GameEvent.BLOCK_CHANGE, pPos, GameEvent.Context.of(pPlayer, blockstate));
            return InteractionResult.sidedSuccess(pLevel.isClientSide);
        } else {
            return super.useWithoutItem(pState, pLevel, pPos, pPlayer, pHitResult);
        }
    }
}
