package net.stegio.mtwa.villager.custom;

import net.minecraft.item.ItemStack;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.TradeOfferList;
import net.minecraft.village.TradedItem;
import net.stegio.mtwa.item.ModItems;

public class ModClericTrades {
    public static TradeOfferList getClericTrades(int level){
        TradeOfferList trades = new TradeOfferList();

        switch (level) {
            case 1 -> {
                trades.add(new TradeOffer(
                        new TradedItem(ModItems.BRONZE_RYO_BUNDLE, 2),
                        new ItemStack(ModItems.SILVER_RYO, 1), 9, 1, 0));
                trades.add(new TradeOffer(
                        new TradedItem(ModItems.SILVER_RYO, 1),
                        new ItemStack(ModItems.BRONZE_RYO, 16), 9, 1, 0));
            }
            case 2 -> {
                trades.add(new TradeOffer(
                        new TradedItem(ModItems.SILVER_RYO_BUNDLE, 2),
                        new ItemStack(ModItems.GOLDEN_RYO, 1), 9, 2, 0));
                trades.add(new TradeOffer(
                        new TradedItem(ModItems.GOLDEN_RYO, 1),
                        new ItemStack(ModItems.SILVER_RYO, 16), 9, 2, 0));
            }
            case 3 -> {
                trades.add(new TradeOffer(
                        new TradedItem(ModItems.BRONZE_RYO_BUNDLE, 36),
                        new ItemStack(ModItems.GOLDEN_RYO, 1), 9, 10, 0));
                trades.add(new TradeOffer(
                        new TradedItem(ModItems.GOLDEN_RYO, 1),
                        new ItemStack(ModItems.BRONZE_RYO_BUNDLE, 32), 9, 10, 0));
            }
            case 4 -> {
                trades.add(new TradeOffer(
                        new TradedItem(ModItems.BRONZE_RYO_BUNDLE, 18),
                        new ItemStack(ModItems.SILVER_RYO_BUNDLE, 1), 9, 15, 0));
                trades.add(new TradeOffer(
                        new TradedItem(ModItems.SILVER_RYO_BUNDLE, 1),
                        new ItemStack(ModItems.BRONZE_RYO_BUNDLE, 16), 9, 15, 0));
            }
            case 5 -> {
                trades.add(new TradeOffer(
                        new TradedItem(ModItems.SILVER_RYO_BUNDLE, 18),
                        new ItemStack(ModItems.GOLDEN_RYO_BUNDLE, 1), 9, 100, 0));
                trades.add(new TradeOffer(
                        new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 1),
                        new ItemStack(ModItems.SILVER_RYO_BUNDLE, 16), 9, 100, 0));
            }
        }
        return trades;
    }
}
