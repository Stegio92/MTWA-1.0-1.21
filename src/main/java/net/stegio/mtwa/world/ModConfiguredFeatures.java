package net.stegio.mtwa.world;

import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.*;
import net.stegio.mtwa.MTWA;
import net.stegio.mtwa.block.ModBlocks;

import java.util.List;

public class ModConfiguredFeatures {

    public static final RegistryKey<ConfiguredFeature<?, ?>> OVERWORLD_ANCIENT_AETHERITE_DEBRIS_KEY1 = registerKey("overworld_ancient_aetherite_debris1");
    public static final RegistryKey<ConfiguredFeature<?, ?>> OVERWORLD_ANCIENT_TITANITE_DEBRIS_KEY1 = registerKey("overworld_ancient_titanite_debris1");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ANCIENT_AETHERITE_DEBRIS_KEY1 = registerKey("ancient_aetherite_debris1");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ANCIENT_TITANITE_DEBRIS_KEY1 = registerKey("ancient_titanite_debris1");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ANCIENT_AETHERITE_DEBRIS_KEY2 = registerKey("ancient_aetherite_debris2");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ANCIENT_TITANITE_DEBRIS_KEY2 = registerKey("ancient_titanite_debris2");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ANCIENT_AETHERITE_DEBRIS_KEY3 = registerKey("ancient_aetherite_debris3");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ANCIENT_TITANITE_DEBRIS_KEY3 = registerKey("ancient_titanite_debris3");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ANCIENT_AETHERITE_DEBRIS_KEY4 = registerKey("ancient_aetherite_debris4");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ANCIENT_TITANITE_DEBRIS_KEY4 = registerKey("ancient_titanite_debris4");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        RuleTest deepslateReplaceables = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest endReplaceables = new BlockMatchRuleTest(Blocks.END_STONE);

        List<OreFeatureConfig.Target> overworldDebris =
                List.of(
                        OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.ANCIENT_AETHERITE_DEBRIS1.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.ANCIENT_TITANITE_DEBRIS1.getDefaultState()));

        List<OreFeatureConfig.Target> endDebris =
                List.of(
                        OreFeatureConfig.createTarget(endReplaceables, ModBlocks.ANCIENT_AETHERITE_DEBRIS1.getDefaultState()),
                        OreFeatureConfig.createTarget(endReplaceables, ModBlocks.ANCIENT_TITANITE_DEBRIS1.getDefaultState()));

        register(context, OVERWORLD_ANCIENT_AETHERITE_DEBRIS_KEY1, Feature.ORE, new OreFeatureConfig(overworldDebris, 1));
        register(context, OVERWORLD_ANCIENT_TITANITE_DEBRIS_KEY1, Feature.ORE, new OreFeatureConfig(overworldDebris, 1));
        register(context, ANCIENT_AETHERITE_DEBRIS_KEY1, Feature.ORE, new OreFeatureConfig(endDebris, 1));
        register(context, ANCIENT_TITANITE_DEBRIS_KEY1, Feature.ORE, new OreFeatureConfig(endDebris, 1));
        register(context, ANCIENT_AETHERITE_DEBRIS_KEY2, Feature.ORE, new OreFeatureConfig(endDebris, 2));
        register(context, ANCIENT_TITANITE_DEBRIS_KEY2, Feature.ORE, new OreFeatureConfig(endDebris, 2));
        register(context, ANCIENT_AETHERITE_DEBRIS_KEY3, Feature.ORE, new OreFeatureConfig(endDebris, 3));
        register(context, ANCIENT_TITANITE_DEBRIS_KEY3, Feature.ORE, new OreFeatureConfig(endDebris, 3));
        register(context, ANCIENT_AETHERITE_DEBRIS_KEY4, Feature.ORE, new OreFeatureConfig(endDebris, 4));
        register(context, ANCIENT_TITANITE_DEBRIS_KEY4, Feature.ORE, new OreFeatureConfig(endDebris, 4));
    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(MTWA.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
