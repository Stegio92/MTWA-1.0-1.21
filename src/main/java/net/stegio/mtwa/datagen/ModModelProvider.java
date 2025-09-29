package net.stegio.mtwa.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;
import net.minecraft.util.Identifier;
import net.stegio.mtwa.block.ModBlocks;
import net.stegio.mtwa.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.AETHERITE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TITANITE_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.AETHERITE_SCRAP, Models.GENERATED);
        itemModelGenerator.register(ModItems.TITANITE_SCRAP, Models.GENERATED);
        itemModelGenerator.register(ModItems.ESSENCE_OF_THE_SKY, Models.GENERATED);
        itemModelGenerator.register(ModItems.ESSENCE_OF_THE_SUN, Models.GENERATED);
        itemModelGenerator.register(ModItems.AETHERITE_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.TITANITE_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.AETHERITE_UPGRADE_SMITHING_TEMPLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.AETHERITE_UPGRADE_SMITHING_TEMPLATE2, Models.GENERATED);
        itemModelGenerator.register(ModItems.AETHERITE_UPGRADE_SMITHING_TEMPLATE3, Models.GENERATED);
        itemModelGenerator.register(ModItems.AETHERITE_UPGRADE_SMITHING_TEMPLATE4, Models.GENERATED);
        itemModelGenerator.register(ModItems.AETHERITE_UPGRADE_SMITHING_TEMPLATE5, Models.GENERATED);
        itemModelGenerator.register(ModItems.TITANITE_UPGRADE_SMITHING_TEMPLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.TITANITE_UPGRADE_SMITHING_TEMPLATE2, Models.GENERATED);
        itemModelGenerator.register(ModItems.TITANITE_UPGRADE_SMITHING_TEMPLATE3, Models.GENERATED);
        itemModelGenerator.register(ModItems.TITANITE_UPGRADE_SMITHING_TEMPLATE4, Models.GENERATED);
        itemModelGenerator.register(ModItems.TITANITE_UPGRADE_SMITHING_TEMPLATE5, Models.GENERATED);

        itemModelGenerator.register(ModItems.WOODEN_KATANA, Models.HANDHELD);
        itemModelGenerator.register(ModItems.IRON_KATANA, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DIAMOND_KATANA, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NETHERITE_KATANA, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AETHERITE_KATANA1, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AETHERITE_KATANA2, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AETHERITE_KATANA3, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AETHERITE_KATANA4, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AETHERITE_KATANA5, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TITANITE_KATANA1, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TITANITE_KATANA2, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TITANITE_KATANA3, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TITANITE_KATANA4, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TITANITE_KATANA5, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AETHERITE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AETHERITE_AXE2, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AETHERITE_AXE3, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AETHERITE_AXE4, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AETHERITE_AXE5, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AETHERITE_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AETHERITE_HOE2, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AETHERITE_HOE3, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AETHERITE_HOE4, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AETHERITE_HOE5, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AETHERITE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AETHERITE_PICKAXE2, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AETHERITE_PICKAXE3, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AETHERITE_PICKAXE4, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AETHERITE_PICKAXE5, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AETHERITE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AETHERITE_SHOVEL2, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AETHERITE_SHOVEL3, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AETHERITE_SHOVEL4, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AETHERITE_SHOVEL5, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TITANITE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TITANITE_AXE2, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TITANITE_AXE3, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TITANITE_AXE4, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TITANITE_AXE5, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TITANITE_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TITANITE_HOE2, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TITANITE_HOE3, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TITANITE_HOE4, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TITANITE_HOE5, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TITANITE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TITANITE_PICKAXE2, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TITANITE_PICKAXE3, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TITANITE_PICKAXE4, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TITANITE_PICKAXE5, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TITANITE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TITANITE_SHOVEL2, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TITANITE_SHOVEL3, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TITANITE_SHOVEL4, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TITANITE_SHOVEL5, Models.HANDHELD);

        itemModelGenerator.register(ModItems.NETHERITE_HORSE_ARMOR, Models.GENERATED);
        itemModelGenerator.register(ModItems.AETHERITE_HORSE_ARMOR, Models.GENERATED);
        itemModelGenerator.register(ModItems.TITANITE_HORSE_ARMOR, Models.GENERATED);

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.AETHERITE_HELMET1));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.AETHERITE_HELMET2));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.AETHERITE_HELMET3));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.AETHERITE_HELMET4));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.AETHERITE_HELMET5));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.AETHERITE_CHESTPLATE1));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.AETHERITE_CHESTPLATE2));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.AETHERITE_CHESTPLATE3));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.AETHERITE_CHESTPLATE4));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.AETHERITE_CHESTPLATE5));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.AETHERITE_LEGGINGS1));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.AETHERITE_LEGGINGS2));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.AETHERITE_LEGGINGS3));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.AETHERITE_LEGGINGS4));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.AETHERITE_LEGGINGS5));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.AETHERITE_BOOTS1));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.AETHERITE_BOOTS2));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.AETHERITE_BOOTS3));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.AETHERITE_BOOTS4));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.AETHERITE_BOOTS5));

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.TITANITE_HELMET1));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.TITANITE_HELMET2));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.TITANITE_HELMET3));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.TITANITE_HELMET4));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.TITANITE_HELMET5));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.TITANITE_CHESTPLATE1));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.TITANITE_CHESTPLATE2));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.TITANITE_CHESTPLATE3));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.TITANITE_CHESTPLATE4));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.TITANITE_CHESTPLATE5));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.TITANITE_LEGGINGS1));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.TITANITE_LEGGINGS2));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.TITANITE_LEGGINGS3));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.TITANITE_LEGGINGS4));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.TITANITE_LEGGINGS5));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.TITANITE_BOOTS1));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.TITANITE_BOOTS2));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.TITANITE_BOOTS3));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.TITANITE_BOOTS4));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.TITANITE_BOOTS5));

        itemModelGenerator.register(ModItems.AETHERITE_MACE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TITANITE_MACE, Models.HANDHELD);





    }
}
