package net.stegio.mtwa.world;

import net.minecraft.predicate.BlockPredicate;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.placementmodifier.*;

import java.util.List;

public class ModOrePlacement {
    public static List<PlacementModifier> modifiers(PlacementModifier countModifier, PlacementModifier rarityModifier, PlacementModifier heightModifier) {
        return List.of(countModifier, rarityModifier, SquarePlacementModifier.of(), heightModifier, BiomePlacementModifier.of());
    }

    public static List<PlacementModifier> modifiersWithCount(int count, int chance, PlacementModifier heightModifier) {
        return modifiers(CountPlacementModifier.of(count), RarityFilterPlacementModifier.of(chance), heightModifier);
    }
}

