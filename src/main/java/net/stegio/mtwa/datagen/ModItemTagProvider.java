package net.stegio.mtwa.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.stegio.mtwa.item.ModItems;
import net.stegio.mtwa.util.ModTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ItemTags.SWORDS)
                .add(ModItems.WOODEN_KATANA)
                .add(ModItems.IRON_KATANA)
                .add(ModItems.DIAMOND_KATANA)
                .add(ModItems.NETHERITE_KATANA);

        getOrCreateTagBuilder(ItemTags.SWORDS)
                .add(ModItems.AETHERITE_KATANA1)
                .add(ModItems.AETHERITE_KATANA2)
                .add(ModItems.AETHERITE_KATANA3)
                .add(ModItems.AETHERITE_KATANA4)
                .add(ModItems.AETHERITE_KATANA5)
                .add(ModItems.TITANITE_KATANA1)
                .add(ModItems.TITANITE_KATANA2)
                .add(ModItems.TITANITE_KATANA3)
                .add(ModItems.TITANITE_KATANA4)
                .add(ModItems.TITANITE_KATANA5)
                .add(ModItems.ETERNITE_KATANA1)
                .add(ModItems.ETERNITE_KATANA2)
                .add(ModItems.ETERNITE_KATANA3)
                .add(ModItems.ETERNITE_KATANA4)
                .add(ModItems.ETERNITE_KATANA5);

        getOrCreateTagBuilder(ItemTags.AXES)
                .add(ModItems.AETHERITE_AXE)
                .add(ModItems.AETHERITE_AXE2)
                .add(ModItems.AETHERITE_AXE3)
                .add(ModItems.AETHERITE_AXE4)
                .add(ModItems.AETHERITE_AXE5)
                .add(ModItems.TITANITE_AXE)
                .add(ModItems.TITANITE_AXE2)
                .add(ModItems.TITANITE_AXE3)
                .add(ModItems.TITANITE_AXE4)
                .add(ModItems.TITANITE_AXE5)
                .add(ModItems.ETERNITE_AXE1)
                .add(ModItems.ETERNITE_AXE2)
                .add(ModItems.ETERNITE_AXE3)
                .add(ModItems.ETERNITE_AXE4)
                .add(ModItems.ETERNITE_AXE5);

        getOrCreateTagBuilder(ItemTags.PICKAXES)
                .add(ModItems.AETHERITE_PICKAXE)
                .add(ModItems.AETHERITE_PICKAXE2)
                .add(ModItems.AETHERITE_PICKAXE3)
                .add(ModItems.AETHERITE_PICKAXE4)
                .add(ModItems.AETHERITE_PICKAXE5)
                .add(ModItems.TITANITE_PICKAXE)
                .add(ModItems.TITANITE_PICKAXE2)
                .add(ModItems.TITANITE_PICKAXE3)
                .add(ModItems.TITANITE_PICKAXE4)
                .add(ModItems.TITANITE_PICKAXE5)
                .add(ModItems.ETERNITE_PICKAXE1)
                .add(ModItems.ETERNITE_PICKAXE2)
                .add(ModItems.ETERNITE_PICKAXE3)
                .add(ModItems.ETERNITE_PICKAXE4)
                .add(ModItems.ETERNITE_PICKAXE5);

        getOrCreateTagBuilder(ItemTags.SHOVELS)
                .add(ModItems.AETHERITE_SHOVEL)
                .add(ModItems.AETHERITE_SHOVEL2)
                .add(ModItems.AETHERITE_SHOVEL3)
                .add(ModItems.AETHERITE_SHOVEL4)
                .add(ModItems.AETHERITE_SHOVEL5)
                .add(ModItems.TITANITE_SHOVEL)
                .add(ModItems.TITANITE_SHOVEL2)
                .add(ModItems.TITANITE_SHOVEL3)
                .add(ModItems.TITANITE_SHOVEL4)
                .add(ModItems.TITANITE_SHOVEL5)
                .add(ModItems.ETERNITE_SHOVEL1)
                .add(ModItems.ETERNITE_SHOVEL2)
                .add(ModItems.ETERNITE_SHOVEL3)
                .add(ModItems.ETERNITE_SHOVEL4)
                .add(ModItems.ETERNITE_SHOVEL5);

        getOrCreateTagBuilder(ItemTags.HOES)
                .add(ModItems.AETHERITE_HOE)
                .add(ModItems.AETHERITE_HOE2)
                .add(ModItems.AETHERITE_HOE3)
                .add(ModItems.AETHERITE_HOE4)
                .add(ModItems.AETHERITE_HOE5)
                .add(ModItems.TITANITE_HOE)
                .add(ModItems.TITANITE_HOE2)
                .add(ModItems.TITANITE_HOE3)
                .add(ModItems.TITANITE_HOE4)
                .add(ModItems.TITANITE_HOE5)
                .add(ModItems.ETERNITE_HOE1)
                .add(ModItems.ETERNITE_HOE2)
                .add(ModItems.ETERNITE_HOE3)
                .add(ModItems.ETERNITE_HOE4)
                .add(ModItems.ETERNITE_HOE5);

        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.AETHERITE_HELMET1)
                .add(ModItems.AETHERITE_CHESTPLATE1)
                .add(ModItems.AETHERITE_LEGGINGS1)
                .add(ModItems.AETHERITE_BOOTS1)
                .add(ModItems.TITANITE_HELMET1)
                .add(ModItems.TITANITE_CHESTPLATE1)
                .add(ModItems.TITANITE_LEGGINGS1)
                .add(ModItems.TITANITE_BOOTS1)
                .add(ModItems.ETERNITE_HELMET1)
                .add(ModItems.ETERNITE_CHESTPLATE1)
                .add(ModItems.ETERNITE_LEGGINGS1)
                .add(ModItems.ETERNITE_BOOTS1);


        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.AETHERITE_HELMET2)
                .add(ModItems.AETHERITE_CHESTPLATE2)
                .add(ModItems.AETHERITE_LEGGINGS2)
                .add(ModItems.AETHERITE_BOOTS2)
                .add(ModItems.TITANITE_HELMET2)
                .add(ModItems.TITANITE_CHESTPLATE2)
                .add(ModItems.TITANITE_LEGGINGS2)
                .add(ModItems.TITANITE_BOOTS2)
                .add(ModItems.ETERNITE_HELMET2)
                .add(ModItems.ETERNITE_CHESTPLATE2)
                .add(ModItems.ETERNITE_LEGGINGS2)
                .add(ModItems.ETERNITE_BOOTS2);

        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.AETHERITE_HELMET3)
                .add(ModItems.AETHERITE_CHESTPLATE3)
                .add(ModItems.AETHERITE_LEGGINGS3)
                .add(ModItems.AETHERITE_BOOTS3)
                .add(ModItems.TITANITE_HELMET3)
                .add(ModItems.TITANITE_CHESTPLATE3)
                .add(ModItems.TITANITE_LEGGINGS3)
                .add(ModItems.TITANITE_BOOTS3)
                .add(ModItems.ETERNITE_HELMET3)
                .add(ModItems.ETERNITE_CHESTPLATE3)
                .add(ModItems.ETERNITE_LEGGINGS3)
                .add(ModItems.ETERNITE_BOOTS3);


        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.AETHERITE_HELMET4)
                .add(ModItems.AETHERITE_CHESTPLATE4)
                .add(ModItems.AETHERITE_LEGGINGS4)
                .add(ModItems.AETHERITE_BOOTS4)
                .add(ModItems.TITANITE_HELMET4)
                .add(ModItems.TITANITE_CHESTPLATE4)
                .add(ModItems.TITANITE_LEGGINGS4)
                .add(ModItems.TITANITE_BOOTS4)
                .add(ModItems.ETERNITE_HELMET4)
                .add(ModItems.ETERNITE_CHESTPLATE4)
                .add(ModItems.ETERNITE_LEGGINGS4)
                .add(ModItems.ETERNITE_BOOTS4);

        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.AETHERITE_HELMET5)
                .add(ModItems.AETHERITE_CHESTPLATE5)
                .add(ModItems.AETHERITE_LEGGINGS5)
                .add(ModItems.AETHERITE_BOOTS5)
                .add(ModItems.TITANITE_HELMET5)
                .add(ModItems.TITANITE_CHESTPLATE5)
                .add(ModItems.TITANITE_LEGGINGS5)
                .add(ModItems.TITANITE_BOOTS5)
                .add(ModItems.ETERNITE_HELMET5)
                .add(ModItems.ETERNITE_CHESTPLATE5)
                .add(ModItems.ETERNITE_LEGGINGS5)
                .add(ModItems.ETERNITE_BOOTS5);

        getOrCreateTagBuilder(ItemTags.MACE_ENCHANTABLE)
                .add(ModItems.AETHERITE_MACE)
                .add(ModItems.TITANITE_MACE)
                .add(ModItems.ETERNITE_MACE);




    }
}
