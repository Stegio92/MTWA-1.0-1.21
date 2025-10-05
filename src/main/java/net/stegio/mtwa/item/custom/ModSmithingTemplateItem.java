package net.stegio.mtwa.item.custom;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

import java.util.List;

public class ModSmithingTemplateItem extends Item {
    private static final Formatting TITLE_FORMATTING = Formatting.GRAY;
    private static final Formatting DESCRIPTION_FORMATTING = Formatting.BLUE;

    private static final Identifier EMPTY_SLOT_INGOT_TEXTURE = Identifier.ofVanilla("item/empty_slot_ingot");
    private static final Identifier EMPTY_ARMOR_SLOT_HELMET_TEXTURE = Identifier.ofVanilla("item/empty_armor_slot_helmet");
    private static final Identifier EMPTY_ARMOR_SLOT_CHESTPLATE_TEXTURE = Identifier.ofVanilla("item/empty_armor_slot_chestplate");
    private static final Identifier EMPTY_ARMOR_SLOT_LEGGINGS_TEXTURE = Identifier.ofVanilla("item/empty_armor_slot_leggings");
    private static final Identifier EMPTY_ARMOR_SLOT_BOOTS_TEXTURE = Identifier.ofVanilla("item/empty_armor_slot_boots");
    private static final Identifier EMPTY_SLOT_HOE_TEXTURE = Identifier.ofVanilla("item/empty_slot_hoe");
    private static final Identifier EMPTY_SLOT_AXE_TEXTURE = Identifier.ofVanilla("item/empty_slot_axe");
    private static final Identifier EMPTY_SLOT_SWORD_TEXTURE = Identifier.ofVanilla("item/empty_slot_sword");
    private static final Identifier EMPTY_SLOT_SHOVEL_TEXTURE = Identifier.ofVanilla("item/empty_slot_shovel");
    private static final Identifier EMPTY_SLOT_PICKAXE_TEXTURE = Identifier.ofVanilla("item/empty_slot_pickaxe");

    public ModSmithingTemplateItem(Item.Settings settings) {
        super(settings);
    }


    public static net.minecraft.item.SmithingTemplateItem createAetheriteUpgrade() {
        return new net.minecraft.item.SmithingTemplateItem(
                AETHERITE_UPGRADE_APPLIES_TO_TEXT,
                AETHERITE_UPGRADE_INGREDIENTS_TEXT,
                AETHERITE_UPGRADE_TEXT,
                AETHERITE_UPGRADE_BASE_SLOT_DESCRIPTION_TEXT,
                AETHERITE_UPGRADE_ADDITIONS_SLOT_DESCRIPTION_TEXT,
                getAetheriteUpgradeEmptyBaseSlotTextures(),
                getAetheriteUpgradeEmptyAdditionsSlotTextures()
        );
    }
    private static final Text AETHERITE_UPGRADE_APPLIES_TO_TEXT = Text.translatable(
                    Util.createTranslationKey("item", Identifier.ofVanilla("smithing_template.aetherite_upgrade.applies_to"))
            )
            .formatted(DESCRIPTION_FORMATTING);
    private static final Text AETHERITE_UPGRADE_INGREDIENTS_TEXT = Text.translatable(
                    Util.createTranslationKey("item", Identifier.ofVanilla("smithing_template.aetherite_upgrade.ingredients"))
            )
            .formatted(DESCRIPTION_FORMATTING);
    private static final Text AETHERITE_UPGRADE_BASE_SLOT_DESCRIPTION_TEXT = Text.translatable(
            Util.createTranslationKey("item", Identifier.ofVanilla("smithing_template.aetherite_upgrade.base_slot_description"))
    );
    private static final Text AETHERITE_UPGRADE_ADDITIONS_SLOT_DESCRIPTION_TEXT = Text.translatable(
            Util.createTranslationKey("item", Identifier.ofVanilla("smithing_template.aetherite_upgrade.additions_slot_description"))
    );
    private static final Text AETHERITE_UPGRADE_TEXT = Text.translatable(Util.createTranslationKey("upgrade", Identifier.ofVanilla("aetherite_upgrade")))
            .formatted(TITLE_FORMATTING);

    private static List<Identifier> getAetheriteUpgradeEmptyBaseSlotTextures() {
        return List.of(
                EMPTY_ARMOR_SLOT_HELMET_TEXTURE,
                EMPTY_SLOT_SWORD_TEXTURE,
                EMPTY_ARMOR_SLOT_CHESTPLATE_TEXTURE,
                EMPTY_SLOT_PICKAXE_TEXTURE,
                EMPTY_ARMOR_SLOT_LEGGINGS_TEXTURE,
                EMPTY_SLOT_AXE_TEXTURE,
                EMPTY_ARMOR_SLOT_BOOTS_TEXTURE,
                EMPTY_SLOT_HOE_TEXTURE,
                EMPTY_SLOT_SHOVEL_TEXTURE
        );
    }

