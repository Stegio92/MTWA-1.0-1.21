package net.stegio.mtwa.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;
import net.stegio.mtwa.block.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.AETHERITE_BLOCK);
        addDrop(ModBlocks.TITANITE_BLOCK);
        addDrop(ModBlocks.ETERNITE_BLOCK);
        addDrop(ModBlocks.AETHERITE_CORE1);
        addDrop(ModBlocks.TITANITE_CORE);
        addDrop(ModBlocks.ETERNITE_CORE);
        addDrop(ModBlocks.ANCIENT_AETHERITE_DEBRIS1);
        addDrop(ModBlocks.ANCIENT_TITANITE_DEBRIS1);
        addDrop(ModBlocks.ANCIENT_ETERNITE_DEBRIS1);
        addDrop(ModBlocks.TOMBSTONE);
        addDrop(ModBlocks.AETHERITE_ARMOR_ANVIL);
        addDrop(ModBlocks.TITANITE_ARMOR_ANVIL);
        addDrop(ModBlocks.ETERNITE_ARMOR_ANVIL);
        addDrop(ModBlocks.AETHERITE_WEAPON_ANVIL);
        addDrop(ModBlocks.TITANITE_WEAPON_ANVIL);
        addDrop(ModBlocks.ETERNITE_WEAPON_ANVIL);
        addDrop(ModBlocks.AETHERITE_TOOL_ANVIL);
        addDrop(ModBlocks.TITANITE_TOOL_ANVIL);
        addDrop(ModBlocks.ETERNITE_TOOL_ANVIL);

    }
}
