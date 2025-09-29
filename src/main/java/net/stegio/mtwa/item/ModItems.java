package net.stegio.mtwa.item;

import net.minecraft.block.Blocks;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.BannerPatternsComponent;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.stegio.mtwa.MTWA;
import net.stegio.mtwa.block.ModBlocks;
import net.stegio.mtwa.item.custom.*;

import static net.minecraft.item.Items.register;

public class ModItems {
    public static final Item AETHERITE_SCRAP = registerItem("aetherite_scrap", new Item(new Item.Settings().rarity(Rarity.RARE)));
    public static final Item TITANITE_SCRAP = registerItem("titanite_scrap", new Item(new Item.Settings().rarity(Rarity.EPIC)));

    public static final Item ESSENCE_OF_THE_SKY = registerItem("essence_of_the_sky", new Item(new Item.Settings().rarity(Rarity.RARE)));
    public static final Item ESSENCE_OF_THE_SUN = registerItem("essence_of_the_sun", new Item(new Item.Settings().rarity(Rarity.EPIC)));

    public static final Item AETHERITE_INGOT = registerItem("aetherite_ingot", new Item(new Item.Settings().rarity(Rarity.RARE)));
    public static final Item TITANITE_INGOT = registerItem("titanite_ingot", new Item(new Item.Settings().rarity(Rarity.EPIC)));

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

    public static final Item AETHERITE_UPGRADE_SMITHING_TEMPLATE = registerItem("aetherite_upgrade_smithing_template", SmithingTemplateItem.createAetheriteUpgrade());
    public static final Item AETHERITE_UPGRADE_SMITHING_TEMPLATE2 = registerItem("aetherite_upgrade_smithing_template2", SmithingTemplateItem.createAetheriteUpgrade());
    public static final Item AETHERITE_UPGRADE_SMITHING_TEMPLATE3 = registerItem("aetherite_upgrade_smithing_template3", SmithingTemplateItem.createAetheriteUpgrade());
    public static final Item AETHERITE_UPGRADE_SMITHING_TEMPLATE4 = registerItem("aetherite_upgrade_smithing_template4", SmithingTemplateItem.createAetheriteUpgrade());
    public static final Item AETHERITE_UPGRADE_SMITHING_TEMPLATE5 = registerItem("aetherite_upgrade_smithing_template5", SmithingTemplateItem.createAetheriteUpgrade());


