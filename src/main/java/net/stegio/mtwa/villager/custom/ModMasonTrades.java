package net.stegio.mtwa.villager.custom;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.TradeOfferList;
import net.minecraft.village.TradedItem;
import net.stegio.mtwa.item.ModItems;

public class ModMasonTrades {
    public static TradeOfferList getMasonTrades(int level) {
        TradeOfferList trades = new TradeOfferList();

        switch (level) {
            case 1 -> {
                trades.add(new TradeOffer(new TradedItem(Items.COBBLESTONE, 64), new ItemStack(ModItems.BRONZE_RYO, 4), 16, 1, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.BRONZE_RYO, 4), new ItemStack(Items.COBBLESTONE, 32), 16, 1, 0));
                trades.add(new TradeOffer(new TradedItem(Items.STONE, 32), new ItemStack(ModItems.BRONZE_RYO, 4), 16, 1, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.BRONZE_RYO, 4), new ItemStack(Items.STONE, 16), 16, 1, 0));
            }
            case 2 -> {
                trades.add(new TradeOffer(new TradedItem(Items.COBBLED_DEEPSLATE, 64), new ItemStack(ModItems.BRONZE_RYO, 6), 16, 1, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.BRONZE_RYO, 6), new ItemStack(Items.COBBLESTONE, 32), 16, 1, 0));
                trades.add(new TradeOffer(new TradedItem(Items.DEEPSLATE, 32), new ItemStack(ModItems.BRONZE_RYO, 6), 16, 1, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.BRONZE_RYO, 6), new ItemStack(Items.DEEPSLATE, 16), 16, 1, 0));
            }
            case 3 -> {
                trades.add(new TradeOffer(new TradedItem(Items.DIORITE, 64), new ItemStack(ModItems.BRONZE_RYO, 6), 16, 1, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.BRONZE_RYO, 6), new ItemStack(Items.DIORITE, 32), 16, 1, 0));
            }
            case 4 -> {
                trades.add(new TradeOffer(new TradedItem(Items.WHITE_CONCRETE_POWDER, 64), new ItemStack(ModItems.BRONZE_RYO_BUNDLE), 16, 1, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.BRONZE_RYO_BUNDLE), new ItemStack(Items.WHITE_CONCRETE_POWDER, 32), 16, 1, 0));
            }
            case 5 -> {
                trades.add(new TradeOffer(new TradedItem(Items.AMETHYST_SHARD, 16), new ItemStack(ModItems.BRONZE_RYO_BUNDLE, 2), 16, 1, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.BRONZE_RYO_BUNDLE, 2), new ItemStack(Items.AMETHYST_SHARD, 8), 16, 1, 0));
                trades.add(new TradeOffer(new TradedItem(Items.QUARTZ, 16), new ItemStack(ModItems.BRONZE_RYO_BUNDLE, 2), 16, 1, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.BRONZE_RYO_BUNDLE, 2), new ItemStack(Items.QUARTZ, 8), 16, 1, 0));
                trades.add(new TradeOffer(new TradedItem(Items.LAPIS_LAZULI, 16), new ItemStack(ModItems.BRONZE_RYO_BUNDLE, 2), 16, 1, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.BRONZE_RYO_BUNDLE, 2), new ItemStack(Items.LAPIS_LAZULI, 8), 16, 1, 0));
                trades.add(new TradeOffer(new TradedItem(Items.REDSTONE, 16), new ItemStack(ModItems.BRONZE_RYO_BUNDLE, 2), 16, 1, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.BRONZE_RYO_BUNDLE, 2), new ItemStack(Items.REDSTONE, 8), 16, 1, 0));
            }
        }
        return trades;
    }
}
