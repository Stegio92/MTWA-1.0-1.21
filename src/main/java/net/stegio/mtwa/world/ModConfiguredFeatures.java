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
    public static final RegistryKey<ConfiguredFeature<?, ?>> ANCIENT_AETHERITE_DEBRIS_KEY1 = registerKey("ancient_aetherite_debris1");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ANCIENT_AETHERITE_DEBRIS_KEY2 = registerKey("ancient_aetherite_debris2");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ANCIENT_AETHERITE_DEBRIS_KEY3 = registerKey("ancient_aetherite_debris3");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TUFF_EXPERIENCE_ORE_KEY4 = registerKey("tuff_experience_ore4");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TUFF_EXPERIENCE_ORE_KEY5 = registerKey("tuff_experience_ore5");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TUFF_EXPERIENCE_ORE_KEY6 = registerKey("tuff_experience_ore6");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TUFF_EXPERIENCE_ORE_KEY7 = registerKey("tuff_experience_ore7");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TUFF_EXPERIENCE_ORE_KEY8 = registerKey("tuff_experience_ore8");

    public static final RegistryKey<ConfiguredFeature<?, ?>> ANCIENT_TITANITE_DEBRIS_KEY1 = registerKey("ancient_titanite_debris1");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ANCIENT_TITANITE_DEBRIS_KEY2 = registerKey("ancient_titanite_debris2");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ANCIENT_TITANITE_DEBRIS_KEY3 = registerKey("ancient_titanite_debris3");
    public static final RegistryKey<ConfiguredFeature<?, ?>> STONE_EXPERIENCE_ORE_KEY4 = registerKey("stone_experience_ore4");
    public static final RegistryKey<ConfiguredFeature<?, ?>> STONE_EXPERIENCE_ORE_KEY5 = registerKey("stone_experience_ore5");
    public static final RegistryKey<ConfiguredFeature<?, ?>> STONE_EXPERIENCE_ORE_KEY6 = registerKey("stone_experience_ore6");
    public static final RegistryKey<ConfiguredFeature<?, ?>> STONE_EXPERIENCE_ORE_KEY7 = registerKey("stone_experience_ore7");
    public static final RegistryKey<ConfiguredFeature<?, ?>> STONE_EXPERIENCE_ORE_KEY8 = registerKey("stone_experience_ore8");


    public static final RegistryKey<ConfiguredFeature<?, ?>> ANCIENT_ETERNITE_DEBRIS_KEY1 = registerKey("ancient_eternite_debris1");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ANCIENT_ETERNITE_DEBRIS_KEY2 = registerKey("ancient_eternite_debris2");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ANCIENT_ETERNITE_DEBRIS_KEY3 = registerKey("ancient_eternite_debris3");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DEEPSLATE_EXPERIENCE_ORE_KEY4 = registerKey("deepslate_experience_ore4");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DEEPSLATE_EXPERIENCE_ORE_KEY5 = registerKey("deepslate_experience_ore5");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DEEPSLATE_EXPERIENCE_ORE_KEY6 = registerKey("deepslate_experience_ore6");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DEEPSLATE_EXPERIENCE_ORE_KEY7 = registerKey("deepslate_experience_ore7");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DEEPSLATE_EXPERIENCE_ORE_KEY8 = registerKey("deepslate_experience_ore8");


    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        RuleTest tuffReplaceables = new BlockMatchRuleTest(Blocks.TUFF);
        RuleTest stoneReplaceables = new BlockMatchRuleTest(Blocks.STONE);
        RuleTest deepslateReplaceables = new BlockMatchRuleTest(Blocks.DEEPSLATE);

        List<OreFeatureConfig.Target> aetherite =
                List.of(
                        OreFeatureConfig.createTarget(tuffReplaceables, ModBlocks.ANCIENT_AETHERITE_DEBRIS1.getDefaultState()));
        List<OreFeatureConfig.Target> tuff_experience =
                List.of(
                        OreFeatureConfig.createTarget(tuffReplaceables, ModBlocks.TUFF_EXPERIENCE_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> titanite=
                List.of(
                        OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.ANCIENT_TITANITE_DEBRIS1.getDefaultState()));
        List<OreFeatureConfig.Target> stone_experience =
                List.of(
                        OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.STONE_EXPERIENCE_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> eternite =
                List.of(
                        OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.ANCIENT_ETERNITE_DEBRIS1.getDefaultState()));
        List<OreFeatureConfig.Target> deepslate_experience =
                List.of(
                        OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.DEEPSLATE_EXPERIENCE_ORE.getDefaultState()));

        register(context, ANCIENT_AETHERITE_DEBRIS_KEY1, Feature.ORE, new OreFeatureConfig(aetherite, 1, 1.0f));
        register(context, ANCIENT_AETHERITE_DEBRIS_KEY2, Feature.ORE, new OreFeatureConfig(aetherite, 2, 1.0f));
        register(context, ANCIENT_AETHERITE_DEBRIS_KEY3, Feature.ORE, new OreFeatureConfig(aetherite, 3, 1.0f));
        register(context, TUFF_EXPERIENCE_ORE_KEY4, Feature.ORE, new OreFeatureConfig(tuff_experience, 4, 0.0f));
        register(context, TUFF_EXPERIENCE_ORE_KEY5, Feature.ORE, new OreFeatureConfig(tuff_experience, 5, 0.0f));
        register(context, TUFF_EXPERIENCE_ORE_KEY6, Feature.ORE, new OreFeatureConfig(tuff_experience, 6, 0.0f));
        register(context, TUFF_EXPERIENCE_ORE_KEY7, Feature.ORE, new OreFeatureConfig(tuff_experience, 7, 0.0f));
        register(context, TUFF_EXPERIENCE_ORE_KEY8, Feature.ORE, new OreFeatureConfig(tuff_experience, 8, 0.0f));

        register(context, ANCIENT_TITANITE_DEBRIS_KEY1, Feature.ORE, new OreFeatureConfig(titanite, 1, 1.0f));
        register(context, ANCIENT_TITANITE_DEBRIS_KEY2, Feature.ORE, new OreFeatureConfig(titanite, 2, 1.0f));
        register(context, ANCIENT_TITANITE_DEBRIS_KEY3, Feature.ORE, new OreFeatureConfig(titanite, 3, 1.0f));
        register(context, STONE_EXPERIENCE_ORE_KEY4, Feature.ORE, new OreFeatureConfig(stone_experience, 4, 0.0f));
        register(context, STONE_EXPERIENCE_ORE_KEY5, Feature.ORE, new OreFeatureConfig(stone_experience, 5, 0.0f));
        register(context, STONE_EXPERIENCE_ORE_KEY6, Feature.ORE, new OreFeatureConfig(stone_experience, 6, 0.0f));
        register(context, STONE_EXPERIENCE_ORE_KEY7, Feature.ORE, new OreFeatureConfig(stone_experience, 7, 0.0f));
        register(context, STONE_EXPERIENCE_ORE_KEY8, Feature.ORE, new OreFeatureConfig(stone_experience, 8, 0.0f));

        register(context, ANCIENT_ETERNITE_DEBRIS_KEY1, Feature.ORE, new OreFeatureConfig(eternite, 1, 1.0f));
        register(context, ANCIENT_ETERNITE_DEBRIS_KEY2, Feature.ORE, new OreFeatureConfig(eternite, 2, 1.0f));
        register(context, ANCIENT_ETERNITE_DEBRIS_KEY3, Feature.ORE, new OreFeatureConfig(eternite, 3, 1.0f));
        register(context, DEEPSLATE_EXPERIENCE_ORE_KEY4, Feature.ORE, new OreFeatureConfig(deepslate_experience, 4, 0.0f));
        register(context, DEEPSLATE_EXPERIENCE_ORE_KEY5, Feature.ORE, new OreFeatureConfig(deepslate_experience, 5, 0.0f));
        register(context, DEEPSLATE_EXPERIENCE_ORE_KEY6, Feature.ORE, new OreFeatureConfig(deepslate_experience, 6, 0.0f));
        register(context, DEEPSLATE_EXPERIENCE_ORE_KEY7, Feature.ORE, new OreFeatureConfig(deepslate_experience, 7, 0.0f));
        register(context, DEEPSLATE_EXPERIENCE_ORE_KEY8, Feature.ORE, new OreFeatureConfig(deepslate_experience, 8, 0.0f));

    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(MTWA.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
