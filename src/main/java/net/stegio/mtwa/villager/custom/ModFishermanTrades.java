package net.stegio.mtwa.villager.custom;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.TradeOfferList;
import net.minecraft.village.TradedItem;
import net.stegio.mtwa.item.ModItems;

public class ModFishermanTrades {
    public static TradeOfferList getFishermanTrades(int level) {
        TradeOfferList trades = new TradeOfferList();

        switch (level) {
            case 1 -> {
                trades.add(new TradeOffer(new TradedItem(ModItems.BRONZE_RYO, 3), new ItemStack(Items.COD), 4, 1, 0));
            }
            case 2 -> {
                trades.add(new TradeOffer(new TradedItem(ModItems.BRONZE_RYO, 4), new ItemStack(Items.SALMON), 4, 2, 0));
            }
            case 3 -> {
                trades.add(new TradeOffer(new TradedItem(ModItems.BRONZE_RYO, 12), new ItemStack(Items.COD, 4), 4, 4, 0));
            }
            case 4 -> {
                trades.add(new TradeOffer(new TradedItem(ModItems.BRONZE_RYO, 16), new ItemStack(Items.SALMON, 4), 4, 5, 0));
            }
            case 5 -> {
                trades.add(new TradeOffer(new TradedItem(ModItems.BRONZE_RYO, 4), new ItemStack(Items.COOKED_COD), 4, 10, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.BRONZE_RYO, 5), new ItemStack(Items.COOKED_SALMON), 4, 10, 0));
            }
        }
        return trades;
    }
}
