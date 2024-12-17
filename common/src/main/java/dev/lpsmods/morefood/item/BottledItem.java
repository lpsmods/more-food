package dev.lpsmods.morefood.item;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class BottledItem extends Item {
    public int MAX_USES = 4;
    public Item glassItem;
    public Item drinkItem;
    private int Uses;

    public BottledItem(Item glassItem, Item drinkItem, Properties settings) {
        super(settings);
        this.glassItem = glassItem;
        this.drinkItem = drinkItem;
    }
    @Override
    public void onCraftedBy(ItemStack stack, Level level, Player player) {
        this.addUses(stack, MAX_USES);
    }

    @Override
    public boolean isBarVisible(ItemStack stack) {
        NbtCompound nbt = stack.getOrCreateNbt();
        this.readUsesFromNbt(nbt);
        return this.Uses < MAX_USES && this.Uses >= 0;
    }

    @Override
    public int getBarWidth(ItemStack stack) {
        NbtCompound nbt = stack.getOrCreateNbt();
        this.readUsesFromNbt(nbt);
        return Math.round((float)this.Uses * 13.0f / MAX_USES);
    }

    @Override
    public int getBarColor(ItemStack stack) {
        NbtCompound nbt = stack.getOrCreateNbt();
        this.readUsesFromNbt(nbt);
        float f = Math.max(0.0f, (float)this.Uses / MAX_USES);
        return MathHelper.hsvToRgb(f / 3.0f, 1.0f, 1.0f);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player user, InteractionHand hand) {

        if (hand == InteractionHand.MAIN_HAND) {
            ItemStack mainhand = user.getItemInHand(InteractionHand.MAIN_HAND);
            ItemStack offhand = user.getItemInHand(InteractionHand.OFF_HAND);

//            NbtCompound nbt = mainhand.getOrCreateNbt();
//            this.readUsesFromNbt(nbt);
//            if (this.Uses > 0 && this.glassItem == offhand.getItem()) {
//                this.Uses--;
//                this.writeUsesToNbt(nbt);
//                user.giveItemStack(new ItemStack(this.drinkItem));
//
//                if (!user.getAbilities().creativeMode) {
//                    offhand.decrement(1);
//                }
//            }
        }

        return super.use(level, user, hand);
    }

    private boolean readUsesFromNbt(NbtCompound nbt) {
        if (nbt.contains("Uses", 3)) {
            this.Uses = nbt.getInt("Uses");
            return true;
        } else {
            return false;
        }
    }

    private boolean writeUsesToNbt(NbtCompound nbt) {
        nbt.putInt("Uses", this.Uses);
        return true;
    }

    public static ItemStack addUses(ItemStack stack, int uses) {
        NbtCompound nbt = stack.getOrCreateNbt();
        nbt.putInt("Uses", uses);
        return stack;
    }

    public void setUses(int uses) {
        this.Uses = uses;
    }
}
