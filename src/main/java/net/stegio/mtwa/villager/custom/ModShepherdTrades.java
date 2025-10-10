package net.stegio.mtwa.villager.custom;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.TradeOfferList;
import net.minecraft.village.TradedItem;
import net.stegio.mtwa.item.ModItems;
import net.stegio.mtwa.util.ModTags;

public class ModShepherdTrades {
    public static TradeOfferList getShepherdTrades(int level) {
        TradeOfferList trades = new TradeOfferList();

        switch (level) {
            case 1 -> {
                trades.add(new TradeOffer(new TradedItem(Items.WHITE_WOOL, 32), new ItemStack(ModItems.BRONZE_RYO, 2), 8, 1, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.BRONZE_RYO, 2), new ItemStack(Items.WHITE_WOOL, 16), 16, 1, 0));
            }
            case 2 -> {
                trades.add(new TradeOffer(new TradedItem(ModItems.BRONZE_RYO), new ItemStack(Items.BLACK_DYE, 8), 8, 1, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.BRONZE_RYO), new ItemStack(Items.BLUE_DYE, 8), 8, 1, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.BRONZE_RYO), new ItemStack(Items.BROWN_DYE, 8), 8, 1, 0));
            }
            case 3 -> {
                trades.add(new TradeOffer(new TradedItem(ModItems.BRONZE_RYO), new ItemStack(Items.CYAN_DYE, 8), 8, 1, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.BRONZE_RYO), new ItemStack(Items.GRAY_DYE, 8), 8, 1, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.BRONZE_RYO), new ItemStack(Items.GREEN_DYE, 8), 8, 1, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.BRONZE_RYO), new ItemStack(Items.LIGHT_BLUE_DYE, 8), 8, 1, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.BRONZE_RYO), new ItemStack(Items.LIGHT_GRAY_DYE, 8), 8, 1, 0));
            }
            case 4 -> {
                trades.add(new TradeOffer(new TradedItem(ModItems.BRONZE_RYO), new ItemStack(Items.LIME_DYE, 8), 8, 1, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.BRONZE_RYO), new ItemStack(Items.MAGENTA_DYE, 8), 8, 1, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.BRONZE_RYO), new ItemStack(Items.ORANGE_DYE, 8), 8, 1, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.BRONZE_RYO), new ItemStack(Items.PINK_DYE, 8), 8, 1, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.BRONZE_RYO), new ItemStack(Items.PURPLE_DYE, 8), 8, 1, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.BRONZE_RYO), new ItemStack(Items.YELLOW_DYE, 8), 8, 1, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.BRONZE_RYO), new ItemStack(Items.RED_DYE, 8), 8, 1, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.BRONZE_RYO), new ItemStack(Items.WHITE_DYE, 8), 8, 1, 0));
            }
            case 5 -> {
                trades.add(new TradeOffer(new TradedItem(ModItems.BRONZE_RYO), new ItemStack(Items.PAINTING, 2), 8, 1, 0));
            }
        }
        return trades;
    }
}
