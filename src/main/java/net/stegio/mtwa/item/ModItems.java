package net.stegio.mtwa.item;

import net.minecraft.component.DataComponentTypes;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.stegio.mtwa.MTWA;
import net.stegio.mtwa.block.ModBlocks;
import net.stegio.mtwa.item.custom.*;
import net.stegio.mtwa.item.custom.ModSmithingTemplateItem;
import net.stegio.mtwa.util.ModRarity;

import static net.minecraft.item.Items.register;

public class ModItems {
    public static final Item BRONZE_RYO = registerItem("bronze_ryo", new Item(new Item.Settings()));
    public static final Item BRONZE_RYO_BUNDLE = registerItem("bronze_ryo_bundle", new Item(new Item.Settings()));
    public static final Item SILVER_RYO = registerItem("silver_ryo", new Item(new Item.Settings()));
    public static final Item SILVER_RYO_BUNDLE = registerItem("silver_ryo_bundle", new Item(new Item.Settings()));
    public static final Item GOLDEN_RYO = registerItem("golden_ryo", new Item(new Item.Settings()));
    public static final Item GOLDEN_RYO_BUNDLE = registerItem("golden_ryo_bundle", new Item(new Item.Settings()));


    public static final Item AETHERITE_SCRAP = registerItem("aetherite_scrap", new RarityItem(new Item.Settings(), ModRarity.LEGENDARY));
    public static final Item TITANITE_SCRAP = registerItem("titanite_scrap", new RarityItem(new Item.Settings(), ModRarity.MYTHIC));
    public static final Item ETERNITE_SCRAP = registerItem("eternite_scrap", new RarityItem(new Item.Settings(), ModRarity.DIVINE));

    public static final Item ESSENCE_OF_THE_SKY = registerItem("essence_of_the_sky", new RarityItem(new Item.Settings(), ModRarity.LEGENDARY));
    public static final Item ESSENCE_OF_THE_SUN = registerItem("essence_of_the_sun", new RarityItem(new Item.Settings(), ModRarity.MYTHIC));
    public static final Item ESSENCE_OF_THE_UNIVERSE = registerItem("essence_of_the_universe", new RarityItem(new Item.Settings(), ModRarity.DIVINE));

    public static final Item DOMAIN_KEY = registerItem("domain_key", new Item(new Item.Settings()));
    public static final Item NETHER_KEY = registerItem("nether_key", new Item(new Item.Settings().rarity(Rarity.EPIC)));
    public static final Item AETHERITE_KEY = registerItem("aetherite_key", new RarityItem(new Item.Settings(), ModRarity.LEGENDARY));
    public static final Item TITANITE_KEY = registerItem("titanite_key", new RarityItem(new Item.Settings(), ModRarity.MYTHIC));
    public static final Item ETERNITE_KEY = registerItem("eternite_key", new RarityItem(new Item.Settings(), ModRarity.DIVINE));


    public static final Item AETHERITE_INGOT = registerItem("aetherite_ingot", new RarityItem(new Item.Settings(), ModRarity.LEGENDARY));
    public static final Item TITANITE_INGOT = registerItem("titanite_ingot", new RarityItem(new Item.Settings(), ModRarity.MYTHIC));
    public static final Item ETERNITE_INGOT = registerItem("eternite_ingot", new RarityItem(new Item.Settings(), ModRarity.DIVINE));

    public static final Item AETHERITE_BLOCK = register(new RarityBlockItem(ModBlocks.AETHERITE_BLOCK, new Item.Settings(), ModRarity.LEGENDARY));
    public static final Item TITANITE_BLOCK = register(new RarityBlockItem(ModBlocks.TITANITE_BLOCK, new Item.Settings(), ModRarity.MYTHIC));
    public static final Item ETERNITE_BLOCK = register(new RarityBlockItem(ModBlocks.ETERNITE_BLOCK, new Item.Settings(), ModRarity.DIVINE));
    public static final Item ANCIENT_AETHERITE_DEBRIS1 = register(new RarityBlockItem(ModBlocks.ANCIENT_AETHERITE_DEBRIS1, new Item.Settings(), ModRarity.LEGENDARY));
    public static final Item ANCIENT_TITANITE_DEBRIS1 = register(new RarityBlockItem(ModBlocks.ANCIENT_TITANITE_DEBRIS1, new Item.Settings(), ModRarity.MYTHIC));
    public static final Item ANCIENT_ETERNITE_DEBRIS1 = register(new RarityBlockItem(ModBlocks.ANCIENT_ETERNITE_DEBRIS1, new Item.Settings(), ModRarity.DIVINE));


    public static final Item AETHERITE_ARMOR_ANVIL = register(new RarityBlockItem(ModBlocks.AETHERITE_ARMOR_ANVIL, new Item.Settings(), ModRarity.LEGENDARY));
    public static final Item TITANITE_ARMOR_ANVIL = register(new RarityBlockItem(ModBlocks.TITANITE_ARMOR_ANVIL, new Item.Settings(), ModRarity.MYTHIC));
    public static final Item ETERNITE_ARMOR_ANVIL = register(new RarityBlockItem(ModBlocks.ETERNITE_ARMOR_ANVIL, new Item.Settings(), ModRarity.DIVINE));
    public static final Item AETHERITE_WEAPON_ANVIL = register(new RarityBlockItem(ModBlocks.AETHERITE_WEAPON_ANVIL, new Item.Settings(), ModRarity.LEGENDARY));
    public static final Item TITANITE_WEAPON_ANVIL = register(new RarityBlockItem(ModBlocks.TITANITE_WEAPON_ANVIL, new Item.Settings(), ModRarity.MYTHIC));
    public static final Item ETERNITE_WEAPON_ANVIL = register(new RarityBlockItem(ModBlocks.ETERNITE_WEAPON_ANVIL, new Item.Settings(), ModRarity.DIVINE));
    public static final Item AETHERITE_TOOL_ANVIL = register(new RarityBlockItem(ModBlocks.AETHERITE_TOOL_ANVIL, new Item.Settings(), ModRarity.LEGENDARY));
    public static final Item TITANITE_TOOL_ANVIL = register(new RarityBlockItem(ModBlocks.TITANITE_TOOL_ANVIL, new Item.Settings(), ModRarity.MYTHIC));
    public static final Item ETERNITE_TOOL_ANVIL = register(new RarityBlockItem(ModBlocks.ETERNITE_TOOL_ANVIL, new Item.Settings(), ModRarity.DIVINE));

