package net.stegio.mtwa.item.custom;

import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.stegio.mtwa.util.CustomRarityHolder;
import net.stegio.mtwa.util.ModRarity;

public class RarityAetheriteMaceItem extends AetheriteMaceItem implements CustomRarityHolder {
    private final ModRarity rarity;

    public RarityAetheriteMaceItem(Settings settings, ModRarity rarity) {
        super(settings);
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