    public static final Item AETHERITE_KATANA1 = registerItem("aetherite_katana1",
            new SwordItem(ModToolMaterials.AETHERITE, new Item.Settings().rarity(Rarity.RARE)
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.AETHERITE,6, -2.4f))));
    public static final Item AETHERITE_KATANA2 = registerItem("aetherite_katana2",
            new SwordItem(ModToolMaterials.AETHERITE2, new Item.Settings().rarity(Rarity.RARE)
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.AETHERITE2,6, -2.4f))));
    public static final Item AETHERITE_KATANA3 = registerItem("aetherite_katana3",
            new SwordItem(ModToolMaterials.AETHERITE3, new Item.Settings().rarity(Rarity.RARE)
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.AETHERITE3,6, -2.4f))));
    public static final Item AETHERITE_KATANA4 = registerItem("aetherite_katana4",
            new SwordItem(ModToolMaterials.AETHERITE4, new Item.Settings().rarity(Rarity.RARE)
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.AETHERITE4,6, -2.4f))));
    public static final Item AETHERITE_KATANA5 = registerItem("aetherite_katana5",
            new SwordItem(ModToolMaterials.AETHERITE5, new Item.Settings().rarity(Rarity.RARE)
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.AETHERITE5,6,-2.4f))));


    public static final Item AETHERITE_AXE = registerItem("aetherite_axe",
            new AxeItem(ModToolMaterials.AETHERITE, new Item.Settings().rarity(Rarity.RARE)
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.AETHERITE,8, -3.0f))));
    public static final Item AETHERITE_AXE2 = registerItem("aetherite_axe2",
            new AxeItem(ModToolMaterials.AETHERITE2, new Item.Settings().rarity(Rarity.RARE)
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.AETHERITE2,8, -3.0f))));
    public static final Item AETHERITE_AXE3 = registerItem("aetherite_axe3",
            new AxeItem(ModToolMaterials.AETHERITE3, new Item.Settings().rarity(Rarity.RARE)
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.AETHERITE3,8, -3.0f))));
    public static final Item AETHERITE_AXE4 = registerItem("aetherite_axe4",
            new AxeItem(ModToolMaterials.AETHERITE4, new Item.Settings().rarity(Rarity.RARE)
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.AETHERITE4,8, -3.0f))));
    public static final Item AETHERITE_AXE5 = registerItem("aetherite_axe5",
            new AxeItem(ModToolMaterials.AETHERITE5, new Item.Settings().rarity(Rarity.RARE)
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.AETHERITE5,8,-3.0f))));

    public static final Item AETHERITE_PICKAXE = registerItem("aetherite_pickaxe",
            new PickaxeItem(ModToolMaterials.AETHERITE, new Item.Settings().rarity(Rarity.RARE)
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.AETHERITE,3, -3.0f))));
    public static final Item AETHERITE_PICKAXE2 = registerItem("aetherite_pickaxe2",
            new PickaxeItem(ModToolMaterials.AETHERITE2, new Item.Settings().rarity(Rarity.RARE)
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.AETHERITE2,3, -3.0f))));
    public static final Item AETHERITE_PICKAXE3 = registerItem("aetherite_pickaxe3",
            new PickaxeItem(ModToolMaterials.AETHERITE3, new Item.Settings().rarity(Rarity.RARE)
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.AETHERITE3,3, -3.0f))));
    public static final Item AETHERITE_PICKAXE4 = registerItem("aetherite_pickaxe4",
            new PickaxeItem(ModToolMaterials.AETHERITE4, new Item.Settings().rarity(Rarity.RARE)
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.AETHERITE4,3, -3.0f))));
    public static final Item AETHERITE_PICKAXE5 = registerItem("aetherite_pickaxe5",
            new PickaxeItem(ModToolMaterials.AETHERITE5, new Item.Settings().rarity(Rarity.RARE)
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.AETHERITE5,3, -3.0f))));

    public static final Item AETHERITE_SHOVEL = registerItem("aetherite_shovel",
            new ShovelItem(ModToolMaterials.AETHERITE, new Item.Settings().rarity(Rarity.RARE)
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.AETHERITE,2, -3.0f))));
    public static final Item AETHERITE_SHOVEL2 = registerItem("aetherite_shovel2",
            new ShovelItem(ModToolMaterials.AETHERITE2, new Item.Settings().rarity(Rarity.RARE)
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.AETHERITE2,2, -3.0f))));
    public static final Item AETHERITE_SHOVEL3 = registerItem("aetherite_shovel3",
            new ShovelItem(ModToolMaterials.AETHERITE3, new Item.Settings().rarity(Rarity.RARE)
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.AETHERITE3,2, -3.0f))));
    public static final Item AETHERITE_SHOVEL4 = registerItem("aetherite_shovel4",
            new ShovelItem(ModToolMaterials.AETHERITE4, new Item.Settings().rarity(Rarity.RARE)
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.AETHERITE4,2, -3.0f))));
    public static final Item AETHERITE_SHOVEL5 = registerItem("aetherite_shovel5",
            new ShovelItem(ModToolMaterials.AETHERITE5, new Item.Settings().rarity(Rarity.RARE)
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.AETHERITE5,2, -3.0f))));

    public static final Item AETHERITE_HOE = registerItem("aetherite_hoe",
            new HoeItem(ModToolMaterials.AETHERITE, new Item.Settings().rarity(Rarity.RARE)
                    .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.AETHERITE,3, -2.8f))));
    public static final Item AETHERITE_HOE2 = registerItem("aetherite_hoe2",
            new HoeItem(ModToolMaterials.AETHERITE2, new Item.Settings().rarity(Rarity.RARE)
                    .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.AETHERITE2,3, -2.8f))));
    public static final Item AETHERITE_HOE3 = registerItem("aetherite_hoe3",
            new HoeItem(ModToolMaterials.AETHERITE3, new Item.Settings().rarity(Rarity.RARE)
                    .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.AETHERITE3,3, -2.8f))));
    public static final Item AETHERITE_HOE4 = registerItem("aetherite_hoe4",
            new HoeItem(ModToolMaterials.AETHERITE4, new Item.Settings().rarity(Rarity.RARE)
                    .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.AETHERITE4,3, -2.8f))));
    public static final Item AETHERITE_HOE5 = registerItem("aetherite_hoe5",
            new HoeItem(ModToolMaterials.AETHERITE5, new Item.Settings().rarity(Rarity.RARE)
                    .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.AETHERITE5,3, -2.8f))));


    public static final Item AETHERITE_HELMET1 = registerItem("aetherite_helmet1",
            new ArmorItem(ModArmorMaterials.AETHERITE_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings().rarity(Rarity.RARE)
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(42))));
    public static final Item AETHERITE_HELMET2 = registerItem("aetherite_helmet2",
            new ArmorItem(ModArmorMaterials.AETHERITE_ARMOR_MATERIAL2, ArmorItem.Type.HELMET, new Item.Settings().rarity(Rarity.RARE)
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(44))));
    public static final Item AETHERITE_HELMET3 = registerItem("aetherite_helmet3",
            new ArmorItem(ModArmorMaterials.AETHERITE_ARMOR_MATERIAL3, ArmorItem.Type.HELMET, new Item.Settings().rarity(Rarity.RARE)
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(46))));
    public static final Item AETHERITE_HELMET4 = registerItem("aetherite_helmet4",
            new ArmorItem(ModArmorMaterials.AETHERITE_ARMOR_MATERIAL4, ArmorItem.Type.HELMET, new Item.Settings().rarity(Rarity.RARE)
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(48))));
    public static final Item AETHERITE_HELMET5 = registerItem("aetherite_helmet5",
            new ArmorItem(ModArmorMaterials.AETHERITE_ARMOR_MATERIAL5, ArmorItem.Type.HELMET, new Item.Settings().rarity(Rarity.RARE)
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(50))));


    public static final Item AETHERITE_CHESTPLATE1 = registerItem("aetherite_chestplate1",
            new ModArmorItem(ModArmorMaterials.AETHERITE_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings().rarity(Rarity.RARE)
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(42))));
    public static final Item AETHERITE_CHESTPLATE2 = registerItem("aetherite_chestplate2",
            new ModArmorItem(ModArmorMaterials.AETHERITE_ARMOR_MATERIAL2, ArmorItem.Type.CHESTPLATE, new Item.Settings().rarity(Rarity.RARE)
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(44))));
    public static final Item AETHERITE_CHESTPLATE3 = registerItem("aetherite_chestplate3",
            new ModArmorItem(ModArmorMaterials.AETHERITE_ARMOR_MATERIAL3, ArmorItem.Type.CHESTPLATE, new Item.Settings().rarity(Rarity.RARE)
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(46))));
    public static final Item AETHERITE_CHESTPLATE4 = registerItem("aetherite_chestplate4",
            new ModArmorItem(ModArmorMaterials.AETHERITE_ARMOR_MATERIAL4, ArmorItem.Type.CHESTPLATE, new Item.Settings().rarity(Rarity.RARE)
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(48))));
    public static final Item AETHERITE_CHESTPLATE5 = registerItem("aetherite_chestplate5",
            new ModArmorItem(ModArmorMaterials.AETHERITE_ARMOR_MATERIAL5, ArmorItem.Type.CHESTPLATE, new Item.Settings().rarity(Rarity.RARE)
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(50))));


    public static final Item AETHERITE_LEGGINGS1 = registerItem("aetherite_leggings1",
            new ArmorItem(ModArmorMaterials.AETHERITE_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings().rarity(Rarity.RARE)
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(42))));
    public static final Item AETHERITE_LEGGINGS2 = registerItem("aetherite_leggings2",
            new ArmorItem(ModArmorMaterials.AETHERITE_ARMOR_MATERIAL2, ArmorItem.Type.LEGGINGS, new Item.Settings().rarity(Rarity.RARE)
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(44))));
    public static final Item AETHERITE_LEGGINGS3 = registerItem("aetherite_leggings3",
            new ArmorItem(ModArmorMaterials.AETHERITE_ARMOR_MATERIAL3, ArmorItem.Type.LEGGINGS, new Item.Settings().rarity(Rarity.RARE)
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(46))));
    public static final Item AETHERITE_LEGGINGS4 = registerItem("aetherite_leggings4",
            new ArmorItem(ModArmorMaterials.AETHERITE_ARMOR_MATERIAL4, ArmorItem.Type.LEGGINGS, new Item.Settings().rarity(Rarity.RARE)
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(48))));
    public static final Item AETHERITE_LEGGINGS5 = registerItem("aetherite_leggings5",
            new ArmorItem(ModArmorMaterials.AETHERITE_ARMOR_MATERIAL5, ArmorItem.Type.LEGGINGS, new Item.Settings().rarity(Rarity.RARE)
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(50))));


    public static final Item AETHERITE_BOOTS1 = registerItem("aetherite_boots1",
            new ArmorItem(ModArmorMaterials.AETHERITE_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings().rarity(Rarity.RARE)
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(42))));
    public static final Item AETHERITE_BOOTS2 = registerItem("aetherite_boots2",
            new ArmorItem(ModArmorMaterials.AETHERITE_ARMOR_MATERIAL2, ArmorItem.Type.BOOTS, new Item.Settings().rarity(Rarity.RARE)
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(44))));
    public static final Item AETHERITE_BOOTS3 = registerItem("aetherite_boots3",
            new ArmorItem(ModArmorMaterials.AETHERITE_ARMOR_MATERIAL3, ArmorItem.Type.BOOTS, new Item.Settings().rarity(Rarity.RARE)
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(46))));
    public static final Item AETHERITE_BOOTS4 = registerItem("aetherite_boots4",
            new ArmorItem(ModArmorMaterials.AETHERITE_ARMOR_MATERIAL4, ArmorItem.Type.BOOTS, new Item.Settings().rarity(Rarity.RARE)
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(48))));
    public static final Item AETHERITE_BOOTS5 = registerItem("aetherite_boots5",
            new ArmorItem(ModArmorMaterials.AETHERITE_ARMOR_MATERIAL5, ArmorItem.Type.BOOTS, new Item.Settings().rarity(Rarity.RARE)
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(50))));


    public static final Item TITANITE_UPGRADE_SMITHING_TEMPLATE = registerItem("titanite_upgrade_smithing_template", SmithingTemplateItem.createTitaniteUpgrade());
    public static final Item TITANITE_UPGRADE_SMITHING_TEMPLATE2 = registerItem("titanite_upgrade_smithing_template2", SmithingTemplateItem.createTitaniteUpgrade());
    public static final Item TITANITE_UPGRADE_SMITHING_TEMPLATE3 = registerItem("titanite_upgrade_smithing_template3", SmithingTemplateItem.createTitaniteUpgrade());
    public static final Item TITANITE_UPGRADE_SMITHING_TEMPLATE4 = registerItem("titanite_upgrade_smithing_template4", SmithingTemplateItem.createTitaniteUpgrade());
    public static final Item TITANITE_UPGRADE_SMITHING_TEMPLATE5 = registerItem("titanite_upgrade_smithing_template5", SmithingTemplateItem.createTitaniteUpgrade());


    public static final Item TITANITE_KATANA1 = registerItem("titanite_katana1",
            new SwordItem(ModToolMaterials.TITANITE, new Item.Settings().rarity(Rarity.EPIC)
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.TITANITE,6, -2.2f))));
    public static final Item TITANITE_KATANA2 = registerItem("titanite_katana2",
            new SwordItem(ModToolMaterials.TITANITE2, new Item.Settings().rarity(Rarity.EPIC)
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.TITANITE2,6, -2.2f))));
    public static final Item TITANITE_KATANA3 = registerItem("titanite_katana3",
            new SwordItem(ModToolMaterials.TITANITE3, new Item.Settings().rarity(Rarity.EPIC)
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.TITANITE3,6, -2.2f))));
    public static final Item TITANITE_KATANA4 = registerItem("titanite_katana4",
            new SwordItem(ModToolMaterials.TITANITE4, new Item.Settings().rarity(Rarity.EPIC)
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.TITANITE4,6, -2.2f))));
    public static final Item TITANITE_KATANA5 = registerItem("titanite_katana5",
            new SwordItem(ModToolMaterials.TITANITE5, new Item.Settings().rarity(Rarity.EPIC)
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.TITANITE5,6, -2.2f))));


    public static final Item TITANITE_AXE = registerItem("titanite_axe",
            new AxeItem(ModToolMaterials.TITANITE, new Item.Settings().rarity(Rarity.EPIC)
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.TITANITE,8, -2.8f))));
    public static final Item TITANITE_AXE2 = registerItem("titanite_axe2",
            new AxeItem(ModToolMaterials.TITANITE2, new Item.Settings().rarity(Rarity.EPIC)
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.TITANITE2,8, -2.8f))));
    public static final Item TITANITE_AXE3 = registerItem("titanite_axe3",
            new AxeItem(ModToolMaterials.TITANITE3, new Item.Settings().rarity(Rarity.EPIC)
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.TITANITE3,8, -2.8f))));
    public static final Item TITANITE_AXE4 = registerItem("titanite_axe4",
            new AxeItem(ModToolMaterials.TITANITE4, new Item.Settings().rarity(Rarity.EPIC)
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.TITANITE4,8, -2.8f))));
    public static final Item TITANITE_AXE5 = registerItem("titanite_axe5",
            new AxeItem(ModToolMaterials.TITANITE5, new Item.Settings().rarity(Rarity.EPIC)
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.TITANITE5,8, -2.8f))));

    public static final Item TITANITE_PICKAXE = registerItem("titanite_pickaxe",
            new PickaxeItem(ModToolMaterials.TITANITE, new Item.Settings().rarity(Rarity.EPIC)
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.TITANITE,3, -2.8f))));
    public static final Item TITANITE_PICKAXE2 = registerItem("titanite_pickaxe2",
            new PickaxeItem(ModToolMaterials.TITANITE2, new Item.Settings().rarity(Rarity.EPIC)
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.TITANITE2,3, -2.8f))));
    public static final Item TITANITE_PICKAXE3 = registerItem("titanite_pickaxe3",
            new PickaxeItem(ModToolMaterials.TITANITE3, new Item.Settings().rarity(Rarity.EPIC)
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.TITANITE3,3, -2.8f))));
    public static final Item TITANITE_PICKAXE4 = registerItem("titanite_pickaxe4",
            new PickaxeItem(ModToolMaterials.TITANITE4, new Item.Settings().rarity(Rarity.EPIC)
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.TITANITE4,3, -2.8f))));
    public static final Item TITANITE_PICKAXE5 = registerItem("titanite_pickaxe5",
            new PickaxeItem(ModToolMaterials.TITANITE5, new Item.Settings().rarity(Rarity.EPIC)
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.TITANITE5,3, -2.8f))));

    public static final Item TITANITE_SHOVEL = registerItem("titanite_shovel",
            new ShovelItem(ModToolMaterials.TITANITE, new Item.Settings().rarity(Rarity.EPIC)
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.TITANITE,2, -2.8f))));
    public static final Item TITANITE_SHOVEL2 = registerItem("titanite_shovel2",
            new ShovelItem(ModToolMaterials.TITANITE2, new Item.Settings().rarity(Rarity.EPIC)
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.TITANITE2,2, -2.8f))));
    public static final Item TITANITE_SHOVEL3 = registerItem("titanite_shovel3",
            new ShovelItem(ModToolMaterials.TITANITE3, new Item.Settings().rarity(Rarity.EPIC)
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.TITANITE3,2, -2.8f))));
    public static final Item TITANITE_SHOVEL4 = registerItem("titanite_shovel4",
            new ShovelItem(ModToolMaterials.TITANITE4, new Item.Settings().rarity(Rarity.EPIC)
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.TITANITE4,2, -2.8f))));
    public static final Item TITANITE_SHOVEL5 = registerItem("titanite_shovel5",
            new ShovelItem(ModToolMaterials.TITANITE5, new Item.Settings().rarity(Rarity.EPIC)
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.TITANITE5,2, -2.8f))));

    public static final Item TITANITE_HOE = registerItem("titanite_hoe",
            new HoeItem(ModToolMaterials.TITANITE, new Item.Settings().rarity(Rarity.EPIC)
                    .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.TITANITE,3, -2.6f))));
    public static final Item TITANITE_HOE2 = registerItem("titanite_hoe2",
            new HoeItem(ModToolMaterials.TITANITE2, new Item.Settings().rarity(Rarity.EPIC)
                    .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.TITANITE2,3, -2.6f))));
    public static final Item TITANITE_HOE3 = registerItem("titanite_hoe3",
            new HoeItem(ModToolMaterials.TITANITE3, new Item.Settings().rarity(Rarity.EPIC)
                    .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.TITANITE3,3, -2.6f))));
    public static final Item TITANITE_HOE4 = registerItem("titanite_hoe4",
            new HoeItem(ModToolMaterials.TITANITE4, new Item.Settings().rarity(Rarity.EPIC)
                    .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.TITANITE4,3, -2.6f))));
    public static final Item TITANITE_HOE5 = registerItem("titanite_hoe5",
            new HoeItem(ModToolMaterials.TITANITE5, new Item.Settings().rarity(Rarity.EPIC)
                    .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.TITANITE5,3, -2.6f))));


    public static final Item TITANITE_HELMET1 = registerItem("titanite_helmet1",
            new ArmorItem(ModArmorMaterials.TITANITE_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings().rarity(Rarity.EPIC)
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(52))));
    public static final Item TITANITE_HELMET2 = registerItem("titanite_helmet2",
            new ArmorItem(ModArmorMaterials.TITANITE_ARMOR_MATERIAL2, ArmorItem.Type.HELMET, new Item.Settings().rarity(Rarity.EPIC)
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(54))));
    public static final Item TITANITE_HELMET3 = registerItem("titanite_helmet3",
            new ArmorItem(ModArmorMaterials.TITANITE_ARMOR_MATERIAL3, ArmorItem.Type.HELMET, new Item.Settings().rarity(Rarity.EPIC)
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(56))));
    public static final Item TITANITE_HELMET4 = registerItem("titanite_helmet4",
            new ArmorItem(ModArmorMaterials.TITANITE_ARMOR_MATERIAL4, ArmorItem.Type.HELMET, new Item.Settings().rarity(Rarity.EPIC)
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(58))));
    public static final Item TITANITE_HELMET5 = registerItem("titanite_helmet5",
            new ArmorItem(ModArmorMaterials.TITANITE_ARMOR_MATERIAL5, ArmorItem.Type.HELMET, new Item.Settings().rarity(Rarity.EPIC)
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(60))));


    public static final Item TITANITE_CHESTPLATE1 = registerItem("titanite_chestplate1",
            new ModArmorItem(ModArmorMaterials.TITANITE_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings().rarity(Rarity.EPIC)
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(52))));
    public static final Item TITANITE_CHESTPLATE2 = registerItem("titanite_chestplate2",
            new ModArmorItem(ModArmorMaterials.TITANITE_ARMOR_MATERIAL2, ArmorItem.Type.CHESTPLATE, new Item.Settings().rarity(Rarity.EPIC)
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(54))));
    public static final Item TITANITE_CHESTPLATE3 = registerItem("titanite_chestplate3",
            new ModArmorItem(ModArmorMaterials.TITANITE_ARMOR_MATERIAL3, ArmorItem.Type.CHESTPLATE, new Item.Settings().rarity(Rarity.EPIC)
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(56))));
    public static final Item TITANITE_CHESTPLATE4 = registerItem("titanite_chestplate4",
            new ModArmorItem(ModArmorMaterials.TITANITE_ARMOR_MATERIAL4, ArmorItem.Type.CHESTPLATE, new Item.Settings().rarity(Rarity.EPIC)
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(58))));
    public static final Item TITANITE_CHESTPLATE5 = registerItem("titanite_chestplate5",
            new ModArmorItem(ModArmorMaterials.TITANITE_ARMOR_MATERIAL5, ArmorItem.Type.CHESTPLATE, new Item.Settings().rarity(Rarity.EPIC)
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(60))));


    public static final Item TITANITE_LEGGINGS1 = registerItem("titanite_leggings1",
            new ArmorItem(ModArmorMaterials.TITANITE_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings().rarity(Rarity.EPIC)
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(52))));
    public static final Item TITANITE_LEGGINGS2 = registerItem("titanite_leggings2",
            new ArmorItem(ModArmorMaterials.TITANITE_ARMOR_MATERIAL2, ArmorItem.Type.LEGGINGS, new Item.Settings().rarity(Rarity.EPIC)
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(54))));
    public static final Item TITANITE_LEGGINGS3 = registerItem("titanite_leggings3",
            new ArmorItem(ModArmorMaterials.TITANITE_ARMOR_MATERIAL3, ArmorItem.Type.LEGGINGS, new Item.Settings().rarity(Rarity.EPIC)
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(56))));
    public static final Item TITANITE_LEGGINGS4 = registerItem("titanite_leggings4",
            new ArmorItem(ModArmorMaterials.TITANITE_ARMOR_MATERIAL4, ArmorItem.Type.LEGGINGS, new Item.Settings().rarity(Rarity.EPIC)
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(58))));
    public static final Item TITANITE_LEGGINGS5 = registerItem("titanite_leggings5",
            new ArmorItem(ModArmorMaterials.TITANITE_ARMOR_MATERIAL5, ArmorItem.Type.LEGGINGS, new Item.Settings().rarity(Rarity.EPIC)
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(60))));


    public static final Item TITANITE_BOOTS1 = registerItem("titanite_boots1",
            new ArmorItem(ModArmorMaterials.TITANITE_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings().rarity(Rarity.EPIC)
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(52))));
    public static final Item TITANITE_BOOTS2 = registerItem("titanite_boots2",
            new ArmorItem(ModArmorMaterials.TITANITE_ARMOR_MATERIAL2, ArmorItem.Type.BOOTS, new Item.Settings().rarity(Rarity.EPIC)
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(54))));
    public static final Item TITANITE_BOOTS3 = registerItem("titanite_boots3",
            new ArmorItem(ModArmorMaterials.TITANITE_ARMOR_MATERIAL3, ArmorItem.Type.BOOTS, new Item.Settings().rarity(Rarity.EPIC)
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(56))));
    public static final Item TITANITE_BOOTS4 = registerItem("titanite_boots4",
            new ArmorItem(ModArmorMaterials.TITANITE_ARMOR_MATERIAL4, ArmorItem.Type.BOOTS, new Item.Settings().rarity(Rarity.EPIC)
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(58))));
    public static final Item TITANITE_BOOTS5 = registerItem("titanite_boots5",
            new ArmorItem(ModArmorMaterials.TITANITE_ARMOR_MATERIAL5, ArmorItem.Type.BOOTS, new Item.Settings().rarity(Rarity.EPIC)
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(60))));


    public static final Item AETHERITE_CORE1 = register(new BlockItem(ModBlocks.AETHERITE_CORE1, new Item.Settings().rarity(Rarity.EPIC)));
    public static final Item TITANITE_CORE = register(new BlockItem(ModBlocks.TITANITE_CORE, new Item.Settings().rarity(Rarity.EPIC)));

    public static final Item AETHERITE_MACE = registerItem(
            "aetherite_mace",
            new AetheriteMaceItem(
                    new Item.Settings()
                            .rarity(Rarity.EPIC)
                            .maxDamage(750)
                            .component(DataComponentTypes.TOOL, AetheriteMaceItem.createToolComponent())
                            .attributeModifiers(AetheriteMaceItem.createAttributeModifiers())
            )
    );

    public static final Item TITANITE_MACE = registerItem(
            "titanite_mace",
            new TitaniteMaceItem(
                    new Item.Settings()
                            .rarity(Rarity.EPIC)
                            .maxDamage(1000)
                            .component(DataComponentTypes.TOOL, TitaniteMaceItem.createToolComponent())
                            .attributeModifiers(TitaniteMaceItem.createAttributeModifiers())
            )
    );
    public static final Item NETHERITE_HORSE_ARMOR = registerItem(
            "netherite_horse_armor", new AnimalArmorItem(ModArmorMaterials.NETHERITE_ARMOR_MATERIAL, AnimalArmorItem.Type.EQUESTRIAN, false, new Item.Settings().maxCount(1)));

    public static final Item AETHERITE_HORSE_ARMOR = registerItem(
            "aetherite_horse_armor", new AnimalArmorItem(ModArmorMaterials.AETHERITE_ARMOR_MATERIAL, AnimalArmorItem.Type.EQUESTRIAN, false, new Item.Settings().rarity(Rarity.RARE).maxCount(1)));

    public static final Item TITANITE_HORSE_ARMOR = registerItem(
            "titanite_horse_armor", new AnimalArmorItem(ModArmorMaterials.TITANITE_ARMOR_MATERIAL, AnimalArmorItem.Type.EQUESTRIAN, false, new Item.Settings().rarity(Rarity.EPIC).maxCount(1)));

    public static final Item WOODEN_SPEAR = registerItem(
            "wooden_spear",
            new WoodenSpearItem(
                    new Item.Settings()
                            .maxDamage(200)
                            .attributeModifiers(WoodenSpearItem.createAttributeModifiers())
                            .component(DataComponentTypes.TOOL, WoodenSpearItem.createToolComponent())));


    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(MTWA.MOD_ID, name), item);
    }

    public static void registerModItems(){
        MTWA.LOGGER.info("Registering Mod Items for " + MTWA.MOD_ID);

    }
}
