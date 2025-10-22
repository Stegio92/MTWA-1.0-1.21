package net.stegio.mtwa;

import net.fabricmc.api.ModInitializer;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.util.ActionResult;
import net.stegio.mtwa.block.ModBlocks;
import net.stegio.mtwa.block.entity.ModBlockEntities;
import net.stegio.mtwa.item.ModItemGroups;
import net.stegio.mtwa.item.ModItems;
import net.stegio.mtwa.util.ModLootTableModifiers;
import net.stegio.mtwa.villager.ModVillagers;
import net.stegio.mtwa.world.gen.ModWorldGeneration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import software.bernie.geckolib.GeckoLib;

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

    }
}