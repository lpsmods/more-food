package dev.lpsmods.morefood.item;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import org.jetbrains.annotations.Nullable;

public class MealReadyToEatItem extends Item {
    @Nullable
    private ResourceLocation lootTable;
    private long lootTableSeed;

    public MealReadyToEatItem(Properties settings) {
        super(settings);
    }

    public void onCraft(ItemStack stack, World world, PlayerEntity player) {
        this.addNbtLootTable(stack, "morefood:mre/default");
    }

    private boolean readLootTableFromNbt(NbtCompound nbt) {
        if (nbt.contains("LootTable", 8)) {
            this.lootTable = new Identifier(nbt.getString("LootTable"));
            this.lootTableSeed = nbt.getLong("LootTableSeed");
            return true;
        } else {
            return false;
        }
    }

    private boolean writeLootTableToNbt(NbtCompound nbt) {
        if (this.lootTable == null) {
            return false;
        } else {
            nbt.putString("LootTable", this.lootTable.toString());
            if (this.lootTableSeed != 0L) {
                nbt.putLong("LootTableSeed", this.lootTableSeed);
            }
            return true;
        }
    }

    public static ItemStack addNbtLootTable(ItemStack stack, String loot) {
        NbtCompound nbt = stack.getOrCreateNbt();
        nbt.putString("LootTable", loot);
        return stack;
    }

    private void spawnLoot(World world, PlayerEntity player) {
        if (world != null && world.getServer() != null) {
            LootTable lootTable = world.getServer().getLootManager().getLootTable(this.lootTable);
            LootContextParameterSet lootContextParameterSet = (new LootContextParameterSet.Builder((ServerWorld)world)).add(LootContextParameters.ORIGIN, player.getPos()).luck(player.getLuck()).add(LootContextParameters.THIS_ENTITY, player).add(LootContextParameters.DAMAGE_SOURCE, player.getRecentDamageSource()).build(LootContextTypes.ENTITY);
            lootTable.generateLoot(lootContextParameterSet, this.lootTableSeed).forEach(itemStack -> {
                if (!player.getInventory().insertStack(itemStack)) {
                    player.dropStack(itemStack);
                }
            });
        }
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if (user.getStackInHand(hand).hasNbt()) {
            this.readLootTableFromNbt(user.getStackInHand(hand).getNbt());
            this.spawnLoot(world, user);
        }
        if (!user.getAbilities().creativeMode) {
            user.getStackInHand(hand).decrement(1);
        }

        return TypedActionResult.pass(user.getStackInHand(hand));
    }

    public void setLootTable(Identifier lootTable, long seed) {
        this.lootTable = lootTable;
        this.lootTableSeed = seed;
    }
}
