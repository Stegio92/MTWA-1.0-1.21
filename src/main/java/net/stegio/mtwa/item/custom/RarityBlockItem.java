package net.stegio.mtwa.item.custom;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;
import net.stegio.mtwa.util.CustomRarityHolder;
import net.stegio.mtwa.util.ModRarity;

public class RarityBlockItem extends BlockItem implements CustomRarityHolder {
    private final ModRarity rarity;

    public RarityBlockItem(Block block, Settings settings, ModRarity rarity) {
        super(block, settings);
        this.rarity = rarity;
    }

    @Override
    public ModRarity getCustomRarity() {
        return null;
    }
    @Override
    public net.minecraft.text.Text getName(ItemStack stack) {
        return rarity.formatName(net.minecraft.text.Text.translatable(this.getTranslationKey(stack)));
    }
}
