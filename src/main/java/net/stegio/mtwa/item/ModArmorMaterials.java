package net.stegio.mtwa.item;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;
import net.stegio.mtwa.MTWA;

import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

public class ModArmorMaterials {
    public static final RegistryEntry<ArmorMaterial> AETHERITE_ARMOR_MATERIAL = registerArmorMaterial("aetherite",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 4);
                map.put(ArmorItem.Type.LEGGINGS, 7);
                map.put(ArmorItem.Type.CHESTPLATE, 9);
                map.put(ArmorItem.Type.HELMET, 4);
                map.put(ArmorItem.Type.BODY, 12);
            }), 5, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, () -> Ingredient.ofItems(ModItems.AETHERITE_INGOT),
                    List.of(new ArmorMaterial.Layer(Identifier.of(MTWA.MOD_ID, "aetherite"))), 4f, 0.2f));

    public static final RegistryEntry<ArmorMaterial> AETHERITE_ARMOR_MATERIAL2 = registerArmorMaterial("aetherite2",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 4);
                map.put(ArmorItem.Type.LEGGINGS, 8);
                map.put(ArmorItem.Type.CHESTPLATE, 10);
                map.put(ArmorItem.Type.HELMET, 4);
                map.put(ArmorItem.Type.BODY, 12);
            }), 5, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, () -> Ingredient.ofItems(ModItems.AETHERITE_INGOT),
                    List.of(new ArmorMaterial.Layer(Identifier.of(MTWA.MOD_ID, "aetherite2"))), 4.5f, 0.25f));

    public static final RegistryEntry<ArmorMaterial> AETHERITE_ARMOR_MATERIAL3 = registerArmorMaterial("aetherite3",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 5);
                map.put(ArmorItem.Type.LEGGINGS, 8);
                map.put(ArmorItem.Type.CHESTPLATE, 10);
                map.put(ArmorItem.Type.HELMET, 5);
                map.put(ArmorItem.Type.BODY, 13);
            }), 5, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, () -> Ingredient.ofItems(ModItems.AETHERITE_INGOT),
                    List.of(new ArmorMaterial.Layer(Identifier.of(MTWA.MOD_ID, "aetherite3"))), 5f, 0.3f));

    public static final RegistryEntry<ArmorMaterial> AETHERITE_ARMOR_MATERIAL4 = registerArmorMaterial("aetherite4",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 5);
                map.put(ArmorItem.Type.LEGGINGS, 9);
                map.put(ArmorItem.Type.CHESTPLATE, 11);
                map.put(ArmorItem.Type.HELMET, 5);
                map.put(ArmorItem.Type.BODY, 13);
            }), 5, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, () -> Ingredient.ofItems(ModItems.AETHERITE_INGOT),
                    List.of(new ArmorMaterial.Layer(Identifier.of(MTWA.MOD_ID, "aetherite4"))), 5.5f, 0.35f));

    public static final RegistryEntry<ArmorMaterial> AETHERITE_ARMOR_MATERIAL5 = registerArmorMaterial("aetherite5",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 6);
                map.put(ArmorItem.Type.LEGGINGS, 9);
                map.put(ArmorItem.Type.CHESTPLATE, 11);
                map.put(ArmorItem.Type.HELMET, 6);
                map.put(ArmorItem.Type.BODY, 14);
            }), 5, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, () -> Ingredient.ofItems(ModItems.AETHERITE_INGOT),
                    List.of(new ArmorMaterial.Layer(Identifier.of(MTWA.MOD_ID, "aetherite5"))), 6f, 0.4f));

    public static final RegistryEntry<ArmorMaterial> TITANITE_ARMOR_MATERIAL = registerArmorMaterial("titanite",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 6);
                map.put(ArmorItem.Type.LEGGINGS, 10);
                map.put(ArmorItem.Type.CHESTPLATE, 12);
                map.put(ArmorItem.Type.HELMET, 6);
                map.put(ArmorItem.Type.BODY, 14);
            }), 5, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, () -> Ingredient.ofItems(ModItems.AETHERITE_INGOT),
                    List.of(new ArmorMaterial.Layer(Identifier.of(MTWA.MOD_ID, "titanite"))), 6.5f, 0.45f));

    public static final RegistryEntry<ArmorMaterial> TITANITE_ARMOR_MATERIAL2 = registerArmorMaterial("titanite2",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 7);
                map.put(ArmorItem.Type.LEGGINGS, 10);
                map.put(ArmorItem.Type.CHESTPLATE, 12);
                map.put(ArmorItem.Type.HELMET, 7);
                map.put(ArmorItem.Type.BODY, 15);
            }), 5, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, () -> Ingredient.ofItems(ModItems.AETHERITE_INGOT),
                    List.of(new ArmorMaterial.Layer(Identifier.of(MTWA.MOD_ID, "titanite2"))), 7f, 0.5f));

    public static final RegistryEntry<ArmorMaterial> TITANITE_ARMOR_MATERIAL3 = registerArmorMaterial("titanite3",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 7);
                map.put(ArmorItem.Type.LEGGINGS, 11);
                map.put(ArmorItem.Type.CHESTPLATE, 13);
                map.put(ArmorItem.Type.HELMET, 7);
                map.put(ArmorItem.Type.BODY, 15);
            }), 5, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, () -> Ingredient.ofItems(ModItems.AETHERITE_INGOT),
                    List.of(new ArmorMaterial.Layer(Identifier.of(MTWA.MOD_ID, "titanite3"))), 7.5f, 0.55f));

    public static final RegistryEntry<ArmorMaterial> TITANITE_ARMOR_MATERIAL4 = registerArmorMaterial("titanite4",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 8);
                map.put(ArmorItem.Type.LEGGINGS, 11);
                map.put(ArmorItem.Type.CHESTPLATE, 13);
                map.put(ArmorItem.Type.HELMET, 8);
                map.put(ArmorItem.Type.BODY, 16);
            }), 5, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, () -> Ingredient.ofItems(ModItems.AETHERITE_INGOT),
                    List.of(new ArmorMaterial.Layer(Identifier.of(MTWA.MOD_ID, "titanite4"))), 8f, 0.6f));

    public static final RegistryEntry<ArmorMaterial> TITANITE_ARMOR_MATERIAL5 = registerArmorMaterial("titanite5",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 8);
                map.put(ArmorItem.Type.LEGGINGS, 12);
                map.put(ArmorItem.Type.CHESTPLATE, 14);
                map.put(ArmorItem.Type.HELMET, 8);
                map.put(ArmorItem.Type.BODY, 16);
            }), 5, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, () -> Ingredient.ofItems(ModItems.AETHERITE_INGOT),
                    List.of(new ArmorMaterial.Layer(Identifier.of(MTWA.MOD_ID, "titanite5"))), 8.5f, 0.65f));

    public static final RegistryEntry<ArmorMaterial> ETERNITE_ARMOR_MATERIAL1 = registerArmorMaterial("eternite1",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 9);
                map.put(ArmorItem.Type.LEGGINGS, 12);
                map.put(ArmorItem.Type.CHESTPLATE, 14);
                map.put(ArmorItem.Type.HELMET, 9);
                map.put(ArmorItem.Type.BODY, 17);
            }), 5, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, () -> Ingredient.ofItems(ModItems.ETERNITE_INGOT),
                    List.of(new ArmorMaterial.Layer(Identifier.of(MTWA.MOD_ID, "eternite1"))), 6.5f, 0.45f));

    public static final RegistryEntry<ArmorMaterial> ETERNITE_ARMOR_MATERIAL2 = registerArmorMaterial("eternite2",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 9);
                map.put(ArmorItem.Type.LEGGINGS, 13);
                map.put(ArmorItem.Type.CHESTPLATE, 15);
                map.put(ArmorItem.Type.HELMET, 9);
                map.put(ArmorItem.Type.BODY, 17);
            }), 5, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, () -> Ingredient.ofItems(ModItems.ETERNITE_INGOT),
                    List.of(new ArmorMaterial.Layer(Identifier.of(MTWA.MOD_ID, "eternite2"))), 7f, 0.5f));

    public static final RegistryEntry<ArmorMaterial> ETERNITE_ARMOR_MATERIAL3 = registerArmorMaterial("eternite3",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 10);
                map.put(ArmorItem.Type.LEGGINGS, 13);
                map.put(ArmorItem.Type.CHESTPLATE, 15);
                map.put(ArmorItem.Type.HELMET, 10);
                map.put(ArmorItem.Type.BODY, 18);
            }), 5, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, () -> Ingredient.ofItems(ModItems.ETERNITE_INGOT),
                    List.of(new ArmorMaterial.Layer(Identifier.of(MTWA.MOD_ID, "eternite3"))), 7.5f, 0.55f));

    public static final RegistryEntry<ArmorMaterial> ETERNITE_ARMOR_MATERIAL4 = registerArmorMaterial("eternite4",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 10);
                map.put(ArmorItem.Type.LEGGINGS, 14);
                map.put(ArmorItem.Type.CHESTPLATE, 16);
                map.put(ArmorItem.Type.HELMET, 10);
                map.put(ArmorItem.Type.BODY, 18);
            }), 5, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, () -> Ingredient.ofItems(ModItems.ETERNITE_INGOT),
                    List.of(new ArmorMaterial.Layer(Identifier.of(MTWA.MOD_ID, "eternite4"))), 8f, 0.6f));

    public static final RegistryEntry<ArmorMaterial> ETERNITE_ARMOR_MATERIAL5 = registerArmorMaterial("eternite5",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 12);
                map.put(ArmorItem.Type.LEGGINGS, 15);
                map.put(ArmorItem.Type.CHESTPLATE, 17);
                map.put(ArmorItem.Type.HELMET, 12);
                map.put(ArmorItem.Type.BODY, 20);
            }), 5, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, () -> Ingredient.ofItems(ModItems.ETERNITE_INGOT),
                    List.of(new ArmorMaterial.Layer(Identifier.of(MTWA.MOD_ID, "eternite5"))), 8.5f, 0.65f));

    public static final RegistryEntry<ArmorMaterial> NETHERITE_ARMOR_MATERIAL = registerArmorMaterial("netherite1",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 3);
                map.put(ArmorItem.Type.LEGGINGS, 6);
                map.put(ArmorItem.Type.CHESTPLATE, 8);
                map.put(ArmorItem.Type.HELMET, 3);
                map.put(ArmorItem.Type.BODY, 11);
            }), 15, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, () -> Ingredient.ofItems(Items.NETHERITE_INGOT),
                    List.of(new ArmorMaterial.Layer(Identifier.of(MTWA.MOD_ID, "netherite1"))), 3f, 0.1f));




    public static RegistryEntry<ArmorMaterial> registerArmorMaterial(String name, Supplier<ArmorMaterial> material) {
        return Registry.registerReference(Registries.ARMOR_MATERIAL, Identifier.of(MTWA.MOD_ID, name), material.get());
    }
}
