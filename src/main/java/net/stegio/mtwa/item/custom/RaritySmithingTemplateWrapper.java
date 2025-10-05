package net.stegio.mtwa.item.custom;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SmithingTemplateItem;
import net.stegio.mtwa.util.CustomRarityHolder;
import net.stegio.mtwa.util.ModRarity;

public class RaritySmithingTemplateWrapper extends Item implements CustomRarityHolder {
    private final SmithingTemplateItem innerTemplate;
    private final ModRarity rarity;

    public RaritySmithingTemplateWrapper(SmithingTemplateItem innerTemplate, ModRarity rarity) {
        super(new Item.Settings().maxCount(innerTemplate.getMaxCount()));
        this.innerTemplate = innerTemplate;
        this.rarity = rarity;
    }
    @Override
    public net.minecraft.text.Text getName(ItemStack stack) {
        return rarity.formatName(net.minecraft.text.Text.translatable(this.getTranslationKey(stack)));
    }
    @Override
    public ModRarity getCustomRarity() {
        return null;
    }
    @Override
    public boolean isEnchantable(ItemStack stack) {
        return innerTemplate.isEnchantable(stack);
    }
    @Override
    public boolean hasGlint(ItemStack stack) {
        return innerTemplate.hasGlint(stack);
    }
    public SmithingTemplateItem getInnerTemplate() {
        return innerTemplate;
    }
}
