package dev.lpsmods.morefood.core;

import dev.lpsmods.morefood.MoreFood;
import dev.lpsmods.morefood.block.entity.LargePaleBlockEntity;
import dev.lpsmods.morefood.block.entity.SmallPaleBlockEntity;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlockEntityType {
    public static final BlockEntityType<LargePaleBlockEntity> LARGE_PALE_BLOCK_ENTITY = FabricBlockEntityTypeBuilder.create(LargePaleBlockEntity::new, ModBlocks.LARGE_PUMPKIN_PALE).build();
    public static final BlockEntityType<SmallPaleBlockEntity> SMALL_PALE_BLOCK_ENTITY = FabricBlockEntityTypeBuilder.create(SmallPaleBlockEntity::new, ModBlocks.SMALL_PUMPKIN_PALE).build();

    public static void register() {
        Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(MoreFood.MOD_ID, "large_pale_block_entity"), LARGE_PALE_BLOCK_ENTITY);
        Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(MoreFood.MOD_ID, "small_pale_block_entity"), SMALL_PALE_BLOCK_ENTITY);
    }
}
