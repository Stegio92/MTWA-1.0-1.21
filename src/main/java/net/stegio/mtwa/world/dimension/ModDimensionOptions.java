package net.stegio.mtwa.world.dimension;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.dimension.DimensionOptions;
import net.minecraft.world.dimension.DimensionType;
import net.minecraft.world.gen.chunk.ChunkGenerator;
import net.stegio.mtwa.MTWA;

public record ModDimensionOptions(RegistryEntry<DimensionType> dimensionTypeEntry, ChunkGenerator chunkGenerator) {
    public static final Codec<DimensionOptions> CODEC = RecordCodecBuilder.create(
            instance -> instance.group(
                            DimensionType.REGISTRY_CODEC.fieldOf("type").forGetter(DimensionOptions::dimensionTypeEntry),
                            ChunkGenerator.CODEC.fieldOf("generator").forGetter(DimensionOptions::chunkGenerator)
                    )
                    .apply(instance, instance.stable(DimensionOptions::new))
    );
    public static final RegistryKey<DimensionOptions> AETHERITE_DIM = RegistryKey.of(RegistryKeys.DIMENSION, Identifier.of(MTWA.MOD_ID, "aetherite_dim"));
    public static final RegistryKey<DimensionOptions> TITANITE_DIM = RegistryKey.of(RegistryKeys.DIMENSION, Identifier.of(MTWA.MOD_ID,"titanite_dim"));
    public static final RegistryKey<DimensionOptions> ETERNITE_DIM = RegistryKey.of(RegistryKeys.DIMENSION, Identifier.of(MTWA.MOD_ID,"eternite_dim"));
    public static final RegistryKey<DimensionOptions> DOMAIN_DIM = RegistryKey.of(RegistryKeys.DIMENSION, Identifier.of(MTWA.MOD_ID,"domain_dim"));
}
