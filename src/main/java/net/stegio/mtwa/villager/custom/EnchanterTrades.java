package net.stegio.mtwa.villager.custom;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.TradeOfferList;
import net.minecraft.village.TradedItem;
import net.stegio.mtwa.item.ModItems;

import java.util.Optional;

public class EnchanterTrades {
    public static TradeOfferList getTradesForEnchanter(int level) {
        TradeOfferList trades = new TradeOfferList();

        switch (level) {
            case 1 -> {
                trades.add(new TradeOffer(
                        new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 4),
                        new ItemStack(Items.AIR, 1), 16, 1, 0));
            }
            case 2 -> {
                trades.add(new TradeOffer(
                        new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 8),
                        new ItemStack(Items.AIR, 1), 16, 1, 0));
            }
            case 3 -> {
                trades.add(new TradeOffer(
                        new TradedItem(ModItems.ETERNITE_AXE1, 1), Optional.of(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 32)),
                        new ItemStack(Items.BOOK, 1), 2, 10, 0));
                trades.add(new TradeOffer(
                        new TradedItem(ModItems.ETERNITE_PICKAXE1, 1), Optional.of(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 32)),
                        new ItemStack(Items.BOOK, 1), 2, 10, 0));
                trades.add(new TradeOffer(
                        new TradedItem(ModItems.ETERNITE_SHOVEL1, 1), Optional.of(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 32)),
                        new ItemStack(Items.BOOK, 1), 2, 10, 0));
                trades.add(new TradeOffer(
                        new TradedItem(ModItems.ETERNITE_HOE1, 1), Optional.of(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 32)),
                        new ItemStack(Items.BOOK, 1), 2, 10, 0));
                trades.add(new TradeOffer(
                        new TradedItem(Items.SHIELD, 1), Optional.of(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 32)),
                        new ItemStack(Items.BOOK, 1), 2, 10, 0));
            }
            case 4 -> {
                trades.add(new TradeOffer(
                        new TradedItem(ModItems.ETERNITE_HELMET1, 1), Optional.of(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 48)),
                        new ItemStack(Items.BOOK, 1), 2, 10, 0));
                trades.add(new TradeOffer(
                        new TradedItem(ModItems.ETERNITE_CHESTPLATE1, 1), Optional.of(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 48)),
                        new ItemStack(Items.BOOK, 1), 2, 10, 0));
                trades.add(new TradeOffer(
                        new TradedItem(ModItems.ETERNITE_LEGGINGS1, 1), Optional.of(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 48)),
                        new ItemStack(Items.BOOK, 1), 2, 10, 0));
                trades.add(new TradeOffer(
                        new TradedItem(ModItems.ETERNITE_BOOTS1, 1), Optional.of(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 48)),
                        new ItemStack(Items.BOOK, 1), 2, 10, 0));
            }
            case 5 -> {
                trades.add(new TradeOffer(
                        new TradedItem(ModItems.ETERNITE_KATANA1, 1), Optional.of(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 64)),
                        new ItemStack(Items.BOOK, 1), 2, 100, 0));
            }

            }
        return trades;
    }
}