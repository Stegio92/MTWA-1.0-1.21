package net.stegio.mtwa.villager.custom;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.TradeOfferList;
import net.minecraft.village.TradedItem;
import net.stegio.mtwa.item.ModItems;

public class MerchantTrades {
    public static TradeOfferList getTradesForMerchant(int level) {
        TradeOfferList trades = new TradeOfferList();

        switch (level) {
            case 1 -> {
                trades.add(new TradeOffer(new TradedItem(ModItems.SILVER_RYO_BUNDLE, 2), new ItemStack(Items.TOTEM_OF_UNDYING), 4, 2, 0));
            }
            case 2 -> {
                trades.add(new TradeOffer(new TradedItem(ModItems.SILVER_RYO_BUNDLE), new ItemStack(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE), 4, 2, 0));
            }
            case 3 -> {
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 3), new ItemStack(ModItems.AETHERITE_UPGRADE_SMITHING_TEMPLATE), 4, 2, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE,4), new ItemStack(ModItems.AETHERITE_UPGRADE_SMITHING_TEMPLATE2), 4, 2, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE,5), new ItemStack(ModItems.AETHERITE_UPGRADE_SMITHING_TEMPLATE3), 4, 2, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 6), new ItemStack(ModItems.AETHERITE_UPGRADE_SMITHING_TEMPLATE4), 4, 2, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 7), new ItemStack(ModItems.AETHERITE_UPGRADE_SMITHING_TEMPLATE5), 4, 2, 0));
            }
            case 4 -> {
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 12), new ItemStack(ModItems.TITANITE_UPGRADE_SMITHING_TEMPLATE), 4, 5, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE,13), new ItemStack(ModItems.TITANITE_UPGRADE_SMITHING_TEMPLATE2), 4, 5, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE,14), new ItemStack(ModItems.TITANITE_UPGRADE_SMITHING_TEMPLATE3), 4, 5, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 15), new ItemStack(ModItems.TITANITE_UPGRADE_SMITHING_TEMPLATE4), 4, 5, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 16), new ItemStack(ModItems.TITANITE_UPGRADE_SMITHING_TEMPLATE5), 4, 5, 0));
            }
            case 5 -> {
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 44), new ItemStack(ModItems.ETERNITE_UPGRADE_SMITHING_TEMPLATE1), 4, 7, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE,45), new ItemStack(ModItems.ETERNITE_UPGRADE_SMITHING_TEMPLATE2), 4, 7, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE,46), new ItemStack(ModItems.ETERNITE_UPGRADE_SMITHING_TEMPLATE3), 4, 7, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 47), new ItemStack(ModItems.ETERNITE_UPGRADE_SMITHING_TEMPLATE4), 4, 7, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 48), new ItemStack(ModItems.ETERNITE_UPGRADE_SMITHING_TEMPLATE5), 4, 7, 0));
            }
        }
        return trades;
    }
}
