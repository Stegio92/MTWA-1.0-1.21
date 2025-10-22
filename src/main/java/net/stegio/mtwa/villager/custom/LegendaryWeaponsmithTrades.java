package net.stegio.mtwa.villager.custom;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.TradeOfferList;
import net.minecraft.village.TradedItem;
import net.stegio.mtwa.item.ModItems;

import java.util.Optional;

public class LegendaryWeaponsmithTrades {
    public static TradeOfferList getTradesForLegendaryWeaponsmith(int level) {
        TradeOfferList trades = new TradeOfferList();

        switch (level) {
            case 1 -> {
                trades.add(new TradeOffer(new TradedItem(ModItems.ETERNITE_INGOT, 1),
                        new ItemStack(ModItems.GOLDEN_RYO_BUNDLE, 32), 8, 1, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 35),
                        new ItemStack(ModItems.ETERNITE_INGOT, 1), 8, 1, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.ETERNITE_SCRAP),
                        new ItemStack(ModItems.GOLDEN_RYO_BUNDLE), 8, 1, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.ESSENCE_OF_THE_UNIVERSE),
                        new ItemStack(ModItems.GOLDEN_RYO_BUNDLE), 8, 1, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 60), Optional.of(new TradedItem(ModItems.TITANITE_KATANA5)),
                        new ItemStack(ModItems.ETERNITE_KATANA1, 1), 1, 8, 0));
            }
            case 2 -> {
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 61), Optional.of(new TradedItem(ModItems.ETERNITE_KATANA1)),
                        new ItemStack(ModItems.ETERNITE_KATANA2, 1), 1, 24, 0));
            }
            case 3 -> {
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 62), Optional.of(new TradedItem(ModItems.ETERNITE_KATANA2)),
                        new ItemStack(ModItems.ETERNITE_KATANA3, 1), 1, 92, 0));
            }
            case 4 -> {
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 63), Optional.of(new TradedItem(ModItems.ETERNITE_KATANA3)),
                        new ItemStack(ModItems.ETERNITE_KATANA4, 1), 1, 140, 0));
            }
            case 5 -> {
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 64), Optional.of(new TradedItem(ModItems.ETERNITE_KATANA4)),
                        new ItemStack(ModItems.ETERNITE_KATANA5, 1), 1, 200, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 60), Optional.of(new TradedItem(ModItems.TITANITE_CORE)),
                        new ItemStack(ModItems.ETERNITE_CORE, 1), 1, 200, 0));
            }
        }
        return trades;
    }
}
