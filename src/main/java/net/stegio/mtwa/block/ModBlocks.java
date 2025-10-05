package net.stegio.mtwa.block;

import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.stegio.mtwa.MTWA;
import net.stegio.mtwa.block.custom.ModFurnaceBlock;
import net.stegio.mtwa.block.custom.SunFurnaceBlock;
import net.stegio.mtwa.block.custom.Tombstone;

import static net.minecraft.block.Blocks.createLightLevelFromLitBlockState;

public class ModBlocks {
    public static final Block AETHERITE_BLOCK = registerBlock("aetherite_block",
            new Block(AbstractBlock.Settings.create().strength(75.0f, 2000f)
                    .requiresTool().sounds(BlockSoundGroup.NETHERITE)));

    public static final Block ANCIENT_AETHERITE_DEBRIS1 = registerBlock("ancient_aetherite_debris1",
            new Block(AbstractBlock.Settings.create().strength(65.0f, 1800f)
                    .requiresTool().sounds(BlockSoundGroup.ANCIENT_DEBRIS)));

    public static final Block TITANITE_BLOCK = registerBlock("titanite_block",
            new Block(AbstractBlock.Settings.create().strength(100.0f, 2200f)
                    .requiresTool().sounds(BlockSoundGroup.NETHERITE)));

    public static final Block ANCIENT_TITANITE_DEBRIS1 = registerBlock("ancient_titanite_debris1",
            new Block(AbstractBlock.Settings.create().strength(90.0f, 2000f)
                    .requiresTool().sounds(BlockSoundGroup.ANCIENT_DEBRIS)));

    public static final Block ETERNITE_BLOCK = registerBlock("eternite_block",
            new Block(AbstractBlock.Settings.create().strength(125.0f, 2500f)
                    .requiresTool().sounds(BlockSoundGroup.NETHERITE)));

    public static final Block ANCIENT_ETERNITE_DEBRIS1 = registerBlock("ancient_eternite_debris1",
            new Block(AbstractBlock.Settings.create().strength(115.0f, 2300f)
                    .requiresTool().sounds(BlockSoundGroup.ANCIENT_DEBRIS)));

    public static final Block AETHERITE_CORE1 = registerBlock(
            "aetherite_core1",
            new HeavyCoreBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.PURPLE)
                            .instrument(NoteBlockInstrument.SNARE)
                            .sounds(BlockSoundGroup.HEAVY_CORE)
                            .strength(15.0F)
                            .pistonBehavior(PistonBehavior.NORMAL)
                            .resistance(1500.0F)
                            .requiresTool()
            )
    );

    public static final Block TITANITE_CORE = registerBlock(
            "titanite_core",
            new HeavyCoreBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_RED)
                            .instrument(NoteBlockInstrument.SNARE)
                            .sounds(BlockSoundGroup.HEAVY_CORE)
                            .strength(25.0F)
                            .pistonBehavior(PistonBehavior.NORMAL)
                            .resistance(2500.0F)
                            .requiresTool()
            )
    );

    public static final Block ETERNITE_CORE = registerBlock(
            "eternite_core",
            new HeavyCoreBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.BLACK)
                            .instrument(NoteBlockInstrument.SNARE)
                            .sounds(BlockSoundGroup.HEAVY_CORE)
                            .strength(35.0F)
                            .pistonBehavior(PistonBehavior.NORMAL)
                            .resistance(3000.0F)
                            .requiresTool()
            )
    );

    public static final Block TOMBSTONE = registerBlock("tombstone",
            new Tombstone(AbstractBlock.Settings.create().strength(10.0f, 100f)
                    .requiresTool().sounds(BlockSoundGroup.STONE).nonOpaque()));

    public static final Block SUN_FURNACE = registerBlock(
            "sun_furnace",
            new SunFurnaceBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.STONE_GRAY)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(3.5F)
                            .luminance(createLightLevelFromLitBlockState(13))));

    public static final Block AETHERITE_ARMOR_ANVIL = registerBlock(
            "aetherite_armor_anvil",
            new AnvilBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.IRON_GRAY)
                            .requiresTool()
                            .strength(5.0F, 1200.0F)
                            .sounds(BlockSoundGroup.ANVIL)
                            .pistonBehavior(PistonBehavior.BLOCK)));

    public static final Block AETHERITE_WEAPON_ANVIL = registerBlock(
            "aetherite_weapon_anvil",
            new AnvilBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.IRON_GRAY)
                            .requiresTool()
                            .strength(5.0F, 1200.0F)
                            .sounds(BlockSoundGroup.ANVIL)
                            .pistonBehavior(PistonBehavior.BLOCK)));

    public static final Block AETHERITE_TOOL_ANVIL = registerBlock(
            "aetherite_tool_anvil",
            new AnvilBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.IRON_GRAY)
                            .requiresTool()
                            .strength(5.0F, 1200.0F)
                            .sounds(BlockSoundGroup.ANVIL)
                            .pistonBehavior(PistonBehavior.BLOCK)));

    public static final Block TITANITE_ARMOR_ANVIL = registerBlock(
            "titanite_armor_anvil",
            new AnvilBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.IRON_GRAY)
                            .requiresTool()
                            .strength(5.0F, 1200.0F)
                            .sounds(BlockSoundGroup.ANVIL)
                            .pistonBehavior(PistonBehavior.BLOCK)));

    public static final Block TITANITE_WEAPON_ANVIL = registerBlock(
            "titanite_weapon_anvil",
            new AnvilBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.IRON_GRAY)
                            .requiresTool()
                            .strength(5.0F, 1200.0F)
                            .sounds(BlockSoundGroup.ANVIL)
                            .pistonBehavior(PistonBehavior.BLOCK)));

    public static final Block TITANITE_TOOL_ANVIL = registerBlock(
            "titanite_tool_anvil",
            new AnvilBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.IRON_GRAY)
                            .requiresTool()
                            .strength(5.0F, 1200.0F)
                            .sounds(BlockSoundGroup.ANVIL)
                            .pistonBehavior(PistonBehavior.BLOCK)));

    public static final Block ETERNITE_ARMOR_ANVIL = registerBlock(
            "eternite_armor_anvil",
            new AnvilBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.IRON_GRAY)
                            .requiresTool()
                            .strength(5.0F, 1200.0F)
                            .sounds(BlockSoundGroup.ANVIL)
                            .pistonBehavior(PistonBehavior.BLOCK)));

    public static final Block ETERNITE_WEAPON_ANVIL = registerBlock(
            "eternite_weapon_anvil",
            new AnvilBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.IRON_GRAY)
                            .requiresTool()
                            .strength(5.0F, 1200.0F)
                            .sounds(BlockSoundGroup.ANVIL)
                            .pistonBehavior(PistonBehavior.BLOCK)));

    public static final Block ETERNITE_TOOL_ANVIL = registerBlock(
            "eternite_tool_anvil",
            new AnvilBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.IRON_GRAY)
                            .requiresTool()
                            .strength(5.0F, 1200.0F)
                            .sounds(BlockSoundGroup.ANVIL)
                            .pistonBehavior(PistonBehavior.BLOCK)));




    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(MTWA.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(MTWA.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlock() {
        MTWA.LOGGER.info("Registering Mod Blocks for " + MTWA.MOD_ID);

    }
}
