package net.stegio.mtwa.villager.custom;

import net.minecraft.item.ItemStack;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.TradeOfferList;
import net.minecraft.village.TradedItem;
import net.stegio.mtwa.item.ModItems;

import java.util.Optional;

public class LegendaryToolsmithTrades {
    public static TradeOfferList getTradesForLegendaryToolsmith(int level) {
        TradeOfferList trades = new TradeOfferList();

        switch (level) {
            case 1 -> {
                trades.add(new TradeOffer(new TradedItem(ModItems.ETERNITE_INGOT, 21),
                        new ItemStack(ModItems.GOLDEN_RYO_BUNDLE, 5), 8, 1, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 42),
                        new ItemStack(ModItems.ETERNITE_INGOT, 1), 8, 1, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 38), Optional.of(new TradedItem(ModItems.TITANITE_AXE5)),
                        new ItemStack(ModItems.ETERNITE_AXE1, 1), 1, 1, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 37), Optional.of(new TradedItem(ModItems.TITANITE_PICKAXE5)),
                        new ItemStack(ModItems.ETERNITE_PICKAXE1, 1), 1, 1, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 36), Optional.of(new TradedItem(ModItems.TITANITE_SHOVEL5)),
                        new ItemStack(ModItems.ETERNITE_SHOVEL1, 1), 1, 1, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 35), Optional.of(new TradedItem(ModItems.TITANITE_HOE5)),
                        new ItemStack(ModItems.ETERNITE_HOE1, 1), 1, 1, 0));
            }
            case 2 -> {
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 39), Optional.of(new TradedItem(ModItems.ETERNITE_AXE1)),
                        new ItemStack(ModItems.ETERNITE_AXE2, 1), 1, 1, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 38), Optional.of(new TradedItem(ModItems.ETERNITE_PICKAXE1)),
                        new ItemStack(ModItems.ETERNITE_PICKAXE2, 1), 1, 1, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 37), Optional.of(new TradedItem(ModItems.ETERNITE_SHOVEL1)),
                        new ItemStack(ModItems.ETERNITE_SHOVEL2, 1), 1, 1, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 36), Optional.of(new TradedItem(ModItems.ETERNITE_HOE1)),
                        new ItemStack(ModItems.ETERNITE_HOE2, 1), 1, 1, 0));
            }
            case 3 -> {
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 40), Optional.of(new TradedItem(ModItems.ETERNITE_AXE2)),
                        new ItemStack(ModItems.ETERNITE_AXE3, 1), 1, 1, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 39), Optional.of(new TradedItem(ModItems.ETERNITE_PICKAXE2)),
                        new ItemStack(ModItems.ETERNITE_PICKAXE3, 1), 1, 1, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 38), Optional.of(new TradedItem(ModItems.ETERNITE_SHOVEL2)),
                        new ItemStack(ModItems.ETERNITE_SHOVEL3, 1), 1, 1, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 37), Optional.of(new TradedItem(ModItems.ETERNITE_HOE2)),
                        new ItemStack(ModItems.ETERNITE_HOE3, 1), 1, 1, 0));
            }
            case 4 -> {
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 41), Optional.of(new TradedItem(ModItems.ETERNITE_AXE3)),
                        new ItemStack(ModItems.ETERNITE_AXE4, 1), 1, 1, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 40), Optional.of(new TradedItem(ModItems.ETERNITE_PICKAXE3)),
                        new ItemStack(ModItems.ETERNITE_PICKAXE4, 1), 1, 1, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 39), Optional.of(new TradedItem(ModItems.ETERNITE_SHOVEL3)),
                        new ItemStack(ModItems.ETERNITE_SHOVEL4, 1), 1, 1, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 38), Optional.of(new TradedItem(ModItems.ETERNITE_HOE3)),
                        new ItemStack(ModItems.ETERNITE_HOE4, 1), 1, 1, 0));
            }
            case 5 -> {
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 42), Optional.of(new TradedItem(ModItems.ETERNITE_AXE4)),
                        new ItemStack(ModItems.ETERNITE_AXE5, 1), 1, 1, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 41), Optional.of(new TradedItem(ModItems.ETERNITE_PICKAXE4)),
                        new ItemStack(ModItems.ETERNITE_PICKAXE5, 1), 1, 1, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 40), Optional.of(new TradedItem(ModItems.ETERNITE_SHOVEL4)),
                        new ItemStack(ModItems.ETERNITE_SHOVEL5, 1), 1, 1, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 39), Optional.of(new TradedItem(ModItems.ETERNITE_HOE4)),
                        new ItemStack(ModItems.ETERNITE_HOE5, 1), 1, 1, 0));
            }
        }
        return trades;
    }
}
