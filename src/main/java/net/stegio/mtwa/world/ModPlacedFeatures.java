package net.stegio.mtwa.world;

import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;
import net.stegio.mtwa.MTWA;

import java.util.List;

public class ModPlacedFeatures {
    public static final RegistryKey<PlacedFeature> OVERWORLD_ANCIENT_AETHERITE_DEBRIS_PLACED_KEY1 = registerKey("overworld_ancient_aetherite_debris_placed1");
    public static final RegistryKey<PlacedFeature> OVERWORLD_ANCIENT_TITANITE_DEBRIS_PLACED_KEY1 = registerKey("overworld_ancient_titanite_debris_placed1");
    public static final RegistryKey<PlacedFeature> ANCIENT_AETHERITE_DEBRIS_PLACED_KEY1 = registerKey("ancient_aetherite_debris_placed1");
    public static final RegistryKey<PlacedFeature> ANCIENT_TITANITE_DEBRIS_PLACED_KEY1 = registerKey("ancient_titanite_debris_placed1");
    public static final RegistryKey<PlacedFeature> ANCIENT_AETHERITE_DEBRIS_PLACED_KEY2 = registerKey("ancient_aetherite_debris_placed2");
    public static final RegistryKey<PlacedFeature> ANCIENT_TITANITE_DEBRIS_PLACED_KEY2 = registerKey("ancient_titanite_debris_placed2");
    public static final RegistryKey<PlacedFeature> ANCIENT_AETHERITE_DEBRIS_PLACED_KEY3 = registerKey("ancient_aetherite_debris_placed3");
    public static final RegistryKey<PlacedFeature> ANCIENT_TITANITE_DEBRIS_PLACED_KEY3 = registerKey("ancient_titanite_debris_placed3");
    public static final RegistryKey<PlacedFeature> ANCIENT_AETHERITE_DEBRIS_PLACED_KEY4 = registerKey("ancient_aetherite_debris_placed4");
    public static final RegistryKey<PlacedFeature> ANCIENT_TITANITE_DEBRIS_PLACED_KEY4 = registerKey("ancient_titanite_debris_placed4");

    public static void bootstrap(Registerable<PlacedFeature> context) {
        var configuredFeatures = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        register(context, OVERWORLD_ANCIENT_AETHERITE_DEBRIS_PLACED_KEY1, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_ANCIENT_AETHERITE_DEBRIS_KEY1),
                ModOrePlacement.modifiersWithCount(2,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(-80), YOffset.fixed(0))));
        register(context, OVERWORLD_ANCIENT_TITANITE_DEBRIS_PLACED_KEY1, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_ANCIENT_TITANITE_DEBRIS_KEY1),
                ModOrePlacement.modifiersWithCount(2,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(-100), YOffset.fixed(0))));
        register(context, ANCIENT_AETHERITE_DEBRIS_PLACED_KEY1, configuredFeatures.getOrThrow(ModConfiguredFeatures.ANCIENT_AETHERITE_DEBRIS_KEY1),
                ModOrePlacement.modifiersWithCount(4,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(0), YOffset.fixed(50))));
        register(context, ANCIENT_TITANITE_DEBRIS_PLACED_KEY1, configuredFeatures.getOrThrow(ModConfiguredFeatures.ANCIENT_TITANITE_DEBRIS_KEY1),
                ModOrePlacement.modifiersWithCount(4,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(0), YOffset.fixed(45))));
        register(context, ANCIENT_AETHERITE_DEBRIS_PLACED_KEY2, configuredFeatures.getOrThrow(ModConfiguredFeatures.ANCIENT_AETHERITE_DEBRIS_KEY2),
                ModOrePlacement.modifiersWithCount(3,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(0), YOffset.fixed(40))));
        register(context, ANCIENT_TITANITE_DEBRIS_PLACED_KEY2, configuredFeatures.getOrThrow(ModConfiguredFeatures.ANCIENT_TITANITE_DEBRIS_KEY2),
                ModOrePlacement.modifiersWithCount(3,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(0), YOffset.fixed(35))));
        register(context, ANCIENT_AETHERITE_DEBRIS_PLACED_KEY3, configuredFeatures.getOrThrow(ModConfiguredFeatures.ANCIENT_AETHERITE_DEBRIS_KEY3),
                ModOrePlacement.modifiersWithCount(2,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(0), YOffset.fixed(30))));
        register(context, ANCIENT_TITANITE_DEBRIS_PLACED_KEY3, configuredFeatures.getOrThrow(ModConfiguredFeatures.ANCIENT_TITANITE_DEBRIS_KEY3),
                ModOrePlacement.modifiersWithCount(2,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(0), YOffset.fixed(25))));
        register(context, ANCIENT_AETHERITE_DEBRIS_PLACED_KEY4, configuredFeatures.getOrThrow(ModConfiguredFeatures.ANCIENT_AETHERITE_DEBRIS_KEY4),
                ModOrePlacement.modifiersWithCount(1,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(0), YOffset.fixed(20))));
        register(context, ANCIENT_TITANITE_DEBRIS_PLACED_KEY4, configuredFeatures.getOrThrow(ModConfiguredFeatures.ANCIENT_TITANITE_DEBRIS_KEY4),
                ModOrePlacement.modifiersWithCount(1,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(0), YOffset.fixed(15))));
    }

    public static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, Identifier.of(MTWA.MOD_ID, name));
    }

    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key,
                                                                                   RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                                                                   PlacementModifier... modifiers) {
        register(context, key, configuration, List.of(modifiers));
    }
}
