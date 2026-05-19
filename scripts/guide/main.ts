import { blocks } from "./blocks.js";
import { items } from "./items.js";
import { changelogs } from "./changelogs.js";

export const pages = {
  ...blocks,
  ...items,
  ...changelogs,
  home: {
    body: "",
    buttons: ["blocks", "items", "changelogs"],
  },
};
