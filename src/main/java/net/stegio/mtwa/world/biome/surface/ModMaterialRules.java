package net.stegio.mtwa.world.biome.surface;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.world.gen.surfacebuilder.MaterialRules;
import net.stegio.mtwa.world.biome.ModBiomes;


public class ModMaterialRules {
    private static final MaterialRules.MaterialRule COBBLESTONE = makeStateRule(Blocks.COBBLESTONE);
    private static final MaterialRules.MaterialRule DRIPSTONE = makeStateRule(Blocks.POINTED_DRIPSTONE);

    public static MaterialRules.MaterialRule makeRules() {
        return MaterialRules.sequence(
                MaterialRules.sequence(MaterialRules.condition(MaterialRules.biome(ModBiomes.MINING_CAVE),
                                MaterialRules.condition(MaterialRules.STONE_DEPTH_FLOOR, COBBLESTONE)),
                        MaterialRules.condition(MaterialRules.STONE_DEPTH_CEILING, COBBLESTONE))

        );
    }

    private static MaterialRules.MaterialRule makeStateRule(Block block) {
        return MaterialRules.block(block.getDefaultState());
    }
}
