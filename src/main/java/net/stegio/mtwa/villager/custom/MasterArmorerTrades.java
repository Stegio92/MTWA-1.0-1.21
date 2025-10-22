package net.stegio.mtwa.villager.custom;

import net.minecraft.item.ItemStack;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.TradeOfferList;
import net.minecraft.village.TradedItem;
import net.stegio.mtwa.item.ModItems;

import java.util.Optional;

public class MasterArmorerTrades {
    public static TradeOfferList getTradesForMasterArmorer(int level) {
        TradeOfferList trades = new TradeOfferList();

        switch (level) {
            case 1 -> {
                trades.add(new TradeOffer(new TradedItem(ModItems.TITANITE_INGOT, 1),
                        new ItemStack(ModItems.GOLDEN_RYO_BUNDLE, 8), 8, 1, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 10),
                        new ItemStack(ModItems.TITANITE_INGOT, 1), 8, 1, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.TITANITE_SCRAP),
                        new ItemStack(ModItems.GOLDEN_RYO, 4), 8, 1, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.ESSENCE_OF_THE_SUN),
                        new ItemStack(ModItems.GOLDEN_RYO, 4), 8, 1, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 23), Optional.of(new TradedItem(ModItems.AETHERITE_HELMET5)),
                        new ItemStack(ModItems.TITANITE_HELMET1, 1), 1, 2, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 25), Optional.of(new TradedItem(ModItems.AETHERITE_CHESTPLATE5)),
                        new ItemStack(ModItems.TITANITE_CHESTPLATE1, 1), 1, 2, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 24), Optional.of(new TradedItem(ModItems.AETHERITE_LEGGINGS5)),
                        new ItemStack(ModItems.TITANITE_LEGGINGS1, 1), 1, 2, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 22), Optional.of(new TradedItem(ModItems.AETHERITE_BOOTS5)),
                        new ItemStack(ModItems.TITANITE_BOOTS1, 1), 1, 2, 0));
            }
            case 2 -> {
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 25), Optional.of(new TradedItem(ModItems.TITANITE_HELMET1)),
                        new ItemStack(ModItems.TITANITE_HELMET2, 1), 1, 6, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 27), Optional.of(new TradedItem(ModItems.TITANITE_CHESTPLATE1)),
                        new ItemStack(ModItems.TITANITE_CHESTPLATE2, 1), 1, 6, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 26), Optional.of(new TradedItem(ModItems.TITANITE_LEGGINGS1)),
                        new ItemStack(ModItems.TITANITE_LEGGINGS2, 1), 1, 6, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 24), Optional.of(new TradedItem(ModItems.TITANITE_BOOTS1)),
                        new ItemStack(ModItems.TITANITE_BOOTS2, 1), 1, 6, 0));
            }
            case 3 -> {
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 27), Optional.of(new TradedItem(ModItems.TITANITE_HELMET2)),
                        new ItemStack(ModItems.TITANITE_HELMET3, 1), 1, 23, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 29), Optional.of(new TradedItem(ModItems.TITANITE_CHESTPLATE2)),
                        new ItemStack(ModItems.TITANITE_CHESTPLATE3, 1), 1, 23, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 28), Optional.of(new TradedItem(ModItems.TITANITE_LEGGINGS2)),
                        new ItemStack(ModItems.TITANITE_LEGGINGS3, 1), 1, 23, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 26), Optional.of(new TradedItem(ModItems.TITANITE_BOOTS2)),
                        new ItemStack(ModItems.TITANITE_BOOTS3, 1), 1, 23, 0));
            }
            case 4 -> {
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 29), Optional.of(new TradedItem(ModItems.TITANITE_HELMET3)),
                        new ItemStack(ModItems.TITANITE_HELMET4, 1), 1, 35, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 31), Optional.of(new TradedItem(ModItems.TITANITE_CHESTPLATE3)),
                        new ItemStack(ModItems.TITANITE_CHESTPLATE4, 1), 1, 35, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 30), Optional.of(new TradedItem(ModItems.TITANITE_LEGGINGS3)),
                        new ItemStack(ModItems.TITANITE_LEGGINGS4, 1), 1, 35, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 28), Optional.of(new TradedItem(ModItems.TITANITE_BOOTS3)),
                        new ItemStack(ModItems.TITANITE_BOOTS4, 1), 1, 35, 0));
            }
            case 5 -> {
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 31), Optional.of(new TradedItem(ModItems.TITANITE_HELMET4)),
                        new ItemStack(ModItems.TITANITE_HELMET5, 1), 1, 100, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 33), Optional.of(new TradedItem(ModItems.TITANITE_CHESTPLATE4)),
                        new ItemStack(ModItems.TITANITE_CHESTPLATE5, 1), 1, 100, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 32), Optional.of(new TradedItem(ModItems.TITANITE_LEGGINGS4)),
                        new ItemStack(ModItems.TITANITE_LEGGINGS5, 1), 1, 100, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 30), Optional.of(new TradedItem(ModItems.TITANITE_BOOTS4)),
                        new ItemStack(ModItems.TITANITE_BOOTS5, 1), 1, 100, 0));
            }
        }
        return trades;
    }
}
