package net.stegio.mtwa.villager.custom;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.TradeOfferList;
import net.minecraft.village.TradedItem;
import net.stegio.mtwa.item.ModItems;

import java.util.Optional;

public class ModArmorerTrades {
    public static TradeOfferList getArmorerTrades(int level) {
        TradeOfferList trades = new TradeOfferList();

        switch (level) {
            case 1 -> {
                trades.add(new TradeOffer(new TradedItem(Items.COPPER_INGOT, 16), new ItemStack(ModItems.BRONZE_RYO), 8, 1, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.BRONZE_RYO), new ItemStack(Items.COPPER_INGOT, 12), 8, 1, 0));
                trades.add(new TradeOffer(new TradedItem(Items.IRON_INGOT, 16), new ItemStack(ModItems.BRONZE_RYO_BUNDLE), 8, 1, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.BRONZE_RYO_BUNDLE), new ItemStack(Items.IRON_INGOT, 12), 8, 1, 0));
                trades.add(new TradeOffer(new TradedItem(Items.GOLD_INGOT, 12), new ItemStack(ModItems.BRONZE_RYO_BUNDLE), 8, 1, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.BRONZE_RYO_BUNDLE), new ItemStack(Items.GOLD_INGOT, 8), 8, 1, 0));
                trades.add(new TradeOffer(new TradedItem(Items.DIAMOND, 8), new ItemStack(ModItems.SILVER_RYO_BUNDLE), 8, 1, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.SILVER_RYO_BUNDLE), new ItemStack(Items.DIAMOND, 6), 8, 1, 0));
                trades.add(new TradeOffer(new TradedItem(Items.NETHERITE_INGOT, 2), new ItemStack(ModItems.GOLDEN_RYO), 8, 1, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO), new ItemStack(Items.NETHERITE_INGOT), 8, 1, 0));
                trades.add(new TradeOffer(new TradedItem(Items.EMERALD, 8), new ItemStack(ModItems.SILVER_RYO_BUNDLE), 8, 1, 0));
            }
            case 2 -> {
                trades.add(new TradeOffer(
                        new TradedItem(ModItems.BRONZE_RYO, 2), Optional.of(new TradedItem(Items.IRON_INGOT, 2)),
                        new  ItemStack(Items.CHAINMAIL_HELMET), 2, 2, 0));
                trades.add(new TradeOffer(
                        new TradedItem(ModItems.BRONZE_RYO, 4), Optional.of(new TradedItem(Items.IRON_INGOT, 4)),
                        new  ItemStack(Items.CHAINMAIL_CHESTPLATE), 2, 2, 0));
                trades.add(new TradeOffer(
                        new TradedItem(ModItems.BRONZE_RYO, 3), Optional.of(new TradedItem(Items.IRON_INGOT, 3)),
                        new  ItemStack(Items.CHAINMAIL_LEGGINGS), 2, 2, 0));
                trades.add(new TradeOffer(
                        new TradedItem(ModItems.BRONZE_RYO, 1), Optional.of(new TradedItem(Items.IRON_INGOT, 1)),
                        new  ItemStack(Items.CHAINMAIL_BOOTS), 2, 2, 0));
            }
            case 3 -> {
                trades.add(new TradeOffer(
                        new TradedItem(ModItems.BRONZE_RYO, 4), Optional.of(new TradedItem(Items.IRON_INGOT, 4)),
                        new  ItemStack(Items.IRON_HELMET), 2, 10, 0));
                trades.add(new TradeOffer(
                        new TradedItem(ModItems.BRONZE_RYO, 6), Optional.of(new TradedItem(Items.IRON_INGOT, 6)),
                        new  ItemStack(Items.IRON_CHESTPLATE), 2, 10, 0));
                trades.add(new TradeOffer(
                        new TradedItem(ModItems.BRONZE_RYO, 5), Optional.of(new TradedItem(Items.IRON_INGOT, 5)),
                        new  ItemStack(Items.IRON_LEGGINGS), 2, 10, 0));
                trades.add(new TradeOffer(
                        new TradedItem(ModItems.BRONZE_RYO, 3), Optional.of(new TradedItem(Items.IRON_INGOT, 3)),
                        new  ItemStack(Items.IRON_BOOTS), 2, 10, 0));
            }
            case 4 -> {
                trades.add(new TradeOffer(
                        new TradedItem(ModItems.SILVER_RYO, 4), Optional.of(new TradedItem(Items.DIAMOND, 4)),
                        new  ItemStack(Items.DIAMOND_HELMET), 2, 15, 0));
                trades.add(new TradeOffer(
                        new TradedItem(ModItems.SILVER_RYO, 6), Optional.of(new TradedItem(Items.DIAMOND, 6)),
                        new  ItemStack(Items.DIAMOND_CHESTPLATE), 2, 15, 0));
                trades.add(new TradeOffer(
                        new TradedItem(ModItems.SILVER_RYO, 5), Optional.of(new TradedItem(Items.DIAMOND, 5)),
                        new  ItemStack(Items.DIAMOND_LEGGINGS), 2, 15, 0));
                trades.add(new TradeOffer(
                        new TradedItem(ModItems.SILVER_RYO, 3), Optional.of(new TradedItem(Items.DIAMOND, 3)),
                        new  ItemStack(Items.DIAMOND_BOOTS), 2, 15, 0));
            }
            case 5 -> {
                trades.add(new TradeOffer(
                        new TradedItem(ModItems.SILVER_RYO_BUNDLE, 2), Optional.of(new TradedItem(Items.DIAMOND_HELMET)),
                        new  ItemStack(Items.DIAMOND_HELMET), 2, 100, 0));
                trades.add(new TradeOffer(
                        new TradedItem(ModItems.SILVER_RYO_BUNDLE, 4), Optional.of(new TradedItem(Items.DIAMOND_CHESTPLATE)),
                        new  ItemStack(Items.DIAMOND_CHESTPLATE), 2, 100, 0));
                trades.add(new TradeOffer(
                        new TradedItem(ModItems.SILVER_RYO_BUNDLE, 3), Optional.of(new TradedItem(Items.DIAMOND_LEGGINGS)),
                        new  ItemStack(Items.DIAMOND_LEGGINGS), 2, 100, 0));
                trades.add(new TradeOffer(
                        new TradedItem(ModItems.SILVER_RYO_BUNDLE, 1), Optional.of(new TradedItem(Items.DIAMOND_BOOTS)),
                        new  ItemStack(Items.DIAMOND_BOOTS), 2, 100, 0));
            }
        }
        return trades;
    }
}
