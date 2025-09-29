package net.stegio.mtwa;

import net.fabricmc.api.ModInitializer;

import net.stegio.mtwa.block.ModBlocks;
import net.stegio.mtwa.item.ModItemGroups;
import net.stegio.mtwa.item.ModItems;
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

	}
}