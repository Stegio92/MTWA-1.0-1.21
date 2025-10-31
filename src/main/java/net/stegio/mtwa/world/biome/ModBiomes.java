package net.stegio.mtwa.world.biome;

import net.minecraft.client.sound.BiomeEffectSoundPlayer;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BiomeMoodSound;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeEffects;
import net.minecraft.world.biome.GenerationSettings;
import net.minecraft.world.biome.SpawnSettings;
import net.minecraft.world.gen.feature.DefaultBiomeFeatures;
import net.stegio.mtwa.MTWA;

public class ModBiomes {
    public static final RegistryKey<Biome> MINING_CAVE = RegistryKey.of(RegistryKeys.BIOME,
            Identifier.of(MTWA.MOD_ID, "mining_cave"));
    public static final RegistryKey<Biome> DOMAIN = RegistryKey.of(RegistryKeys.BIOME,
            Identifier.of(MTWA.MOD_ID, "domain"));

    public static void bootsrap(Registerable<Biome> context) {
        context.register(MINING_CAVE, mining_cave(context));
        context.register(DOMAIN, domain(context));
    }

    public static void globalOverworldGeneration(GenerationSettings.LookupBackedBuilder builder) {
    }

    public static Biome mining_cave(Registerable<Biome> context) {
        SpawnSettings.Builder spawnBuilder = new SpawnSettings.Builder();
        spawnBuilder.spawn(SpawnGroup.CREATURE, new SpawnSettings.SpawnEntry(EntityType.BAT, 25, 10, 15));

        GenerationSettings.LookupBackedBuilder biomeBuilder =
                new GenerationSettings.LookupBackedBuilder(context.getRegistryLookup(RegistryKeys.PLACED_FEATURE),
                        context.getRegistryLookup(RegistryKeys.CONFIGURED_CARVER));

        globalOverworldGeneration(biomeBuilder);

        return new Biome.Builder()
                .precipitation(false)
                .downfall(0.0f)
                .temperature(0.25f)
                .generationSettings(biomeBuilder.build())
                .spawnSettings(spawnBuilder.build())
                .effects((new BiomeEffects.Builder())
                        .waterColor(0x44a6b8)
                        .waterFogColor(0x85b8c1)
                        .skyColor(0x000000)
                        .grassColor(0x0f5b1a)
                        .foliageColor(0x0f5b1a)
                        .fogColor(0x1c2120)
                        .moodSound(BiomeMoodSound.CAVE)
                        .build())
                .build();
    }
    public static Biome domain(Registerable<Biome> context) {
        SpawnSettings.Builder spawnBuilder = new SpawnSettings.Builder();

        GenerationSettings.LookupBackedBuilder biomeBuilder =
                new GenerationSettings.LookupBackedBuilder(context.getRegistryLookup(RegistryKeys.PLACED_FEATURE),
                        context.getRegistryLookup(RegistryKeys.CONFIGURED_CARVER));

        globalOverworldGeneration(biomeBuilder);

        return new Biome.Builder()
                .precipitation(false)
                .downfall(0.0f)
                .temperature(0.8f)
                .generationSettings(biomeBuilder.build())
                .spawnSettings(spawnBuilder.build())
                .effects((new BiomeEffects.Builder())
                        .waterColor(0x520614)
                        .waterFogColor(0x4f7388)
                        .skyColor(0x000000)
                        .grassColor(0x000000)
                        .foliageColor(0x000000)
                        .fogColor(0x000000)
                        .moodSound(BiomeMoodSound.CAVE)
                        .build())
                .build();
    }
}


