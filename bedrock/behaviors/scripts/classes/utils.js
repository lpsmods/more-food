import { ItemStack } from "@minecraft/server";

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

export function inRange(value, min, max) {
  return min <= value && max >= value;
}

export function randomInt(min, max) {
  return Math.floor(Math.random() * (max - min) + min);
}

export function replaceStack(player, slot, resultStack) {
  const inv = player.getComponent("inventory");
  const equ = player.getComponent("equippable");
  const stack = equ.getEquipment(slot);
  if (stack.amount === 1) {
    equ.setEquipment(slot, resultStack);
  } else {
    inv.container.addItem(resultStack);
    stack.amount -= 1;
    equ.setEquipment(slot, stack);
  }
}

export function decreasementStack(player, slot, amount = 1) {
  const equ = player.getComponent("equippable");
  const stack = equ.getEquipment(slot);
  if (stack.amount <= amount) {
    equ.setEquipment(slot, new ItemStack("air"));
    return;
  }
  stack.amount -= amount;
  equ.setEquipment(slot, stack);
}

export function directionToOffset(direction) {
  switch (direction.toString().toLowerCase()) {
    case "down":
      return { x: 0, y: -1, z: 0 };
    case "east":
      return { x: -1, y: 0, z: 0 };
    case "north":
      return { x: 0, y: 0, z: 1 };
    case "south":
      return { x: 0, y: 0, z: -1 };
    case "up":
      return { x: 0, y: 1, z: 0 };
    case "west":
      return { x: 1, y: 0, z: 0 };
  }
}

export function oppositeDirection(direction) {
  switch (direction.toString().toLowerCase()) {
    case "north":
      return "south";
    case "south":
      return "north";
    case "east":
      return "west";
    case "west":
      return "east";
    case "up":
      return "down";
    case "down":
      return "up";
  }
}

export function clamp(value, min, max) {
  return Math.min(Math.max(value, min), max);
}
