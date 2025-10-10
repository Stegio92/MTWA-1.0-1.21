package net.stegio.mtwa.villager.custom;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.TradeOfferList;
import net.minecraft.village.TradedItem;
import net.stegio.mtwa.item.ModItems;

import java.util.Optional;

public class ModWeaponsmithTrades {
    public static TradeOfferList getWeaponsmithTrades(int level) {
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
                trades.add(new TradeOffer(new TradedItem(ModItems.BRONZE_RYO), new ItemStack(Items.STONE_SWORD), 2, 1, 0));
            }
            case 3 -> {
                trades.add(new TradeOffer(new TradedItem(ModItems.BRONZE_RYO, 2), new ItemStack(ModItems.IRON_KATANA), 2, 1, 0));
            }
            case 4 -> {
                trades.add(new TradeOffer(new TradedItem(ModItems.SILVER_RYO, 2), new ItemStack(ModItems.DIAMOND_KATANA), 2, 1, 0));
            }
            case 5 -> {
                trades.add(new TradeOffer(new TradedItem(ModItems.SILVER_RYO_BUNDLE, 2), Optional.of(new TradedItem(ModItems.DIAMOND_KATANA)),
                        new ItemStack(ModItems.NETHERITE_KATANA), 2, 1, 0));
            }
        }
        return trades;
    }
}

