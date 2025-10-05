package net.stegio.mtwa.item.custom;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.stegio.mtwa.util.ModRarity;

public class RarityItem extends Item {
    private final ModRarity rarity;
    public RarityItem(Settings settings, ModRarity rarity) {
        super(settings);
        this.rarity = rarity;
    }
    @Override
    public Text getName(ItemStack stack) {
        return rarity.formatName(Text.translatable(this.getTranslationKey(stack)));
    }
    public ModRarity getCustomRarity() {
        return rarity;
    }
}
