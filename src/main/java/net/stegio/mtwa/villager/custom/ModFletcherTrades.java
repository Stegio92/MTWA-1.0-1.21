package net.stegio.mtwa.villager.custom;

import net.minecraft.component.type.PotionContentsComponent;
import net.minecraft.entity.projectile.thrown.PotionEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.PotionItem;
import net.minecraft.potion.Potion;
import net.minecraft.potion.Potions;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.TradeOfferList;
import net.minecraft.village.TradedItem;
import net.stegio.mtwa.item.ModItems;

public class ModFletcherTrades {
    public static TradeOfferList getFletcherTrades(int level) {
        TradeOfferList trades = new TradeOfferList();

        switch (level) {
            case 1 -> {
                trades.add(new TradeOffer(new TradedItem(Items.SPRUCE_LOG, 16), new ItemStack(ModItems.BRONZE_RYO), 8, 1, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.BRONZE_RYO, 8), new ItemStack(Items.SPRUCE_LOG), 8, 1, 0));
            }
            case 2 -> {
                trades.add(new TradeOffer(new TradedItem(ModItems.BRONZE_RYO_BUNDLE), new ItemStack(Items.SHIELD), 2, 1, 0));
            }
            case 3 -> {
                trades.add(new TradeOffer(new TradedItem(ModItems.BRONZE_RYO, 2), new ItemStack(ModItems.WOODEN_KATANA), 2, 1, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.BRONZE_RYO_BUNDLE, 2), new ItemStack(Items.BOW), 2, 1, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.BRONZE_RYO_BUNDLE, 2), new ItemStack(Items.CROSSBOW), 2, 1, 0));
            }
            case 4 -> {
                trades.add(new TradeOffer(new TradedItem(ModItems.BRONZE_RYO, 2), new ItemStack(Items.ARROW, 16), 4, 1, 0));
            }
            case 5 -> {
                trades.add(new TradeOffer(new TradedItem(ModItems.BRONZE_RYO, 2), new ItemStack(Items.TIPPED_ARROW, 8), 2, 1, 0));
            }
        }
        return trades;
    }
}
