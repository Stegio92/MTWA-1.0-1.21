package net.stegio.mtwa.villager.custom;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.TradeOfferList;
import net.minecraft.village.TradedItem;
import net.stegio.mtwa.item.ModItems;

public class ModLeatherworkerTrades {
    public static TradeOfferList getLeatherworkerTrades(int level) {
        TradeOfferList trades = new TradeOfferList();

        switch (level) {
            case 1 -> {
                trades.add(new TradeOffer(new TradedItem(Items.LEATHER, 16), new ItemStack(ModItems.BRONZE_RYO), 8, 2, 0));
            }
            case 2 -> {
                trades.add(new TradeOffer(new TradedItem(ModItems.SILVER_RYO_BUNDLE), new ItemStack(Items.TIDE_ARMOR_TRIM_SMITHING_TEMPLATE), 4, 2, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.SILVER_RYO_BUNDLE), new ItemStack(Items.BOLT_ARMOR_TRIM_SMITHING_TEMPLATE), 4, 2, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.SILVER_RYO_BUNDLE), new ItemStack(Items.COAST_ARMOR_TRIM_SMITHING_TEMPLATE), 4, 2, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.SILVER_RYO_BUNDLE), new ItemStack(Items.DUNE_ARMOR_TRIM_SMITHING_TEMPLATE), 4, 2, 0));
            }
            case 3 -> {
                trades.add(new TradeOffer(new TradedItem(ModItems.SILVER_RYO_BUNDLE), new ItemStack(Items.EYE_ARMOR_TRIM_SMITHING_TEMPLATE), 4, 4, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.SILVER_RYO_BUNDLE), new ItemStack(Items.FLOW_ARMOR_TRIM_SMITHING_TEMPLATE), 4, 4, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.SILVER_RYO_BUNDLE), new ItemStack(Items.HOST_ARMOR_TRIM_SMITHING_TEMPLATE), 4, 4, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.SILVER_RYO_BUNDLE), new ItemStack(Items.RAISER_ARMOR_TRIM_SMITHING_TEMPLATE), 4, 4, 0));
            }
            case 4 -> {
                trades.add(new TradeOffer(new TradedItem(ModItems.SILVER_RYO_BUNDLE), new ItemStack(Items.RIB_ARMOR_TRIM_SMITHING_TEMPLATE), 4, 5, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.SILVER_RYO_BUNDLE), new ItemStack(Items.WILD_ARMOR_TRIM_SMITHING_TEMPLATE), 4, 5, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.SILVER_RYO_BUNDLE), new ItemStack(Items.WARD_ARMOR_TRIM_SMITHING_TEMPLATE), 4, 5, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.SILVER_RYO_BUNDLE), new ItemStack(Items.VEX_ARMOR_TRIM_SMITHING_TEMPLATE), 4, 5, 0));
            }
            case 5 -> {
                trades.add(new TradeOffer(new TradedItem(ModItems.SILVER_RYO_BUNDLE), new ItemStack(Items.SNOUT_ARMOR_TRIM_SMITHING_TEMPLATE), 4, 20, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.SILVER_RYO_BUNDLE), new ItemStack(Items.SPIRE_ARMOR_TRIM_SMITHING_TEMPLATE), 4, 20, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.SILVER_RYO_BUNDLE), new ItemStack(Items.WAYFINDER_ARMOR_TRIM_SMITHING_TEMPLATE), 4, 20, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.SILVER_RYO_BUNDLE), new ItemStack(Items.SENTRY_ARMOR_TRIM_SMITHING_TEMPLATE), 4, 20, 0));
            }
        }
        return trades;
    }
}
