package dev.lpsmods.morefood.core;


import dev.lpsmods.morefood.MoreFood;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModBlockTags {
    public static final TagKey<Block> SACKS = TagKey.of(RegistryKeys.BLOCK, Identifier.of(MoreFood.MOD_ID, "sacks"));
    public static final TagKey<Block> BUSHES = TagKey.of(RegistryKeys.BLOCK, Identifier.of(MoreFood.MOD_ID, "bushes"));
    public static final TagKey<Block> CROPS = TagKey.of(RegistryKeys.BLOCK, Identifier.of(MoreFood.MOD_ID, "crops"));
}
