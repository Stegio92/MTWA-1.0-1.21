package net.stegio.mtwa.item;

import com.google.common.base.Suppliers;
import net.fabricmc.fabric.mixin.recipe.ingredient.IngredientMixin;
import net.minecraft.block.Block;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.TagKey;
import net.stegio.mtwa.util.ModTags;

import java.util.function.Supplier;

public enum ModToolMaterials implements ToolMaterial {
    AETHERITE(ModTags.Blocks.INCORRECT_FOR_AETHERITE_TOOL, 2500, 15.0F, 5.0F, 5, () -> Ingredient.ofItems(ModItems.AETHERITE_INGOT)),
    AETHERITE2(ModTags.Blocks.INCORRECT_FOR_AETHERITE_TOOL, 2600, 16.0F, 6.0F, 5, () -> Ingredient.ofItems(ModItems.AETHERITE_INGOT)),
    AETHERITE3(ModTags.Blocks.INCORRECT_FOR_AETHERITE_TOOL, 2700, 17.0F, 7.0F, 5, () -> Ingredient.ofItems(ModItems.AETHERITE_INGOT)),
    AETHERITE4(ModTags.Blocks.INCORRECT_FOR_AETHERITE_TOOL, 2800, 18.0F, 8.0F, 5, () -> Ingredient.ofItems(ModItems.AETHERITE_INGOT)),
    AETHERITE5(ModTags.Blocks.INCORRECT_FOR_AETHERITE_TOOL, 2900, 20.0F, 9.0F, 5, () -> Ingredient.ofItems(ModItems.AETHERITE_INGOT)),
    TITANITE(ModTags.Blocks.INCORRECT_FOR_TITANITE_TOOL, 3000, 25.0F, 10.0F, 5, () -> Ingredient.ofItems(ModItems.TITANITE_INGOT)),
    TITANITE2(ModTags.Blocks.INCORRECT_FOR_TITANITE_TOOL, 3100, 26.0F, 11.0F, 5, () -> Ingredient.ofItems(ModItems.TITANITE_INGOT)),
    TITANITE3(ModTags.Blocks.INCORRECT_FOR_TITANITE_TOOL, 3200, 27.0F, 12.0F, 5, () -> Ingredient.ofItems(ModItems.TITANITE_INGOT)),
    TITANITE4(ModTags.Blocks.INCORRECT_FOR_TITANITE_TOOL, 3300, 28.0F, 13.0F, 5, () -> Ingredient.ofItems(ModItems.TITANITE_INGOT)),
    TITANITE5(ModTags.Blocks.INCORRECT_FOR_TITANITE_TOOL, 3400, 30.0F, 14.0F, 5, () -> Ingredient.ofItems(ModItems.TITANITE_INGOT));

    private final TagKey<Block> inverseTag;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;

    private ModToolMaterials(final TagKey<Block> inverseTag, final int itemDurability, final float miningSpeed, final float attackDamage, final int enchantability, final Supplier<Ingredient> repairIngredient
    ) {
        this.inverseTag = inverseTag;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = Suppliers.memoize(repairIngredient::get);
    }



    @Override
    public int getDurability() {
        return this.itemDurability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public TagKey<Block> getInverseTag() {
        return this.inverseTag;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return (Ingredient)this.repairIngredient.get();
    }
}
