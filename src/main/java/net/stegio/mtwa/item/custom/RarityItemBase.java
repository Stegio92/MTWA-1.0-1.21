package net.stegio.mtwa.item.custom;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.stegio.mtwa.util.CustomRarityHolder;
import net.stegio.mtwa.util.ModRarity;
import org.w3c.dom.Text;

public abstract class RarityItemBase extends Item implements CustomRarityHolder {
    private final ModRarity rarity;

    public RarityItemBase(Settings settings, ModRarity rarity) {
        super(settings);
        this.rarity = rarity;
    }
    @Override
    public net.minecraft.text.Text getName(ItemStack stack) {
        return rarity.formatName(net.minecraft.text.Text.translatable(this.getTranslationKey(stack)));
    }
    @Override
    public ModRarity getCustomRarity() {
        return rarity;
    }
}
