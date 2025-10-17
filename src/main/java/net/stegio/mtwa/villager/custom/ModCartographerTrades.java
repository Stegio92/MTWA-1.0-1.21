package net.stegio.mtwa.villager.custom;

import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.item.FilledMapItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.loot.function.ExplorationMapLootFunction;
import net.minecraft.registry.tag.StructureTags;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.TradeOfferList;
import net.minecraft.village.TradedItem;
import net.minecraft.village.VillagerProfession;
import net.minecraft.world.World;
import net.stegio.mtwa.item.ModItems;

public class ModCartographerTrades {
    public static TradeOfferList getCartographerTrades (int level) {
        TradeOfferList trades = new TradeOfferList();

        switch (level) {
            case 1 -> {
                trades.add(new TradeOffer(new TradedItem(Items.PAPER, 15), new ItemStack(ModItems.BRONZE_RYO, 1), 8, 2, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.BRONZE_RYO, 1), new ItemStack(Items.PAPER, 9), 8, 2, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.BRONZE_RYO, 1), new ItemStack(Items.MAP, 1), 8, 2, 0));
            }
            case 2 -> {
                trades.add(new TradeOffer(new TradedItem(ModItems.BRONZE_RYO, 1), new ItemStack(Items.FILLED_MAP, 1), 2, 2, 0));
            }
            case 3 -> {
                trades.add(new TradeOffer(new TradedItem(ModItems.BRONZE_RYO, 1), new ItemStack(Items.FILLED_MAP, 1), 4, 10, 0));
            }
            case 4 -> {
                trades.add(new TradeOffer(new TradedItem(ModItems.BRONZE_RYO, 1), new ItemStack(Items.FILLED_MAP, 1), 6, 15, 0));
            }
            case 5 -> {
                trades.add(new TradeOffer(new TradedItem(ModItems.BRONZE_RYO_BUNDLE, 1), new ItemStack(Items.WHITE_BANNER),  2, 100, 0));
            }
        }
        return trades;
    }
}
