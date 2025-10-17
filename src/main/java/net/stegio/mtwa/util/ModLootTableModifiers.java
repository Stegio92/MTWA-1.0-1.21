package net.stegio.mtwa.util;

import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;
import net.stegio.mtwa.item.ModItems;

public class ModLootTableModifiers {
    public static final Identifier ELDER_GUARDIAN_ID
            = Identifier.of("minecraft", "entities/elder_guardian");
    public static final Identifier WITHER_ID
            = Identifier.of("minecraft", "entities/wither");
    public static final Identifier WARDEN_ID
            = Identifier.of("minecraft", "entities/warden");

    public static void modifyLootTables() {
        LootTableEvents.MODIFY.register((key, tablebuilder, source, wrapperLookup) -> {

            if (ELDER_GUARDIAN_ID.equals(key.getValue())){
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.5f))
                        .with(ItemEntry.builder(ModItems.ESSENCE_OF_THE_SKY))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)).build());

                tablebuilder.pool(poolBuilder.build());
            }
            if (WITHER_ID.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.6f))
                        .with(ItemEntry.builder(ModItems.ESSENCE_OF_THE_SKY))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 3.0f)).build());
                LootPool.Builder poolBuilder2 = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.4f))
                        .with(ItemEntry.builder(ModItems.ESSENCE_OF_THE_SUN))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)).build());
                LootPool.Builder poolBuilder3 = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.05f))
                        .with(ItemEntry.builder(ModItems.ESSENCE_OF_THE_UNIVERSE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)).build());

                tablebuilder.pool(poolBuilder.build());
                tablebuilder.pool(poolBuilder2.build());
                tablebuilder.pool(poolBuilder3.build());
            }
            if (WARDEN_ID.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.8f))
                        .with(ItemEntry.builder(ModItems.ESSENCE_OF_THE_SKY))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(3.0f, 5.0f)).build());
                LootPool.Builder poolBuilder2 = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.7f))
                        .with(ItemEntry.builder(ModItems.ESSENCE_OF_THE_SUN))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2.0f, 4.0f)).build());
                LootPool.Builder poolBuilder3 = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.5f))
                        .with(ItemEntry.builder(ModItems.ESSENCE_OF_THE_UNIVERSE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2.0f, 4.0f)).build());

                tablebuilder.pool(poolBuilder.build());
                tablebuilder.pool(poolBuilder2.build());
                tablebuilder.pool(poolBuilder3.build());
            }



        });
    }
}
