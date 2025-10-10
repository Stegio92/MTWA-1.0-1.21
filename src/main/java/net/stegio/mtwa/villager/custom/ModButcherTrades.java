package net.stegio.mtwa.villager.custom;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.TradeOfferList;
import net.minecraft.village.TradedItem;
import net.stegio.mtwa.item.ModItems;

public class ModButcherTrades {
    public static TradeOfferList getTradesForButcher(int level) {
        TradeOfferList trades = new TradeOfferList();

        switch (level) {
            case 1 -> {
                trades.add(new TradeOffer(new TradedItem(ModItems.BRONZE_RYO, 3), new ItemStack(Items.RABBIT, 2), 8, 2, 0));
            }
            case 2 -> {
                trades.add(new TradeOffer(new TradedItem(ModItems.BRONZE_RYO, 3), new ItemStack(Items.CHICKEN, 2), 8, 4, 0));
                }
            case 3 -> {
                trades.add(new TradeOffer(new TradedItem(ModItems.BRONZE_RYO, 3), new ItemStack(Items.MUTTON, 2), 8, 6, 0));
            }
            case 4 -> {
                trades.add(new TradeOffer(new TradedItem(ModItems.BRONZE_RYO, 4), new ItemStack(Items.PORKCHOP, 2), 8, 8, 0));
            }
            case 5 -> {
                trades.add(new TradeOffer(new TradedItem(ModItems.BRONZE_RYO, 4), new ItemStack(Items.BEEF, 2), 8, 10, 0));
            }
            }
        return trades;
    }
}



