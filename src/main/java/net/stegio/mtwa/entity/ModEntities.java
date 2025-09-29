package net.stegio.mtwa.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.stegio.mtwa.MTWA;
import net.stegio.mtwa.entity.custom.WoodenSpearProjectileEntity;

public class ModEntities {

    public static final EntityType<WoodenSpearProjectileEntity> WOODEN_SPEAR = Registry.register(Registries.ENTITY_TYPE,
            Identifier.of(MTWA.MOD_ID, "wooden_spear"),
            EntityType.Builder.<WoodenSpearProjectileEntity>create(WoodenSpearProjectileEntity::new, SpawnGroup.MISC)
                    .dimensions(0.5F, 0.5F)
                    .eyeHeight(0.13F)
                    .maxTrackingRange(4)
                    .trackingTickInterval(20)
                    .build());


    public static void registerModEntities() {
        MTWA.LOGGER.info("Registering Mod Entities for " + MTWA.MOD_ID);
    }
}
