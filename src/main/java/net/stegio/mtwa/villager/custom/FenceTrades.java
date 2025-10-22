package net.stegio.mtwa.villager.custom;


import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.TradeOfferList;
import net.minecraft.village.TradedItem;
import net.stegio.mtwa.item.ModItems;

public class FenceTrades {
    public static TradeOfferList getFenceTrades(int level) {
        TradeOfferList trades = new TradeOfferList();

        switch (level) {
            case 1 -> {
                trades.add(new TradeOffer(new TradedItem(ModItems.IRON_KATANA), new ItemStack(ModItems.BRONZE_RYO, 1), 8, 1, 0));
                trades.add(new TradeOffer(new TradedItem(Items.IRON_AXE), new ItemStack(ModItems.BRONZE_RYO, 1), 8, 1, 0));
                trades.add(new TradeOffer(new TradedItem(Items.IRON_HELMET), new ItemStack(ModItems.BRONZE_RYO, 1), 8, 1, 0));
                trades.add(new TradeOffer(new TradedItem(Items.IRON_CHESTPLATE), new ItemStack(ModItems.BRONZE_RYO, 2), 8, 1, 0));
                trades.add(new TradeOffer(new TradedItem(Items.IRON_LEGGINGS), new ItemStack(ModItems.BRONZE_RYO, 1), 8, 1, 0));
                trades.add(new TradeOffer(new TradedItem(Items.IRON_BOOTS), new ItemStack(ModItems.BRONZE_RYO, 1), 8, 1, 0));
            }
            case 2 -> {
                trades.add(new TradeOffer(new TradedItem(ModItems.DIAMOND_KATANA), new ItemStack(ModItems.SILVER_RYO, 1), 6, 2, 0));
                trades.add(new TradeOffer(new TradedItem(Items.DIAMOND_AXE), new ItemStack(ModItems.SILVER_RYO, 1), 6, 2, 0));
                trades.add(new TradeOffer(new TradedItem(Items.DIAMOND_HELMET), new ItemStack(ModItems.SILVER_RYO, 1), 6, 2, 0));
                trades.add(new TradeOffer(new TradedItem(Items.DIAMOND_CHESTPLATE), new ItemStack(ModItems.SILVER_RYO, 2), 6, 2, 0));
                trades.add(new TradeOffer(new TradedItem(Items.DIAMOND_LEGGINGS), new ItemStack(ModItems.SILVER_RYO, 1), 6, 2, 0));
                trades.add(new TradeOffer(new TradedItem(Items.DIAMOND_BOOTS), new ItemStack(ModItems.SILVER_RYO, 1), 6, 2, 0));

                trades.add(new TradeOffer(new TradedItem(ModItems.NETHERITE_KATANA), new ItemStack(ModItems.SILVER_RYO_BUNDLE, 1), 6, 2, 0));
                trades.add(new TradeOffer(new TradedItem(Items.NETHERITE_AXE), new ItemStack(ModItems.SILVER_RYO_BUNDLE, 1), 6, 2, 0));
                trades.add(new TradeOffer(new TradedItem(Items.NETHERITE_HELMET), new ItemStack(ModItems.SILVER_RYO_BUNDLE, 1), 6, 2, 0));
                trades.add(new TradeOffer(new TradedItem(Items.NETHERITE_CHESTPLATE), new ItemStack(ModItems.SILVER_RYO_BUNDLE, 2), 6, 2, 0));
                trades.add(new TradeOffer(new TradedItem(Items.NETHERITE_LEGGINGS), new ItemStack(ModItems.SILVER_RYO_BUNDLE, 1), 6, 2, 0));
                trades.add(new TradeOffer(new TradedItem(Items.NETHERITE_BOOTS), new ItemStack(ModItems.SILVER_RYO_BUNDLE, 1), 6, 2, 0));
            }
            case 3 -> {
                trades.add(new TradeOffer(new TradedItem(ModItems.AETHERITE_KATANA1), new ItemStack(ModItems.GOLDEN_RYO_BUNDLE, 1), 5, 15, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.AETHERITE_AXE), new ItemStack(ModItems.GOLDEN_RYO_BUNDLE, 1), 5, 15, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.AETHERITE_HELMET1), new ItemStack(ModItems.GOLDEN_RYO_BUNDLE, 1), 5, 15, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.AETHERITE_CHESTPLATE1), new ItemStack(ModItems.GOLDEN_RYO_BUNDLE, 2), 5, 15, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.AETHERITE_LEGGINGS1), new ItemStack(ModItems.GOLDEN_RYO_BUNDLE, 1), 5, 15, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.AETHERITE_BOOTS1), new ItemStack(ModItems.GOLDEN_RYO_BUNDLE, 1), 5, 15, 0));

                trades.add(new TradeOffer(new TradedItem(ModItems.AETHERITE_KATANA2), new ItemStack(ModItems.GOLDEN_RYO_BUNDLE, 2), 5, 15, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.AETHERITE_AXE2), new ItemStack(ModItems.GOLDEN_RYO_BUNDLE, 2), 5, 15, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.AETHERITE_HELMET2), new ItemStack(ModItems.GOLDEN_RYO_BUNDLE, 2), 5, 15, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.AETHERITE_CHESTPLATE2), new ItemStack(ModItems.GOLDEN_RYO_BUNDLE, 3), 5, 15, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.AETHERITE_LEGGINGS2), new ItemStack(ModItems.GOLDEN_RYO_BUNDLE, 2), 5, 15, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.AETHERITE_BOOTS2), new ItemStack(ModItems.GOLDEN_RYO_BUNDLE, 2), 5, 15, 0));

                trades.add(new TradeOffer(new TradedItem(ModItems.AETHERITE_KATANA3), new ItemStack(ModItems.GOLDEN_RYO_BUNDLE, 3), 5, 15, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.AETHERITE_AXE3), new ItemStack(ModItems.GOLDEN_RYO_BUNDLE, 3), 5, 15, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.AETHERITE_HELMET3), new ItemStack(ModItems.GOLDEN_RYO_BUNDLE, 3), 5, 15, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.AETHERITE_CHESTPLATE3), new ItemStack(ModItems.GOLDEN_RYO_BUNDLE, 4), 5, 15, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.AETHERITE_LEGGINGS3), new ItemStack(ModItems.GOLDEN_RYO_BUNDLE, 3), 5, 15, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.AETHERITE_BOOTS3), new ItemStack(ModItems.GOLDEN_RYO_BUNDLE, 3), 5, 15, 0));

                trades.add(new TradeOffer(new TradedItem(ModItems.AETHERITE_KATANA4), new ItemStack(ModItems.GOLDEN_RYO_BUNDLE, 4), 5, 15, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.AETHERITE_AXE4), new ItemStack(ModItems.GOLDEN_RYO_BUNDLE, 4), 5, 15, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.AETHERITE_HELMET4), new ItemStack(ModItems.GOLDEN_RYO_BUNDLE, 4), 5, 15, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.AETHERITE_CHESTPLATE4), new ItemStack(ModItems.GOLDEN_RYO_BUNDLE, 5), 5, 15, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.AETHERITE_LEGGINGS4), new ItemStack(ModItems.GOLDEN_RYO_BUNDLE, 4), 5, 15, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.AETHERITE_BOOTS4), new ItemStack(ModItems.GOLDEN_RYO_BUNDLE, 4), 5, 15, 0));

                trades.add(new TradeOffer(new TradedItem(ModItems.AETHERITE_KATANA5), new ItemStack(ModItems.GOLDEN_RYO_BUNDLE, 5), 5, 15, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.AETHERITE_AXE5), new ItemStack(ModItems.GOLDEN_RYO_BUNDLE, 5), 5, 15, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.AETHERITE_HELMET5), new ItemStack(ModItems.GOLDEN_RYO_BUNDLE, 5), 5, 15, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.AETHERITE_CHESTPLATE5), new ItemStack(ModItems.GOLDEN_RYO_BUNDLE, 6), 5, 15, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.AETHERITE_LEGGINGS5), new ItemStack(ModItems.GOLDEN_RYO_BUNDLE, 5), 5, 15, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.AETHERITE_BOOTS5), new ItemStack(ModItems.GOLDEN_RYO_BUNDLE, 5), 5, 15, 0));
            }
            case 4 -> {
                trades.add(new TradeOffer(new TradedItem(ModItems.TITANITE_KATANA1), new ItemStack(ModItems.GOLDEN_RYO_BUNDLE, 10), 3, 20, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.TITANITE_AXE), new ItemStack(ModItems.GOLDEN_RYO_BUNDLE, 10), 3, 20, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.TITANITE_HELMET1), new ItemStack(ModItems.GOLDEN_RYO_BUNDLE, 10), 3, 20, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.TITANITE_CHESTPLATE1), new ItemStack(ModItems.GOLDEN_RYO_BUNDLE, 11), 3, 20, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.TITANITE_LEGGINGS1), new ItemStack(ModItems.GOLDEN_RYO_BUNDLE, 10), 3, 20, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.TITANITE_BOOTS1), new ItemStack(ModItems.GOLDEN_RYO_BUNDLE, 10), 3, 20, 0));

                trades.add(new TradeOffer(new TradedItem(ModItems.TITANITE_KATANA2), new ItemStack(ModItems.GOLDEN_RYO_BUNDLE, 11), 3, 20, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.TITANITE_AXE2), new ItemStack(ModItems.GOLDEN_RYO_BUNDLE, 11), 3, 20, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.TITANITE_HELMET2), new ItemStack(ModItems.GOLDEN_RYO_BUNDLE, 11), 3, 20, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.TITANITE_CHESTPLATE2), new ItemStack(ModItems.GOLDEN_RYO_BUNDLE, 12), 3, 20, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.TITANITE_LEGGINGS2), new ItemStack(ModItems.GOLDEN_RYO_BUNDLE, 11), 3, 20, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.TITANITE_BOOTS2), new ItemStack(ModItems.GOLDEN_RYO_BUNDLE, 11), 3, 20, 0));

                trades.add(new TradeOffer(new TradedItem(ModItems.TITANITE_KATANA3), new ItemStack(ModItems.GOLDEN_RYO_BUNDLE, 12), 3, 20, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.TITANITE_AXE3), new ItemStack(ModItems.GOLDEN_RYO_BUNDLE, 12), 3, 20, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.TITANITE_HELMET3), new ItemStack(ModItems.GOLDEN_RYO_BUNDLE, 12), 3, 20, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.TITANITE_CHESTPLATE3), new ItemStack(ModItems.GOLDEN_RYO_BUNDLE, 13), 3, 20, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.TITANITE_LEGGINGS3), new ItemStack(ModItems.GOLDEN_RYO_BUNDLE, 12), 3, 20, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.TITANITE_BOOTS3), new ItemStack(ModItems.GOLDEN_RYO_BUNDLE, 12), 3, 20, 0));

                trades.add(new TradeOffer(new TradedItem(ModItems.TITANITE_KATANA4), new ItemStack(ModItems.GOLDEN_RYO_BUNDLE, 13), 3, 20, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.TITANITE_AXE4), new ItemStack(ModItems.GOLDEN_RYO_BUNDLE, 13), 3, 20, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.TITANITE_HELMET4), new ItemStack(ModItems.GOLDEN_RYO_BUNDLE, 13), 3, 20, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.TITANITE_CHESTPLATE4), new ItemStack(ModItems.GOLDEN_RYO_BUNDLE, 14), 3, 20, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.TITANITE_LEGGINGS4), new ItemStack(ModItems.GOLDEN_RYO_BUNDLE, 13), 3, 20, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.TITANITE_BOOTS4), new ItemStack(ModItems.GOLDEN_RYO_BUNDLE, 13), 3, 20, 0));

                trades.add(new TradeOffer(new TradedItem(ModItems.TITANITE_KATANA5), new ItemStack(ModItems.GOLDEN_RYO_BUNDLE, 14), 3, 20, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.TITANITE_AXE5), new ItemStack(ModItems.GOLDEN_RYO_BUNDLE, 14), 3, 20, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.TITANITE_HELMET5), new ItemStack(ModItems.GOLDEN_RYO_BUNDLE, 14), 3, 20, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.TITANITE_CHESTPLATE5), new ItemStack(ModItems.GOLDEN_RYO_BUNDLE, 15), 3, 20, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.TITANITE_LEGGINGS5), new ItemStack(ModItems.GOLDEN_RYO_BUNDLE, 14), 3, 20, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.TITANITE_BOOTS5), new ItemStack(ModItems.GOLDEN_RYO_BUNDLE, 14), 3, 20, 0));
            }
            case 5 -> {
                trades.add(new TradeOffer(new TradedItem(ModItems.ETERNITE_KATANA1), new ItemStack(ModItems.GOLDEN_RYO_BUNDLE, 25), 1, 100, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.ETERNITE_AXE1), new ItemStack(ModItems.GOLDEN_RYO_BUNDLE, 25), 1, 100, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.ETERNITE_HELMET1), new ItemStack(ModItems.GOLDEN_RYO_BUNDLE, 25), 1, 100, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.ETERNITE_CHESTPLATE1), new ItemStack(ModItems.GOLDEN_RYO_BUNDLE, 26), 1, 100, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.ETERNITE_LEGGINGS1), new ItemStack(ModItems.GOLDEN_RYO_BUNDLE, 25), 1, 100, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.ETERNITE_BOOTS1), new ItemStack(ModItems.GOLDEN_RYO_BUNDLE, 25), 1, 100, 0));

                trades.add(new TradeOffer(new TradedItem(ModItems.ETERNITE_KATANA2), new ItemStack(ModItems.GOLDEN_RYO_BUNDLE, 26), 1, 100, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.ETERNITE_AXE2), new ItemStack(ModItems.GOLDEN_RYO_BUNDLE, 26), 1, 100, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.ETERNITE_HELMET2), new ItemStack(ModItems.GOLDEN_RYO_BUNDLE, 26), 1, 100, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.ETERNITE_CHESTPLATE2), new ItemStack(ModItems.GOLDEN_RYO_BUNDLE, 27), 1, 100, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.ETERNITE_LEGGINGS2), new ItemStack(ModItems.GOLDEN_RYO_BUNDLE, 26), 1, 100, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.ETERNITE_BOOTS2), new ItemStack(ModItems.GOLDEN_RYO_BUNDLE, 26), 1, 100, 0));

                trades.add(new TradeOffer(new TradedItem(ModItems.ETERNITE_KATANA3), new ItemStack(ModItems.GOLDEN_RYO_BUNDLE, 27), 1, 100, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.ETERNITE_AXE3), new ItemStack(ModItems.GOLDEN_RYO_BUNDLE, 27), 1, 100, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.ETERNITE_HELMET3), new ItemStack(ModItems.GOLDEN_RYO_BUNDLE, 27), 1, 100, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.ETERNITE_CHESTPLATE3), new ItemStack(ModItems.GOLDEN_RYO_BUNDLE, 28), 1, 100, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.ETERNITE_LEGGINGS3), new ItemStack(ModItems.GOLDEN_RYO_BUNDLE, 27), 1, 100, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.ETERNITE_BOOTS3), new ItemStack(ModItems.GOLDEN_RYO_BUNDLE, 27), 1, 100, 0));

                trades.add(new TradeOffer(new TradedItem(ModItems.ETERNITE_KATANA4), new ItemStack(ModItems.GOLDEN_RYO_BUNDLE, 28), 1, 100, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.ETERNITE_AXE4), new ItemStack(ModItems.GOLDEN_RYO_BUNDLE, 28), 1, 100, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.ETERNITE_HELMET4), new ItemStack(ModItems.GOLDEN_RYO_BUNDLE, 28), 1, 100, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.ETERNITE_CHESTPLATE4), new ItemStack(ModItems.GOLDEN_RYO_BUNDLE, 29), 1, 100, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.ETERNITE_LEGGINGS4), new ItemStack(ModItems.GOLDEN_RYO_BUNDLE, 28), 1, 100, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.ETERNITE_BOOTS4), new ItemStack(ModItems.GOLDEN_RYO_BUNDLE, 28), 1, 100, 0));

                trades.add(new TradeOffer(new TradedItem(ModItems.ETERNITE_KATANA5), new ItemStack(ModItems.GOLDEN_RYO_BUNDLE, 29), 1, 100, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.ETERNITE_AXE5), new ItemStack(ModItems.GOLDEN_RYO_BUNDLE, 29), 1, 100, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.ETERNITE_HELMET5), new ItemStack(ModItems.GOLDEN_RYO_BUNDLE, 29), 1, 100, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.ETERNITE_CHESTPLATE5), new ItemStack(ModItems.GOLDEN_RYO_BUNDLE, 30), 1, 100, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.ETERNITE_LEGGINGS5), new ItemStack(ModItems.GOLDEN_RYO_BUNDLE, 29), 1, 100, 0));
                trades.add(new TradeOffer(new TradedItem(ModItems.ETERNITE_BOOTS5), new ItemStack(ModItems.GOLDEN_RYO_BUNDLE, 29), 1, 100, 0));
            }
        }
        return trades;
    }
}

