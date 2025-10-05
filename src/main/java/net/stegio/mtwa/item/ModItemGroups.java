package net.stegio.mtwa.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.stegio.mtwa.MTWA;
import net.stegio.mtwa.block.ModBlocks;

public class ModItemGroups {

    public static final ItemGroup MTWA_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(MTWA.MOD_ID, "mtwa"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.TITANITE_INGOT))
                    .displayName(Text.translatable("itemgroup.mtwa.mtwa"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.BRONZE_RYO);
                        entries.add(ModItems.BRONZE_RYO_BUNDLE);
                        entries.add(ModItems.SILVER_RYO);
                        entries.add(ModItems.SILVER_RYO_BUNDLE);
                        entries.add(ModItems.GOLDEN_RYO);
                        entries.add(ModItems.GOLDEN_RYO_BUNDLE);

                        entries.add(ModItems.AETHERITE_SCRAP);
                        entries.add(ModItems.TITANITE_SCRAP);
                        entries.add(ModItems.ETERNITE_SCRAP);

                        entries.add(ModItems.ESSENCE_OF_THE_SKY);
                        entries.add(ModItems.ESSENCE_OF_THE_SUN);
                        entries.add(ModItems.ESSENCE_OF_THE_UNIVERSE);

                        entries.add(ModItems.AETHERITE_INGOT);
                        entries.add(ModItems.TITANITE_INGOT);
                        entries.add(ModItems.ETERNITE_INGOT);

                        entries.add(ModBlocks.SUN_FURNACE);

                        entries.add(ModBlocks.ANCIENT_AETHERITE_DEBRIS1);
                        entries.add(ModBlocks.AETHERITE_BLOCK);
                        entries.add(ModBlocks.ANCIENT_TITANITE_DEBRIS1);
                        entries.add(ModBlocks.TITANITE_BLOCK);
                        entries.add(ModBlocks.ANCIENT_ETERNITE_DEBRIS1);
                        entries.add(ModBlocks.ETERNITE_BLOCK);
                        entries.add(ModBlocks.AETHERITE_ARMOR_ANVIL);
                        entries.add(ModBlocks.AETHERITE_WEAPON_ANVIL);
                        entries.add(ModBlocks.AETHERITE_TOOL_ANVIL);
                        entries.add(ModBlocks.TITANITE_ARMOR_ANVIL);
                        entries.add(ModBlocks.TITANITE_WEAPON_ANVIL);
                        entries.add(ModBlocks.TITANITE_TOOL_ANVIL);
                        entries.add(ModBlocks.ETERNITE_ARMOR_ANVIL);
                        entries.add(ModBlocks.ETERNITE_WEAPON_ANVIL);
                        entries.add(ModBlocks.ETERNITE_TOOL_ANVIL);
                        entries.add(ModBlocks.TOMBSTONE);

                        entries.add(ModItems.AETHERITE_CORE1);
                        entries.add(ModItems.TITANITE_CORE);
                        entries.add(ModItems.ETERNITE_CORE);

                        entries.add(ModItems.AETHERITE_UPGRADE_SMITHING_TEMPLATE);
                        entries.add(ModItems.AETHERITE_UPGRADE_SMITHING_TEMPLATE2);
                        entries.add(ModItems.AETHERITE_UPGRADE_SMITHING_TEMPLATE3);
                        entries.add(ModItems.AETHERITE_UPGRADE_SMITHING_TEMPLATE4);
                        entries.add(ModItems.AETHERITE_UPGRADE_SMITHING_TEMPLATE5);
                        entries.add(ModItems.TITANITE_UPGRADE_SMITHING_TEMPLATE);
                        entries.add(ModItems.TITANITE_UPGRADE_SMITHING_TEMPLATE2);
                        entries.add(ModItems.TITANITE_UPGRADE_SMITHING_TEMPLATE3);
                        entries.add(ModItems.TITANITE_UPGRADE_SMITHING_TEMPLATE4);
                        entries.add(ModItems.TITANITE_UPGRADE_SMITHING_TEMPLATE5);
                        entries.add(ModItems.ETERNITE_UPGRADE_SMITHING_TEMPLATE1);
                        entries.add(ModItems.ETERNITE_UPGRADE_SMITHING_TEMPLATE2);
                        entries.add(ModItems.ETERNITE_UPGRADE_SMITHING_TEMPLATE3);
                        entries.add(ModItems.ETERNITE_UPGRADE_SMITHING_TEMPLATE4);
                        entries.add(ModItems.ETERNITE_UPGRADE_SMITHING_TEMPLATE5);

                        entries.add(ModItems.WOODEN_KATANA);
                        entries.add(ModItems.IRON_KATANA);
                        entries.add(ModItems.DIAMOND_KATANA);
                        entries.add(ModItems.NETHERITE_KATANA);

                        entries.add(ModItems.NETHERITE_HORSE_ARMOR);

                        entries.add(ModItems.AETHERITE_KATANA1);
                        entries.add(ModItems.AETHERITE_KATANA2);
                        entries.add(ModItems.AETHERITE_KATANA3);
                        entries.add(ModItems.AETHERITE_KATANA4);
                        entries.add(ModItems.AETHERITE_KATANA5);

                        entries.add(ModItems.AETHERITE_AXE);
                        entries.add(ModItems.AETHERITE_AXE2);
                        entries.add(ModItems.AETHERITE_AXE3);
                        entries.add(ModItems.AETHERITE_AXE4);
                        entries.add(ModItems.AETHERITE_AXE5);
                        entries.add(ModItems.AETHERITE_PICKAXE);
                        entries.add(ModItems.AETHERITE_PICKAXE2);
                        entries.add(ModItems.AETHERITE_PICKAXE3);
                        entries.add(ModItems.AETHERITE_PICKAXE4);
                        entries.add(ModItems.AETHERITE_PICKAXE5);
                        entries.add(ModItems.AETHERITE_SHOVEL);
                        entries.add(ModItems.AETHERITE_SHOVEL2);
                        entries.add(ModItems.AETHERITE_SHOVEL3);
                        entries.add(ModItems.AETHERITE_SHOVEL4);
                        entries.add(ModItems.AETHERITE_SHOVEL5);
                        entries.add(ModItems.AETHERITE_HOE);
                        entries.add(ModItems.AETHERITE_HOE2);
                        entries.add(ModItems.AETHERITE_HOE3);
                        entries.add(ModItems.AETHERITE_HOE4);
                        entries.add(ModItems.AETHERITE_HOE5);

                        entries.add(ModItems.AETHERITE_MACE);

                        entries.add(ModItems.AETHERITE_HELMET1);
                        entries.add(ModItems.AETHERITE_HELMET2);
                        entries.add(ModItems.AETHERITE_HELMET3);
                        entries.add(ModItems.AETHERITE_HELMET4);
                        entries.add(ModItems.AETHERITE_HELMET5);
                        entries.add(ModItems.AETHERITE_CHESTPLATE1);
                        entries.add(ModItems.AETHERITE_CHESTPLATE2);
                        entries.add(ModItems.AETHERITE_CHESTPLATE3);
                        entries.add(ModItems.AETHERITE_CHESTPLATE4);
                        entries.add(ModItems.AETHERITE_CHESTPLATE5);
                        entries.add(ModItems.AETHERITE_LEGGINGS1);
                        entries.add(ModItems.AETHERITE_LEGGINGS2);
                        entries.add(ModItems.AETHERITE_LEGGINGS3);
                        entries.add(ModItems.AETHERITE_LEGGINGS4);
                        entries.add(ModItems.AETHERITE_LEGGINGS5);
                        entries.add(ModItems.AETHERITE_BOOTS1);
                        entries.add(ModItems.AETHERITE_BOOTS2);
                        entries.add(ModItems.AETHERITE_BOOTS3);
                        entries.add(ModItems.AETHERITE_BOOTS4);
                        entries.add(ModItems.AETHERITE_BOOTS5);
                        entries.add(ModItems.AETHERITE_HORSE_ARMOR);

                        entries.add(ModItems.TITANITE_KATANA1);
                        entries.add(ModItems.TITANITE_KATANA2);
                        entries.add(ModItems.TITANITE_KATANA3);
                        entries.add(ModItems.TITANITE_KATANA4);
                        entries.add(ModItems.TITANITE_KATANA5);

                        entries.add(ModItems.TITANITE_AXE);
                        entries.add(ModItems.TITANITE_AXE2);
                        entries.add(ModItems.TITANITE_AXE3);
                        entries.add(ModItems.TITANITE_AXE4);
                        entries.add(ModItems.TITANITE_AXE5);
                        entries.add(ModItems.TITANITE_PICKAXE);
                        entries.add(ModItems.TITANITE_PICKAXE2);
                        entries.add(ModItems.TITANITE_PICKAXE3);
                        entries.add(ModItems.TITANITE_PICKAXE4);
                        entries.add(ModItems.TITANITE_PICKAXE5);
                        entries.add(ModItems.TITANITE_SHOVEL);
                        entries.add(ModItems.TITANITE_SHOVEL2);
                        entries.add(ModItems.TITANITE_SHOVEL3);
                        entries.add(ModItems.TITANITE_SHOVEL4);
                        entries.add(ModItems.TITANITE_SHOVEL5);
                        entries.add(ModItems.TITANITE_HOE);
                        entries.add(ModItems.TITANITE_HOE2);
                        entries.add(ModItems.TITANITE_HOE3);
                        entries.add(ModItems.TITANITE_HOE4);
                        entries.add(ModItems.TITANITE_HOE5);

                        entries.add(ModItems.TITANITE_MACE);

                        entries.add(ModItems.TITANITE_HELMET1);
                        entries.add(ModItems.TITANITE_HELMET2);
                        entries.add(ModItems.TITANITE_HELMET3);
                        entries.add(ModItems.TITANITE_HELMET4);
                        entries.add(ModItems.TITANITE_HELMET5);
                        entries.add(ModItems.TITANITE_CHESTPLATE1);
                        entries.add(ModItems.TITANITE_CHESTPLATE2);
                        entries.add(ModItems.TITANITE_CHESTPLATE3);
                        entries.add(ModItems.TITANITE_CHESTPLATE4);
                        entries.add(ModItems.TITANITE_CHESTPLATE5);
                        entries.add(ModItems.TITANITE_LEGGINGS1);
                        entries.add(ModItems.TITANITE_LEGGINGS2);
                        entries.add(ModItems.TITANITE_LEGGINGS3);
                        entries.add(ModItems.TITANITE_LEGGINGS4);
                        entries.add(ModItems.TITANITE_LEGGINGS5);
                        entries.add(ModItems.TITANITE_BOOTS1);
                        entries.add(ModItems.TITANITE_BOOTS2);
                        entries.add(ModItems.TITANITE_BOOTS3);
                        entries.add(ModItems.TITANITE_BOOTS4);
                        entries.add(ModItems.TITANITE_BOOTS5);
                        entries.add(ModItems.TITANITE_HORSE_ARMOR);

                        entries.add(ModItems.ETERNITE_KATANA1);
                        entries.add(ModItems.ETERNITE_KATANA2);
                        entries.add(ModItems.ETERNITE_KATANA3);
                        entries.add(ModItems.ETERNITE_KATANA4);
                        entries.add(ModItems.ETERNITE_KATANA5);

                        entries.add(ModItems.ETERNITE_AXE1);
                        entries.add(ModItems.ETERNITE_AXE2);
                        entries.add(ModItems.ETERNITE_AXE3);
                        entries.add(ModItems.ETERNITE_AXE4);
                        entries.add(ModItems.ETERNITE_AXE5);
                        entries.add(ModItems.ETERNITE_PICKAXE1);
                        entries.add(ModItems.ETERNITE_PICKAXE2);
                        entries.add(ModItems.ETERNITE_PICKAXE3);
                        entries.add(ModItems.ETERNITE_PICKAXE4);
                        entries.add(ModItems.ETERNITE_PICKAXE5);
                        entries.add(ModItems.ETERNITE_SHOVEL1);
                        entries.add(ModItems.ETERNITE_SHOVEL2);
                        entries.add(ModItems.ETERNITE_SHOVEL3);
                        entries.add(ModItems.ETERNITE_SHOVEL4);
                        entries.add(ModItems.ETERNITE_SHOVEL5);
                        entries.add(ModItems.ETERNITE_HOE1);
                        entries.add(ModItems.ETERNITE_HOE2);
                        entries.add(ModItems.ETERNITE_HOE3);
                        entries.add(ModItems.ETERNITE_HOE4);
                        entries.add(ModItems.ETERNITE_HOE5);

                        entries.add(ModItems.ETERNITE_MACE);

                        entries.add(ModItems.ETERNITE_HELMET1);
                        entries.add(ModItems.ETERNITE_HELMET2);
                        entries.add(ModItems.ETERNITE_HELMET3);
                        entries.add(ModItems.ETERNITE_HELMET4);
                        entries.add(ModItems.ETERNITE_HELMET5);
                        entries.add(ModItems.ETERNITE_CHESTPLATE1);
                        entries.add(ModItems.ETERNITE_CHESTPLATE2);
                        entries.add(ModItems.ETERNITE_CHESTPLATE3);
                        entries.add(ModItems.ETERNITE_CHESTPLATE4);
                        entries.add(ModItems.ETERNITE_CHESTPLATE5);
                        entries.add(ModItems.ETERNITE_LEGGINGS1);
                        entries.add(ModItems.ETERNITE_LEGGINGS2);
                        entries.add(ModItems.ETERNITE_LEGGINGS3);
                        entries.add(ModItems.ETERNITE_LEGGINGS4);
                        entries.add(ModItems.ETERNITE_LEGGINGS5);
                        entries.add(ModItems.ETERNITE_BOOTS1);
                        entries.add(ModItems.ETERNITE_BOOTS2);
                        entries.add(ModItems.ETERNITE_BOOTS3);
                        entries.add(ModItems.ETERNITE_BOOTS4);
                        entries.add(ModItems.ETERNITE_BOOTS5);
                        entries.add(ModItems.ETERNITE_HORSE_ARMOR);


                    })


                    .build());

    public static void registerItemGroups() {
        MTWA.LOGGER.info("Registering Item Groups for " + MTWA.MOD_ID);
    }
}
