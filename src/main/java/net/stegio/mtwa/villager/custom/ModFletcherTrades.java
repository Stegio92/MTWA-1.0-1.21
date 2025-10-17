package net.stegio.mtwa.villager.custom;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.TradeOfferList;
import net.minecraft.village.TradedItem;
import net.stegio.mtwa.item.ModItems;

public class ModFletcherTrades {
    public static TradeOfferList getFletcherTrades(int level) {
        TradeOfferList trades = new TradeOfferList();

        switch (level) {
            case 1 -> {
                trades.add(new TradeOffer(new TradedItem(Items.SPRUCE_LOG, 16), new ItemStack(ModItems.BRONZE_RYO), 16, 1, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.BRONZE_RYO), new ItemStack(Items.SPRUCE_LOG, 8), 16, 1, 0));
            }
            case 2 -> {
                trades.add(new TradeOffer(new TradedItem(ModItems.BRONZE_RYO_BUNDLE), new ItemStack(Items.SHIELD), 2, 2, 0));
            }
            case 3 -> {
                trades.add(new TradeOffer(new TradedItem(ModItems.BRONZE_RYO, 2), new ItemStack(ModItems.WOODEN_KATANA), 2, 8, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.BRONZE_RYO, 5), new ItemStack(Items.BOW), 2, 8, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.BRONZE_RYO, 7), new ItemStack(Items.CROSSBOW), 2, 8, 0));
            }
            case 4 -> {
                trades.add(new TradeOffer(new TradedItem(ModItems.BRONZE_RYO, 2), new ItemStack(Items.ARROW, 16), 4, 10, 0));
            }
            case 5 -> {
                trades.add(new TradeOffer(new TradedItem(ModItems.BRONZE_RYO, 2), new ItemStack(Items.TIPPED_ARROW, 8), 4, 100, 0));
            }
        }
        return trades;
    }
}
