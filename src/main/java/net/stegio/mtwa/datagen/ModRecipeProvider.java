package net.stegio.mtwa.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.SmithingTransformRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.SmeltingRecipe;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.util.Identifier;
import net.stegio.mtwa.MTWA;
import net.stegio.mtwa.block.ModBlocks;
import net.stegio.mtwa.item.ModItems;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter recipeExporter) {

        offerReversibleCompactingRecipes(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModItems.AETHERITE_INGOT, RecipeCategory.DECORATIONS, ModBlocks.AETHERITE_BLOCK);
        offerReversibleCompactingRecipes(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModItems.TITANITE_INGOT, RecipeCategory.DECORATIONS, ModBlocks.TITANITE_BLOCK);
        offerReversibleCompactingRecipes(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModItems.ETERNITE_INGOT, RecipeCategory.DECORATIONS, ModBlocks.ETERNITE_BLOCK);

        offerReversibleCompactingRecipes(recipeExporter, RecipeCategory.MISC, ModItems.BRONZE_RYO, RecipeCategory.MISC, ModItems.BRONZE_RYO_BUNDLE);
        offerReversibleCompactingRecipes(recipeExporter, RecipeCategory.MISC, ModItems.SILVER_RYO, RecipeCategory.MISC, ModItems.SILVER_RYO_BUNDLE);
        offerReversibleCompactingRecipes(recipeExporter, RecipeCategory.MISC, ModItems.GOLDEN_RYO, RecipeCategory.MISC, ModItems.GOLDEN_RYO_BUNDLE);

        offerSmelting(recipeExporter, List.of(ModBlocks.ANCIENT_AETHERITE_DEBRIS1), RecipeCategory.MISC, ModItems.AETHERITE_SCRAP, 1f, 400, "aetherite_scrap");
        offerBlasting(recipeExporter, List.of(ModBlocks.ANCIENT_AETHERITE_DEBRIS1), RecipeCategory.MISC, ModItems.AETHERITE_SCRAP, 0.5f, 200, "aetherite_scrap");

        offerSmelting(recipeExporter, List.of(ModBlocks.ANCIENT_TITANITE_DEBRIS1), RecipeCategory.MISC, ModItems.TITANITE_SCRAP, 1.5f, 500, "titanite_scrap");
        offerBlasting(recipeExporter, List.of(ModBlocks.ANCIENT_TITANITE_DEBRIS1), RecipeCategory.MISC, ModItems.TITANITE_SCRAP, 0.75f, 250, "titanite_scrap");

        offerSmelting(recipeExporter, List.of(ModBlocks.ANCIENT_ETERNITE_DEBRIS1), RecipeCategory.MISC, ModItems.ETERNITE_SCRAP, 2f, 600, "eternite_scrap");
        offerBlasting(recipeExporter, List.of(ModBlocks.ANCIENT_ETERNITE_DEBRIS1), RecipeCategory.MISC, ModItems.ETERNITE_SCRAP, 1f, 300, "eternite_scrap");

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.AETHERITE_INGOT)
                .pattern("NAN")
                .pattern("AEA")
                .pattern("NAN")
                .input('A', ModItems.AETHERITE_SCRAP)
                .input('E', ModItems.ESSENCE_OF_THE_SKY)
                .input('N', Items.NETHERITE_INGOT)
                .criterion(hasItem(ModItems.AETHERITE_SCRAP), conditionsFromItem(ModItems.AETHERITE_SCRAP))
                .criterion(hasItem(ModItems.ESSENCE_OF_THE_SKY), conditionsFromItem(ModItems.ESSENCE_OF_THE_SKY))
                .criterion(hasItem(Items.NETHERITE_INGOT), conditionsFromItem(Items.NETHERITE_INGOT))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "aetherite_ingot9"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.TITANITE_INGOT)
                .pattern("ATA")
                .pattern("TET")
                .pattern("ATA")
                .input('T', ModItems.TITANITE_SCRAP)
                .input('E', ModItems.ESSENCE_OF_THE_SUN)
                .input('A', ModItems.AETHERITE_INGOT)
                .criterion(hasItem(ModItems.TITANITE_SCRAP), conditionsFromItem(ModItems.TITANITE_SCRAP))
                .criterion(hasItem(ModItems.ESSENCE_OF_THE_SUN), conditionsFromItem(ModItems.ESSENCE_OF_THE_SUN))
                .criterion(hasItem(ModItems.AETHERITE_INGOT), conditionsFromItem(ModItems.AETHERITE_INGOT))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "titanite_ingot9"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.TITANITE_INGOT)
                .pattern("ATA")
                .pattern("TET")
                .pattern("ATA")
                .input('T', ModItems.ETERNITE_SCRAP)
                .input('E', ModItems.ESSENCE_OF_THE_UNIVERSE)
                .input('A', ModItems.TITANITE_INGOT)
                .criterion(hasItem(ModItems.ETERNITE_SCRAP), conditionsFromItem(ModItems.ETERNITE_SCRAP))
                .criterion(hasItem(ModItems.ESSENCE_OF_THE_UNIVERSE), conditionsFromItem(ModItems.ESSENCE_OF_THE_UNIVERSE))
                .criterion(hasItem(ModItems.TITANITE_INGOT), conditionsFromItem(ModItems.TITANITE_INGOT))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "eternite_ingot9"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.AETHERITE_ARMOR_ANVIL)
                .pattern("III")
                .pattern(" R ")
                .pattern("ARR")
                .input('I', Blocks.IRON_BLOCK)
                .input('R', Items.IRON_INGOT)
                .input('A', ModItems.AETHERITE_INGOT)
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .criterion(hasItem(Blocks.IRON_BLOCK), conditionsFromItem(Blocks.IRON_BLOCK))
                .criterion(hasItem(ModItems.AETHERITE_INGOT), conditionsFromItem(ModItems.AETHERITE_INGOT))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "aetherite_armor_anvil"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.AETHERITE_WEAPON_ANVIL)
                .pattern("III")
                .pattern(" R ")
                .pattern("RAR")
                .input('I', Blocks.IRON_BLOCK)
                .input('R', Items.IRON_INGOT)
                .input('A', ModItems.AETHERITE_INGOT)
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .criterion(hasItem(Blocks.IRON_BLOCK), conditionsFromItem(Blocks.IRON_BLOCK))
                .criterion(hasItem(ModItems.AETHERITE_INGOT), conditionsFromItem(ModItems.AETHERITE_INGOT))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "aetherite_weapon_anvil"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.AETHERITE_TOOL_ANVIL)
                .pattern("III")
                .pattern(" R ")
                .pattern("RRA")
                .input('I', Blocks.IRON_BLOCK)
                .input('R', Items.IRON_INGOT)
                .input('A', ModItems.AETHERITE_INGOT)
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .criterion(hasItem(Blocks.IRON_BLOCK), conditionsFromItem(Blocks.IRON_BLOCK))
                .criterion(hasItem(ModItems.AETHERITE_INGOT), conditionsFromItem(ModItems.AETHERITE_INGOT))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "aetherite_tool_anvil"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.TITANITE_ARMOR_ANVIL)
                .pattern("III")
                .pattern(" R ")
                .pattern("ARR")
                .input('I', Blocks.IRON_BLOCK)
                .input('R', Items.IRON_INGOT)
                .input('A', ModItems.TITANITE_INGOT)
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .criterion(hasItem(Blocks.IRON_BLOCK), conditionsFromItem(Blocks.IRON_BLOCK))
                .criterion(hasItem(ModItems.TITANITE_INGOT), conditionsFromItem(ModItems.TITANITE_INGOT))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "titanite_armor_anvil"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.TITANITE_WEAPON_ANVIL)
                .pattern("III")
                .pattern(" R ")
                .pattern("RAR")
                .input('I', Blocks.IRON_BLOCK)
                .input('R', Items.IRON_INGOT)
                .input('A', ModItems.TITANITE_INGOT)
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .criterion(hasItem(Blocks.IRON_BLOCK), conditionsFromItem(Blocks.IRON_BLOCK))
                .criterion(hasItem(ModItems.TITANITE_INGOT), conditionsFromItem(ModItems.TITANITE_INGOT))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "titanite_weapon_anvil"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.TITANITE_TOOL_ANVIL)
                .pattern("III")
                .pattern(" R ")
                .pattern("RRA")
                .input('I', Blocks.IRON_BLOCK)
                .input('R', Items.IRON_INGOT)
                .input('A', ModItems.TITANITE_INGOT)
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .criterion(hasItem(Blocks.IRON_BLOCK), conditionsFromItem(Blocks.IRON_BLOCK))
                .criterion(hasItem(ModItems.TITANITE_INGOT), conditionsFromItem(ModItems.TITANITE_INGOT))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "titanite_tool_anvil"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.ETERNITE_ARMOR_ANVIL)
                .pattern("III")
                .pattern(" R ")
                .pattern("ARR")
                .input('I', Blocks.IRON_BLOCK)
                .input('R', Items.IRON_INGOT)
                .input('A', ModItems.ETERNITE_INGOT)
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .criterion(hasItem(Blocks.IRON_BLOCK), conditionsFromItem(Blocks.IRON_BLOCK))
                .criterion(hasItem(ModItems.ETERNITE_INGOT), conditionsFromItem(ModItems.ETERNITE_INGOT))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "eternite_armor_anvil"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.ETERNITE_WEAPON_ANVIL)
                .pattern("III")
                .pattern(" R ")
                .pattern("RAR")
                .input('I', Blocks.IRON_BLOCK)
                .input('R', Items.IRON_INGOT)
                .input('A', ModItems.AETHERITE_INGOT)
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .criterion(hasItem(Blocks.IRON_BLOCK), conditionsFromItem(Blocks.IRON_BLOCK))
                .criterion(hasItem(ModItems.ETERNITE_INGOT), conditionsFromItem(ModItems.ETERNITE_INGOT))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "eternite_weapon_anvil"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.ETERNITE_TOOL_ANVIL)
                .pattern("III")
                .pattern(" R ")
                .pattern("RRA")
                .input('I', Blocks.IRON_BLOCK)
                .input('R', Items.IRON_INGOT)
                .input('A', ModItems.AETHERITE_INGOT)
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .criterion(hasItem(Blocks.IRON_BLOCK), conditionsFromItem(Blocks.IRON_BLOCK))
                .criterion(hasItem(ModItems.ETERNITE_INGOT), conditionsFromItem(ModItems.ETERNITE_INGOT))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "eternite_tool_anvil"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.TOMBSTONE)
                .pattern("S")
                .pattern("S")
                .pattern("S")
                .input('S', Items.COBBLESTONE)
                .criterion(hasItem(Items.COBBLESTONE), conditionsFromItem(Items.COBBLESTONE))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "tombstone"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.WOODEN_KATANA)
                .pattern("  L")
                .pattern(" L ")
                .pattern("S  ")
                .input('L', Ingredient.fromTag(ItemTags.LOGS))
                .input('S', Items.STICK)
                .criterion("has_log", conditionsFromTag(ItemTags.LOGS))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "wooden_katana"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.IRON_KATANA)
                .pattern("  I")
                .pattern(" I ")
                .pattern("S  ")
                .input('I', Items.IRON_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "iron_katana"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DIAMOND_KATANA)
                .pattern("  D")
                .pattern(" D ")
                .pattern("S  ")
                .input('D', Items.DIAMOND)
                .input('S', Items.STICK)
                .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "diamond_katana"));

        SmithingTransformRecipeJsonBuilder.create(
                Ingredient.ofItems(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                Ingredient.ofItems(ModItems.DIAMOND_KATANA),
                Ingredient.ofItems(Items.NETHERITE_INGOT),
                RecipeCategory.MISC,
                ModItems.NETHERITE_KATANA
        ).criterion("has_diamond_katana", conditionsFromItem(ModItems.DIAMOND_KATANA))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "netherite_katana"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.AETHERITE_UPGRADE_SMITHING_TEMPLATE)
                .pattern("ANA")
                .input('A', ModItems.AETHERITE_INGOT)
                .input('N', Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE)
                .criterion(hasItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE), conditionsFromItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
                .criterion(hasItem(ModItems.AETHERITE_INGOT), conditionsFromItem(ModItems.AETHERITE_INGOT))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "aetherite_upgrade_smithing_template_1"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.AETHERITE_UPGRADE_SMITHING_TEMPLATE, 2)
                .pattern("A*A")
                .input('A', ModItems.AETHERITE_INGOT)
                .input('*', ModItems.AETHERITE_UPGRADE_SMITHING_TEMPLATE)
                .criterion(hasItem(ModItems.AETHERITE_UPGRADE_SMITHING_TEMPLATE), conditionsFromItem(ModItems.AETHERITE_UPGRADE_SMITHING_TEMPLATE))
                .criterion(hasItem(ModItems.AETHERITE_INGOT), conditionsFromItem(ModItems.AETHERITE_INGOT))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "aetherite_upgrade_smithing_template_2"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.AETHERITE_UPGRADE_SMITHING_TEMPLATE2)
                .pattern("A*A")
                .input('A', ModItems.AETHERITE_INGOT)
                .input('*', ModItems.AETHERITE_UPGRADE_SMITHING_TEMPLATE)
                .criterion(hasItem(ModItems.AETHERITE_UPGRADE_SMITHING_TEMPLATE), conditionsFromItem(ModItems.AETHERITE_UPGRADE_SMITHING_TEMPLATE))
                .criterion(hasItem(ModItems.AETHERITE_INGOT), conditionsFromItem(ModItems.AETHERITE_INGOT))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "aetherite_upgrade_smithing_template2_1"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.AETHERITE_UPGRADE_SMITHING_TEMPLATE2, 2)
                .pattern("A*A")
                .input('A', ModItems.AETHERITE_INGOT)
                .input('*', ModItems.AETHERITE_UPGRADE_SMITHING_TEMPLATE2)
                .criterion(hasItem(ModItems.AETHERITE_UPGRADE_SMITHING_TEMPLATE2), conditionsFromItem(ModItems.AETHERITE_UPGRADE_SMITHING_TEMPLATE2))
                .criterion(hasItem(ModItems.AETHERITE_INGOT), conditionsFromItem(ModItems.AETHERITE_INGOT))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "aetherite_upgrade_smithing_template2_2"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.AETHERITE_UPGRADE_SMITHING_TEMPLATE3)
                .pattern("A*A")
                .input('A', ModItems.AETHERITE_INGOT)
                .input('*', ModItems.AETHERITE_UPGRADE_SMITHING_TEMPLATE2)
                .criterion(hasItem(ModItems.AETHERITE_UPGRADE_SMITHING_TEMPLATE2), conditionsFromItem(ModItems.AETHERITE_UPGRADE_SMITHING_TEMPLATE2))
                .criterion(hasItem(ModItems.AETHERITE_INGOT), conditionsFromItem(ModItems.AETHERITE_INGOT))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "aetherite_upgrade_smithing_template3_1"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.AETHERITE_UPGRADE_SMITHING_TEMPLATE3, 2)
                .pattern("A*A")
                .input('A', ModItems.AETHERITE_INGOT)
                .input('*', ModItems.AETHERITE_UPGRADE_SMITHING_TEMPLATE3)
                .criterion(hasItem(ModItems.AETHERITE_UPGRADE_SMITHING_TEMPLATE3), conditionsFromItem(ModItems.AETHERITE_UPGRADE_SMITHING_TEMPLATE3))
                .criterion(hasItem(ModItems.AETHERITE_INGOT), conditionsFromItem(ModItems.AETHERITE_INGOT))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "aetherite_upgrade_smithing_template3_2"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.AETHERITE_UPGRADE_SMITHING_TEMPLATE4)
                .pattern("A*A")
                .input('A', ModItems.AETHERITE_INGOT)
                .input('*', ModItems.AETHERITE_UPGRADE_SMITHING_TEMPLATE3)
                .criterion(hasItem(ModItems.AETHERITE_UPGRADE_SMITHING_TEMPLATE3), conditionsFromItem(ModItems.AETHERITE_UPGRADE_SMITHING_TEMPLATE3))
                .criterion(hasItem(ModItems.AETHERITE_INGOT), conditionsFromItem(ModItems.AETHERITE_INGOT))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "aetherite_upgrade_smithing_template4_1"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.AETHERITE_UPGRADE_SMITHING_TEMPLATE4, 2)
                .pattern("A*A")
                .input('A', ModItems.AETHERITE_INGOT)
                .input('*', ModItems.AETHERITE_UPGRADE_SMITHING_TEMPLATE4)
                .criterion(hasItem(ModItems.AETHERITE_UPGRADE_SMITHING_TEMPLATE4), conditionsFromItem(ModItems.AETHERITE_UPGRADE_SMITHING_TEMPLATE4))
                .criterion(hasItem(ModItems.AETHERITE_INGOT), conditionsFromItem(ModItems.AETHERITE_INGOT))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "aetherite_upgrade_smithing_template4_2"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.AETHERITE_UPGRADE_SMITHING_TEMPLATE5)
                .pattern("A*A")
                .input('A', ModItems.AETHERITE_INGOT)
                .input('*', ModItems.AETHERITE_UPGRADE_SMITHING_TEMPLATE4)
                .criterion(hasItem(ModItems.AETHERITE_UPGRADE_SMITHING_TEMPLATE4), conditionsFromItem(ModItems.AETHERITE_UPGRADE_SMITHING_TEMPLATE4))
                .criterion(hasItem(ModItems.AETHERITE_INGOT), conditionsFromItem(ModItems.AETHERITE_INGOT))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "aetherite_upgrade_smithing_template5_1"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.AETHERITE_UPGRADE_SMITHING_TEMPLATE5, 2)
                .pattern("A*A")
                .input('A', ModItems.AETHERITE_INGOT)
                .input('*', ModItems.AETHERITE_UPGRADE_SMITHING_TEMPLATE5)
                .criterion(hasItem(ModItems.AETHERITE_UPGRADE_SMITHING_TEMPLATE5), conditionsFromItem(ModItems.AETHERITE_UPGRADE_SMITHING_TEMPLATE5))
                .criterion(hasItem(ModItems.AETHERITE_INGOT), conditionsFromItem(ModItems.AETHERITE_INGOT))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "aetherite_upgrade_smithing_template5_2"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.TITANITE_UPGRADE_SMITHING_TEMPLATE)
                .pattern("T*T")
                .input('T', ModItems.TITANITE_INGOT)
                .input('*', ModItems.AETHERITE_UPGRADE_SMITHING_TEMPLATE5)
                .criterion(hasItem(ModItems.AETHERITE_UPGRADE_SMITHING_TEMPLATE5), conditionsFromItem(ModItems.AETHERITE_UPGRADE_SMITHING_TEMPLATE5))
                .criterion(hasItem(ModItems.TITANITE_INGOT), conditionsFromItem(ModItems.TITANITE_INGOT))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "titanite_upgrade_smithing_template_1"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.TITANITE_UPGRADE_SMITHING_TEMPLATE, 2)
                .pattern("T#T")
                .input('T', ModItems.TITANITE_INGOT)
                .input('#', ModItems.TITANITE_UPGRADE_SMITHING_TEMPLATE)
                .criterion(hasItem(ModItems.TITANITE_UPGRADE_SMITHING_TEMPLATE), conditionsFromItem(ModItems.TITANITE_UPGRADE_SMITHING_TEMPLATE))
                .criterion(hasItem(ModItems.TITANITE_INGOT), conditionsFromItem(ModItems.TITANITE_INGOT))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "titanite_upgrade_smithing_template_2"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.TITANITE_UPGRADE_SMITHING_TEMPLATE2)
                .pattern("T*T")
                .input('T', ModItems.TITANITE_INGOT)
                .input('*', ModItems.TITANITE_UPGRADE_SMITHING_TEMPLATE)
                .criterion(hasItem(ModItems.TITANITE_UPGRADE_SMITHING_TEMPLATE), conditionsFromItem(ModItems.TITANITE_UPGRADE_SMITHING_TEMPLATE))
                .criterion(hasItem(ModItems.TITANITE_INGOT), conditionsFromItem(ModItems.TITANITE_INGOT))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "titanite_upgrade_smithing_template2_1"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.TITANITE_UPGRADE_SMITHING_TEMPLATE2, 2)
                .pattern("T#T")
                .input('T', ModItems.TITANITE_INGOT)
                .input('#', ModItems.TITANITE_UPGRADE_SMITHING_TEMPLATE2)
                .criterion(hasItem(ModItems.TITANITE_UPGRADE_SMITHING_TEMPLATE2), conditionsFromItem(ModItems.TITANITE_UPGRADE_SMITHING_TEMPLATE2))
                .criterion(hasItem(ModItems.TITANITE_INGOT), conditionsFromItem(ModItems.TITANITE_INGOT))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "titanite_upgrade_smithing_template2_2"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.TITANITE_UPGRADE_SMITHING_TEMPLATE3)
                .pattern("T*T")
                .input('T', ModItems.TITANITE_INGOT)
                .input('*', ModItems.TITANITE_UPGRADE_SMITHING_TEMPLATE2)
                .criterion(hasItem(ModItems.TITANITE_UPGRADE_SMITHING_TEMPLATE2), conditionsFromItem(ModItems.TITANITE_UPGRADE_SMITHING_TEMPLATE2))
                .criterion(hasItem(ModItems.TITANITE_INGOT), conditionsFromItem(ModItems.TITANITE_INGOT))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "titanite_upgrade_smithing_template3_1"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.TITANITE_UPGRADE_SMITHING_TEMPLATE3, 2)
                .pattern("T#T")
                .input('T', ModItems.TITANITE_INGOT)
                .input('#', ModItems.TITANITE_UPGRADE_SMITHING_TEMPLATE3)
                .criterion(hasItem(ModItems.TITANITE_UPGRADE_SMITHING_TEMPLATE3), conditionsFromItem(ModItems.TITANITE_UPGRADE_SMITHING_TEMPLATE3))
                .criterion(hasItem(ModItems.TITANITE_INGOT), conditionsFromItem(ModItems.TITANITE_INGOT))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "titanite_upgrade_smithing_template3_2"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.TITANITE_UPGRADE_SMITHING_TEMPLATE4)
                .pattern("T*T")
                .input('T', ModItems.TITANITE_INGOT)
                .input('*', ModItems.TITANITE_UPGRADE_SMITHING_TEMPLATE3)
                .criterion(hasItem(ModItems.TITANITE_UPGRADE_SMITHING_TEMPLATE3), conditionsFromItem(ModItems.TITANITE_UPGRADE_SMITHING_TEMPLATE3))
                .criterion(hasItem(ModItems.TITANITE_INGOT), conditionsFromItem(ModItems.TITANITE_INGOT))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "titanite_upgrade_smithing_template4_1"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.TITANITE_UPGRADE_SMITHING_TEMPLATE4, 2)
                .pattern("T#T")
                .input('T', ModItems.TITANITE_INGOT)
                .input('#', ModItems.TITANITE_UPGRADE_SMITHING_TEMPLATE4)
                .criterion(hasItem(ModItems.TITANITE_UPGRADE_SMITHING_TEMPLATE4), conditionsFromItem(ModItems.TITANITE_UPGRADE_SMITHING_TEMPLATE4))
                .criterion(hasItem(ModItems.TITANITE_INGOT), conditionsFromItem(ModItems.TITANITE_INGOT))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "titanite_upgrade_smithing_template4_2"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.TITANITE_UPGRADE_SMITHING_TEMPLATE5)
                .pattern("T*T")
                .input('T', ModItems.TITANITE_INGOT)
                .input('*', ModItems.TITANITE_UPGRADE_SMITHING_TEMPLATE4)
                .criterion(hasItem(ModItems.TITANITE_UPGRADE_SMITHING_TEMPLATE4), conditionsFromItem(ModItems.TITANITE_UPGRADE_SMITHING_TEMPLATE4))
                .criterion(hasItem(ModItems.TITANITE_INGOT), conditionsFromItem(ModItems.TITANITE_INGOT))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "titanite_upgrade_smithing_template5_1"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.TITANITE_UPGRADE_SMITHING_TEMPLATE5, 2)
                .pattern("T#T")
                .input('T', ModItems.TITANITE_INGOT)
                .input('#', ModItems.TITANITE_UPGRADE_SMITHING_TEMPLATE5)
                .criterion(hasItem(ModItems.TITANITE_UPGRADE_SMITHING_TEMPLATE5), conditionsFromItem(ModItems.TITANITE_UPGRADE_SMITHING_TEMPLATE5))
                .criterion(hasItem(ModItems.TITANITE_INGOT), conditionsFromItem(ModItems.TITANITE_INGOT))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "titanite_upgrade_smithing_template5_2"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ETERNITE_UPGRADE_SMITHING_TEMPLATE1)
                .pattern("ANA")
                .input('A', ModItems.ETERNITE_INGOT)
                .input('N', ModItems.TITANITE_UPGRADE_SMITHING_TEMPLATE5)
                .criterion(hasItem(ModItems.TITANITE_UPGRADE_SMITHING_TEMPLATE5), conditionsFromItem(ModItems.TITANITE_UPGRADE_SMITHING_TEMPLATE5))
                .criterion(hasItem(ModItems.ETERNITE_INGOT), conditionsFromItem(ModItems.ETERNITE_INGOT))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "eternite_upgrade_smithing_template_1"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ETERNITE_UPGRADE_SMITHING_TEMPLATE1, 2)
                .pattern("A*A")
                .input('A', ModItems.ETERNITE_INGOT)
                .input('*', ModItems.ETERNITE_UPGRADE_SMITHING_TEMPLATE1)
                .criterion(hasItem(ModItems.ETERNITE_UPGRADE_SMITHING_TEMPLATE1), conditionsFromItem(ModItems.ETERNITE_UPGRADE_SMITHING_TEMPLATE1))
                .criterion(hasItem(ModItems.ETERNITE_INGOT), conditionsFromItem(ModItems.ETERNITE_INGOT))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "eternite_upgrade_smithing_template_2"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ETERNITE_UPGRADE_SMITHING_TEMPLATE2)
                .pattern("A*A")
                .input('A', ModItems.ETERNITE_INGOT)
                .input('*', ModItems.ETERNITE_UPGRADE_SMITHING_TEMPLATE1)
                .criterion(hasItem(ModItems.ETERNITE_UPGRADE_SMITHING_TEMPLATE1), conditionsFromItem(ModItems.ETERNITE_UPGRADE_SMITHING_TEMPLATE1))
                .criterion(hasItem(ModItems.ETERNITE_INGOT), conditionsFromItem(ModItems.ETERNITE_INGOT))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "eternite_upgrade_smithing_template2_1"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ETERNITE_UPGRADE_SMITHING_TEMPLATE2, 2)
                .pattern("A*A")
                .input('A', ModItems.ETERNITE_INGOT)
                .input('*', ModItems.ETERNITE_UPGRADE_SMITHING_TEMPLATE2)
                .criterion(hasItem(ModItems.ETERNITE_UPGRADE_SMITHING_TEMPLATE2), conditionsFromItem(ModItems.ETERNITE_UPGRADE_SMITHING_TEMPLATE2))
                .criterion(hasItem(ModItems.ETERNITE_INGOT), conditionsFromItem(ModItems.ETERNITE_INGOT))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "eternite_upgrade_smithing_template2_2"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ETERNITE_UPGRADE_SMITHING_TEMPLATE3)
                .pattern("A*A")
                .input('A', ModItems.ETERNITE_INGOT)
                .input('*', ModItems.ETERNITE_UPGRADE_SMITHING_TEMPLATE2)
                .criterion(hasItem(ModItems.ETERNITE_UPGRADE_SMITHING_TEMPLATE2), conditionsFromItem(ModItems.ETERNITE_UPGRADE_SMITHING_TEMPLATE2))
                .criterion(hasItem(ModItems.ETERNITE_INGOT), conditionsFromItem(ModItems.ETERNITE_INGOT))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "eternite_upgrade_smithing_template3_1"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ETERNITE_UPGRADE_SMITHING_TEMPLATE3, 2)
                .pattern("A*A")
                .input('A', ModItems.ETERNITE_INGOT)
                .input('*', ModItems.ETERNITE_UPGRADE_SMITHING_TEMPLATE3)
                .criterion(hasItem(ModItems.ETERNITE_UPGRADE_SMITHING_TEMPLATE3), conditionsFromItem(ModItems.ETERNITE_UPGRADE_SMITHING_TEMPLATE3))
                .criterion(hasItem(ModItems.ETERNITE_INGOT), conditionsFromItem(ModItems.ETERNITE_INGOT))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "eternite_upgrade_smithing_template3_2"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ETERNITE_UPGRADE_SMITHING_TEMPLATE4)
                .pattern("A*A")
                .input('A', ModItems.ETERNITE_INGOT)
                .input('*', ModItems.ETERNITE_UPGRADE_SMITHING_TEMPLATE3)
                .criterion(hasItem(ModItems.ETERNITE_UPGRADE_SMITHING_TEMPLATE3), conditionsFromItem(ModItems.ETERNITE_UPGRADE_SMITHING_TEMPLATE3))
                .criterion(hasItem(ModItems.ETERNITE_INGOT), conditionsFromItem(ModItems.ETERNITE_INGOT))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "eternite_upgrade_smithing_template4_1"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ETERNITE_UPGRADE_SMITHING_TEMPLATE4, 2)
                .pattern("A*A")
                .input('A', ModItems.ETERNITE_INGOT)
                .input('*', ModItems.ETERNITE_UPGRADE_SMITHING_TEMPLATE4)
                .criterion(hasItem(ModItems.ETERNITE_UPGRADE_SMITHING_TEMPLATE4), conditionsFromItem(ModItems.ETERNITE_UPGRADE_SMITHING_TEMPLATE4))
                .criterion(hasItem(ModItems.ETERNITE_INGOT), conditionsFromItem(ModItems.ETERNITE_INGOT))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "eternite_upgrade_smithing_template4_2"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ETERNITE_UPGRADE_SMITHING_TEMPLATE5)
                .pattern("A*A")
                .input('A', ModItems.ETERNITE_INGOT)
                .input('*', ModItems.ETERNITE_UPGRADE_SMITHING_TEMPLATE4)
                .criterion(hasItem(ModItems.ETERNITE_UPGRADE_SMITHING_TEMPLATE4), conditionsFromItem(ModItems.ETERNITE_UPGRADE_SMITHING_TEMPLATE4))
                .criterion(hasItem(ModItems.ETERNITE_INGOT), conditionsFromItem(ModItems.ETERNITE_INGOT))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "eternite_upgrade_smithing_template5_1"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ETERNITE_UPGRADE_SMITHING_TEMPLATE5, 2)
                .pattern("A*A")
                .input('A', ModItems.ETERNITE_INGOT)
                .input('*', ModItems.ETERNITE_UPGRADE_SMITHING_TEMPLATE5)
                .criterion(hasItem(ModItems.ETERNITE_UPGRADE_SMITHING_TEMPLATE5), conditionsFromItem(ModItems.ETERNITE_UPGRADE_SMITHING_TEMPLATE5))
                .criterion(hasItem(ModItems.ETERNITE_INGOT), conditionsFromItem(ModItems.ETERNITE_INGOT))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "eternite_upgrade_smithing_template5_2"));

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.AETHERITE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(ModItems.NETHERITE_KATANA),
                        Ingredient.ofItems(ModItems.AETHERITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.AETHERITE_KATANA1
                ).criterion("has_netherite_katana", conditionsFromItem(ModItems.NETHERITE_KATANA))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "aetherite_katana1"));

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.AETHERITE_UPGRADE_SMITHING_TEMPLATE2),
                        Ingredient.ofItems(ModItems.AETHERITE_KATANA1),
                        Ingredient.ofItems(ModItems.AETHERITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.AETHERITE_KATANA2
                ).criterion("has_aetherite_katana1", conditionsFromItem(ModItems.AETHERITE_KATANA2))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "aetherite_katana2"));

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.AETHERITE_UPGRADE_SMITHING_TEMPLATE3),
                        Ingredient.ofItems(ModItems.AETHERITE_KATANA2),
                        Ingredient.ofItems(ModItems.AETHERITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.AETHERITE_KATANA3
                ).criterion("has_aetherite_katana2", conditionsFromItem(ModItems.AETHERITE_KATANA2))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "aetherite_katana3"));

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.AETHERITE_UPGRADE_SMITHING_TEMPLATE4),
                        Ingredient.ofItems(ModItems.AETHERITE_KATANA3),
                        Ingredient.ofItems(ModItems.AETHERITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.AETHERITE_KATANA4
                ).criterion("has_aetherite_katana3", conditionsFromItem(ModItems.AETHERITE_KATANA3))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "aetherite_katana4"));

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.AETHERITE_UPGRADE_SMITHING_TEMPLATE5),
                        Ingredient.ofItems(ModItems.AETHERITE_KATANA4),
                        Ingredient.ofItems(ModItems.AETHERITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.AETHERITE_KATANA5
                ).criterion("has_aetherite_katana4", conditionsFromItem(ModItems.AETHERITE_KATANA4))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "aetherite_katana5"));

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.AETHERITE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(Items.NETHERITE_AXE),
                        Ingredient.ofItems(ModItems.AETHERITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.AETHERITE_AXE
                ).criterion("has_netherite_axe", conditionsFromItem(Items.NETHERITE_AXE))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "aetherite_axe"));
        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.AETHERITE_UPGRADE_SMITHING_TEMPLATE2),
                        Ingredient.ofItems(ModItems.AETHERITE_AXE),
                        Ingredient.ofItems(ModItems.AETHERITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.AETHERITE_AXE2
                ).criterion("has_aetherite_axe", conditionsFromItem(ModItems.AETHERITE_AXE))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "aetherite_axe2"));
        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.AETHERITE_UPGRADE_SMITHING_TEMPLATE3),
                        Ingredient.ofItems(ModItems.AETHERITE_AXE2),
                        Ingredient.ofItems(ModItems.AETHERITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.AETHERITE_AXE3
                ).criterion("has_aetherite_axe2", conditionsFromItem(ModItems.AETHERITE_AXE))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "aetherite_axe3"));
        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.AETHERITE_UPGRADE_SMITHING_TEMPLATE4),
                        Ingredient.ofItems(ModItems.AETHERITE_AXE3),
                        Ingredient.ofItems(ModItems.AETHERITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.AETHERITE_AXE4
                ).criterion("has_aetherite_axe3", conditionsFromItem(ModItems.AETHERITE_AXE))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "aetherite_axe4"));
        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.AETHERITE_UPGRADE_SMITHING_TEMPLATE5),
                        Ingredient.ofItems(ModItems.AETHERITE_AXE4),
                        Ingredient.ofItems(ModItems.AETHERITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.AETHERITE_AXE5
                ).criterion("has_aetherite_axe4", conditionsFromItem(ModItems.AETHERITE_AXE))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "aetherite_axe5"));


        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.AETHERITE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(Items.NETHERITE_PICKAXE),
                        Ingredient.ofItems(ModItems.AETHERITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.AETHERITE_PICKAXE
                ).criterion("has_netherite_pickaxe", conditionsFromItem(Items.NETHERITE_PICKAXE))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "aetherite_pickaxe"));
        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.AETHERITE_UPGRADE_SMITHING_TEMPLATE2),
                        Ingredient.ofItems(ModItems.AETHERITE_PICKAXE),
                        Ingredient.ofItems(ModItems.AETHERITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.AETHERITE_PICKAXE2
                ).criterion("has_aetherite_pickaxe", conditionsFromItem(ModItems.AETHERITE_PICKAXE))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "aetherite_pickaxe2"));
        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.AETHERITE_UPGRADE_SMITHING_TEMPLATE3),
                        Ingredient.ofItems(ModItems.AETHERITE_PICKAXE2),
                        Ingredient.ofItems(ModItems.AETHERITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.AETHERITE_PICKAXE3
                ).criterion("has_aetherite_pickaxe2", conditionsFromItem(ModItems.AETHERITE_PICKAXE2))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "aetherite_pickaxe3"));
        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.AETHERITE_UPGRADE_SMITHING_TEMPLATE4),
                        Ingredient.ofItems(ModItems.AETHERITE_PICKAXE3),
                        Ingredient.ofItems(ModItems.AETHERITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.AETHERITE_PICKAXE4
                ).criterion("has_aetherite_pickaxe3", conditionsFromItem(ModItems.AETHERITE_PICKAXE3))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "aetherite_pickaxe4"));
        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.AETHERITE_UPGRADE_SMITHING_TEMPLATE5),
                        Ingredient.ofItems(ModItems.AETHERITE_PICKAXE4),
                        Ingredient.ofItems(ModItems.AETHERITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.AETHERITE_PICKAXE5
                ).criterion("has_aetherite_pickaxe4", conditionsFromItem(ModItems.AETHERITE_PICKAXE4))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "aetherite_pickaxe5"));

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.AETHERITE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(Items.NETHERITE_SHOVEL),
                        Ingredient.ofItems(ModItems.AETHERITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.AETHERITE_SHOVEL
                ).criterion("has_netherite_shovel", conditionsFromItem(Items.NETHERITE_SHOVEL))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "aetherite_shovel"));
        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.AETHERITE_UPGRADE_SMITHING_TEMPLATE2),
                        Ingredient.ofItems(ModItems.AETHERITE_SHOVEL),
                        Ingredient.ofItems(ModItems.AETHERITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.AETHERITE_SHOVEL2
                ).criterion("has_aetherite_shovel", conditionsFromItem(ModItems.AETHERITE_SHOVEL))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "aetherite_shovel2"));
        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.AETHERITE_UPGRADE_SMITHING_TEMPLATE3),
                        Ingredient.ofItems(ModItems.AETHERITE_SHOVEL2),
                        Ingredient.ofItems(ModItems.AETHERITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.AETHERITE_SHOVEL3
                ).criterion("has_aetherite_shovel2", conditionsFromItem(ModItems.AETHERITE_SHOVEL2))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "aetherite_shovel3"));
        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.AETHERITE_UPGRADE_SMITHING_TEMPLATE4),
                        Ingredient.ofItems(ModItems.AETHERITE_SHOVEL3),
                        Ingredient.ofItems(ModItems.AETHERITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.AETHERITE_SHOVEL4
                ).criterion("has_aetherite_shovel3", conditionsFromItem(ModItems.AETHERITE_SHOVEL3))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "aetherite_shovel4"));
        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.AETHERITE_UPGRADE_SMITHING_TEMPLATE5),
                        Ingredient.ofItems(ModItems.AETHERITE_SHOVEL4),
                        Ingredient.ofItems(ModItems.AETHERITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.AETHERITE_SHOVEL5
                ).criterion("has_aetherite_shovel4", conditionsFromItem(ModItems.AETHERITE_SHOVEL4))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "aetherite_shovel5"));

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.AETHERITE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(Items.NETHERITE_HOE),
                        Ingredient.ofItems(ModItems.AETHERITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.AETHERITE_HOE
                ).criterion("has_netherite_hoe", conditionsFromItem(Items.NETHERITE_HOE))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "aetherite_hoe"));
        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.AETHERITE_UPGRADE_SMITHING_TEMPLATE2),
                        Ingredient.ofItems(ModItems.AETHERITE_HOE),
                        Ingredient.ofItems(ModItems.AETHERITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.AETHERITE_HOE2
                ).criterion("has_aetherite_hoe", conditionsFromItem(ModItems.AETHERITE_HOE))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "aetherite_hoe2"));
        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.AETHERITE_UPGRADE_SMITHING_TEMPLATE2),
                        Ingredient.ofItems(ModItems.AETHERITE_HOE2),
                        Ingredient.ofItems(ModItems.AETHERITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.AETHERITE_HOE3
                ).criterion("has_aetherite_hoe2", conditionsFromItem(ModItems.AETHERITE_HOE2))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "aetherite_hoe3"));
        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.AETHERITE_UPGRADE_SMITHING_TEMPLATE2),
                        Ingredient.ofItems(ModItems.AETHERITE_HOE3),
                        Ingredient.ofItems(ModItems.AETHERITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.AETHERITE_HOE4
                ).criterion("has_aetherite_hoe3", conditionsFromItem(ModItems.AETHERITE_HOE3))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "aetherite_hoe4"));
        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.AETHERITE_UPGRADE_SMITHING_TEMPLATE2),
                        Ingredient.ofItems(ModItems.AETHERITE_HOE4),
                        Ingredient.ofItems(ModItems.AETHERITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.AETHERITE_HOE5
                ).criterion("has_aetherite_hoe4", conditionsFromItem(ModItems.AETHERITE_HOE4))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "aetherite_hoe5"));

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.TITANITE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(ModItems.AETHERITE_KATANA5),
                        Ingredient.ofItems(ModItems.TITANITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.TITANITE_KATANA1
                ).criterion("has_aetherite_katana5", conditionsFromItem(ModItems.AETHERITE_KATANA5))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "titanite_katana1"));

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.TITANITE_UPGRADE_SMITHING_TEMPLATE2),
                        Ingredient.ofItems(ModItems.TITANITE_KATANA1),
                        Ingredient.ofItems(ModItems.TITANITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.TITANITE_KATANA2
                ).criterion("has_titanite_katana", conditionsFromItem(ModItems.TITANITE_KATANA1))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "titanite_katana2"));

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.TITANITE_UPGRADE_SMITHING_TEMPLATE3),
                        Ingredient.ofItems(ModItems.TITANITE_KATANA2),
                        Ingredient.ofItems(ModItems.TITANITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.TITANITE_KATANA3
                ).criterion("has_titanite_katana2", conditionsFromItem(ModItems.TITANITE_KATANA2))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "titanite_katana3"));

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.TITANITE_UPGRADE_SMITHING_TEMPLATE4),
                        Ingredient.ofItems(ModItems.TITANITE_KATANA3),
                        Ingredient.ofItems(ModItems.TITANITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.TITANITE_KATANA4
                ).criterion("has_titanite_katana3", conditionsFromItem(ModItems.TITANITE_KATANA3))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "titanite_katana4"));

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.TITANITE_UPGRADE_SMITHING_TEMPLATE5),
                        Ingredient.ofItems(ModItems.TITANITE_KATANA4),
                        Ingredient.ofItems(ModItems.TITANITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.TITANITE_KATANA5
                ).criterion("has_titanite_katana4", conditionsFromItem(ModItems.TITANITE_KATANA4))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "titanite_katana5"));

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.TITANITE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(ModItems.AETHERITE_AXE5),
                        Ingredient.ofItems(ModItems.TITANITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.TITANITE_AXE
                ).criterion("has_aetherite_axe5", conditionsFromItem(ModItems.AETHERITE_AXE5))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "titanite_axe"));
        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.TITANITE_UPGRADE_SMITHING_TEMPLATE2),
                        Ingredient.ofItems(ModItems.TITANITE_AXE),
                        Ingredient.ofItems(ModItems.TITANITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.TITANITE_AXE2
                ).criterion("has_titanite_axe", conditionsFromItem(ModItems.TITANITE_AXE))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "titanite_axe2"));
        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.TITANITE_UPGRADE_SMITHING_TEMPLATE3),
                        Ingredient.ofItems(ModItems.TITANITE_AXE2),
                        Ingredient.ofItems(ModItems.TITANITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.TITANITE_AXE3
                ).criterion("has_titanite_axe2", conditionsFromItem(ModItems.TITANITE_AXE2))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "titanite_axe3"));
        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.TITANITE_UPGRADE_SMITHING_TEMPLATE4),
                        Ingredient.ofItems(ModItems.TITANITE_AXE3),
                        Ingredient.ofItems(ModItems.TITANITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.TITANITE_AXE4
                ).criterion("has_titanite_axe3", conditionsFromItem(ModItems.TITANITE_AXE3))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "titanite_axe4"));
        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.TITANITE_UPGRADE_SMITHING_TEMPLATE5),
                        Ingredient.ofItems(ModItems.TITANITE_AXE4),
                        Ingredient.ofItems(ModItems.TITANITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.TITANITE_AXE5
                ).criterion("has_titanite_axe4", conditionsFromItem(ModItems.TITANITE_AXE4))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "titanite_axe5"));

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.TITANITE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(ModItems.AETHERITE_PICKAXE5),
                        Ingredient.ofItems(ModItems.TITANITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.TITANITE_PICKAXE
                ).criterion("has_aetherite_pickaxe5", conditionsFromItem(ModItems.AETHERITE_PICKAXE5))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "titanite_pickaxe"));
        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.TITANITE_UPGRADE_SMITHING_TEMPLATE2),
                        Ingredient.ofItems(ModItems.TITANITE_PICKAXE),
                        Ingredient.ofItems(ModItems.TITANITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.TITANITE_PICKAXE2
                ).criterion("has_titanite_pickaxe", conditionsFromItem(ModItems.TITANITE_PICKAXE))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "titanite_pickaxe2"));
        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.TITANITE_UPGRADE_SMITHING_TEMPLATE3),
                        Ingredient.ofItems(ModItems.TITANITE_PICKAXE2),
                        Ingredient.ofItems(ModItems.TITANITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.TITANITE_PICKAXE3
                ).criterion("has_titanite_pickaxe2", conditionsFromItem(ModItems.TITANITE_PICKAXE2))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "titanite_pickaxe3"));
        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.TITANITE_UPGRADE_SMITHING_TEMPLATE4),
                        Ingredient.ofItems(ModItems.TITANITE_PICKAXE3),
                        Ingredient.ofItems(ModItems.TITANITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.TITANITE_PICKAXE4
                ).criterion("has_titanite_pickaxe3", conditionsFromItem(ModItems.TITANITE_PICKAXE3))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "titanite_pickaxe4"));
        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.TITANITE_UPGRADE_SMITHING_TEMPLATE5),
                        Ingredient.ofItems(ModItems.TITANITE_PICKAXE4),
                        Ingredient.ofItems(ModItems.TITANITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.TITANITE_PICKAXE5
                ).criterion("has_titanite_pickaxe4", conditionsFromItem(ModItems.TITANITE_PICKAXE4))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "titanite_pickaxe5"));

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.TITANITE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(ModItems.AETHERITE_SHOVEL5),
                        Ingredient.ofItems(ModItems.TITANITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.TITANITE_SHOVEL
                ).criterion("has_aetherite_shovel5", conditionsFromItem(ModItems.AETHERITE_SHOVEL5))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "titanite_shovel"));
        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.TITANITE_UPGRADE_SMITHING_TEMPLATE2),
                        Ingredient.ofItems(ModItems.TITANITE_SHOVEL),
                        Ingredient.ofItems(ModItems.TITANITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.TITANITE_SHOVEL2
                ).criterion("has_titanite_shovel", conditionsFromItem(ModItems.TITANITE_SHOVEL))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "titanite_shovel2"));
        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.TITANITE_UPGRADE_SMITHING_TEMPLATE3),
                        Ingredient.ofItems(ModItems.TITANITE_SHOVEL2),
                        Ingredient.ofItems(ModItems.TITANITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.TITANITE_SHOVEL3
                ).criterion("has_titanite_shovel2", conditionsFromItem(ModItems.TITANITE_SHOVEL2))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "titanite_shovel3"));
        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.TITANITE_UPGRADE_SMITHING_TEMPLATE4),
                        Ingredient.ofItems(ModItems.TITANITE_SHOVEL3),
                        Ingredient.ofItems(ModItems.TITANITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.TITANITE_SHOVEL4
                ).criterion("has_titanite_shovel3", conditionsFromItem(ModItems.TITANITE_SHOVEL3))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "titanite_shovel4"));
        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.TITANITE_UPGRADE_SMITHING_TEMPLATE5),
                        Ingredient.ofItems(ModItems.TITANITE_SHOVEL4),
                        Ingredient.ofItems(ModItems.TITANITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.TITANITE_SHOVEL5
                ).criterion("has_titanite_shovel4", conditionsFromItem(ModItems.TITANITE_SHOVEL4))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "titanite_shovel5"));

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.TITANITE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(ModItems.AETHERITE_HOE),
                        Ingredient.ofItems(ModItems.TITANITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.TITANITE_HOE
                ).criterion("has_aetherite_hoe", conditionsFromItem(ModItems.AETHERITE_HOE))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "titanite_hoe"));
        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.TITANITE_UPGRADE_SMITHING_TEMPLATE2),
                        Ingredient.ofItems(ModItems.TITANITE_HOE),
                        Ingredient.ofItems(ModItems.TITANITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.TITANITE_HOE2
                ).criterion("has_titanite_hoe", conditionsFromItem(ModItems.TITANITE_HOE))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "titanite_hoe2"));
        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.TITANITE_UPGRADE_SMITHING_TEMPLATE3),
                        Ingredient.ofItems(ModItems.TITANITE_HOE2),
                        Ingredient.ofItems(ModItems.TITANITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.TITANITE_HOE3
                ).criterion("has_titanite_hoe2", conditionsFromItem(ModItems.TITANITE_HOE2))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "titanite_hoe3"));
        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.TITANITE_UPGRADE_SMITHING_TEMPLATE4),
                        Ingredient.ofItems(ModItems.TITANITE_HOE3),
                        Ingredient.ofItems(ModItems.TITANITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.TITANITE_HOE4
                ).criterion("has_titanite_hoe3", conditionsFromItem(ModItems.TITANITE_HOE3))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "titanite_hoe4"));
        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.TITANITE_UPGRADE_SMITHING_TEMPLATE5),
                        Ingredient.ofItems(ModItems.TITANITE_HOE4),
                        Ingredient.ofItems(ModItems.TITANITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.TITANITE_HOE5
                ).criterion("has_titanite_hoe4", conditionsFromItem(ModItems.TITANITE_HOE4))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "titanite_hoe5"));

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.ETERNITE_UPGRADE_SMITHING_TEMPLATE1),
                        Ingredient.ofItems(ModItems.TITANITE_KATANA5),
                        Ingredient.ofItems(ModItems.ETERNITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.ETERNITE_KATANA1
                ).criterion("has_titanite_katana5", conditionsFromItem(ModItems.TITANITE_KATANA5))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "eternite_katana1"));

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.ETERNITE_UPGRADE_SMITHING_TEMPLATE2),
                        Ingredient.ofItems(ModItems.ETERNITE_KATANA1),
                        Ingredient.ofItems(ModItems.ETERNITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.ETERNITE_KATANA2
                ).criterion("has_eternite_katana1", conditionsFromItem(ModItems.ETERNITE_KATANA1))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "eternite_katana2"));

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.ETERNITE_UPGRADE_SMITHING_TEMPLATE3),
                        Ingredient.ofItems(ModItems.ETERNITE_KATANA2),
                        Ingredient.ofItems(ModItems.ETERNITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.ETERNITE_KATANA3
                ).criterion("has_eternite_katana2", conditionsFromItem(ModItems.ETERNITE_KATANA2))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "eternite_katana3"));

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.ETERNITE_UPGRADE_SMITHING_TEMPLATE4),
                        Ingredient.ofItems(ModItems.ETERNITE_KATANA3),
                        Ingredient.ofItems(ModItems.ETERNITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.ETERNITE_KATANA4
                ).criterion("has_eternite_katana3", conditionsFromItem(ModItems.ETERNITE_KATANA3))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "eternite_katana4"));

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.ETERNITE_UPGRADE_SMITHING_TEMPLATE5),
                        Ingredient.ofItems(ModItems.ETERNITE_KATANA4),
                        Ingredient.ofItems(ModItems.ETERNITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.ETERNITE_KATANA5
                ).criterion("has_eternite_katana4", conditionsFromItem(ModItems.ETERNITE_KATANA4))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "eternite_katana5"));

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.ETERNITE_UPGRADE_SMITHING_TEMPLATE1),
                        Ingredient.ofItems(ModItems.TITANITE_AXE5),
                        Ingredient.ofItems(ModItems.ETERNITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.ETERNITE_AXE1
                ).criterion("has_titanite_axe5", conditionsFromItem(ModItems.TITANITE_AXE5))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "eternite_axe1"));
        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.ETERNITE_UPGRADE_SMITHING_TEMPLATE2),
                        Ingredient.ofItems(ModItems.ETERNITE_AXE1),
                        Ingredient.ofItems(ModItems.ETERNITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.ETERNITE_AXE2
                ).criterion("has_eternite_axe1", conditionsFromItem(ModItems.ETERNITE_AXE1))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "eternite_axe2"));
        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.ETERNITE_UPGRADE_SMITHING_TEMPLATE3),
                        Ingredient.ofItems(ModItems.ETERNITE_AXE2),
                        Ingredient.ofItems(ModItems.ETERNITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.ETERNITE_AXE3
                ).criterion("has_eternite_axe2", conditionsFromItem(ModItems.ETERNITE_AXE2))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "eternite_axe3"));
        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.ETERNITE_UPGRADE_SMITHING_TEMPLATE4),
                        Ingredient.ofItems(ModItems.ETERNITE_AXE3),
                        Ingredient.ofItems(ModItems.ETERNITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.ETERNITE_AXE4
                ).criterion("has_eternite_axe3", conditionsFromItem(ModItems.ETERNITE_AXE3))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "eternite_axe4"));
        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.ETERNITE_UPGRADE_SMITHING_TEMPLATE5),
                        Ingredient.ofItems(ModItems.ETERNITE_AXE4),
                        Ingredient.ofItems(ModItems.ETERNITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.ETERNITE_AXE5
                ).criterion("has_eternite_axe4", conditionsFromItem(ModItems.ETERNITE_AXE4))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "eternite_axe5"));

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.ETERNITE_UPGRADE_SMITHING_TEMPLATE1),
                        Ingredient.ofItems(ModItems.TITANITE_PICKAXE5),
                        Ingredient.ofItems(ModItems.ETERNITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.ETERNITE_PICKAXE1
                ).criterion("has_titanite_pickaxe5", conditionsFromItem(ModItems.TITANITE_PICKAXE5))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "eternite_pickaxe1"));
        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.ETERNITE_UPGRADE_SMITHING_TEMPLATE2),
                        Ingredient.ofItems(ModItems.ETERNITE_PICKAXE1),
                        Ingredient.ofItems(ModItems.ETERNITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.ETERNITE_PICKAXE2
                ).criterion("has_eternite_pickaxe1", conditionsFromItem(ModItems.ETERNITE_PICKAXE1))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "eternite_pickaxe2"));
        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.ETERNITE_UPGRADE_SMITHING_TEMPLATE3),
                        Ingredient.ofItems(ModItems.ETERNITE_PICKAXE2),
                        Ingredient.ofItems(ModItems.ETERNITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.ETERNITE_PICKAXE3
                ).criterion("has_eternite_pickaxe2", conditionsFromItem(ModItems.ETERNITE_PICKAXE2))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "eternite_pickaxe3"));
        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.ETERNITE_UPGRADE_SMITHING_TEMPLATE4),
                        Ingredient.ofItems(ModItems.ETERNITE_PICKAXE3),
                        Ingredient.ofItems(ModItems.ETERNITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.ETERNITE_PICKAXE4
                ).criterion("has_eternite_pickaxe3", conditionsFromItem(ModItems.ETERNITE_PICKAXE3))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "eternite_pickaxe4"));
        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.ETERNITE_UPGRADE_SMITHING_TEMPLATE5),
                        Ingredient.ofItems(ModItems.ETERNITE_PICKAXE4),
                        Ingredient.ofItems(ModItems.ETERNITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.ETERNITE_PICKAXE5
                ).criterion("has_eternite_pickaxe4", conditionsFromItem(ModItems.ETERNITE_PICKAXE4))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "eternite_pickaxe5"));

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.ETERNITE_UPGRADE_SMITHING_TEMPLATE1),
                        Ingredient.ofItems(ModItems.TITANITE_SHOVEL5),
                        Ingredient.ofItems(ModItems.ETERNITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.ETERNITE_SHOVEL1
                ).criterion("has_titanite_shovel5", conditionsFromItem(ModItems.TITANITE_SHOVEL5))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "eternite_shovel1"));
        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.ETERNITE_UPGRADE_SMITHING_TEMPLATE2),
                        Ingredient.ofItems(ModItems.ETERNITE_SHOVEL1),
                        Ingredient.ofItems(ModItems.ETERNITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.ETERNITE_SHOVEL2
                ).criterion("has_eternite_shovel1", conditionsFromItem(ModItems.ETERNITE_SHOVEL1))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "eternite_shovel2"));
        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.ETERNITE_UPGRADE_SMITHING_TEMPLATE3),
                        Ingredient.ofItems(ModItems.ETERNITE_SHOVEL2),
                        Ingredient.ofItems(ModItems.ETERNITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.ETERNITE_SHOVEL3
                ).criterion("has_eternite_shovel2", conditionsFromItem(ModItems.ETERNITE_SHOVEL2))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "eternite_shovel3"));
        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.ETERNITE_UPGRADE_SMITHING_TEMPLATE4),
                        Ingredient.ofItems(ModItems.ETERNITE_SHOVEL3),
                        Ingredient.ofItems(ModItems.ETERNITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.ETERNITE_SHOVEL4
                ).criterion("has_eternite_shovel3", conditionsFromItem(ModItems.ETERNITE_SHOVEL3))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "eternite_shovel4"));
        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.ETERNITE_UPGRADE_SMITHING_TEMPLATE5),
                        Ingredient.ofItems(ModItems.ETERNITE_SHOVEL4),
                        Ingredient.ofItems(ModItems.ETERNITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.ETERNITE_SHOVEL5
                ).criterion("has_eternite_shovel4", conditionsFromItem(ModItems.ETERNITE_SHOVEL4))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "eternite_shovel5"));

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.ETERNITE_UPGRADE_SMITHING_TEMPLATE1),
                        Ingredient.ofItems(ModItems.TITANITE_HOE5),
                        Ingredient.ofItems(ModItems.ETERNITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.ETERNITE_HOE1
                ).criterion("has_titanite_hoe5", conditionsFromItem(ModItems.TITANITE_HOE5))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "eternite_hoe1"));
        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.ETERNITE_UPGRADE_SMITHING_TEMPLATE2),
                        Ingredient.ofItems(ModItems.ETERNITE_HOE1),
                        Ingredient.ofItems(ModItems.ETERNITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.ETERNITE_HOE2
                ).criterion("has_eternite_hoe1", conditionsFromItem(ModItems.ETERNITE_HOE1))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "eternite_hoe2"));
        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.ETERNITE_UPGRADE_SMITHING_TEMPLATE3),
                        Ingredient.ofItems(ModItems.ETERNITE_HOE2),
                        Ingredient.ofItems(ModItems.ETERNITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.ETERNITE_HOE3
                ).criterion("has_eternite_hoe2", conditionsFromItem(ModItems.ETERNITE_HOE2))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "eternite_hoe3"));
        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.ETERNITE_UPGRADE_SMITHING_TEMPLATE4),
                        Ingredient.ofItems(ModItems.ETERNITE_HOE3),
                        Ingredient.ofItems(ModItems.ETERNITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.ETERNITE_HOE4
                ).criterion("has_eternite_hoe3", conditionsFromItem(ModItems.ETERNITE_HOE3))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "eternite_hoe4"));
        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.ETERNITE_UPGRADE_SMITHING_TEMPLATE5),
                        Ingredient.ofItems(ModItems.ETERNITE_HOE4),
                        Ingredient.ofItems(ModItems.ETERNITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.ETERNITE_HOE5
                ).criterion("has_eternite_hoe4", conditionsFromItem(ModItems.ETERNITE_HOE4))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "eternite_hoe5"));

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.AETHERITE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(Items.NETHERITE_HELMET),
                        Ingredient.ofItems(ModItems.AETHERITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.AETHERITE_HELMET1
                ).criterion("has_netherite_helmet", conditionsFromItem(Items.NETHERITE_HELMET))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "aetherite_helmet1"));

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.AETHERITE_UPGRADE_SMITHING_TEMPLATE2),
                        Ingredient.ofItems(ModItems.AETHERITE_HELMET1),
                        Ingredient.ofItems(ModItems.AETHERITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.AETHERITE_HELMET2
                ).criterion("has_aetherite_helmet1", conditionsFromItem(ModItems.AETHERITE_HELMET1))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "aetherite_helmet2"));

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.AETHERITE_UPGRADE_SMITHING_TEMPLATE3),
                        Ingredient.ofItems(ModItems.AETHERITE_HELMET2),
                        Ingredient.ofItems(ModItems.AETHERITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.AETHERITE_HELMET3
                ).criterion("has_aetherite_helmet2", conditionsFromItem(ModItems.AETHERITE_HELMET2))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "aetherite_helmet3"));

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.AETHERITE_UPGRADE_SMITHING_TEMPLATE4),
                        Ingredient.ofItems(ModItems.AETHERITE_HELMET3),
                        Ingredient.ofItems(ModItems.AETHERITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.AETHERITE_HELMET4
                ).criterion("has_aetherite_helmet3", conditionsFromItem(ModItems.AETHERITE_HELMET3))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "aetherite_helmet4"));

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.AETHERITE_UPGRADE_SMITHING_TEMPLATE5),
                        Ingredient.ofItems(ModItems.AETHERITE_HELMET4),
                        Ingredient.ofItems(ModItems.AETHERITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.AETHERITE_HELMET5
                ).criterion("has_aetherite_helmet4", conditionsFromItem(ModItems.AETHERITE_HELMET4))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "aetherite_helmet5"));

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.AETHERITE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(Items.NETHERITE_CHESTPLATE),
                        Ingredient.ofItems(ModItems.AETHERITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.AETHERITE_CHESTPLATE1
                ).criterion("has_netherite_chestplate", conditionsFromItem(Items.NETHERITE_CHESTPLATE))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "aetherite_chestplate1"));

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.AETHERITE_UPGRADE_SMITHING_TEMPLATE2),
                        Ingredient.ofItems(ModItems.AETHERITE_CHESTPLATE1),
                        Ingredient.ofItems(ModItems.AETHERITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.AETHERITE_CHESTPLATE2
                ).criterion("has_aetherite_chestplate1", conditionsFromItem(ModItems.AETHERITE_CHESTPLATE1))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "aetherite_chestplate2"));

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.AETHERITE_UPGRADE_SMITHING_TEMPLATE3),
                        Ingredient.ofItems(ModItems.AETHERITE_CHESTPLATE2),
                        Ingredient.ofItems(ModItems.AETHERITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.AETHERITE_CHESTPLATE3
                ).criterion("has_aetherite_chestplate2", conditionsFromItem(ModItems.AETHERITE_CHESTPLATE2))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "aetherite_chestplate3"));

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.AETHERITE_UPGRADE_SMITHING_TEMPLATE4),
                        Ingredient.ofItems(ModItems.AETHERITE_CHESTPLATE3),
                        Ingredient.ofItems(ModItems.AETHERITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.AETHERITE_CHESTPLATE4
                ).criterion("has_aetherite_chestplate3", conditionsFromItem(ModItems.AETHERITE_CHESTPLATE3))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "aetherite_chestplate4"));

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.AETHERITE_UPGRADE_SMITHING_TEMPLATE5),
                        Ingredient.ofItems(ModItems.AETHERITE_CHESTPLATE4),
                        Ingredient.ofItems(ModItems.AETHERITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.AETHERITE_CHESTPLATE5
                ).criterion("has_aetherite_chestplate4", conditionsFromItem(ModItems.AETHERITE_CHESTPLATE4))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "aetherite_chestplate5"));

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.AETHERITE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(Items.NETHERITE_LEGGINGS),
                        Ingredient.ofItems(ModItems.AETHERITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.AETHERITE_LEGGINGS1
                ).criterion("has_netherite_leggings", conditionsFromItem(Items.NETHERITE_LEGGINGS))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "aetherite_leggings1"));

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.AETHERITE_UPGRADE_SMITHING_TEMPLATE2),
                        Ingredient.ofItems(ModItems.AETHERITE_LEGGINGS1),
                        Ingredient.ofItems(ModItems.AETHERITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.AETHERITE_LEGGINGS2
                ).criterion("has_aetherite_leggings1", conditionsFromItem(ModItems.AETHERITE_LEGGINGS1))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "aetherite_leggings2"));

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.AETHERITE_UPGRADE_SMITHING_TEMPLATE3),
                        Ingredient.ofItems(ModItems.AETHERITE_LEGGINGS2),
                        Ingredient.ofItems(ModItems.AETHERITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.AETHERITE_LEGGINGS3
                ).criterion("has_aetherite_leggings2", conditionsFromItem(ModItems.AETHERITE_LEGGINGS2))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "aetherite_leggings3"));

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.AETHERITE_UPGRADE_SMITHING_TEMPLATE4),
                        Ingredient.ofItems(ModItems.AETHERITE_LEGGINGS3),
                        Ingredient.ofItems(ModItems.AETHERITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.AETHERITE_LEGGINGS4
                ).criterion("has_aetherite_leggings3", conditionsFromItem(ModItems.AETHERITE_LEGGINGS3))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "aetherite_leggings4"));

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.AETHERITE_UPGRADE_SMITHING_TEMPLATE5),
                        Ingredient.ofItems(ModItems.AETHERITE_LEGGINGS4),
                        Ingredient.ofItems(ModItems.AETHERITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.AETHERITE_LEGGINGS5
                ).criterion("has_aetherite_leggings4", conditionsFromItem(ModItems.AETHERITE_LEGGINGS4))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "aetherite_leggings5"));

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.AETHERITE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(Items.NETHERITE_BOOTS),
                        Ingredient.ofItems(ModItems.AETHERITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.AETHERITE_BOOTS1
                ).criterion("has_netherite_boots", conditionsFromItem(Items.NETHERITE_BOOTS))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "aetherite_boots1"));

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.AETHERITE_UPGRADE_SMITHING_TEMPLATE2),
                        Ingredient.ofItems(ModItems.AETHERITE_BOOTS1),
                        Ingredient.ofItems(ModItems.AETHERITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.AETHERITE_BOOTS2
                ).criterion("has_aetherite_boots1", conditionsFromItem(ModItems.AETHERITE_BOOTS1))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "aetherite_boots2"));

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.AETHERITE_UPGRADE_SMITHING_TEMPLATE3),
                        Ingredient.ofItems(ModItems.AETHERITE_BOOTS2),
                        Ingredient.ofItems(ModItems.AETHERITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.AETHERITE_BOOTS3
                ).criterion("has_aetherite_boots2", conditionsFromItem(ModItems.AETHERITE_BOOTS2))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "aetherite_boots3"));

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.AETHERITE_UPGRADE_SMITHING_TEMPLATE4),
                        Ingredient.ofItems(ModItems.AETHERITE_BOOTS3),
                        Ingredient.ofItems(ModItems.AETHERITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.AETHERITE_BOOTS4
                ).criterion("has_aetherite_boots3", conditionsFromItem(ModItems.AETHERITE_BOOTS3))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "aetherite_boots4"));

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.AETHERITE_UPGRADE_SMITHING_TEMPLATE5),
                        Ingredient.ofItems(ModItems.AETHERITE_BOOTS4),
                        Ingredient.ofItems(ModItems.AETHERITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.AETHERITE_BOOTS5
                ).criterion("has_aetherite_boots4", conditionsFromItem(ModItems.AETHERITE_BOOTS4))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "aetherite_boots5"));

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.TITANITE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(ModItems.AETHERITE_HELMET5),
                        Ingredient.ofItems(ModItems.TITANITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.TITANITE_HELMET1
                ).criterion("has_aetherite_helmet5", conditionsFromItem(ModItems.AETHERITE_HELMET5))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "titanite_helmet1"));

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.TITANITE_UPGRADE_SMITHING_TEMPLATE2),
                        Ingredient.ofItems(ModItems.TITANITE_HELMET1),
                        Ingredient.ofItems(ModItems.TITANITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.TITANITE_HELMET2
                ).criterion("has_titanite_helmet1", conditionsFromItem(ModItems.TITANITE_HELMET1))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "titanite_helmet2"));

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.TITANITE_UPGRADE_SMITHING_TEMPLATE3),
                        Ingredient.ofItems(ModItems.TITANITE_HELMET2),
                        Ingredient.ofItems(ModItems.TITANITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.TITANITE_HELMET3
                ).criterion("has_titanite_helmet2", conditionsFromItem(ModItems.TITANITE_HELMET2))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "titanite_helmet3"));

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.TITANITE_UPGRADE_SMITHING_TEMPLATE4),
                        Ingredient.ofItems(ModItems.TITANITE_HELMET3),
                        Ingredient.ofItems(ModItems.TITANITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.TITANITE_HELMET4
                ).criterion("has_titanite_helmet3", conditionsFromItem(ModItems.TITANITE_HELMET3))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "titanite_helmet4"));

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.TITANITE_UPGRADE_SMITHING_TEMPLATE5),
                        Ingredient.ofItems(ModItems.TITANITE_HELMET4),
                        Ingredient.ofItems(ModItems.TITANITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.TITANITE_HELMET5
                ).criterion("has_titanite_helmet4", conditionsFromItem(ModItems.TITANITE_HELMET4))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "titanite_helmet5"));

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.TITANITE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(ModItems.AETHERITE_CHESTPLATE5),
                        Ingredient.ofItems(ModItems.TITANITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.TITANITE_CHESTPLATE1
                ).criterion("has_aetherite_chestplate5", conditionsFromItem(ModItems.AETHERITE_CHESTPLATE5))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "titanite_chestplate1"));

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.TITANITE_UPGRADE_SMITHING_TEMPLATE2),
                        Ingredient.ofItems(ModItems.TITANITE_CHESTPLATE1),
                        Ingredient.ofItems(ModItems.TITANITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.TITANITE_CHESTPLATE2
                ).criterion("has_titanite_chestplate1", conditionsFromItem(ModItems.TITANITE_CHESTPLATE1))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "titanite_chestplate2"));

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.TITANITE_UPGRADE_SMITHING_TEMPLATE3),
                        Ingredient.ofItems(ModItems.TITANITE_CHESTPLATE2),
                        Ingredient.ofItems(ModItems.TITANITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.TITANITE_CHESTPLATE3
                ).criterion("has_titanite_chestplate2", conditionsFromItem(ModItems.TITANITE_CHESTPLATE2))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "titanite_chestplate3"));

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.TITANITE_UPGRADE_SMITHING_TEMPLATE4),
                        Ingredient.ofItems(ModItems.TITANITE_CHESTPLATE3),
                        Ingredient.ofItems(ModItems.TITANITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.TITANITE_CHESTPLATE4
                ).criterion("has_titanite_chestplate3", conditionsFromItem(ModItems.TITANITE_CHESTPLATE3))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "titanite_chestplate4"));

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.TITANITE_UPGRADE_SMITHING_TEMPLATE5),
                        Ingredient.ofItems(ModItems.TITANITE_CHESTPLATE4),
                        Ingredient.ofItems(ModItems.TITANITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.TITANITE_CHESTPLATE5
                ).criterion("has_titanite_chestplate4", conditionsFromItem(ModItems.TITANITE_CHESTPLATE4))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "titanite_chestplate5"));

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.TITANITE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(ModItems.AETHERITE_LEGGINGS5),
                        Ingredient.ofItems(ModItems.TITANITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.TITANITE_LEGGINGS1
                ).criterion("has_aetherite_leggings5", conditionsFromItem(ModItems.AETHERITE_LEGGINGS5))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "titanite_leggings1"));

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.TITANITE_UPGRADE_SMITHING_TEMPLATE2),
                        Ingredient.ofItems(ModItems.TITANITE_LEGGINGS1),
                        Ingredient.ofItems(ModItems.TITANITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.TITANITE_LEGGINGS2
                ).criterion("has_titanite_leggings1", conditionsFromItem(ModItems.TITANITE_LEGGINGS1))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "titanite_leggings2"));

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.TITANITE_UPGRADE_SMITHING_TEMPLATE3),
                        Ingredient.ofItems(ModItems.TITANITE_LEGGINGS2),
                        Ingredient.ofItems(ModItems.TITANITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.TITANITE_LEGGINGS3
                ).criterion("has_titanite_leggings2", conditionsFromItem(ModItems.TITANITE_LEGGINGS2))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "titanite_leggings3"));

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.TITANITE_UPGRADE_SMITHING_TEMPLATE4),
                        Ingredient.ofItems(ModItems.TITANITE_LEGGINGS3),
                        Ingredient.ofItems(ModItems.TITANITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.TITANITE_LEGGINGS4
                ).criterion("has_titanite_leggings3", conditionsFromItem(ModItems.TITANITE_LEGGINGS3))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "titanite_leggings4"));

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.TITANITE_UPGRADE_SMITHING_TEMPLATE5),
                        Ingredient.ofItems(ModItems.TITANITE_LEGGINGS4),
                        Ingredient.ofItems(ModItems.TITANITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.TITANITE_LEGGINGS5
                ).criterion("has_titanite_leggings4", conditionsFromItem(ModItems.TITANITE_LEGGINGS4))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "titanite_leggings5"));

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.TITANITE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(ModItems.AETHERITE_BOOTS5),
                        Ingredient.ofItems(ModItems.TITANITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.TITANITE_BOOTS1
                ).criterion("has_aetherite_boots5", conditionsFromItem(ModItems.AETHERITE_BOOTS5))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "titanite_boots1"));

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.TITANITE_UPGRADE_SMITHING_TEMPLATE2),
                        Ingredient.ofItems(ModItems.TITANITE_BOOTS1),
                        Ingredient.ofItems(ModItems.TITANITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.TITANITE_BOOTS2
                ).criterion("has_titanite_boots1", conditionsFromItem(ModItems.TITANITE_BOOTS1))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "titanite_boots2"));

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.TITANITE_UPGRADE_SMITHING_TEMPLATE3),
                        Ingredient.ofItems(ModItems.TITANITE_BOOTS2),
                        Ingredient.ofItems(ModItems.TITANITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.TITANITE_BOOTS3
                ).criterion("has_titanite_boots2", conditionsFromItem(ModItems.TITANITE_BOOTS2))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "titanite_boots3"));

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.TITANITE_UPGRADE_SMITHING_TEMPLATE4),
                        Ingredient.ofItems(ModItems.TITANITE_BOOTS3),
                        Ingredient.ofItems(ModItems.TITANITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.TITANITE_BOOTS4
                ).criterion("has_titanite_boots3", conditionsFromItem(ModItems.TITANITE_BOOTS3))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "titanite_boots4"));

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.TITANITE_UPGRADE_SMITHING_TEMPLATE5),
                        Ingredient.ofItems(ModItems.TITANITE_BOOTS4),
                        Ingredient.ofItems(ModItems.TITANITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.TITANITE_BOOTS5
                ).criterion("has_titanite_boots4", conditionsFromItem(ModItems.TITANITE_BOOTS4))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "titanite_boots5"));

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.ETERNITE_UPGRADE_SMITHING_TEMPLATE1),
                        Ingredient.ofItems(ModItems.TITANITE_HELMET5),
                        Ingredient.ofItems(ModItems.ETERNITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.ETERNITE_HELMET1
                ).criterion("has_titanite_helmet5", conditionsFromItem(ModItems.TITANITE_HELMET5))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "eternite_helmet1"));

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.ETERNITE_UPGRADE_SMITHING_TEMPLATE2),
                        Ingredient.ofItems(ModItems.ETERNITE_HELMET1),
                        Ingredient.ofItems(ModItems.ETERNITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.ETERNITE_HELMET2
                ).criterion("has_eternite_helmet1", conditionsFromItem(ModItems.ETERNITE_HELMET1))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "eternite_helmet2"));

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.ETERNITE_UPGRADE_SMITHING_TEMPLATE3),
                        Ingredient.ofItems(ModItems.ETERNITE_HELMET2),
                        Ingredient.ofItems(ModItems.ETERNITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.ETERNITE_HELMET3
                ).criterion("has_titanite_helmet2", conditionsFromItem(ModItems.ETERNITE_HELMET2))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "eternite_helmet3"));

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.ETERNITE_UPGRADE_SMITHING_TEMPLATE4),
                        Ingredient.ofItems(ModItems.ETERNITE_HELMET3),
                        Ingredient.ofItems(ModItems.ETERNITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.ETERNITE_HELMET4
                ).criterion("has_eternite_helmet3", conditionsFromItem(ModItems.ETERNITE_HELMET3))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "eternite_helmet4"));

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.ETERNITE_UPGRADE_SMITHING_TEMPLATE5),
                        Ingredient.ofItems(ModItems.ETERNITE_HELMET4),
                        Ingredient.ofItems(ModItems.ETERNITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.ETERNITE_HELMET5
                ).criterion("has_eternite_helmet4", conditionsFromItem(ModItems.ETERNITE_HELMET4))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "eternite_helmet5"));

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.ETERNITE_UPGRADE_SMITHING_TEMPLATE1),
                        Ingredient.ofItems(ModItems.TITANITE_CHESTPLATE5),
                        Ingredient.ofItems(ModItems.ETERNITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.ETERNITE_CHESTPLATE1
                ).criterion("has_titanite_chestplate5", conditionsFromItem(ModItems.TITANITE_CHESTPLATE5))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "eternite_chestplate1"));

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.ETERNITE_UPGRADE_SMITHING_TEMPLATE2),
                        Ingredient.ofItems(ModItems.ETERNITE_CHESTPLATE1),
                        Ingredient.ofItems(ModItems.ETERNITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.ETERNITE_CHESTPLATE2
                ).criterion("has_eternite_chestplate1", conditionsFromItem(ModItems.ETERNITE_CHESTPLATE1))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "eternite_chestplate2"));

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.ETERNITE_UPGRADE_SMITHING_TEMPLATE3),
                        Ingredient.ofItems(ModItems.ETERNITE_CHESTPLATE2),
                        Ingredient.ofItems(ModItems.ETERNITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.ETERNITE_CHESTPLATE3
                ).criterion("has_eternite_chestplate2", conditionsFromItem(ModItems.ETERNITE_CHESTPLATE2))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "eternite_chestplate3"));

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.ETERNITE_UPGRADE_SMITHING_TEMPLATE4),
                        Ingredient.ofItems(ModItems.ETERNITE_CHESTPLATE3),
                        Ingredient.ofItems(ModItems.ETERNITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.ETERNITE_CHESTPLATE4
                ).criterion("has_eternite_chestplate3", conditionsFromItem(ModItems.ETERNITE_CHESTPLATE3))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "eternite_chestplate4"));

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.ETERNITE_UPGRADE_SMITHING_TEMPLATE5),
                        Ingredient.ofItems(ModItems.ETERNITE_CHESTPLATE4),
                        Ingredient.ofItems(ModItems.ETERNITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.ETERNITE_CHESTPLATE5
                ).criterion("has_eternite_chestplate4", conditionsFromItem(ModItems.ETERNITE_CHESTPLATE4))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "eternite_chestplate5"));

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.ETERNITE_UPGRADE_SMITHING_TEMPLATE1),
                        Ingredient.ofItems(ModItems.TITANITE_LEGGINGS5),
                        Ingredient.ofItems(ModItems.ETERNITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.ETERNITE_LEGGINGS1
                ).criterion("has_titanite_leggings5", conditionsFromItem(ModItems.TITANITE_LEGGINGS5))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "eternite_leggings1"));

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.ETERNITE_UPGRADE_SMITHING_TEMPLATE2),
                        Ingredient.ofItems(ModItems.ETERNITE_LEGGINGS1),
                        Ingredient.ofItems(ModItems.ETERNITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.ETERNITE_LEGGINGS2
                ).criterion("has_eternite_leggings1", conditionsFromItem(ModItems.ETERNITE_LEGGINGS1))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "eternite_leggings2"));

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.ETERNITE_UPGRADE_SMITHING_TEMPLATE3),
                        Ingredient.ofItems(ModItems.ETERNITE_LEGGINGS2),
                        Ingredient.ofItems(ModItems.ETERNITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.ETERNITE_LEGGINGS3
                ).criterion("has_eternite_leggings2", conditionsFromItem(ModItems.ETERNITE_LEGGINGS2))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "eternite_leggings3"));

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.ETERNITE_UPGRADE_SMITHING_TEMPLATE4),
                        Ingredient.ofItems(ModItems.ETERNITE_LEGGINGS3),
                        Ingredient.ofItems(ModItems.ETERNITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.ETERNITE_LEGGINGS4
                ).criterion("has_eternite_leggings3", conditionsFromItem(ModItems.ETERNITE_LEGGINGS3))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "eternite_leggings4"));

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.ETERNITE_UPGRADE_SMITHING_TEMPLATE5),
                        Ingredient.ofItems(ModItems.ETERNITE_LEGGINGS4),
                        Ingredient.ofItems(ModItems.ETERNITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.ETERNITE_LEGGINGS5
                ).criterion("has_eternite_leggings4", conditionsFromItem(ModItems.ETERNITE_LEGGINGS4))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "eternite_leggings5"));

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.ETERNITE_UPGRADE_SMITHING_TEMPLATE1),
                        Ingredient.ofItems(ModItems.TITANITE_BOOTS5),
                        Ingredient.ofItems(ModItems.ETERNITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.ETERNITE_BOOTS1
                ).criterion("has_titanite_boots5", conditionsFromItem(ModItems.TITANITE_BOOTS5))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "eternite_boots1"));

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.ETERNITE_UPGRADE_SMITHING_TEMPLATE2),
                        Ingredient.ofItems(ModItems.ETERNITE_BOOTS1),
                        Ingredient.ofItems(ModItems.ETERNITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.ETERNITE_BOOTS2
                ).criterion("has_eternite_boots1", conditionsFromItem(ModItems.ETERNITE_BOOTS1))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "eternite_boots2"));

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.ETERNITE_UPGRADE_SMITHING_TEMPLATE3),
                        Ingredient.ofItems(ModItems.ETERNITE_BOOTS2),
                        Ingredient.ofItems(ModItems.ETERNITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.ETERNITE_BOOTS3
                ).criterion("has_eternite_boots2", conditionsFromItem(ModItems.ETERNITE_BOOTS2))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "eternite_boots3"));

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.ETERNITE_UPGRADE_SMITHING_TEMPLATE4),
                        Ingredient.ofItems(ModItems.ETERNITE_BOOTS3),
                        Ingredient.ofItems(ModItems.ETERNITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.ETERNITE_BOOTS4
                ).criterion("has_eternite_boots3", conditionsFromItem(ModItems.ETERNITE_BOOTS3))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "eternite_boots4"));

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.ETERNITE_UPGRADE_SMITHING_TEMPLATE5),
                        Ingredient.ofItems(ModItems.ETERNITE_BOOTS4),
                        Ingredient.ofItems(ModItems.ETERNITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.ETERNITE_BOOTS5
                ).criterion("has_eternite_boots4", conditionsFromItem(ModItems.ETERNITE_BOOTS4))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "eternite_boots5"));

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.AETHERITE_UPGRADE_SMITHING_TEMPLATE5),
                        Ingredient.ofItems(Items.HEAVY_CORE),
                        Ingredient.ofItems(ModItems.AETHERITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.AETHERITE_CORE1
                ).criterion("has_heavy_core", conditionsFromItem(Items.HEAVY_CORE))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "aetherite_core1"));

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.TITANITE_UPGRADE_SMITHING_TEMPLATE5),
                        Ingredient.ofItems(ModItems.AETHERITE_CORE1),
                        Ingredient.ofItems(ModItems.TITANITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.TITANITE_CORE
                ).criterion("has_aetherite_core1", conditionsFromItem(ModItems.AETHERITE_CORE1))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "titanite_core"));

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.ETERNITE_UPGRADE_SMITHING_TEMPLATE5),
                        Ingredient.ofItems(ModItems.TITANITE_CORE),
                        Ingredient.ofItems(ModItems.ETERNITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.ETERNITE_CORE
                ).criterion("has_titanite_core", conditionsFromItem(ModItems.TITANITE_CORE))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "eternite_core"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.AETHERITE_MACE)
                .pattern("*")
                .pattern("B")
                .input('*', ModItems.AETHERITE_CORE1)
                .input('B', Items.BREEZE_ROD)
                .criterion(hasItem(ModItems.AETHERITE_CORE1), conditionsFromItem(ModItems.AETHERITE_CORE1))
                .criterion(hasItem(Items.BREEZE_ROD), conditionsFromItem(Items.BREEZE_ROD))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "aetherite_mace"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.TITANITE_MACE)
                .pattern("*")
                .pattern("B")
                .input('*', ModItems.TITANITE_CORE)
                .input('B', Items.BREEZE_ROD)
                .criterion(hasItem(ModItems.TITANITE_CORE), conditionsFromItem(ModItems.TITANITE_CORE))
                .criterion(hasItem(Items.BREEZE_ROD), conditionsFromItem(Items.BREEZE_ROD))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "titanite_mace"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ETERNITE_MACE)
                .pattern("*")
                .pattern("B")
                .input('*', ModItems.ETERNITE_CORE)
                .input('B', Items.BREEZE_ROD)
                .criterion(hasItem(ModItems.ETERNITE_CORE), conditionsFromItem(ModItems.ETERNITE_CORE))
                .criterion(hasItem(Items.BREEZE_ROD), conditionsFromItem(Items.BREEZE_ROD))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "eternite_mace"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Items.DIAMOND_HORSE_ARMOR)
                .pattern("  D")
                .pattern("DDD")
                .pattern("DDD")
                .input('D', Items.DIAMOND)
                .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "diamond_horse_armor"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Items.IRON_HORSE_ARMOR)
                .pattern("  D")
                .pattern("DDD")
                .pattern("DDD")
                .input('D', Items.IRON_INGOT)
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "iron_horse_armor"));

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(Items.DIAMOND_HORSE_ARMOR),
                        Ingredient.ofItems(Items.NETHERITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.NETHERITE_HORSE_ARMOR
                ).criterion("has_diamond_horse_armor", conditionsFromItem(Items.DIAMOND_HORSE_ARMOR))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "netherite_horse_armor"));

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.AETHERITE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(ModItems.NETHERITE_HORSE_ARMOR),
                        Ingredient.ofItems(ModItems.AETHERITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.AETHERITE_HORSE_ARMOR
                ).criterion("has_aetherite_horse_armor", conditionsFromItem(ModItems.NETHERITE_HORSE_ARMOR))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "aetherite_horse_armor"));

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.TITANITE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(ModItems.AETHERITE_HORSE_ARMOR),
                        Ingredient.ofItems(ModItems.TITANITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.TITANITE_HORSE_ARMOR
                ).criterion("has_aetherite_horse_armor", conditionsFromItem(ModItems.AETHERITE_HORSE_ARMOR))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "titanite_horse_armor"));

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.ETERNITE_UPGRADE_SMITHING_TEMPLATE1),
                        Ingredient.ofItems(ModItems.TITANITE_HORSE_ARMOR),
                        Ingredient.ofItems(ModItems.ETERNITE_INGOT),
                        RecipeCategory.MISC,
                        ModItems.ETERNITE_HORSE_ARMOR
                ).criterion("has_titanite_horse_armor", conditionsFromItem(ModItems.TITANITE_HORSE_ARMOR))
                .offerTo(recipeExporter, Identifier.of(MTWA.MOD_ID, "eternite_horse_armor"));



    }
}
