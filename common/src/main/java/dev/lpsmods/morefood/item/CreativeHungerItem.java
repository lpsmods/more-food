package dev.lpsmods.morefood.item;


import net.minecraft.world.item.Item;

import java.util.List;

public class CreativeHungerItem extends Item {
    public CreativeHungerItem(Properties settings) {
        super(settings);
    }

    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        tooltip.add(Text.translatable("item.morefood.creative_hunger.desc").formatted(Formatting.GRAY));
    }
}
