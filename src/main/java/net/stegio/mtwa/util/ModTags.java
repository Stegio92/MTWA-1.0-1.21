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
        public static final TagKey<Block> NEEDS_AETHERITE_TOOL1 = createTag("needs_aetherite_tool1");
        public static final TagKey<Block> NEEDS_AETHERITE_TOOL2 = createTag("needs_aetherite_tool2");
        public static final TagKey<Block> NEEDS_AETHERITE_TOOL3 = createTag("needs_aetherite_tool3");
        public static final TagKey<Block> NEEDS_AETHERITE_TOOL4 = createTag("needs_aetherite_tool4");
        public static final TagKey<Block> NEEDS_AETHERITE_TOOL5 = createTag("needs_aetherite_tool5");
        public static final TagKey<Block> NEEDS_TITANITE_TOOL1 = createTag("needs_titanite_tool1");
        public static final TagKey<Block> NEEDS_TITANITE_TOOL2 = createTag("needs_titanite_tool2");
        public static final TagKey<Block> NEEDS_TITANITE_TOOL3 = createTag("needs_titanite_tool3");
        public static final TagKey<Block> NEEDS_TITANITE_TOOL4 = createTag("needs_titanite_tool4");
        public static final TagKey<Block> NEEDS_TITANITE_TOOL5 = createTag("needs_titanite_tool5");
        public static final TagKey<Block> NEEDS_ETERNITE_TOOL1 = createTag("needs_eternite_tool1");
        public static final TagKey<Block> NEEDS_ETERNITE_TOOL2 = createTag("needs_eternite_tool2");
        public static final TagKey<Block> NEEDS_ETERNITE_TOOL3 = createTag("needs_eternite_tool3");
        public static final TagKey<Block> NEEDS_ETERNITE_TOOL4 = createTag("needs_eternite_tool4");
        public static final TagKey<Block> NEEDS_ETERNITE_TOOL5 = createTag("needs_eternite_tool5");
        public static final TagKey<Block> INCORRECT_FOR_AETHERITE_TOOL1 = createTag("incorrect_for_aetherite_tool1");
        public static final TagKey<Block> INCORRECT_FOR_AETHERITE_TOOL2 = createTag("incorrect_for_aetherite_tool2");
        public static final TagKey<Block> INCORRECT_FOR_AETHERITE_TOOL3 = createTag("incorrect_for_aetherite_tool3");
        public static final TagKey<Block> INCORRECT_FOR_AETHERITE_TOOL4 = createTag("incorrect_for_aetherite_tool4");
        public static final TagKey<Block> INCORRECT_FOR_AETHERITE_TOOL5 = createTag("incorrect_for_aetherite_tool5");
        public static final TagKey<Block> INCORRECT_FOR_TITANITE_TOOL1 = createTag("incorrect_for_titanite_tool1");
        public static final TagKey<Block> INCORRECT_FOR_TITANITE_TOOL2 = createTag("incorrect_for_titanite_tool2");
        public static final TagKey<Block> INCORRECT_FOR_TITANITE_TOOL3 = createTag("incorrect_for_titanite_tool3");
        public static final TagKey<Block> INCORRECT_FOR_TITANITE_TOOL4 = createTag("incorrect_for_titanite_tool4");
        public static final TagKey<Block> INCORRECT_FOR_TITANITE_TOOL5 = createTag("incorrect_for_titanite_tool5");
        public static final TagKey<Block> INCORRECT_FOR_ETERNITE_TOOL1 = createTag("incorrect_for_eternite_tool1");
        public static final TagKey<Block> INCORRECT_FOR_ETERNITE_TOOL2 = createTag("incorrect_for_eternite_tool2");
        public static final TagKey<Block> INCORRECT_FOR_ETERNITE_TOOL3 = createTag("incorrect_for_eternite_tool3");
        public static final TagKey<Block> INCORRECT_FOR_ETERNITE_TOOL4 = createTag("incorrect_for_eternite_tool4");
        public static final TagKey<Block> INCORRECT_FOR_ETERNITE_TOOL5 = createTag("incorrect_for_eternite_tool5");


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
