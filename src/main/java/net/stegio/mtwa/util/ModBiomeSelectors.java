package net.stegio.mtwa.util;

import net.fabricmc.fabric.api.biome.v1.BiomeSelectionContext;
import net.minecraft.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.dimension.DimensionOptions;
import net.stegio.mtwa.world.biome.ModBiomes;
import net.stegio.mtwa.world.dimension.ModDimensionOptions;
import net.stegio.mtwa.world.dimension.ModDimensions;

import java.util.Collection;
import java.util.function.Predicate;

public class ModBiomeSelectors {
    public static Predicate<BiomeSelectionContext> foundInTheAetheriteDimension() {
        return context -> context.canGenerateIn(ModDimensionOptions.AETHERITE_DIM);
    }
    public static Predicate<BiomeSelectionContext> foundInTheTitaniteDimension() {
        return context -> context.canGenerateIn(ModDimensionOptions.TITANITE_DIM);
    }
    public static Predicate<BiomeSelectionContext> foundInTheEterniteDimension() {
        return context -> context.canGenerateIn(ModDimensionOptions.ETERNITE_DIM);
    }
}
