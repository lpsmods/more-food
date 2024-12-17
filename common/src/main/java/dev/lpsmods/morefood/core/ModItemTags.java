package dev.lpsmods.morefood.core;

import dev.lpsmods.morefood.MoreFood;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModItemTags {
    public static final TagKey<Item> CHOCOLATE = TagKey.of(RegistryKeys.ITEM, Identifier.of(MoreFood.MOD_ID, "chocolate"));
    public static final TagKey<Item> KNIVES = TagKey.of(RegistryKeys.ITEM, Identifier.of(MoreFood.MOD_ID, "knives"));
    public static final TagKey<Item> RECYCLE_GLASS_SHARD = TagKey.of(RegistryKeys.ITEM, Identifier.of(MoreFood.MOD_ID, "recycle_glass_shard"));
    public static final TagKey<Item> RECYCLE_PULP = TagKey.of(RegistryKeys.ITEM, Identifier.of(MoreFood.MOD_ID, "recycle_pulp"));
    public static final TagKey<Item> SEEDS_FROM_GRASS = TagKey.of(RegistryKeys.ITEM, Identifier.of(MoreFood.MOD_ID, "seeds_from_grass"));
    public static final TagKey<Item> CANDY = TagKey.of(RegistryKeys.ITEM, Identifier.of(MoreFood.MOD_ID, "candy"));
}
