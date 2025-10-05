package net.stegio.mtwa.item.custom;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.entry.RegistryEntry;
import net.stegio.mtwa.util.CustomRarityHolder;
import net.stegio.mtwa.util.ModRarity;

public class RarityArmorItem extends ArmorItem implements CustomRarityHolder {
    private final ModRarity rarity;

    public RarityArmorItem(RegistryEntry<ArmorMaterial> material, Type type, Settings settings, ModRarity rarity) {
        super(material, type, settings);
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
