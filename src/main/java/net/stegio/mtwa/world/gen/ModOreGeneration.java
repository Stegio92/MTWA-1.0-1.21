package net.stegio.mtwa.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModification;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.gen.GenerationStep;
import net.stegio.mtwa.util.ModBiomeSelectors;
import net.stegio.mtwa.world.ModPlacedFeatures;

public class ModOreGeneration {
    public static void generateOres() {
        BiomeModifications.addFeature(ModBiomeSelectors.foundInTheAetheriteDimension(), GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.ANCIENT_AETHERITE_DEBRIS_PLACED_KEY1);
        BiomeModifications.addFeature(ModBiomeSelectors.foundInTheAetheriteDimension(), GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.ANCIENT_AETHERITE_DEBRIS_PLACED_KEY2);
        BiomeModifications.addFeature(ModBiomeSelectors.foundInTheAetheriteDimension(), GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.ANCIENT_AETHERITE_DEBRIS_PLACED_KEY3);

        BiomeModifications.addFeature(ModBiomeSelectors.foundInTheAetheriteDimension(), GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.TUFF_EXPERIENCE_ORE_PLACED_KEY4);
        BiomeModifications.addFeature(ModBiomeSelectors.foundInTheAetheriteDimension(), GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.TUFF_EXPERIENCE_ORE_PLACED_KEY5);
        BiomeModifications.addFeature(ModBiomeSelectors.foundInTheAetheriteDimension(), GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.TUFF_EXPERIENCE_ORE_PLACED_KEY6);
        BiomeModifications.addFeature(ModBiomeSelectors.foundInTheAetheriteDimension(), GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.TUFF_EXPERIENCE_ORE_PLACED_KEY7);
        BiomeModifications.addFeature(ModBiomeSelectors.foundInTheAetheriteDimension(), GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.TUFF_EXPERIENCE_ORE_PLACED_KEY8);

        BiomeModifications.addFeature(ModBiomeSelectors.foundInTheTitaniteDimension(), GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.ANCIENT_TITANITE_DEBRIS_PLACED_KEY1);
        BiomeModifications.addFeature(ModBiomeSelectors.foundInTheTitaniteDimension(), GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.ANCIENT_TITANITE_DEBRIS_PLACED_KEY2);
        BiomeModifications.addFeature(ModBiomeSelectors.foundInTheTitaniteDimension(), GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.ANCIENT_TITANITE_DEBRIS_PLACED_KEY3);

        BiomeModifications.addFeature(ModBiomeSelectors.foundInTheTitaniteDimension(), GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.STONE_EXPERIENCE_ORE_PLACED_KEY4);
        BiomeModifications.addFeature(ModBiomeSelectors.foundInTheTitaniteDimension(), GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.STONE_EXPERIENCE_ORE_PLACED_KEY5);
        BiomeModifications.addFeature(ModBiomeSelectors.foundInTheTitaniteDimension(), GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.STONE_EXPERIENCE_ORE_PLACED_KEY6);
        BiomeModifications.addFeature(ModBiomeSelectors.foundInTheTitaniteDimension(), GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.STONE_EXPERIENCE_ORE_PLACED_KEY7);
        BiomeModifications.addFeature(ModBiomeSelectors.foundInTheTitaniteDimension(), GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.STONE_EXPERIENCE_ORE_PLACED_KEY8);

        BiomeModifications.addFeature(ModBiomeSelectors.foundInTheEterniteDimension(), GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.ANCIENT_ETERNITE_DEBRIS_PLACED_KEY1);
        BiomeModifications.addFeature(ModBiomeSelectors.foundInTheEterniteDimension(), GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.ANCIENT_ETERNITE_DEBRIS_PLACED_KEY2);
        BiomeModifications.addFeature(ModBiomeSelectors.foundInTheEterniteDimension(), GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.ANCIENT_ETERNITE_DEBRIS_PLACED_KEY3);

        BiomeModifications.addFeature(ModBiomeSelectors.foundInTheEterniteDimension(), GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.DEEPSLATE_EXPERIENCE_ORE_PLACED_KEY4);
        BiomeModifications.addFeature(ModBiomeSelectors.foundInTheEterniteDimension(), GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.DEEPSLATE_EXPERIENCE_ORE_PLACED_KEY5);
        BiomeModifications.addFeature(ModBiomeSelectors.foundInTheEterniteDimension(), GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.DEEPSLATE_EXPERIENCE_ORE_PLACED_KEY6);
        BiomeModifications.addFeature(ModBiomeSelectors.foundInTheEterniteDimension(), GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.DEEPSLATE_EXPERIENCE_ORE_PLACED_KEY7);
        BiomeModifications.addFeature(ModBiomeSelectors.foundInTheEterniteDimension(), GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.DEEPSLATE_EXPERIENCE_ORE_PLACED_KEY8);
    }
}
