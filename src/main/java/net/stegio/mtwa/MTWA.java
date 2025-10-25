package net.stegio.mtwa;

import net.fabricmc.api.ModInitializer;
import net.kyrptonaught.customportalapi.api.CustomPortalBuilder;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Identifier;
import net.stegio.mtwa.block.ModBlocks;
import net.stegio.mtwa.block.entity.ModBlockEntities;
import net.stegio.mtwa.event.CobblestoneGeneratedCallback;
import net.stegio.mtwa.group.ModItemGroups;
import net.stegio.mtwa.item.ModItems;
import net.stegio.mtwa.util.ModLootTableModifiers;
import net.stegio.mtwa.villager.ModVillagers;
import net.stegio.mtwa.world.gen.ModWorldGeneration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MTWA implements ModInitializer {
	public static final String MOD_ID = "mtwa";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
        ModItems.registerModItems();
        ModBlocks.registerModBlock();
        ModItemGroups.registerItemGroups();
        ModWorldGeneration.generateModWorldGen();
        ModBlockEntities.registerBlockEntities();
        ModVillagers.registerVillagers();
        ModLootTableModifiers.modifyLootTables();
        CobblestoneGeneratedCallback.EVENT.register((CobblestoneGeneratedCallback)(world, pos) -> {
            Block block = world.getBlockState(pos).getBlock() == Blocks.OBSIDIAN ? Blocks.OBSIDIAN : (pos.getY() > 0 ? Blocks.COBBLESTONE : Blocks.COBBLED_DEEPSLATE);
            world.setBlockState(pos, block.getDefaultState());
            return ActionResult.PASS;
        });
        CustomPortalBuilder.beginPortal()
                .frameBlock(Blocks.TUFF)
                .lightWithItem(ModItems.ESSENCE_OF_THE_SKY)
                .destDimID(Identifier.of(MTWA.MOD_ID, "aetherite_dim"))
                .tintColor(88, 41, 118)
                .registerPortal();
        CustomPortalBuilder.beginPortal()
                .frameBlock(Blocks.STONE)
                .lightWithItem(ModItems.ESSENCE_OF_THE_SUN)
                .destDimID(Identifier.of(MTWA.MOD_ID, "titanite_dim"))
                .tintColor(0x660000)
                .registerPortal();
        CustomPortalBuilder.beginPortal()
                .frameBlock(Blocks.DEEPSLATE)
                .lightWithItem(ModItems.ESSENCE_OF_THE_UNIVERSE)
                .destDimID(Identifier.of(MTWA.MOD_ID, "eternite_dim"))
                .tintColor(0x000000)
                .registerPortal();


    }
}