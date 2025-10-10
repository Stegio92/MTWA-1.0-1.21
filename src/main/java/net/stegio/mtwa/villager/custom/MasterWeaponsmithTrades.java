package net.stegio.mtwa.villager.custom;

import net.minecraft.item.ItemStack;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.TradeOfferList;
import net.minecraft.village.TradedItem;
import net.stegio.mtwa.item.ModItems;

import java.util.Optional;

public class MasterWeaponsmithTrades {
    public static TradeOfferList getTradesForMasterWeaponsmith(int level) {
        TradeOfferList trades = new TradeOfferList();

        switch (level) {
            case 1 -> {
                trades.add(new TradeOffer(new TradedItem(ModItems.TITANITE_INGOT, 1),
                        new ItemStack(ModItems.GOLDEN_RYO_BUNDLE, 5), 8, 1, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 10),
                        new ItemStack(ModItems.TITANITE_INGOT, 1), 8, 1, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 11), Optional.of(new TradedItem(ModItems.AETHERITE_KATANA5)),
                        new ItemStack(ModItems.TITANITE_KATANA1, 1), 1, 1, 0));
            }
            case 2 -> {
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 12), Optional.of(new TradedItem(ModItems.TITANITE_KATANA1)),
                        new ItemStack(ModItems.TITANITE_KATANA2, 1), 1, 1, 0));
            }
            case 3 -> {
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 13), Optional.of(new TradedItem(ModItems.TITANITE_KATANA2)),
                        new ItemStack(ModItems.TITANITE_KATANA3, 1), 1, 1, 0));
            }
            case 4 -> {
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 14), Optional.of(new TradedItem(ModItems.TITANITE_KATANA3)),
                        new ItemStack(ModItems.TITANITE_KATANA4, 1), 1, 1, 0));
            }
            case 5 -> {
                trades.add(new TradeOffer(new TradedItem(ModItems.GOLDEN_RYO_BUNDLE, 15), Optional.of(new TradedItem(ModItems.TITANITE_KATANA4)),
                        new ItemStack(ModItems.TITANITE_KATANA5, 1), 1, 1, 0));
            }
        }
        return trades;
    }
}
