package net.stegio.mtwa.block.entity;

import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.stegio.mtwa.MTWA;
import net.stegio.mtwa.block.ModBlocks;
import net.stegio.mtwa.block.entity.custom.SunFurnaceBlockEntity;

public class ModBlockEntities {
    public static final BlockEntityType<SunFurnaceBlockEntity> SUN_FURNACE_BE =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(MTWA.MOD_ID, "sun_furnace_be"),
                    BlockEntityType.Builder.create(SunFurnaceBlockEntity::new, ModBlocks.SUN_FURNACE).build(null));

    public static void registerBlockEntities() {
        MTWA.LOGGER.info("Registering Block Entities for " + MTWA.MOD_ID);
    }
}