package net.stegio.mtwa.villager.custom;

import net.minecraft.item.ItemStack;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.TradeOfferList;
import net.minecraft.village.TradedItem;
import net.stegio.mtwa.item.ModItems;

import java.util.Optional;

public class LegendaryArmorerTrades {
    public static TradeOfferList getTradesForLegendaryArmorer(int level) {
        TradeOfferList trades = new TradeOfferList();

        switch (level) {
            case 1 -> {
                trades.add(new TradeOffer(new TradedItem(ModItems.ETERNITE_INGOT, 1),
                        new ItemStack(ModItems.GOLDEN_RYO_BUNDLE, 32), 8, 1, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 35),
                        new ItemStack(ModItems.ETERNITE_INGOT, 1), 8, 1, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.ETERNITE_SCRAP),
                        new ItemStack(ModItems.GOLDEN_RYO_BUNDLE), 8, 1, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.ESSENCE_OF_THE_UNIVERSE),
                        new ItemStack(ModItems.GOLDEN_RYO_BUNDLE), 8, 1, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 58), Optional.of(new TradedItem(ModItems.TITANITE_HELMET5)),
                        new ItemStack(ModItems.ETERNITE_HELMET1, 1), 1, 2, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 60), Optional.of(new TradedItem(ModItems.TITANITE_CHESTPLATE5)),
                        new ItemStack(ModItems.ETERNITE_CHESTPLATE1, 1), 1, 2, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 59), Optional.of(new TradedItem(ModItems.TITANITE_LEGGINGS5)),
                        new ItemStack(ModItems.ETERNITE_LEGGINGS1, 1), 1, 2, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 57), Optional.of(new TradedItem(ModItems.TITANITE_BOOTS5)),
                        new ItemStack(ModItems.ETERNITE_BOOTS1, 1), 1, 2, 0));
            }
            case 2 -> {
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 59), Optional.of(new TradedItem(ModItems.ETERNITE_HELMET1)),
                        new ItemStack(ModItems.ETERNITE_HELMET2, 1), 1, 6, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 61), Optional.of(new TradedItem(ModItems.ETERNITE_CHESTPLATE1)),
                        new ItemStack(ModItems.ETERNITE_CHESTPLATE2, 1), 1, 6, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 60), Optional.of(new TradedItem(ModItems.ETERNITE_LEGGINGS1)),
                        new ItemStack(ModItems.ETERNITE_LEGGINGS2, 1), 1, 6, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 58), Optional.of(new TradedItem(ModItems.ETERNITE_BOOTS1)),
                        new ItemStack(ModItems.ETERNITE_BOOTS2, 1), 1, 6, 0));
            }
            case 3 -> {
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 60), Optional.of(new TradedItem(ModItems.ETERNITE_HELMET2)),
                        new ItemStack(ModItems.ETERNITE_HELMET3, 1), 1, 23, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 62), Optional.of(new TradedItem(ModItems.ETERNITE_CHESTPLATE2)),
                        new ItemStack(ModItems.ETERNITE_CHESTPLATE3, 1), 1, 23, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 61), Optional.of(new TradedItem(ModItems.ETERNITE_LEGGINGS2)),
                        new ItemStack(ModItems.ETERNITE_LEGGINGS3, 1), 1, 23, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 59), Optional.of(new TradedItem(ModItems.ETERNITE_BOOTS2)),
                        new ItemStack(ModItems.ETERNITE_BOOTS3, 1), 1, 23, 0));
            }
            case 4 -> {
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 61), Optional.of(new TradedItem(ModItems.ETERNITE_HELMET3)),
                        new ItemStack(ModItems.ETERNITE_HELMET4, 1), 1, 35, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 63), Optional.of(new TradedItem(ModItems.ETERNITE_CHESTPLATE3)),
                        new ItemStack(ModItems.ETERNITE_CHESTPLATE4, 1), 1, 35, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 62), Optional.of(new TradedItem(ModItems.ETERNITE_LEGGINGS3)),
                        new ItemStack(ModItems.ETERNITE_LEGGINGS4, 1), 1, 35, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 60), Optional.of(new TradedItem(ModItems.ETERNITE_BOOTS3)),
                        new ItemStack(ModItems.ETERNITE_BOOTS4, 1), 1, 35, 0));
            }
            case 5 -> {
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 62), Optional.of(new TradedItem(ModItems.ETERNITE_HELMET4)),
                        new ItemStack(ModItems.ETERNITE_HELMET5, 1), 1, 100, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 64), Optional.of(new TradedItem(ModItems.ETERNITE_CHESTPLATE4)),
                        new ItemStack(ModItems.ETERNITE_CHESTPLATE5, 1), 1, 100, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 63), Optional.of(new TradedItem(ModItems.ETERNITE_LEGGINGS4)),
                        new ItemStack(ModItems.ETERNITE_LEGGINGS5, 1), 1, 100, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 61), Optional.of(new TradedItem(ModItems.ETERNITE_BOOTS4)),
                        new ItemStack(ModItems.ETERNITE_BOOTS5, 1), 1, 100, 0));
            }
        }
        return trades;
    }
}
