package net.stegio.mtwa.villager.custom;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.TradeOfferList;
import net.minecraft.village.TradedItem;
import net.stegio.mtwa.item.ModItems;

public class ModFarmerTrades {
    public static TradeOfferList getFarmerTrades(int level) {
        TradeOfferList trades = new TradeOfferList();

        switch (level) {
            case 1 -> {
                trades.add(new TradeOffer(new TradedItem(ModItems.BRONZE_RYO, 1), new ItemStack(Items.CARROT, 2), 16, 1, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.BRONZE_RYO, 1), new ItemStack(Items.POTATO, 2), 16, 1, 0));
            }
            case 2 -> {
                trades.add(new TradeOffer(new TradedItem(ModItems.BRONZE_RYO, 3), new ItemStack(Items.BREAD, 1), 12, 1, 0));
            }
            case 3 -> {
                trades.add(new TradeOffer(new TradedItem(ModItems.SILVER_RYO, 3), new ItemStack(Items.GOLDEN_CARROT, 3), 10, 4, 0));
            }
            case 4 -> {
                trades.add(new TradeOffer(new TradedItem(ModItems.SILVER_RYO_BUNDLE), new ItemStack(Items.GOLDEN_APPLE), 4, 5, 0));
            }
            case 5 -> {
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE), new ItemStack(Items.ENCHANTED_GOLDEN_APPLE), 1, 1, 0));
            }
        }
        return trades;
    }
}
