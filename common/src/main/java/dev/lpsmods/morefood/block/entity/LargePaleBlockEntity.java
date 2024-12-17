package dev.lpsmods.morefood.block.entity;

import dev.lpsmods.morefood.core.ModBlockEntityType;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.LootableContainerBlockEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventories;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.text.Text;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;

public class LargePaleBlockEntity extends LootableContainerBlockEntity {
    private DefaultedList<ItemStack> inventory = DefaultedList.ofSize(5, ItemStack.EMPTY);

    public LargePaleBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntityType.LARGE_PALE_BLOCK_ENTITY, pos, state);
    }

    protected void writeNbt(NbtCompound nbt) {
        super.writeNbt(nbt);
        if (!this.writeLootTable(nbt)) {
            Inventories.writeNbt(nbt, this.inventory);
        }
    }

    public void readNbt(NbtCompound nbt) {
        super.readNbt(nbt);
        this.inventory = DefaultedList.ofSize(this.size(), ItemStack.EMPTY);
        if (!this.readLootTable(nbt)) {
            Inventories.readNbt(nbt, this.inventory);
        }
    }

    @Override
    protected Text getContainerName() {
        return null;
    }

    @Override
    protected DefaultedList<ItemStack> getHeldStacks() {
        return null;
    }

    @Override
    protected void setHeldStacks(DefaultedList<ItemStack> inventory) {

    }

    @Override
    protected ScreenHandler createScreenHandler(int syncId, PlayerInventory playerInventory) {
        return null;
    }


    protected DefaultedList<ItemStack> getInvStackList() {
        return this.inventory;
    }

    @Override
    protected DefaultedList<ItemStack> method_11282() {
        return this.inventory;
    }

    @Override
    protected void setInvStackList(DefaultedList<ItemStack> list) {
        this.inventory = list;
    }

    @Override
    public int size() {
        return this.inventory.size();
    }
}
