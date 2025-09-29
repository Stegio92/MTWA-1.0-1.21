package net.stegio.mtwa.util;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.stegio.mtwa.MTWA;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_AETHERITE_TOOL = createTag("needs_aetherite_tool");
        public static final TagKey<Block> NEEDS_TITANITE_TOOL = createTag("needs_titanite_tool");
        public static final TagKey<Block> INCORRECT_FOR_AETHERITE_TOOL = createTag("incorrect_for_aetherite_tool");
        public static final TagKey<Block> INCORRECT_FOR_TITANITE_TOOL = createTag("incorrect_for_titanite_tool");


        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(MTWA.MOD_ID, name));
        }
    }

    public static class Items {

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(MTWA.MOD_ID, name));
        }

    }
}
