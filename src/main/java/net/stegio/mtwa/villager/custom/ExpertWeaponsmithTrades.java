package net.stegio.mtwa.villager.custom;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.TradeOfferList;
import net.minecraft.village.TradedItem;
import net.stegio.mtwa.item.ModItems;

import java.util.Optional;

public class ExpertWeaponsmithTrades {
    public static TradeOfferList getTradesForExpertWeaponsmith(int level) {
        TradeOfferList trades = new TradeOfferList();

        switch (level) {
            case 1 -> {
                trades.add(new TradeOffer(new TradedItem(ModItems.AETHERITE_INGOT, 1),
                        new ItemStack(ModItems.GOLDEN_RYO_BUNDLE, 2), 8, 1, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 3),
                        new ItemStack(ModItems.AETHERITE_INGOT, 1), 8, 1, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.AETHERITE_SCRAP),
                        new ItemStack(ModItems.GOLDEN_RYO), 8, 1, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.ESSENCE_OF_THE_SKY),
                        new ItemStack(ModItems.GOLDEN_RYO), 8, 1, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 8), Optional.of(new TradedItem(ModItems.NETHERITE_KATANA)),
                        new ItemStack(ModItems.AETHERITE_KATANA1, 1), 1, 8, 0));
            }
            case 2 -> {
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 11), Optional.of(new TradedItem(ModItems.AETHERITE_KATANA1)),
                        new ItemStack(ModItems.AETHERITE_KATANA2, 1), 1, 24, 0));
            }
            case 3 -> {
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 14), Optional.of(new TradedItem(ModItems.AETHERITE_KATANA2)),
                        new ItemStack(ModItems.AETHERITE_KATANA3, 1), 1, 92, 0));
            }
            case 4 -> {
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 17), Optional.of(new TradedItem(ModItems.AETHERITE_KATANA3)),
                        new ItemStack(ModItems.AETHERITE_KATANA4, 1), 1, 140, 0));
            }
            case 5 -> {
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 20), Optional.of(new TradedItem(ModItems.AETHERITE_KATANA4)),
                        new ItemStack(ModItems.AETHERITE_KATANA5, 1), 1, 200, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 8), Optional.of(new TradedItem(Items.HEAVY_CORE)),
                        new ItemStack(ModItems.AETHERITE_CORE1, 1), 1, 200, 0));
            }
        }
        return trades;
    }
}
