package dev.lpsmods.morefood.item;

import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class ConvertableItem extends Item {
    private final Item usingConvertsTo;

    public ConvertableItem(Item usingConvertsTo, Properties settings) {
        super(settings);
        this.usingConvertsTo = usingConvertsTo;
    }

    @Override
    public ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity livingEntity) {
        super.finishUsingItem(stack, level, livingEntity);
        if (livingEntity instanceof ServerPlayer serverPlayerEntity) {
            CriteriaTriggers.CONSUME_ITEM.trigger(serverPlayerEntity, stack);
        }

        if (stack.isEmpty()) {
            return new ItemStack(usingConvertsTo);
        } else {
            if (livingEntity instanceof Player && !((Player)livingEntity).isCreative()) {
                ItemStack itemStack = new ItemStack(usingConvertsTo);
                Player playerEntity = (Player)livingEntity;
                if (!playerEntity.getInventory().add(itemStack)) {
                    playerEntity.drop(itemStack, false);
                }
            }

            return stack;
        }
    }
}
