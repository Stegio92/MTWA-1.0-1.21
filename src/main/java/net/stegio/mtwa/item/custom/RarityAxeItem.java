package net.stegio.mtwa.item.custom;

import net.minecraft.item.AxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.stegio.mtwa.util.CustomRarityHolder;
import net.stegio.mtwa.util.ModRarity;

public class RarityAxeItem extends AxeItem implements CustomRarityHolder {
    private final ModRarity rarity;

    public RarityAxeItem(ToolMaterial toolMaterial, Settings settings, ModRarity rarity) {
        super(toolMaterial, settings);
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
