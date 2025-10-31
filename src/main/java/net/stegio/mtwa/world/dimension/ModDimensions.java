package net.stegio.mtwa.world.dimension;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.world.World;
import net.minecraft.world.dimension.DimensionOptions;
import net.minecraft.world.dimension.DimensionType;
import net.minecraft.world.dimension.DimensionTypes;
import net.minecraft.world.gen.chunk.ChunkGenerator;
import net.stegio.mtwa.MTWA;

import java.util.OptionalLong;

public class ModDimensions {
    public static final RegistryKey<World> AETHERITE_DIM_LEVEL_KEY = RegistryKey.of(RegistryKeys.WORLD,
            Identifier.of(MTWA.MOD_ID, "aetherite_dim.json"));
    public static final RegistryKey<DimensionType> AETHERITE_DIM_TYPE = RegistryKey.of(RegistryKeys.DIMENSION_TYPE,
            Identifier.of(MTWA.MOD_ID, "aetherite_dim_type"));

    public static final RegistryKey<World> TITANITE_DIM_LEVEL_KEY = RegistryKey.of(RegistryKeys.WORLD,
            Identifier.of(MTWA.MOD_ID, "titanite_dim.json"));
    public static final RegistryKey<DimensionType> TITANITE_DIM_TYPE = RegistryKey.of(RegistryKeys.DIMENSION_TYPE,
            Identifier.of(MTWA.MOD_ID, "titanite_dim_type"));

    public static final RegistryKey<World> ETERNITE_DIM_LEVEL_KEY = RegistryKey.of(RegistryKeys.WORLD,
            Identifier.of(MTWA.MOD_ID, "eternite_dim.json"));
    public static final RegistryKey<DimensionType> ETERNITE_DIM_TYPE = RegistryKey.of(RegistryKeys.DIMENSION_TYPE,
            Identifier.of(MTWA.MOD_ID, "eternite_dim_type"));

    public static final RegistryKey<World> DOMAIN_DIM_LEVEL_KEY = RegistryKey.of(RegistryKeys.WORLD,
            Identifier.of(MTWA.MOD_ID, "domain_dim.json"));
    public static final RegistryKey<DimensionType> DOMAIN_DIM_TYPE = RegistryKey.of(RegistryKeys.DIMENSION_TYPE,
            Identifier.of(MTWA.MOD_ID, "domain_dim_type"));

    public static void bootstrapType(Registerable<DimensionType> context) {
        context.register(AETHERITE_DIM_TYPE, new DimensionType(
                OptionalLong.of(18000), // fixedTime
                false, // hasSkylight
                true, // hasCeiling
                false, // ultraWarm
                true, // natural
                10.0, // coordinateScale
                true, // bedWorks
                false, // respawnAnchorWorks
                0, // minY
                128, // height
                128, // logicalHeight
                BlockTags.INFINIBURN_OVERWORLD, // infiniburn
                DimensionTypes.THE_NETHER_ID, // effectsLocation
                0.1f, // ambientLight
                new DimensionType.MonsterSettings(false, false, UniformIntProvider.create(0, 0), 0)));

        context.register(TITANITE_DIM_TYPE, new DimensionType(
                OptionalLong.of(18000), // fixedTime
                false, // hasSkylight
                true, // hasCeiling
                false, // ultraWarm
                true, // natural
                10.0, // coordinateScale
                true, // bedWorks
                false, // respawnAnchorWorks
                0, // minY
                128, // height
                128, // logicalHeight
                BlockTags.INFINIBURN_OVERWORLD, // infiniburn
                DimensionTypes.THE_NETHER_ID, // effectsLocation
                0.05f, // ambientLight
                new DimensionType.MonsterSettings(false, false, UniformIntProvider.create(0, 0), 0)));

        context.register(ETERNITE_DIM_TYPE, new DimensionType(
                OptionalLong.of(18000), // fixedTime
                false, // hasSkylight
                true, // hasCeiling
                false, // ultraWarm
                true, // natural
                10.0, // coordinateScale
                true, // bedWorks
                false, // respawnAnchorWorks
                0, // minY
                128, // height
                128, // logicalHeight
                BlockTags.INFINIBURN_OVERWORLD, // infiniburn
                DimensionTypes.THE_NETHER_ID, // effectsLocation
                0.01f, // ambientLight
                new DimensionType.MonsterSettings(false, false, UniformIntProvider.create(0, 0), 0)));

        context.register(DOMAIN_DIM_TYPE, new DimensionType(
                OptionalLong.of(18000), // fixedTime
                false, // hasSkylight
                false, // hasCeiling
                false, // ultraWarm
                true, // natural
                10.0, // coordinateScale
                false, // bedWorks
                false, // respawnAnchorWorks
                0, // minY
                128, // height
                128, // logicalHeight
                BlockTags.INFINIBURN_OVERWORLD, // infiniburn
                DimensionTypes.THE_NETHER_ID, // effectsLocation
                0.01f, // ambientLight
                new DimensionType.MonsterSettings(false, false, UniformIntProvider.create(0, 0), 0)));
    }
}
