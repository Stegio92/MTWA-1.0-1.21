package net.stegio.mtwa.mixin;

import net.minecraft.entity.passive.VillagerEntity;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.TradeOfferList;
import net.stegio.mtwa.villager.ModVillagerTrades;
import net.stegio.mtwa.villager.ModVillagers;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Random;

@Mixin(VillagerEntity.class)
public class VillagerTradesMixin {

    @Inject(method = "populatesTrades", at = @At("HEAD"), cancellable = true)
    private void injectCustomTrades(Random random, CallbackInfo ci) {
        VillagerEntity villager = (VillagerEntity) (Object) this;
        var profession = villager.getVillagerData().getProfession();
        int level = villager.getVillagerData().getLevel();

        if (profession == ModVillagers.EXPERT_ARMORER) {
            TradeOfferList customTrades = new TradeOfferList();
            if (profession ==ModVillagers.EXPERT_ARMORER) {
                customTrades = ModVillagerTrades.getTradesForExpertArmorer(level);
            }
            for (TradeOffer offer : customTrades) {
                villager.getOffers().add(offer);
            }
            ci.cancel();
        }
    }
}
