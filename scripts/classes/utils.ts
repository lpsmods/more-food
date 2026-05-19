import { EquipmentSlot, ItemStack, Player } from "@minecraft/server";

export const CANDLES = [
  "candle",
  "white_candle",
  "light_gray_candle",
  "gray_candle",
  "black_candle",
  "brown_candle",
  "red_candle",
  "orange_candle",
  "yellow_candle",
  "lime_candle",
  "green_candle",
  "cyan_candle",
  "light_blue_candle",
  "blue_candle",
  "purple_candle",
  "magenta_candle",
  "pink_candle",
];

// TODO: Does this exist in @lpsmods/mc-utils?
export function replaceStack(
  player: Player,
  slot: EquipmentSlot,
  resultStack: ItemStack,
): void {
  const inv = player.getComponent("inventory");
  const equ = player.getComponent("equippable");
  if (!equ || !inv) return;
  const stack = equ.getEquipment(slot);
  if (!stack) return;
  if (stack.amount === 1) {
    equ.setEquipment(slot, resultStack);
  } else {
    inv.container.addItem(resultStack);
    stack.amount -= 1;
    equ.setEquipment(slot, stack);
  }
}
