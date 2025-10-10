package net.stegio.mtwa.villager.custom;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.TradeOfferList;
import net.minecraft.village.TradedItem;
import net.stegio.mtwa.item.ModItems;

import java.util.Optional;

public class MasterToolsmithTrades {
    public static TradeOfferList getTradesForMasterToolsmith(int level) {
        TradeOfferList trades = new TradeOfferList();

        switch (level) {
            case 1 -> {
                trades.add(new TradeOffer(new TradedItem(ModItems.TITANITE_INGOT, 1),
                        new ItemStack(ModItems.GOLDEN_RYO_BUNDLE, 5), 8, 1, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 10),
                        new ItemStack(ModItems.TITANITE_INGOT, 1), 8, 1, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 13), Optional.of(new TradedItem(ModItems.AETHERITE_AXE5)),
                        new ItemStack(ModItems.TITANITE_AXE, 1), 1, 1, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 12), Optional.of(new TradedItem(ModItems.AETHERITE_PICKAXE5)),
                        new ItemStack(ModItems.TITANITE_PICKAXE, 1), 1, 1, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 11), Optional.of(new TradedItem(ModItems.AETHERITE_SHOVEL5)),
                        new ItemStack(ModItems.TITANITE_SHOVEL, 1), 1, 1, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 10), Optional.of(new TradedItem(ModItems.AETHERITE_HOE5)),
                        new ItemStack(ModItems.TITANITE_HOE, 1), 1, 1, 0));
            }
            case 2 -> {
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 14), Optional.of(new TradedItem(ModItems.TITANITE_AXE)),
                        new ItemStack(ModItems.TITANITE_AXE2, 1), 1, 1, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 13), Optional.of(new TradedItem(ModItems.TITANITE_PICKAXE)),
                        new ItemStack(ModItems.TITANITE_PICKAXE2, 1), 1, 1, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 12), Optional.of(new TradedItem(ModItems.TITANITE_SHOVEL)),
                        new ItemStack(ModItems.TITANITE_SHOVEL2, 1), 1, 1, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 11), Optional.of(new TradedItem(ModItems.TITANITE_HOE)),
                        new ItemStack(ModItems.TITANITE_HOE2, 1), 1, 1, 0));
            }
            case 3 -> {
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 15), Optional.of(new TradedItem(ModItems.TITANITE_AXE2)),
                        new ItemStack(ModItems.TITANITE_AXE3, 1), 1, 1, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 14), Optional.of(new TradedItem(ModItems.TITANITE_PICKAXE2)),
                        new ItemStack(ModItems.TITANITE_PICKAXE3, 1), 1, 1, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 13), Optional.of(new TradedItem(ModItems.TITANITE_SHOVEL2)),
                        new ItemStack(ModItems.TITANITE_SHOVEL3, 1), 1, 1, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 12), Optional.of(new TradedItem(ModItems.TITANITE_HOE2)),
                        new ItemStack(ModItems.TITANITE_HOE3, 1), 1, 1, 0));
            }
            case 4 -> {
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 16), Optional.of(new TradedItem(ModItems.TITANITE_AXE3)),
                        new ItemStack(ModItems.TITANITE_AXE4, 1), 1, 1, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 15), Optional.of(new TradedItem(ModItems.TITANITE_PICKAXE3)),
                        new ItemStack(ModItems.TITANITE_PICKAXE4, 1), 1, 1, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 14), Optional.of(new TradedItem(ModItems.TITANITE_SHOVEL3)),
                        new ItemStack(ModItems.TITANITE_SHOVEL4, 1), 1, 1, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 13), Optional.of(new TradedItem(ModItems.TITANITE_HOE3)),
                        new ItemStack(ModItems.TITANITE_HOE4, 1), 1, 1, 0));
            }
            case 5 -> {
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 17), Optional.of(new TradedItem(ModItems.TITANITE_AXE4)),
                        new ItemStack(ModItems.TITANITE_AXE5, 1), 1, 1, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 16), Optional.of(new TradedItem(ModItems.TITANITE_PICKAXE4)),
                        new ItemStack(ModItems.TITANITE_PICKAXE5, 1), 1, 1, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 15), Optional.of(new TradedItem(ModItems.TITANITE_SHOVEL4)),
                        new ItemStack(ModItems.TITANITE_SHOVEL5, 1), 1, 1, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 14), Optional.of(new TradedItem(ModItems.TITANITE_HOE4)),
                        new ItemStack(ModItems.TITANITE_HOE5, 1), 1, 1, 0));
            }
        }
        return trades;
    }
}