    private static List<Identifier> getAetheriteUpgradeEmptyAdditionsSlotTextures() {
        return List.of(EMPTY_SLOT_INGOT_TEXTURE);
    }
    public static net.minecraft.item.SmithingTemplateItem createTitaniteUpgrade() {
        return new net.minecraft.item.SmithingTemplateItem(
                TITANITE_UPGRADE_APPLIES_TO_TEXT,
                TITANITE_UPGRADE_INGREDIENTS_TEXT,
                TITANITE_UPGRADE_TEXT,
                TITANITE_UPGRADE_BASE_SLOT_DESCRIPTION_TEXT,
                TITANITE_UPGRADE_ADDITIONS_SLOT_DESCRIPTION_TEXT,
                getTitaniteUpgradeEmptyBaseSlotTextures(),
                getTitaniteUpgradeEmptyAdditionsSlotTextures()
        );
    }
    private static final Text TITANITE_UPGRADE_APPLIES_TO_TEXT = Text.translatable(
                    Util.createTranslationKey("item", Identifier.ofVanilla("smithing_template.titanite_upgrade.applies_to"))
            )
            .formatted(DESCRIPTION_FORMATTING);
    private static final Text TITANITE_UPGRADE_INGREDIENTS_TEXT = Text.translatable(
                    Util.createTranslationKey("item", Identifier.ofVanilla("smithing_template.titanite_upgrade.ingredients"))
            )
            .formatted(DESCRIPTION_FORMATTING);
    private static final Text TITANITE_UPGRADE_BASE_SLOT_DESCRIPTION_TEXT = Text.translatable(
            Util.createTranslationKey("item", Identifier.ofVanilla("smithing_template.titanite_upgrade.base_slot_description"))
    );
    private static final Text TITANITE_UPGRADE_ADDITIONS_SLOT_DESCRIPTION_TEXT = Text.translatable(
            Util.createTranslationKey("item", Identifier.ofVanilla("smithing_template.titanite_upgrade.additions_slot_description"))
    );
    private static final Text TITANITE_UPGRADE_TEXT = Text.translatable(Util.createTranslationKey("upgrade", Identifier.ofVanilla("titanite_upgrade")))
            .formatted(TITLE_FORMATTING);

    private static List<Identifier> getTitaniteUpgradeEmptyBaseSlotTextures() {
        return List.of(
                EMPTY_ARMOR_SLOT_HELMET_TEXTURE,
                EMPTY_SLOT_SWORD_TEXTURE,
                EMPTY_ARMOR_SLOT_CHESTPLATE_TEXTURE,
                EMPTY_SLOT_PICKAXE_TEXTURE,
                EMPTY_ARMOR_SLOT_LEGGINGS_TEXTURE,
                EMPTY_SLOT_AXE_TEXTURE,
                EMPTY_ARMOR_SLOT_BOOTS_TEXTURE,
                EMPTY_SLOT_HOE_TEXTURE,
                EMPTY_SLOT_SHOVEL_TEXTURE
        );
    }

    private static List<Identifier> getTitaniteUpgradeEmptyAdditionsSlotTextures() {
        return List.of(EMPTY_SLOT_INGOT_TEXTURE);
    }
    public static net.minecraft.item.SmithingTemplateItem createEterniteUpgrade() {
        return new net.minecraft.item.SmithingTemplateItem(
                ETERNITE_UPGRADE_APPLIES_TO_TEXT,
                ETERNITE_UPGRADE_INGREDIENTS_TEXT,
                ETERNITE_UPGRADE_TEXT,
                ETERNITE_UPGRADE_BASE_SLOT_DESCRIPTION_TEXT,
                ETERNITE_UPGRADE_ADDITIONS_SLOT_DESCRIPTION_TEXT,
                getEterniteUpgradeEmptyBaseSlotTextures(),
                getEterniteUpgradeEmptyAdditionsSlotTextures()
        );
    }
    private static final Text ETERNITE_UPGRADE_APPLIES_TO_TEXT = Text.translatable(
                    Util.createTranslationKey("item", Identifier.ofVanilla("smithing_template.eternite_upgrade.applies_to"))
            )
            .formatted(DESCRIPTION_FORMATTING);
    private static final Text ETERNITE_UPGRADE_INGREDIENTS_TEXT = Text.translatable(
                    Util.createTranslationKey("item", Identifier.ofVanilla("smithing_template.eternite_upgrade.ingredients"))
            )
            .formatted(DESCRIPTION_FORMATTING);
    private static final Text ETERNITE_UPGRADE_BASE_SLOT_DESCRIPTION_TEXT = Text.translatable(
            Util.createTranslationKey("item", Identifier.ofVanilla("smithing_template.eternite_upgrade.base_slot_description"))
    );
    private static final Text ETERNITE_UPGRADE_ADDITIONS_SLOT_DESCRIPTION_TEXT = Text.translatable(
            Util.createTranslationKey("item", Identifier.ofVanilla("smithing_template.eternite_upgrade.additions_slot_description"))
    );
    private static final Text ETERNITE_UPGRADE_TEXT = Text.translatable(Util.createTranslationKey("upgrade", Identifier.ofVanilla("eternite_upgrade")))
            .formatted(TITLE_FORMATTING);

    private static List<Identifier> getEterniteUpgradeEmptyBaseSlotTextures() {
        return List.of(
                EMPTY_ARMOR_SLOT_HELMET_TEXTURE,
                EMPTY_SLOT_SWORD_TEXTURE,
                EMPTY_ARMOR_SLOT_CHESTPLATE_TEXTURE,
                EMPTY_SLOT_PICKAXE_TEXTURE,
                EMPTY_ARMOR_SLOT_LEGGINGS_TEXTURE,
                EMPTY_SLOT_AXE_TEXTURE,
                EMPTY_ARMOR_SLOT_BOOTS_TEXTURE,
                EMPTY_SLOT_HOE_TEXTURE,
                EMPTY_SLOT_SHOVEL_TEXTURE
        );
    }

    private static List<Identifier> getEterniteUpgradeEmptyAdditionsSlotTextures() {
        return List.of(EMPTY_SLOT_INGOT_TEXTURE);
    }

    public int getMaxCount() {
        return 64;
    }

    public boolean isEnchantable(ItemStack stack) {
        return false;
    }

}
