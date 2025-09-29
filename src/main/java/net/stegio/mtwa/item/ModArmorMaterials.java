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
                map.put(ArmorItem.Type.LEGGINGS, 7);
                map.put(ArmorItem.Type.CHESTPLATE, 9);
                map.put(ArmorItem.Type.HELMET, 4);
                map.put(ArmorItem.Type.BODY, 12);
            }), 5, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, () -> Ingredient.ofItems(ModItems.AETHERITE_INGOT),
                    List.of(new ArmorMaterial.Layer(Identifier.of(MTWA.MOD_ID, "aetherite2"))), 4f, 0.2f));

    public static final RegistryEntry<ArmorMaterial> AETHERITE_ARMOR_MATERIAL3 = registerArmorMaterial("aetherite3",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 4);
                map.put(ArmorItem.Type.LEGGINGS, 7);
                map.put(ArmorItem.Type.CHESTPLATE, 9);
                map.put(ArmorItem.Type.HELMET, 4);
                map.put(ArmorItem.Type.BODY, 12);
            }), 5, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, () -> Ingredient.ofItems(ModItems.AETHERITE_INGOT),
                    List.of(new ArmorMaterial.Layer(Identifier.of(MTWA.MOD_ID, "aetherite3"))), 4f, 0.2f));

    public static final RegistryEntry<ArmorMaterial> AETHERITE_ARMOR_MATERIAL4 = registerArmorMaterial("aetherite4",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 4);
                map.put(ArmorItem.Type.LEGGINGS, 7);
                map.put(ArmorItem.Type.CHESTPLATE, 9);
                map.put(ArmorItem.Type.HELMET, 4);
                map.put(ArmorItem.Type.BODY, 12);
            }), 5, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, () -> Ingredient.ofItems(ModItems.AETHERITE_INGOT),
                    List.of(new ArmorMaterial.Layer(Identifier.of(MTWA.MOD_ID, "aetherite4"))), 4f, 0.2f));

    public static final RegistryEntry<ArmorMaterial> AETHERITE_ARMOR_MATERIAL5 = registerArmorMaterial("aetherite5",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 4);
                map.put(ArmorItem.Type.LEGGINGS, 7);
                map.put(ArmorItem.Type.CHESTPLATE, 9);
                map.put(ArmorItem.Type.HELMET, 4);
                map.put(ArmorItem.Type.BODY, 12);
            }), 5, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, () -> Ingredient.ofItems(ModItems.AETHERITE_INGOT),
                    List.of(new ArmorMaterial.Layer(Identifier.of(MTWA.MOD_ID, "aetherite5"))), 4f, 0.2f));

    public static final RegistryEntry<ArmorMaterial> TITANITE_ARMOR_MATERIAL = registerArmorMaterial("titanite",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 6);
                map.put(ArmorItem.Type.LEGGINGS, 9);
                map.put(ArmorItem.Type.CHESTPLATE, 11);
                map.put(ArmorItem.Type.HELMET, 6);
                map.put(ArmorItem.Type.BODY, 14);
            }), 5, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, () -> Ingredient.ofItems(ModItems.AETHERITE_INGOT),
                    List.of(new ArmorMaterial.Layer(Identifier.of(MTWA.MOD_ID, "titanite"))), 6f, 0.3f));

    public static final RegistryEntry<ArmorMaterial> TITANITE_ARMOR_MATERIAL2 = registerArmorMaterial("titanite2",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 6);
                map.put(ArmorItem.Type.LEGGINGS, 9);
                map.put(ArmorItem.Type.CHESTPLATE, 11);
                map.put(ArmorItem.Type.HELMET, 6);
                map.put(ArmorItem.Type.BODY, 14);
            }), 5, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, () -> Ingredient.ofItems(ModItems.AETHERITE_INGOT),
                    List.of(new ArmorMaterial.Layer(Identifier.of(MTWA.MOD_ID, "titanite2"))), 6f, 0.3f));

    public static final RegistryEntry<ArmorMaterial> TITANITE_ARMOR_MATERIAL3 = registerArmorMaterial("titanite3",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 6);
                map.put(ArmorItem.Type.LEGGINGS, 9);
                map.put(ArmorItem.Type.CHESTPLATE, 11);
                map.put(ArmorItem.Type.HELMET, 6);
                map.put(ArmorItem.Type.BODY, 14);
            }), 5, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, () -> Ingredient.ofItems(ModItems.AETHERITE_INGOT),
                    List.of(new ArmorMaterial.Layer(Identifier.of(MTWA.MOD_ID, "titanite3"))), 6f, 0.3f));

    public static final RegistryEntry<ArmorMaterial> TITANITE_ARMOR_MATERIAL4 = registerArmorMaterial("titanite4",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 6);
                map.put(ArmorItem.Type.LEGGINGS, 9);
                map.put(ArmorItem.Type.CHESTPLATE, 11);
                map.put(ArmorItem.Type.HELMET, 6);
                map.put(ArmorItem.Type.BODY, 14);
            }), 5, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, () -> Ingredient.ofItems(ModItems.AETHERITE_INGOT),
                    List.of(new ArmorMaterial.Layer(Identifier.of(MTWA.MOD_ID, "titanite4"))), 6f, 0.3f));

    public static final RegistryEntry<ArmorMaterial> TITANITE_ARMOR_MATERIAL5 = registerArmorMaterial("titanite5",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 6);
                map.put(ArmorItem.Type.LEGGINGS, 9);
                map.put(ArmorItem.Type.CHESTPLATE, 11);
                map.put(ArmorItem.Type.HELMET, 6);
                map.put(ArmorItem.Type.BODY, 14);
            }), 5, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, () -> Ingredient.ofItems(ModItems.AETHERITE_INGOT),
                    List.of(new ArmorMaterial.Layer(Identifier.of(MTWA.MOD_ID, "titanite5"))), 6f, 0.3f));

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
