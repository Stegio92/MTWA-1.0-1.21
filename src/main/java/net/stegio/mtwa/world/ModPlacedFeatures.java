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
    public static final RegistryKey<PlacedFeature> ANCIENT_AETHERITE_DEBRIS_PLACED_KEY1 = registerKey("ancient_aetherite_debris_placed1");
    public static final RegistryKey<PlacedFeature> ANCIENT_AETHERITE_DEBRIS_PLACED_KEY2 = registerKey("ancient_aetherite_debris_placed2");
    public static final RegistryKey<PlacedFeature> ANCIENT_AETHERITE_DEBRIS_PLACED_KEY3 = registerKey("ancient_aetherite_debris_placed3");
    public static final RegistryKey<PlacedFeature> TUFF_EXPERIENCE_ORE_PLACED_KEY4 = registerKey("tuff_experience_placed4");
    public static final RegistryKey<PlacedFeature> TUFF_EXPERIENCE_ORE_PLACED_KEY5 = registerKey("tuff_experience_placed5");
    public static final RegistryKey<PlacedFeature> TUFF_EXPERIENCE_ORE_PLACED_KEY6 = registerKey("tuff_experience_placed6");
    public static final RegistryKey<PlacedFeature> TUFF_EXPERIENCE_ORE_PLACED_KEY7 = registerKey("tuff_experience_placed7");
    public static final RegistryKey<PlacedFeature> TUFF_EXPERIENCE_ORE_PLACED_KEY8 = registerKey("tuff_experience_placed8");


    public static final RegistryKey<PlacedFeature> ANCIENT_TITANITE_DEBRIS_PLACED_KEY1 = registerKey("ancient_titanite_debris_placed1");
    public static final RegistryKey<PlacedFeature> ANCIENT_TITANITE_DEBRIS_PLACED_KEY2 = registerKey("ancient_titanite_debris_placed2");
    public static final RegistryKey<PlacedFeature> ANCIENT_TITANITE_DEBRIS_PLACED_KEY3 = registerKey("ancient_titanite_debris_placed3");
    public static final RegistryKey<PlacedFeature> STONE_EXPERIENCE_ORE_PLACED_KEY4 = registerKey("stone_experience_placed4");
    public static final RegistryKey<PlacedFeature> STONE_EXPERIENCE_ORE_PLACED_KEY5 = registerKey("stone_experience_placed5");
    public static final RegistryKey<PlacedFeature> STONE_EXPERIENCE_ORE_PLACED_KEY6 = registerKey("stone_experience_placed6");
    public static final RegistryKey<PlacedFeature> STONE_EXPERIENCE_ORE_PLACED_KEY7 = registerKey("stone_experience_placed7");
    public static final RegistryKey<PlacedFeature> STONE_EXPERIENCE_ORE_PLACED_KEY8 = registerKey("stone_experience_placed8");


    public static final RegistryKey<PlacedFeature> ANCIENT_ETERNITE_DEBRIS_PLACED_KEY1 = registerKey("ancient_eternite_debris_placed1");
    public static final RegistryKey<PlacedFeature> ANCIENT_ETERNITE_DEBRIS_PLACED_KEY2 = registerKey("ancient_eternite_debris_placed2");
    public static final RegistryKey<PlacedFeature> ANCIENT_ETERNITE_DEBRIS_PLACED_KEY3 = registerKey("ancient_eternite_debris_placed3");
    public static final RegistryKey<PlacedFeature> DEEPSLATE_EXPERIENCE_ORE_PLACED_KEY4 = registerKey("deepslate_experience_placed4");
    public static final RegistryKey<PlacedFeature> DEEPSLATE_EXPERIENCE_ORE_PLACED_KEY5 = registerKey("deepslate_experience_placed5");
    public static final RegistryKey<PlacedFeature> DEEPSLATE_EXPERIENCE_ORE_PLACED_KEY6 = registerKey("deepslate_experience_placed6");
    public static final RegistryKey<PlacedFeature> DEEPSLATE_EXPERIENCE_ORE_PLACED_KEY7 = registerKey("deepslate_experience_placed7");
    public static final RegistryKey<PlacedFeature> DEEPSLATE_EXPERIENCE_ORE_PLACED_KEY8 = registerKey("deepslate_experience_placed8");



    public static void bootstrap(Registerable<PlacedFeature> context) {
        var configuredFeatures = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        register(context, ANCIENT_AETHERITE_DEBRIS_PLACED_KEY1, configuredFeatures.getOrThrow(ModConfiguredFeatures.ANCIENT_AETHERITE_DEBRIS_KEY1),
                ModOrePlacement.modifiersWithCount(15,1,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(128))));
        register(context, ANCIENT_AETHERITE_DEBRIS_PLACED_KEY2, configuredFeatures.getOrThrow(ModConfiguredFeatures.ANCIENT_AETHERITE_DEBRIS_KEY2),
                ModOrePlacement.modifiersWithCount(7,1,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(0), YOffset.fixed(30))));
        register(context, ANCIENT_AETHERITE_DEBRIS_PLACED_KEY3, configuredFeatures.getOrThrow(ModConfiguredFeatures.ANCIENT_AETHERITE_DEBRIS_KEY3),
                ModOrePlacement.modifiersWithCount(4,1,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(5), YOffset.fixed(25))));



        register(context, TUFF_EXPERIENCE_ORE_PLACED_KEY4, configuredFeatures.getOrThrow(ModConfiguredFeatures.TUFF_EXPERIENCE_ORE_KEY4),
                ModOrePlacement.modifiersWithCount(25,1,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(128))));
        register(context, TUFF_EXPERIENCE_ORE_PLACED_KEY5, configuredFeatures.getOrThrow(ModConfiguredFeatures.TUFF_EXPERIENCE_ORE_KEY5),
                ModOrePlacement.modifiersWithCount(24,1,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(128))));
        register(context, TUFF_EXPERIENCE_ORE_PLACED_KEY6, configuredFeatures.getOrThrow(ModConfiguredFeatures.TUFF_EXPERIENCE_ORE_KEY6),
                ModOrePlacement.modifiersWithCount(23,1,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(128))));
        register(context, TUFF_EXPERIENCE_ORE_PLACED_KEY7, configuredFeatures.getOrThrow(ModConfiguredFeatures.TUFF_EXPERIENCE_ORE_KEY7),
                ModOrePlacement.modifiersWithCount(22,1,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(128))));
        register(context, TUFF_EXPERIENCE_ORE_PLACED_KEY8, configuredFeatures.getOrThrow(ModConfiguredFeatures.TUFF_EXPERIENCE_ORE_KEY8),
                ModOrePlacement.modifiersWithCount(21,1,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(128))));



        register(context, ANCIENT_TITANITE_DEBRIS_PLACED_KEY1, configuredFeatures.getOrThrow(ModConfiguredFeatures.ANCIENT_TITANITE_DEBRIS_KEY1),
                ModOrePlacement.modifiersWithCount(12,1,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(128))));
        register(context, ANCIENT_TITANITE_DEBRIS_PLACED_KEY2, configuredFeatures.getOrThrow(ModConfiguredFeatures.ANCIENT_TITANITE_DEBRIS_KEY2),
                ModOrePlacement.modifiersWithCount(6,1,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(0), YOffset.fixed(30))));
        register(context, ANCIENT_TITANITE_DEBRIS_PLACED_KEY3, configuredFeatures.getOrThrow(ModConfiguredFeatures.ANCIENT_TITANITE_DEBRIS_KEY3),
                ModOrePlacement.modifiersWithCount(3,1,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(5), YOffset.fixed(25))));



        register(context, STONE_EXPERIENCE_ORE_PLACED_KEY4, configuredFeatures.getOrThrow(ModConfiguredFeatures.STONE_EXPERIENCE_ORE_KEY4),
                ModOrePlacement.modifiersWithCount(27,1,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(128))));
        register(context, STONE_EXPERIENCE_ORE_PLACED_KEY5, configuredFeatures.getOrThrow(ModConfiguredFeatures.STONE_EXPERIENCE_ORE_KEY5),
                ModOrePlacement.modifiersWithCount(26,1,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(128))));
        register(context, STONE_EXPERIENCE_ORE_PLACED_KEY6, configuredFeatures.getOrThrow(ModConfiguredFeatures.STONE_EXPERIENCE_ORE_KEY6),
                ModOrePlacement.modifiersWithCount(25,1,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(128))));
        register(context, STONE_EXPERIENCE_ORE_PLACED_KEY7, configuredFeatures.getOrThrow(ModConfiguredFeatures.STONE_EXPERIENCE_ORE_KEY7),
                ModOrePlacement.modifiersWithCount(24,1,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(128))));
        register(context, STONE_EXPERIENCE_ORE_PLACED_KEY8, configuredFeatures.getOrThrow(ModConfiguredFeatures.STONE_EXPERIENCE_ORE_KEY8),
                ModOrePlacement.modifiersWithCount(23,1,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(128))));



        register(context, ANCIENT_ETERNITE_DEBRIS_PLACED_KEY1, configuredFeatures.getOrThrow(ModConfiguredFeatures.ANCIENT_ETERNITE_DEBRIS_KEY1),
                ModOrePlacement.modifiersWithCount(10,1,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(128))));
        register(context, ANCIENT_ETERNITE_DEBRIS_PLACED_KEY2, configuredFeatures.getOrThrow(ModConfiguredFeatures.ANCIENT_ETERNITE_DEBRIS_KEY2),
                ModOrePlacement.modifiersWithCount(5,1,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(0), YOffset.fixed(30))));
        register(context, ANCIENT_ETERNITE_DEBRIS_PLACED_KEY3, configuredFeatures.getOrThrow(ModConfiguredFeatures.ANCIENT_ETERNITE_DEBRIS_KEY3),
                ModOrePlacement.modifiersWithCount(2,1,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(5), YOffset.fixed(25))));



        register(context, DEEPSLATE_EXPERIENCE_ORE_PLACED_KEY4, configuredFeatures.getOrThrow(ModConfiguredFeatures.DEEPSLATE_EXPERIENCE_ORE_KEY4),
                ModOrePlacement.modifiersWithCount(30,1,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(128))));
        register(context, DEEPSLATE_EXPERIENCE_ORE_PLACED_KEY5, configuredFeatures.getOrThrow(ModConfiguredFeatures.DEEPSLATE_EXPERIENCE_ORE_KEY5),
                ModOrePlacement.modifiersWithCount(29,1,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(128))));
        register(context, DEEPSLATE_EXPERIENCE_ORE_PLACED_KEY6, configuredFeatures.getOrThrow(ModConfiguredFeatures.DEEPSLATE_EXPERIENCE_ORE_KEY6),
                ModOrePlacement.modifiersWithCount(28,1,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(128))));
        register(context, DEEPSLATE_EXPERIENCE_ORE_PLACED_KEY7, configuredFeatures.getOrThrow(ModConfiguredFeatures.DEEPSLATE_EXPERIENCE_ORE_KEY7),
                ModOrePlacement.modifiersWithCount(27,1,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(128))));
        register(context, DEEPSLATE_EXPERIENCE_ORE_PLACED_KEY8, configuredFeatures.getOrThrow(ModConfiguredFeatures.DEEPSLATE_EXPERIENCE_ORE_KEY8),
                ModOrePlacement.modifiersWithCount(25,1,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(128))));
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
