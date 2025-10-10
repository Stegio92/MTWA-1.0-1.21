package net.stegio.mtwa.mixin;

import net.minecraft.entity.passive.VillagerEntity;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.TradeOfferList;
import net.minecraft.village.VillagerProfession;
import net.stegio.mtwa.villager.custom.*;
import net.stegio.mtwa.villager.ModVillagers;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(VillagerEntity.class)
public class VillagerTradesMixin {

    @Inject(method = "fillRecipes", at = @At("HEAD"), cancellable = true)
    private void injectCustomTrades(CallbackInfo ci) {
        VillagerEntity villager = (VillagerEntity) (Object) this;
        var profession = villager.getVillagerData().getProfession();
        int level = villager.getVillagerData().getLevel();

        if (profession == ModVillagers.EXPERT_ARMORER ||
                profession == ModVillagers.MASTER_ARMORER ||
                profession == ModVillagers.LEGENDARY_ARMORER ||
                profession == ModVillagers.EXPERT_WEAPONSMITH ||
                profession == ModVillagers.MASTER_WEAPONSMITH ||
                profession == ModVillagers.LEGENDARY_WEAPONSMITH ||
                profession == ModVillagers.EXPERT_TOOLSMITH ||
                profession == ModVillagers.MASTER_TOOLSMITH ||
                profession == ModVillagers.LEGENDARY_TOOLSMITH ||
                profession == VillagerProfession.FLETCHER ||
                profession == VillagerProfession.SHEPHERD ||
                profession == VillagerProfession.FARMER ||
                profession == VillagerProfession.FISHERMAN ||
                profession == VillagerProfession.BUTCHER ||
                profession == VillagerProfession.CARTOGRAPHER ||
                profession == VillagerProfession.MASON ||
                profession == VillagerProfession.LEATHERWORKER ||
                profession == VillagerProfession.CLERIC ||
                profession == VillagerProfession.ARMORER ||
                profession == VillagerProfession.WEAPONSMITH ||
                profession == VillagerProfession.TOOLSMITH) {

            TradeOfferList customTrades = new TradeOfferList();

            if (profession == ModVillagers.EXPERT_ARMORER) {
                customTrades = ExpertArmorerTrades.getTradesForExpertArmorer(level);
            }
            else if (profession == ModVillagers.MASTER_ARMORER) {
                customTrades = MasterArmorerTrades.getTradesForMasterArmorer(level);
            }
            else if (profession == ModVillagers.LEGENDARY_ARMORER) {
                customTrades = LegendaryArmorerTrades.getTradesForLegendaryArmorer(level);
            }
            else if (profession == ModVillagers.EXPERT_WEAPONSMITH) {
                customTrades = ExpertWeaponsmithTrades.getTradesForExpertWeaponsmith(level);
            }
            else if (profession == ModVillagers.MASTER_WEAPONSMITH) {
                customTrades = MasterWeaponsmithTrades.getTradesForMasterWeaponsmith(level);
            }
            else if (profession == ModVillagers.LEGENDARY_WEAPONSMITH) {
                customTrades = LegendaryWeaponsmithTrades.getTradesForLegendaryWeaponsmith(level);
            }
            else if (profession == ModVillagers.EXPERT_TOOLSMITH) {
                customTrades = ExpertToolsmithTrades.getTradesForExpertToolsmith(level);
            }
            else if (profession == ModVillagers.MASTER_TOOLSMITH) {
                customTrades = MasterToolsmithTrades.getTradesForMasterToolsmith(level);
            }
            else if (profession == ModVillagers.LEGENDARY_TOOLSMITH) {
                customTrades = LegendaryToolsmithTrades.getTradesForLegendaryToolsmith(level);
            }
            else if (profession == VillagerProfession.FLETCHER) {
                customTrades = ModFletcherTrades.getFletcherTrades(level);
            }
            else if (profession == VillagerProfession.SHEPHERD) {
                customTrades = ModShepherdTrades.getShepherdTrades(level);
            }
            else if (profession == VillagerProfession.FARMER) {
                customTrades = ModFarmerTrades.getFarmerTrades(level);
            }
            else if (profession == VillagerProfession.FISHERMAN) {
                customTrades = ModFishermanTrades.getFishermanTrades(level);
            }
            else if (profession == VillagerProfession.BUTCHER) {
                customTrades = ModButcherTrades.getTradesForButcher(level);
            }
            else if (profession == VillagerProfession.CARTOGRAPHER) {
                customTrades = ModCartographerTrades.getCartographerTrades(level);
            }
            else if (profession == VillagerProfession.MASON) {
                customTrades = ModMasonTrades.getMasonTrades(level);
            }
            else if (profession == VillagerProfession.LEATHERWORKER) {
                customTrades = ModLeatherworkerTrades.getLeatherworkerTrades(level);
            }
            else if (profession == VillagerProfession.CLERIC) {
                customTrades = ModClericTrades.getClericTrades(level);
            }
            else if (profession == VillagerProfession.ARMORER) {
                customTrades = ModArmorerTrades.getArmorerTrades(level);
            }
            else if (profession == VillagerProfession.WEAPONSMITH) {
                customTrades = ModWeaponsmithTrades.getWeaponsmithTrades(level);
            }
            else if (profession == VillagerProfession.TOOLSMITH) {
                customTrades = ModToolsmithTrades.getToolsmithTrades(level);
            }
            for (TradeOffer offer : customTrades) {
                villager.getOffers().add(offer);
            }
            ci.cancel();
        }
    }
}
