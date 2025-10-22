package net.stegio.mtwa.villager;

import com.google.common.collect.ImmutableSet;
import net.fabricmc.fabric.api.object.builder.v1.world.poi.PointOfInterestHelper;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.village.VillagerProfession;
import net.minecraft.world.poi.PointOfInterestType;
import net.stegio.mtwa.MTWA;
import net.stegio.mtwa.block.ModBlocks;

import javax.swing.text.html.HTML;

public class ModVillagers {

    public static final RegistryKey<PointOfInterestType> EARMORER_POI_KEY = registerPoiKey("earmorer_poi");
    public static final RegistryKey<PointOfInterestType> EWEAPONSMITH_POI_KEY = registerPoiKey("eweaponsmith_poi");
    public static final RegistryKey<PointOfInterestType> ETOOLSMITH_POI_KEY = registerPoiKey("etoolsmith_poi");

    public static final RegistryKey<PointOfInterestType> MARMORER_POI_KEY = registerPoiKey("marmorer_poi");
    public static final RegistryKey<PointOfInterestType> MWEAPONSMITH_POI_KEY = registerPoiKey("mweaponsmith_poi");
    public static final RegistryKey<PointOfInterestType> MTOOLSMITH_POI_KEY = registerPoiKey("mtoolsmith_poi");

    public static final RegistryKey<PointOfInterestType> LARMORER_POI_KEY = registerPoiKey("larmorer_poi");
    public static final RegistryKey<PointOfInterestType> LWEAPONSMITH_POI_KEY = registerPoiKey("lweaponsmith_poi");
    public static final RegistryKey<PointOfInterestType> LTOOLSMITH_POI_KEY = registerPoiKey("ltoolsmith_poi");

    public static final RegistryKey<PointOfInterestType> MERCHANT_POI_KEY = registerPoiKey("merchant_poi");
    public static final RegistryKey<PointOfInterestType> FENCE_POI_KEY = registerPoiKey("fence_poi");

    public static final RegistryKey<PointOfInterestType> ENCHANTER_POI_KEY = registerPoiKey("enchanter_poi");

    public static final PointOfInterestType EARMOR_POI = registerPOI("earmorer_poi", ModBlocks.AETHERITE_ARMOR_ANVIL);
    public static final PointOfInterestType EWEAPONSMITH_POI = registerPOI("eweaponsmith_poi", ModBlocks.AETHERITE_WEAPON_ANVIL);
    public static final PointOfInterestType ETOOLSMITH_POI = registerPOI("etoolsmith_poi", ModBlocks.AETHERITE_TOOL_ANVIL);

    public static final PointOfInterestType MARMORER_POI = registerPOI("marmorer_poi", ModBlocks.TITANITE_ARMOR_ANVIL);
    public static final PointOfInterestType MWEAPONSMITH = registerPOI("mweaponsmith_poi", ModBlocks.TITANITE_WEAPON_ANVIL);
    public static final PointOfInterestType MTOOLSMITH_POI = registerPOI("mtoolsmith_poi", ModBlocks.TITANITE_TOOL_ANVIL);

    public static final PointOfInterestType LARMORER_POI = registerPOI("larmorer_poi", ModBlocks.ETERNITE_ARMOR_ANVIL);
    public static final PointOfInterestType LWEAPONSMITH_POI = registerPOI("lweaponsmith_poi", ModBlocks.ETERNITE_WEAPON_ANVIL);
    public static final PointOfInterestType LTOOLSMITH_POI = registerPOI("ltoolsmith_poi", ModBlocks.ETERNITE_TOOL_ANVIL);

    public static final PointOfInterestType MERCHANT_POI = registerPOI("merchant_poi", Blocks.CRAFTING_TABLE);
    public static final PointOfInterestType FENCE_POI = registerPOI("fence_poi", Blocks.BLACK_SHULKER_BOX);

    public static final PointOfInterestType ENCHANTER_POI = registerPOI("enchanter_poi", Blocks.ENCHANTING_TABLE);

    public static final VillagerProfession EXPERT_ARMORER = registerProfession("expert_armorer", EARMORER_POI_KEY);
    public static final VillagerProfession EXPERT_WEAPONSMITH = registerProfession("expert_weaponsmith", EWEAPONSMITH_POI_KEY);
    public static final VillagerProfession EXPERT_TOOLSMITH = registerProfession("expert_toolsmith", ETOOLSMITH_POI_KEY);

    public static final VillagerProfession MASTER_ARMORER = registerProfession("master_armorer", MARMORER_POI_KEY);
    public static final VillagerProfession MASTER_WEAPONSMITH = registerProfession("master_weaponsmith", MWEAPONSMITH_POI_KEY);
    public static final VillagerProfession MASTER_TOOLSMITH = registerProfession("master_toolsmith", MTOOLSMITH_POI_KEY);

    public static final VillagerProfession LEGENDARY_ARMORER = registerProfession("legendary_armorer", LARMORER_POI_KEY);
    public static final VillagerProfession LEGENDARY_WEAPONSMITH = registerProfession("legendary_weaponsmith", LWEAPONSMITH_POI_KEY);
    public static final VillagerProfession LEGENDARY_TOOLSMITH = registerProfession("legendary_toolsmith", LTOOLSMITH_POI_KEY);

    public static final VillagerProfession MERCHANT = registerProfession("merchant", MERCHANT_POI_KEY);
    public static final VillagerProfession FENCE = registerProfession("fence", FENCE_POI_KEY);

    public static final VillagerProfession ENCHANTER = registerProfession("enchanter", ENCHANTER_POI_KEY);


    private static VillagerProfession registerProfession(String name, RegistryKey<PointOfInterestType> type) {
        return Registry.register(Registries.VILLAGER_PROFESSION, Identifier.of(MTWA.MOD_ID, name),
                new VillagerProfession(name, entry -> entry.matchesKey(type), entry -> entry.matchesKey(type),
                        ImmutableSet.of(), ImmutableSet.of(), SoundEvents.ENTITY_VILLAGER_WORK_ARMORER));
    }

    private static PointOfInterestType registerPOI(String name, Block block) {
        return PointOfInterestHelper.register(Identifier.of(MTWA.MOD_ID, name),
                1, 1, block);
    }

    private static RegistryKey<PointOfInterestType> registerPoiKey(String name) {
        return RegistryKey.of(RegistryKeys.POINT_OF_INTEREST_TYPE, Identifier.of(MTWA.MOD_ID, name));
    }

    public static void registerVillagers() {
        MTWA.LOGGER.info("Registering Villagers for " + MTWA.MOD_ID);
    }
}