    public static final Item WOODEN_KATANA = registerItem("wooden_katana",
            new SwordItem(ToolMaterials.WOOD, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.WOOD,4, -2.4f))));

    public static final Item IRON_KATANA = registerItem("iron_katana",
            new SwordItem(ToolMaterials.IRON, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.IRON,4, -2.4f))));

    public static final Item DIAMOND_KATANA = registerItem("diamond_katana",
            new SwordItem(ToolMaterials.DIAMOND, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.DIAMOND,4, -2.4f))));

    public static final Item NETHERITE_KATANA = registerItem("netherite_katana",
            new SwordItem(ToolMaterials.NETHERITE, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.NETHERITE,4, -2.4f))));

    public static final Item AETHERITE_UPGRADE_SMITHING_TEMPLATE = registerItem("aetherite_upgrade_smithing_template", ModSmithingTemplateItem.createAetheriteUpgrade());
    public static final Item AETHERITE_UPGRADE_SMITHING_TEMPLATE2 = registerItem("aetherite_upgrade_smithing_template2", ModSmithingTemplateItem.createAetheriteUpgrade());
    public static final Item AETHERITE_UPGRADE_SMITHING_TEMPLATE3 = registerItem("aetherite_upgrade_smithing_template3", ModSmithingTemplateItem.createAetheriteUpgrade());
    public static final Item AETHERITE_UPGRADE_SMITHING_TEMPLATE4 = registerItem("aetherite_upgrade_smithing_template4", ModSmithingTemplateItem.createAetheriteUpgrade());
    public static final Item AETHERITE_UPGRADE_SMITHING_TEMPLATE5 = registerItem("aetherite_upgrade_smithing_template5", ModSmithingTemplateItem.createAetheriteUpgrade());


    public static final Item AETHERITE_KATANA1 = registerItem("aetherite_katana1",
            new RaritySwordItem(ModToolMaterials.AETHERITE, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.AETHERITE,6, -2.4f)), ModRarity.LEGENDARY));
    public static final Item AETHERITE_KATANA2 = registerItem("aetherite_katana2",
            new RaritySwordItem(ModToolMaterials.AETHERITE2, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.AETHERITE2,6, -2.4f)), ModRarity.LEGENDARY));
    public static final Item AETHERITE_KATANA3 = registerItem("aetherite_katana3",
            new RaritySwordItem(ModToolMaterials.AETHERITE3, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.AETHERITE3,6, -2.4f)), ModRarity.LEGENDARY));
    public static final Item AETHERITE_KATANA4 = registerItem("aetherite_katana4",
            new RaritySwordItem(ModToolMaterials.AETHERITE4, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.AETHERITE4,6, -2.4f)), ModRarity.LEGENDARY));
    public static final Item AETHERITE_KATANA5 = registerItem("aetherite_katana5",
            new RaritySwordItem(ModToolMaterials.AETHERITE5, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.AETHERITE5,6,-2.4f)), ModRarity.LEGENDARY));


    public static final Item AETHERITE_AXE = registerItem("aetherite_axe1",
            new RarityAxeItem(ModToolMaterials.AETHERITE, new Item.Settings()
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.AETHERITE,8, -3.0f)), ModRarity.LEGENDARY));
    public static final Item AETHERITE_AXE2 = registerItem("aetherite_axe2",
            new RarityAxeItem(ModToolMaterials.AETHERITE2, new Item.Settings()
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.AETHERITE2,8, -3.0f)),ModRarity.LEGENDARY));
    public static final Item AETHERITE_AXE3 = registerItem("aetherite_axe3",
            new RarityAxeItem(ModToolMaterials.AETHERITE3, new Item.Settings()
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.AETHERITE3,8, -3.0f)), ModRarity.LEGENDARY));
    public static final Item AETHERITE_AXE4 = registerItem("aetherite_axe4",
            new RarityAxeItem(ModToolMaterials.AETHERITE4, new Item.Settings()
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.AETHERITE4,8, -3.0f)), ModRarity.LEGENDARY));
    public static final Item AETHERITE_AXE5 = registerItem("aetherite_axe5",
            new RarityAxeItem(ModToolMaterials.AETHERITE5, new Item.Settings()
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.AETHERITE5,8,-3.0f)), ModRarity.LEGENDARY));

    public static final Item AETHERITE_PICKAXE = registerItem("aetherite_pickaxe1",
            new RarityPickaxeItem(ModToolMaterials.AETHERITE, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.AETHERITE,3, -3.0f)), ModRarity.LEGENDARY));
    public static final Item AETHERITE_PICKAXE2 = registerItem("aetherite_pickaxe2",
            new RarityPickaxeItem(ModToolMaterials.AETHERITE2, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.AETHERITE2,3, -3.0f)), ModRarity.LEGENDARY));
    public static final Item AETHERITE_PICKAXE3 = registerItem("aetherite_pickaxe3",
            new RarityPickaxeItem(ModToolMaterials.AETHERITE3, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.AETHERITE3,3, -3.0f)), ModRarity.LEGENDARY));
    public static final Item AETHERITE_PICKAXE4 = registerItem("aetherite_pickaxe4",
            new RarityPickaxeItem(ModToolMaterials.AETHERITE4, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.AETHERITE4,3, -3.0f)), ModRarity.LEGENDARY));
    public static final Item AETHERITE_PICKAXE5 = registerItem("aetherite_pickaxe5",
            new RarityPickaxeItem(ModToolMaterials.AETHERITE5, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.AETHERITE5,3, -3.0f)), ModRarity.LEGENDARY));

    public static final Item AETHERITE_SHOVEL = registerItem("aetherite_shovel1",
            new RarityShovelItem(ModToolMaterials.AETHERITE, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.AETHERITE,2, -3.0f)), ModRarity.LEGENDARY));
    public static final Item AETHERITE_SHOVEL2 = registerItem("aetherite_shovel2",
            new RarityShovelItem(ModToolMaterials.AETHERITE2, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.AETHERITE2,2, -3.0f)), ModRarity.LEGENDARY));
    public static final Item AETHERITE_SHOVEL3 = registerItem("aetherite_shovel3",
            new RarityShovelItem(ModToolMaterials.AETHERITE3, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.AETHERITE3,2, -3.0f)), ModRarity.LEGENDARY));
    public static final Item AETHERITE_SHOVEL4 = registerItem("aetherite_shovel4",
            new RarityShovelItem(ModToolMaterials.AETHERITE4, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.AETHERITE4,2, -3.0f)), ModRarity.LEGENDARY));
    public static final Item AETHERITE_SHOVEL5 = registerItem("aetherite_shovel5",
            new RarityShovelItem(ModToolMaterials.AETHERITE5, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.AETHERITE5,2, -3.0f)), ModRarity.LEGENDARY));

    public static final Item AETHERITE_HOE = registerItem("aetherite_hoe1",
            new RarityHoeItem(ModToolMaterials.AETHERITE, new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.AETHERITE,3, -2.8f)), ModRarity.LEGENDARY));
    public static final Item AETHERITE_HOE2 = registerItem("aetherite_hoe2",
            new RarityHoeItem(ModToolMaterials.AETHERITE2, new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.AETHERITE2,3, -2.8f)), ModRarity.LEGENDARY));
    public static final Item AETHERITE_HOE3 = registerItem("aetherite_hoe3",
            new RarityHoeItem(ModToolMaterials.AETHERITE3, new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.AETHERITE3,3, -2.8f)), ModRarity.LEGENDARY));
    public static final Item AETHERITE_HOE4 = registerItem("aetherite_hoe4",
            new RarityHoeItem(ModToolMaterials.AETHERITE4, new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.AETHERITE4,3, -2.8f)), ModRarity.LEGENDARY));
    public static final Item AETHERITE_HOE5 = registerItem("aetherite_hoe5",
            new RarityHoeItem(ModToolMaterials.AETHERITE5, new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.AETHERITE5,3, -2.8f)), ModRarity.LEGENDARY));


    public static final Item AETHERITE_HELMET1 = registerItem("aetherite_helmet1",
            new RarityArmorItem(ModArmorMaterials.AETHERITE_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(42)), ModRarity.LEGENDARY));
    public static final Item AETHERITE_HELMET2 = registerItem("aetherite_helmet2",
            new RarityArmorItem(ModArmorMaterials.AETHERITE_ARMOR_MATERIAL2, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(44)), ModRarity.LEGENDARY));
    public static final Item AETHERITE_HELMET3 = registerItem("aetherite_helmet3",
            new RarityArmorItem(ModArmorMaterials.AETHERITE_ARMOR_MATERIAL3, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(46)), ModRarity.LEGENDARY));
    public static final Item AETHERITE_HELMET4 = registerItem("aetherite_helmet4",
            new RarityArmorItem(ModArmorMaterials.AETHERITE_ARMOR_MATERIAL4, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(48)), ModRarity.LEGENDARY));
    public static final Item AETHERITE_HELMET5 = registerItem("aetherite_helmet5",
            new RarityArmorItem(ModArmorMaterials.AETHERITE_ARMOR_MATERIAL5, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(50)), ModRarity.LEGENDARY));


    public static final Item AETHERITE_CHESTPLATE1 = registerItem("aetherite_chestplate1",
            new RarityModArmorItem(ModArmorMaterials.AETHERITE_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(42)), ModRarity.LEGENDARY));
    public static final Item AETHERITE_CHESTPLATE2 = registerItem("aetherite_chestplate2",
            new RarityModArmorItem(ModArmorMaterials.AETHERITE_ARMOR_MATERIAL2, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(44)), ModRarity.LEGENDARY));
    public static final Item AETHERITE_CHESTPLATE3 = registerItem("aetherite_chestplate3",
            new RarityModArmorItem(ModArmorMaterials.AETHERITE_ARMOR_MATERIAL3, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(46)), ModRarity.LEGENDARY));
    public static final Item AETHERITE_CHESTPLATE4 = registerItem("aetherite_chestplate4",
            new RarityModArmorItem(ModArmorMaterials.AETHERITE_ARMOR_MATERIAL4, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(48)), ModRarity.LEGENDARY));
    public static final Item AETHERITE_CHESTPLATE5 = registerItem("aetherite_chestplate5",
            new RarityModArmorItem(ModArmorMaterials.AETHERITE_ARMOR_MATERIAL5, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(50)), ModRarity.LEGENDARY));


    public static final Item AETHERITE_LEGGINGS1 = registerItem("aetherite_leggings1",
            new RarityArmorItem(ModArmorMaterials.AETHERITE_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(42)), ModRarity.LEGENDARY));
    public static final Item AETHERITE_LEGGINGS2 = registerItem("aetherite_leggings2",
            new RarityArmorItem(ModArmorMaterials.AETHERITE_ARMOR_MATERIAL2, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(44)), ModRarity.LEGENDARY));
    public static final Item AETHERITE_LEGGINGS3 = registerItem("aetherite_leggings3",
            new RarityArmorItem(ModArmorMaterials.AETHERITE_ARMOR_MATERIAL3, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(46)), ModRarity.LEGENDARY));
    public static final Item AETHERITE_LEGGINGS4 = registerItem("aetherite_leggings4",
            new RarityArmorItem(ModArmorMaterials.AETHERITE_ARMOR_MATERIAL4, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(48)), ModRarity.LEGENDARY));
    public static final Item AETHERITE_LEGGINGS5 = registerItem("aetherite_leggings5",
            new RarityArmorItem(ModArmorMaterials.AETHERITE_ARMOR_MATERIAL5, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(50)), ModRarity.LEGENDARY));


    public static final Item AETHERITE_BOOTS1 = registerItem("aetherite_boots1",
            new RarityArmorItem(ModArmorMaterials.AETHERITE_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(42)), ModRarity.LEGENDARY));
    public static final Item AETHERITE_BOOTS2 = registerItem("aetherite_boots2",
            new RarityArmorItem(ModArmorMaterials.AETHERITE_ARMOR_MATERIAL2, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(44)), ModRarity.LEGENDARY));
    public static final Item AETHERITE_BOOTS3 = registerItem("aetherite_boots3",
            new RarityArmorItem(ModArmorMaterials.AETHERITE_ARMOR_MATERIAL3, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(46)), ModRarity.LEGENDARY));
    public static final Item AETHERITE_BOOTS4 = registerItem("aetherite_boots4",
            new RarityArmorItem(ModArmorMaterials.AETHERITE_ARMOR_MATERIAL4, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(48)), ModRarity.LEGENDARY));
    public static final Item AETHERITE_BOOTS5 = registerItem("aetherite_boots5",
            new RarityArmorItem(ModArmorMaterials.AETHERITE_ARMOR_MATERIAL5, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(50)), ModRarity.LEGENDARY));


    public static final Item TITANITE_UPGRADE_SMITHING_TEMPLATE = registerItem("titanite_upgrade_smithing_template", ModSmithingTemplateItem.createTitaniteUpgrade());
    public static final Item TITANITE_UPGRADE_SMITHING_TEMPLATE2 = registerItem("titanite_upgrade_smithing_template2", ModSmithingTemplateItem.createTitaniteUpgrade());
    public static final Item TITANITE_UPGRADE_SMITHING_TEMPLATE3 = registerItem("titanite_upgrade_smithing_template3", ModSmithingTemplateItem.createTitaniteUpgrade());
    public static final Item TITANITE_UPGRADE_SMITHING_TEMPLATE4 = registerItem("titanite_upgrade_smithing_template4", ModSmithingTemplateItem.createTitaniteUpgrade());
    public static final Item TITANITE_UPGRADE_SMITHING_TEMPLATE5 = registerItem("titanite_upgrade_smithing_template5", ModSmithingTemplateItem.createTitaniteUpgrade());


    public static final Item TITANITE_KATANA1 = registerItem("titanite_katana1",
            new RaritySwordItem(ModToolMaterials.TITANITE, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.TITANITE,6, -2.2f)), ModRarity.MYTHIC));
    public static final Item TITANITE_KATANA2 = registerItem("titanite_katana2",
            new RaritySwordItem(ModToolMaterials.TITANITE2, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.TITANITE2,6, -2.2f)), ModRarity.MYTHIC));
    public static final Item TITANITE_KATANA3 = registerItem("titanite_katana3",
            new RaritySwordItem(ModToolMaterials.TITANITE3, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.TITANITE3,6, -2.2f)), ModRarity.MYTHIC));
    public static final Item TITANITE_KATANA4 = registerItem("titanite_katana4",
            new RaritySwordItem(ModToolMaterials.TITANITE4, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.TITANITE4,6, -2.2f)), ModRarity.MYTHIC));
    public static final Item TITANITE_KATANA5 = registerItem("titanite_katana5",
            new RaritySwordItem(ModToolMaterials.TITANITE5, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.TITANITE5,6, -2.2f)), ModRarity.MYTHIC));


    public static final Item TITANITE_AXE = registerItem("titanite_axe1",
            new RarityAxeItem(ModToolMaterials.TITANITE, new Item.Settings()
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.TITANITE,8, -2.8f)), ModRarity.MYTHIC));
    public static final Item TITANITE_AXE2 = registerItem("titanite_axe2",
            new RarityAxeItem(ModToolMaterials.TITANITE2, new Item.Settings()
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.TITANITE2,8, -2.8f)), ModRarity.MYTHIC));
    public static final Item TITANITE_AXE3 = registerItem("titanite_axe3",
            new RarityAxeItem(ModToolMaterials.TITANITE3, new Item.Settings()
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.TITANITE3,8, -2.8f)), ModRarity.MYTHIC));
    public static final Item TITANITE_AXE4 = registerItem("titanite_axe4",
            new RarityAxeItem(ModToolMaterials.TITANITE4, new Item.Settings()
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.TITANITE4,8, -2.8f)), ModRarity.MYTHIC));
    public static final Item TITANITE_AXE5 = registerItem("titanite_axe5",
            new RarityAxeItem(ModToolMaterials.TITANITE5, new Item.Settings()
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.TITANITE5,8, -2.8f)), ModRarity.MYTHIC));

    public static final Item TITANITE_PICKAXE = registerItem("titanite_pickaxe1",
            new RarityPickaxeItem(ModToolMaterials.TITANITE, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.TITANITE,3, -2.8f)), ModRarity.MYTHIC));
    public static final Item TITANITE_PICKAXE2 = registerItem("titanite_pickaxe2",
            new RarityPickaxeItem(ModToolMaterials.TITANITE2, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.TITANITE2,3, -2.8f)), ModRarity.MYTHIC));
    public static final Item TITANITE_PICKAXE3 = registerItem("titanite_pickaxe3",
            new RarityPickaxeItem(ModToolMaterials.TITANITE3, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.TITANITE3,3, -2.8f)), ModRarity.MYTHIC));
    public static final Item TITANITE_PICKAXE4 = registerItem("titanite_pickaxe4",
            new RarityPickaxeItem(ModToolMaterials.TITANITE4, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.TITANITE4,3, -2.8f)), ModRarity.MYTHIC));
    public static final Item TITANITE_PICKAXE5 = registerItem("titanite_pickaxe5",
            new RarityPickaxeItem(ModToolMaterials.TITANITE5, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.TITANITE5,3, -2.8f)), ModRarity.MYTHIC));

    public static final Item TITANITE_SHOVEL = registerItem("titanite_shovel1",
            new RarityShovelItem(ModToolMaterials.TITANITE, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.TITANITE,2, -2.8f)), ModRarity.MYTHIC));
    public static final Item TITANITE_SHOVEL2 = registerItem("titanite_shovel2",
            new RarityShovelItem(ModToolMaterials.TITANITE2, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.TITANITE2,2, -2.8f)), ModRarity.MYTHIC));
    public static final Item TITANITE_SHOVEL3 = registerItem("titanite_shovel3",
            new RarityShovelItem(ModToolMaterials.TITANITE3, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.TITANITE3,2, -2.8f)), ModRarity.MYTHIC));
    public static final Item TITANITE_SHOVEL4 = registerItem("titanite_shovel4",
            new RarityShovelItem(ModToolMaterials.TITANITE4, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.TITANITE4,2, -2.8f)), ModRarity.MYTHIC));
    public static final Item TITANITE_SHOVEL5 = registerItem("titanite_shovel5",
            new RarityShovelItem(ModToolMaterials.TITANITE5, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.TITANITE5,2, -2.8f)), ModRarity.MYTHIC));

    public static final Item TITANITE_HOE = registerItem("titanite_hoe1",
            new RarityHoeItem(ModToolMaterials.TITANITE, new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.TITANITE,3, -2.6f)), ModRarity.MYTHIC));
    public static final Item TITANITE_HOE2 = registerItem("titanite_hoe2",
            new RarityHoeItem(ModToolMaterials.TITANITE2, new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.TITANITE2,3, -2.6f)), ModRarity.MYTHIC));
    public static final Item TITANITE_HOE3 = registerItem("titanite_hoe3",
            new RarityHoeItem(ModToolMaterials.TITANITE3, new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.TITANITE3,3, -2.6f)), ModRarity.MYTHIC));
    public static final Item TITANITE_HOE4 = registerItem("titanite_hoe4",
            new RarityHoeItem(ModToolMaterials.TITANITE4, new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.TITANITE4,3, -2.6f)), ModRarity.MYTHIC));
    public static final Item TITANITE_HOE5 = registerItem("titanite_hoe5",
            new RarityHoeItem(ModToolMaterials.TITANITE5, new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.TITANITE5,3, -2.6f)), ModRarity.MYTHIC));


    public static final Item TITANITE_HELMET1 = registerItem("titanite_helmet1",
            new RarityArmorItem(ModArmorMaterials.TITANITE_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(52)), ModRarity.MYTHIC));
    public static final Item TITANITE_HELMET2 = registerItem("titanite_helmet2",
            new RarityArmorItem(ModArmorMaterials.TITANITE_ARMOR_MATERIAL2, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(54)), ModRarity.MYTHIC));
    public static final Item TITANITE_HELMET3 = registerItem("titanite_helmet3",
            new RarityArmorItem(ModArmorMaterials.TITANITE_ARMOR_MATERIAL3, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(56)), ModRarity.MYTHIC));
    public static final Item TITANITE_HELMET4 = registerItem("titanite_helmet4",
            new RarityArmorItem(ModArmorMaterials.TITANITE_ARMOR_MATERIAL4, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(58)), ModRarity.MYTHIC));
    public static final Item TITANITE_HELMET5 = registerItem("titanite_helmet5",
            new RarityArmorItem(ModArmorMaterials.TITANITE_ARMOR_MATERIAL5, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(60)), ModRarity.MYTHIC));


    public static final Item TITANITE_CHESTPLATE1 = registerItem("titanite_chestplate1",
            new RarityModArmorItem(ModArmorMaterials.TITANITE_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(52)), ModRarity.MYTHIC));
    public static final Item TITANITE_CHESTPLATE2 = registerItem("titanite_chestplate2",
            new RarityModArmorItem(ModArmorMaterials.TITANITE_ARMOR_MATERIAL2, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(54)), ModRarity.MYTHIC));
    public static final Item TITANITE_CHESTPLATE3 = registerItem("titanite_chestplate3",
            new RarityModArmorItem(ModArmorMaterials.TITANITE_ARMOR_MATERIAL3, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(56)), ModRarity.MYTHIC));
    public static final Item TITANITE_CHESTPLATE4 = registerItem("titanite_chestplate4",
            new RarityModArmorItem(ModArmorMaterials.TITANITE_ARMOR_MATERIAL4, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(58)), ModRarity.MYTHIC));
    public static final Item TITANITE_CHESTPLATE5 = registerItem("titanite_chestplate5",
            new RarityModArmorItem(ModArmorMaterials.TITANITE_ARMOR_MATERIAL5, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(60)), ModRarity.MYTHIC));


    public static final Item TITANITE_LEGGINGS1 = registerItem("titanite_leggings1",
            new RarityArmorItem(ModArmorMaterials.TITANITE_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(52)), ModRarity.MYTHIC));
    public static final Item TITANITE_LEGGINGS2 = registerItem("titanite_leggings2",
            new RarityArmorItem(ModArmorMaterials.TITANITE_ARMOR_MATERIAL2, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(54)), ModRarity.MYTHIC));
    public static final Item TITANITE_LEGGINGS3 = registerItem("titanite_leggings3",
            new RarityArmorItem(ModArmorMaterials.TITANITE_ARMOR_MATERIAL3, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(56)), ModRarity.MYTHIC));
    public static final Item TITANITE_LEGGINGS4 = registerItem("titanite_leggings4",
            new RarityArmorItem(ModArmorMaterials.TITANITE_ARMOR_MATERIAL4, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(58)), ModRarity.MYTHIC));
    public static final Item TITANITE_LEGGINGS5 = registerItem("titanite_leggings5",
            new RarityArmorItem(ModArmorMaterials.TITANITE_ARMOR_MATERIAL5, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(60)), ModRarity.MYTHIC));


    public static final Item TITANITE_BOOTS1 = registerItem("titanite_boots1",
            new RarityArmorItem(ModArmorMaterials.TITANITE_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(52)), ModRarity.MYTHIC));
    public static final Item TITANITE_BOOTS2 = registerItem("titanite_boots2",
            new RarityArmorItem(ModArmorMaterials.TITANITE_ARMOR_MATERIAL2, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(54)), ModRarity.MYTHIC));
    public static final Item TITANITE_BOOTS3 = registerItem("titanite_boots3",
            new RarityArmorItem(ModArmorMaterials.TITANITE_ARMOR_MATERIAL3, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(56)), ModRarity.MYTHIC));
    public static final Item TITANITE_BOOTS4 = registerItem("titanite_boots4",
            new RarityArmorItem(ModArmorMaterials.TITANITE_ARMOR_MATERIAL4, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(58)), ModRarity.MYTHIC));
    public static final Item TITANITE_BOOTS5 = registerItem("titanite_boots5",
            new RarityArmorItem(ModArmorMaterials.TITANITE_ARMOR_MATERIAL5, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(60)), ModRarity.MYTHIC));

    public static final Item ETERNITE_UPGRADE_SMITHING_TEMPLATE1 = registerItem("eternite_upgrade_smithing_template1", ModSmithingTemplateItem.createEterniteUpgrade());
    public static final Item ETERNITE_UPGRADE_SMITHING_TEMPLATE2 = registerItem("eternite_upgrade_smithing_template2", ModSmithingTemplateItem.createEterniteUpgrade());
    public static final Item ETERNITE_UPGRADE_SMITHING_TEMPLATE3 = registerItem("eternite_upgrade_smithing_template3", ModSmithingTemplateItem.createEterniteUpgrade());
    public static final Item ETERNITE_UPGRADE_SMITHING_TEMPLATE4 = registerItem("eternite_upgrade_smithing_template4", ModSmithingTemplateItem.createEterniteUpgrade());
    public static final Item ETERNITE_UPGRADE_SMITHING_TEMPLATE5 = registerItem("eternite_upgrade_smithing_template5", ModSmithingTemplateItem.createEterniteUpgrade());


    public static final Item ETERNITE_KATANA1 = registerItem("eternite_katana1",
            new RaritySwordItem(ModToolMaterials.ETERNITE1, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.ETERNITE1,6, -2.0f)), ModRarity.DIVINE));
    public static final Item ETERNITE_KATANA2 = registerItem("eternite_katana2",
            new RaritySwordItem(ModToolMaterials.ETERNITE2, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.ETERNITE2,6, -2.0f)), ModRarity.DIVINE));
    public static final Item ETERNITE_KATANA3 = registerItem("eternite_katana3",
            new RaritySwordItem(ModToolMaterials.ETERNITE3, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.ETERNITE3,6, -2.0f)), ModRarity.DIVINE));
    public static final Item ETERNITE_KATANA4 = registerItem("eternite_katana4",
            new RaritySwordItem(ModToolMaterials.ETERNITE4, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.ETERNITE4,6, -2.0f)), ModRarity.DIVINE));
    public static final Item ETERNITE_KATANA5 = registerItem("eternite_katana5",
            new RaritySwordItem(ModToolMaterials.ETERNITE5, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.ETERNITE5,6, -2.0f)), ModRarity.DIVINE));


    public static final Item ETERNITE_AXE1 = registerItem("eternite_axe1",
            new RarityHoeItem(ModToolMaterials.ETERNITE1, new Item.Settings()
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.ETERNITE1,8, -2.8f)), ModRarity.DIVINE));
    public static final Item ETERNITE_AXE2 = registerItem("eternite_axe2",
            new RarityHoeItem(ModToolMaterials.ETERNITE2, new Item.Settings()
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.ETERNITE2,8, -2.8f)), ModRarity.DIVINE));
    public static final Item ETERNITE_AXE3 = registerItem("eternite_axe3",
            new RarityHoeItem(ModToolMaterials.ETERNITE3, new Item.Settings()
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.ETERNITE3,8, -2.8f)), ModRarity.DIVINE));
    public static final Item ETERNITE_AXE4 = registerItem("eternite_axe4",
            new RarityHoeItem(ModToolMaterials.ETERNITE4, new Item.Settings()
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.ETERNITE4,8, -2.8f)), ModRarity.DIVINE));
    public static final Item ETERNITE_AXE5 = registerItem("eternite_axe5",
            new RarityHoeItem(ModToolMaterials.ETERNITE5, new Item.Settings()
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.ETERNITE5,8, -2.8f)), ModRarity.DIVINE));

    public static final Item ETERNITE_PICKAXE1 = registerItem("eternite_pickaxe1",
            new RarityPickaxeItem(ModToolMaterials.ETERNITE1, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.ETERNITE1,3, -2.8f)), ModRarity.DIVINE));
    public static final Item ETERNITE_PICKAXE2 = registerItem("eternite_pickaxe2",
            new RarityPickaxeItem(ModToolMaterials.ETERNITE2, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.ETERNITE2,3, -2.8f)), ModRarity.DIVINE));
    public static final Item ETERNITE_PICKAXE3 = registerItem("eternite_pickaxe3",
            new RarityPickaxeItem(ModToolMaterials.ETERNITE3, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.ETERNITE3,3, -2.8f)), ModRarity.DIVINE));
    public static final Item ETERNITE_PICKAXE4 = registerItem("eternite_pickaxe4",
            new RarityPickaxeItem(ModToolMaterials.ETERNITE4, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.ETERNITE4,3, -2.8f)), ModRarity.DIVINE));
    public static final Item ETERNITE_PICKAXE5 = registerItem("eternite_pickaxe5",
            new RarityPickaxeItem(ModToolMaterials.ETERNITE5, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.ETERNITE5,3, -2.8f)), ModRarity.DIVINE));

    public static final Item ETERNITE_SHOVEL1 = registerItem("eternite_shovel1",
            new RarityShovelItem(ModToolMaterials.ETERNITE1, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.ETERNITE1,2, -2.8f)), ModRarity.DIVINE));
    public static final Item ETERNITE_SHOVEL2 = registerItem("eternite_shovel2",
            new RarityShovelItem(ModToolMaterials.ETERNITE2, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.ETERNITE2,2, -2.8f)), ModRarity.DIVINE));
    public static final Item ETERNITE_SHOVEL3 = registerItem("eternite_shovel3",
            new RarityShovelItem(ModToolMaterials.ETERNITE3, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.ETERNITE3,2, -2.8f)), ModRarity.DIVINE));
    public static final Item ETERNITE_SHOVEL4 = registerItem("eternite_shovel4",
            new RarityShovelItem(ModToolMaterials.ETERNITE4, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.ETERNITE4,2, -2.8f)), ModRarity.DIVINE));
    public static final Item ETERNITE_SHOVEL5 = registerItem("eternite_shovel5",
            new RarityShovelItem(ModToolMaterials.ETERNITE5, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.ETERNITE5,2, -2.8f)), ModRarity.DIVINE));

    public static final Item ETERNITE_HOE1 = registerItem("eternite_hoe1",
            new RarityHoeItem(ModToolMaterials.ETERNITE1, new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.ETERNITE1,3, -2.6f)), ModRarity.DIVINE));
    public static final Item ETERNITE_HOE2 = registerItem("eternite_hoe2",
            new RarityHoeItem(ModToolMaterials.ETERNITE2, new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.ETERNITE2,3, -2.6f)), ModRarity.DIVINE));
    public static final Item ETERNITE_HOE3 = registerItem("eternite_hoe3",
            new RarityHoeItem(ModToolMaterials.ETERNITE3, new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.ETERNITE3,3, -2.6f)), ModRarity.DIVINE));
    public static final Item ETERNITE_HOE4 = registerItem("eternite_hoe4",
            new RarityHoeItem(ModToolMaterials.ETERNITE4, new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.ETERNITE4,3, -2.6f)), ModRarity.DIVINE));
    public static final Item ETERNITE_HOE5 = registerItem("eternite_hoe5",
            new RarityHoeItem(ModToolMaterials.ETERNITE5, new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.ETERNITE5,3, -2.6f)), ModRarity.DIVINE));


    public static final Item ETERNITE_HELMET1 = registerItem("eternite_helmet1",
            new RarityArmorItem(ModArmorMaterials.ETERNITE_ARMOR_MATERIAL1, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(62)), ModRarity.DIVINE));
    public static final Item ETERNITE_HELMET2 = registerItem("eternite_helmet2",
            new RarityArmorItem(ModArmorMaterials.ETERNITE_ARMOR_MATERIAL2, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(64)), ModRarity.DIVINE));
    public static final Item ETERNITE_HELMET3 = registerItem("eternite_helmet3",
            new RarityArmorItem(ModArmorMaterials.ETERNITE_ARMOR_MATERIAL3, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(66)), ModRarity.DIVINE));
    public static final Item ETERNITE_HELMET4 = registerItem("eternite_helmet4",
            new RarityArmorItem(ModArmorMaterials.ETERNITE_ARMOR_MATERIAL4, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(68)), ModRarity.DIVINE));
    public static final Item ETERNITE_HELMET5 = registerItem("eternite_helmet5",
            new RarityArmorItem(ModArmorMaterials.ETERNITE_ARMOR_MATERIAL5, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(75)), ModRarity.DIVINE));


    public static final Item ETERNITE_CHESTPLATE1 = registerItem("eternite_chestplate1",
            new RarityModArmorItem(ModArmorMaterials.ETERNITE_ARMOR_MATERIAL1, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(62)), ModRarity.DIVINE));
    public static final Item ETERNITE_CHESTPLATE2 = registerItem("eternite_chestplate2",
            new RarityModArmorItem(ModArmorMaterials.ETERNITE_ARMOR_MATERIAL2, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(64)), ModRarity.DIVINE));
    public static final Item ETERNITE_CHESTPLATE3 = registerItem("eternite_chestplate3",
            new RarityModArmorItem(ModArmorMaterials.ETERNITE_ARMOR_MATERIAL3, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(66)), ModRarity.DIVINE));
    public static final Item ETERNITE_CHESTPLATE4 = registerItem("eternite_chestplate4",
            new RarityModArmorItem(ModArmorMaterials.ETERNITE_ARMOR_MATERIAL4, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(68)), ModRarity.DIVINE));
    public static final Item ETERNITE_CHESTPLATE5 = registerItem("eternite_chestplate5",
            new RarityModArmorItem(ModArmorMaterials.ETERNITE_ARMOR_MATERIAL5, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(75)), ModRarity.DIVINE));


    public static final Item ETERNITE_LEGGINGS1 = registerItem("eternite_leggings1",
            new RarityArmorItem(ModArmorMaterials.ETERNITE_ARMOR_MATERIAL1, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(62)), ModRarity.DIVINE));
    public static final Item ETERNITE_LEGGINGS2 = registerItem("eternite_leggings2",
            new RarityArmorItem(ModArmorMaterials.ETERNITE_ARMOR_MATERIAL2, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(64)), ModRarity.DIVINE));
    public static final Item ETERNITE_LEGGINGS3 = registerItem("eternite_leggings3",
            new RarityArmorItem(ModArmorMaterials.ETERNITE_ARMOR_MATERIAL3, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(66)), ModRarity.DIVINE));
    public static final Item ETERNITE_LEGGINGS4 = registerItem("eternite_leggings4",
            new RarityArmorItem(ModArmorMaterials.ETERNITE_ARMOR_MATERIAL4, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(68)), ModRarity.DIVINE));
    public static final Item ETERNITE_LEGGINGS5 = registerItem("eternite_leggings5",
            new RarityArmorItem(ModArmorMaterials.ETERNITE_ARMOR_MATERIAL5, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(75)), ModRarity.DIVINE));


    public static final Item ETERNITE_BOOTS1 = registerItem("eternite_boots1",
            new RarityArmorItem(ModArmorMaterials.ETERNITE_ARMOR_MATERIAL1, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(62)), ModRarity.DIVINE));
    public static final Item ETERNITE_BOOTS2 = registerItem("eternite_boots2",
            new RarityArmorItem(ModArmorMaterials.ETERNITE_ARMOR_MATERIAL2, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(64)), ModRarity.DIVINE));
    public static final Item ETERNITE_BOOTS3 = registerItem("eternite_boots3",
            new RarityArmorItem(ModArmorMaterials.ETERNITE_ARMOR_MATERIAL3, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(66)), ModRarity.DIVINE));
    public static final Item ETERNITE_BOOTS4 = registerItem("eternite_boots4",
            new RarityArmorItem(ModArmorMaterials.ETERNITE_ARMOR_MATERIAL4, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(68)), ModRarity.DIVINE));
    public static final Item ETERNITE_BOOTS5 = registerItem("eternite_boots5",
            new RarityArmorItem(ModArmorMaterials.ETERNITE_ARMOR_MATERIAL5, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(75)), ModRarity.DIVINE));


    public static final Item AETHERITE_CORE1 = register(new RarityBlockItem(ModBlocks.AETHERITE_CORE1, new Item.Settings(), ModRarity.LEGENDARY));
    public static final Item TITANITE_CORE = register(new RarityBlockItem(ModBlocks.TITANITE_CORE, new Item.Settings(), ModRarity.MYTHIC));
    public static final Item ETERNITE_CORE = register(new RarityBlockItem(ModBlocks.ETERNITE_CORE, new Item.Settings(), ModRarity.DIVINE));

    public static final Item AETHERITE_MACE = registerItem(
            "aetherite_mace",
            new RarityAetheriteMaceItem(new Item.Settings()
                            .maxDamage(750)
                            .component(DataComponentTypes.TOOL, AetheriteMaceItem.createToolComponent())
                            .attributeModifiers(AetheriteMaceItem.createAttributeModifiers()), ModRarity.LEGENDARY));

    public static final Item TITANITE_MACE = registerItem(
            "titanite_mace",
            new RarityTitaniteMaceItem(new Item.Settings()
                            .maxDamage(1000)
                            .component(DataComponentTypes.TOOL, TitaniteMaceItem.createToolComponent())
                            .attributeModifiers(TitaniteMaceItem.createAttributeModifiers()), ModRarity.MYTHIC));

    public static final Item ETERNITE_MACE = registerItem(
            "eternite_mace",
            new RarityEterniteMaceItem(new Item.Settings()
                            .maxDamage(1500)
                            .component(DataComponentTypes.TOOL, EterniteMaceItem.createToolComponent())
                            .attributeModifiers(EterniteMaceItem.createAttributeModifiers()), ModRarity.DIVINE));

    public static final Item NETHERITE_HORSE_ARMOR = registerItem(
            "netherite_horse_armor", new AnimalArmorItem(
                    ModArmorMaterials.NETHERITE_ARMOR_MATERIAL, AnimalArmorItem.Type.EQUESTRIAN, false, new Item.Settings().maxCount(1)));

    public static final Item AETHERITE_HORSE_ARMOR = registerItem(
            "aetherite_horse_armor", new AnimalArmorItem(
                    ModArmorMaterials.AETHERITE_ARMOR_MATERIAL, AnimalArmorItem.Type.EQUESTRIAN, false, new Item.Settings().maxCount(1).rarity(Rarity.EPIC)));

    public static final Item TITANITE_HORSE_ARMOR = registerItem(
            "titanite_horse_armor", new AnimalArmorItem(
                    ModArmorMaterials.TITANITE_ARMOR_MATERIAL, AnimalArmorItem.Type.EQUESTRIAN, false, new Item.Settings().maxCount(1).rarity(Rarity.EPIC)));

    public static final Item ETERNITE_HORSE_ARMOR = registerItem(
            "eternite_horse_armor", new AnimalArmorItem(
                    ModArmorMaterials.ETERNITE_ARMOR_MATERIAL1, AnimalArmorItem.Type.EQUESTRIAN, false, new Item.Settings().maxCount(1).rarity(Rarity.EPIC)));



    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(MTWA.MOD_ID, name), item);
    }

    public static void registerModItems(){
        MTWA.LOGGER.info("Registering Mod Items for " + MTWA.MOD_ID);

    }
}
