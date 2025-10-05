package net.stegio.mtwa.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.stegio.mtwa.block.ModBlocks;
import net.stegio.mtwa.util.ModTags;

import java.util.concurrent.CompletableFuture;

import static java.awt.AWTEventMulticaster.add;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }


    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.AETHERITE_BLOCK)
                .add(ModBlocks.AETHERITE_CORE1)
                .add(ModBlocks.TITANITE_BLOCK)
                .add(ModBlocks.TITANITE_CORE)
                .add(ModBlocks.ETERNITE_BLOCK)
                .add(ModBlocks.ETERNITE_CORE)
                .add(ModBlocks.ANCIENT_AETHERITE_DEBRIS1)
                .add(ModBlocks.ANCIENT_TITANITE_DEBRIS1)
                .add(ModBlocks.ANCIENT_ETERNITE_DEBRIS1)
                .add(ModBlocks.AETHERITE_ARMOR_ANVIL)
                .add(ModBlocks.TITANITE_ARMOR_ANVIL)
                .add(ModBlocks.ETERNITE_ARMOR_ANVIL)
                .add(ModBlocks.AETHERITE_WEAPON_ANVIL)
                .add(ModBlocks.TITANITE_WEAPON_ANVIL)
                .add(ModBlocks.ETERNITE_WEAPON_ANVIL)
                .add(ModBlocks.AETHERITE_TOOL_ANVIL)
                .add(ModBlocks.TITANITE_TOOL_ANVIL)
                .add(ModBlocks.ETERNITE_TOOL_ANVIL)
                .add(ModBlocks.TOMBSTONE);

        getOrCreateTagBuilder(ModTags.Blocks.NEEDS_AETHERITE_TOOL)
                .addTag(BlockTags.NEEDS_DIAMOND_TOOL);
        getOrCreateTagBuilder(ModTags.Blocks.NEEDS_TITANITE_TOOL)
                .addTag(BlockTags.NEEDS_DIAMOND_TOOL);
        getOrCreateTagBuilder(ModTags.Blocks.NEEDS_ETERNITE_TOOL)
                .addTag(BlockTags.NEEDS_DIAMOND_TOOL);

        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.ANCIENT_AETHERITE_DEBRIS1)
                .add(ModBlocks.AETHERITE_CORE1)
                .add(ModBlocks.AETHERITE_BLOCK)
                .add(ModBlocks.ANCIENT_TITANITE_DEBRIS1)
                .add(ModBlocks.TITANITE_CORE)
                .add(ModBlocks.TITANITE_BLOCK)
                .add(ModBlocks.ANCIENT_ETERNITE_DEBRIS1)
                .add(ModBlocks.ETERNITE_CORE)
                .add(ModBlocks.ETERNITE_BLOCK)
                .add(ModBlocks.AETHERITE_ARMOR_ANVIL)
                .add(ModBlocks.TITANITE_ARMOR_ANVIL)
                .add(ModBlocks.ETERNITE_ARMOR_ANVIL)
                .add(ModBlocks.AETHERITE_WEAPON_ANVIL)
                .add(ModBlocks.TITANITE_WEAPON_ANVIL)
                .add(ModBlocks.ETERNITE_WEAPON_ANVIL)
                .add(ModBlocks.AETHERITE_TOOL_ANVIL)
                .add(ModBlocks.TITANITE_TOOL_ANVIL)
                .add(ModBlocks.ETERNITE_TOOL_ANVIL);


    }
}
