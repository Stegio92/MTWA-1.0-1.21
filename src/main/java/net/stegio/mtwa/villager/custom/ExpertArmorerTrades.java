package net.stegio.mtwa.villager.custom;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.TradeOfferList;
import net.minecraft.village.TradedItem;
import net.stegio.mtwa.item.ModItems;

import java.util.Optional;

public class ExpertArmorerTrades {
    public static TradeOfferList getTradesForExpertArmorer(int level) {
        TradeOfferList trades = new TradeOfferList();

        switch (level) {
            case 1 -> {
                trades.add(new TradeOffer(new TradedItem(ModItems.AETHERITE_INGOT, 1),
                        new ItemStack(ModItems.GOLDEN_RYO_BUNDLE, 2), 8, 1, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 3),
                        new ItemStack(ModItems.AETHERITE_INGOT, 1), 8, 1, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.AETHERITE_SCRAP),
                        new ItemStack(ModItems.GOLDEN_RYO), 8, 1, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.ESSENCE_OF_THE_SKY),
                        new ItemStack(ModItems.GOLDEN_RYO), 8, 1, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 4), Optional.of(new TradedItem(Items.NETHERITE_HELMET)),
                        new ItemStack(ModItems.AETHERITE_HELMET1, 1), 1, 2, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 6), Optional.of(new TradedItem(Items.NETHERITE_CHESTPLATE)),
                        new ItemStack(ModItems.AETHERITE_CHESTPLATE1, 1), 1, 2, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 5), Optional.of(new TradedItem(Items.NETHERITE_LEGGINGS)),
                        new ItemStack(ModItems.AETHERITE_LEGGINGS1, 1), 1, 2, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 3), Optional.of(new TradedItem(Items.NETHERITE_BOOTS)),
                        new ItemStack(ModItems.AETHERITE_BOOTS1, 1), 1, 2, 0));
            }
            case 2 -> {
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 7), Optional.of(new TradedItem(ModItems.AETHERITE_HELMET1)),
                        new ItemStack(ModItems.AETHERITE_HELMET2, 1), 1, 6, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 9), Optional.of(new TradedItem(ModItems.AETHERITE_CHESTPLATE1)),
                        new ItemStack(ModItems.AETHERITE_CHESTPLATE2, 1), 1, 6, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 8), Optional.of(new TradedItem(ModItems.AETHERITE_LEGGINGS1)),
                        new ItemStack(ModItems.AETHERITE_LEGGINGS2, 1), 1, 6, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 6), Optional.of(new TradedItem(ModItems.AETHERITE_BOOTS1)),
                        new ItemStack(ModItems.AETHERITE_BOOTS2, 1), 1, 6, 0));
            }
            case 3 -> {
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 10), Optional.of(new TradedItem(ModItems.AETHERITE_HELMET2)),
                        new ItemStack(ModItems.AETHERITE_HELMET3, 1), 1, 23, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 12), Optional.of(new TradedItem(ModItems.AETHERITE_CHESTPLATE2)),
                        new ItemStack(ModItems.AETHERITE_CHESTPLATE3, 1), 1, 23, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 11), Optional.of(new TradedItem(ModItems.AETHERITE_LEGGINGS2)),
                        new ItemStack(ModItems.AETHERITE_LEGGINGS3, 1), 1, 23, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 9), Optional.of(new TradedItem(ModItems.AETHERITE_BOOTS2)),
                        new ItemStack(ModItems.AETHERITE_BOOTS3, 1), 1, 23, 0));
            }
            case 4 -> {
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 13), Optional.of(new TradedItem(ModItems.AETHERITE_HELMET3)),
                        new ItemStack(ModItems.AETHERITE_HELMET4, 1), 1, 35, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 15), Optional.of(new TradedItem(ModItems.AETHERITE_CHESTPLATE3)),
                        new ItemStack(ModItems.AETHERITE_CHESTPLATE4, 1), 1, 35, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 14), Optional.of(new TradedItem(ModItems.AETHERITE_LEGGINGS3)),
                        new ItemStack(ModItems.AETHERITE_LEGGINGS4, 1), 1, 35, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 12), Optional.of(new TradedItem(ModItems.AETHERITE_BOOTS3)),
                        new ItemStack(ModItems.AETHERITE_BOOTS4, 1), 1, 35, 0));
            }
            case 5 -> {
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 16), Optional.of(new TradedItem(ModItems.AETHERITE_HELMET4)),
                        new ItemStack(ModItems.AETHERITE_HELMET5, 1), 1, 100, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 18), Optional.of(new TradedItem(ModItems.AETHERITE_CHESTPLATE4)),
                        new ItemStack(ModItems.AETHERITE_CHESTPLATE5, 1), 1, 100, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 17), Optional.of(new TradedItem(ModItems.AETHERITE_LEGGINGS4)),
                        new ItemStack(ModItems.AETHERITE_LEGGINGS5, 1), 1, 100, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 15), Optional.of(new TradedItem(ModItems.AETHERITE_BOOTS4)),
                        new ItemStack(ModItems.AETHERITE_BOOTS5, 1), 1, 100, 0));
            }
        }
        return trades;
    }
}
