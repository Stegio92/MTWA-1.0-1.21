package net.stegio.mtwa.villager.custom;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.TradeOfferList;
import net.minecraft.village.TradedItem;
import net.stegio.mtwa.item.ModItems;

import java.util.Optional;

public class ExpertToolsmithTrades {
    public static TradeOfferList getTradesForExpertToolsmith(int level) {
        TradeOfferList trades = new TradeOfferList();

        switch (level) {
            case 1 -> {
                trades.add(new TradeOffer(new TradedItem(ModItems.AETHERITE_INGOT, 1),
                        new ItemStack(ModItems.GOLDEN_RYO_BUNDLE, 1), 8, 1, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 2),
                        new ItemStack(ModItems.AETHERITE_INGOT, 1), 8, 1, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 4), Optional.of(new TradedItem(Items.NETHERITE_AXE)),
                        new ItemStack(ModItems.AETHERITE_AXE, 1), 1, 1, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 3), Optional.of(new TradedItem(Items.NETHERITE_PICKAXE)),
                        new ItemStack(ModItems.AETHERITE_PICKAXE, 1), 1, 1, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 2), Optional.of(new TradedItem(Items.NETHERITE_SHOVEL)),
                        new ItemStack(ModItems.AETHERITE_SHOVEL, 1), 1, 1, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 1), Optional.of(new TradedItem(Items.NETHERITE_HOE)),
                        new ItemStack(ModItems.AETHERITE_HOE, 1), 1, 1, 0));
            }
            case 2 -> {
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 5), Optional.of(new TradedItem(ModItems.AETHERITE_AXE)),
                        new ItemStack(ModItems.AETHERITE_AXE2, 1), 1, 1, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 4), Optional.of(new TradedItem(ModItems.AETHERITE_PICKAXE)),
                        new ItemStack(ModItems.AETHERITE_PICKAXE2, 1), 1, 1, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 3), Optional.of(new TradedItem(ModItems.AETHERITE_SHOVEL)),
                        new ItemStack(ModItems.AETHERITE_SHOVEL2, 1), 1, 1, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 2), Optional.of(new TradedItem(ModItems.AETHERITE_HOE)),
                        new ItemStack(ModItems.AETHERITE_HOE2, 1), 1, 1, 0));
            }
            case 3 -> {
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 6), Optional.of(new TradedItem(ModItems.AETHERITE_AXE2)),
                        new ItemStack(ModItems.AETHERITE_AXE3, 1), 1, 1, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 5), Optional.of(new TradedItem(ModItems.AETHERITE_PICKAXE2)),
                        new ItemStack(ModItems.AETHERITE_PICKAXE3, 1), 1, 1, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 4), Optional.of(new TradedItem(ModItems.AETHERITE_SHOVEL2)),
                        new ItemStack(ModItems.AETHERITE_SHOVEL3, 1), 1, 1, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 3), Optional.of(new TradedItem(ModItems.AETHERITE_HOE2)),
                        new ItemStack(ModItems.AETHERITE_HOE3, 1), 1, 1, 0));
            }
            case 4 -> {
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 7), Optional.of(new TradedItem(ModItems.AETHERITE_AXE3)),
                        new ItemStack(ModItems.AETHERITE_AXE4, 1), 1, 1, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 6), Optional.of(new TradedItem(ModItems.AETHERITE_PICKAXE3)),
                        new ItemStack(ModItems.AETHERITE_PICKAXE4, 1), 1, 1, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 5), Optional.of(new TradedItem(ModItems.AETHERITE_SHOVEL3)),
                        new ItemStack(ModItems.AETHERITE_SHOVEL4, 1), 1, 1, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 4), Optional.of(new TradedItem(ModItems.AETHERITE_HOE3)),
                        new ItemStack(ModItems.AETHERITE_HOE, 1), 1, 1, 0));
            }
            case 5 -> {
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 8), Optional.of(new TradedItem(ModItems.AETHERITE_AXE4)),
                        new ItemStack(ModItems.AETHERITE_AXE5, 1), 1, 1, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 7), Optional.of(new TradedItem(ModItems.AETHERITE_PICKAXE4)),
                        new ItemStack(ModItems.AETHERITE_PICKAXE5, 1), 1, 1, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 6), Optional.of(new TradedItem(ModItems.AETHERITE_SHOVEL4)),
                        new ItemStack(ModItems.AETHERITE_SHOVEL5, 1), 1, 1, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 5), Optional.of(new TradedItem(ModItems.AETHERITE_HOE)),
                        new ItemStack(ModItems.AETHERITE_HOE5, 1), 1, 1, 0));
            }
        }
        return trades;
    }
}
