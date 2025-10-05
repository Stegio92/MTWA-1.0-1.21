package net.stegio.mtwa.block.entity.custom;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.recipe.RecipeType;
import net.minecraft.screen.BlastFurnaceScreenHandler;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;
import net.stegio.mtwa.block.entity.ModBlockEntities;

public class SunFurnaceBlockEntity extends ModFurnaceBlockEntity {
    public SunFurnaceBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.SUN_FURNACE_BE, pos, state, RecipeType.BLASTING);
    }

    @Override
    protected Text getContainerName() {
        return Text.translatable("container.sun_furnace");
    }

    @Override
    protected int getFuelTime(ItemStack fuel) {
        return super.getFuelTime(fuel) / 2;
    }

    @Override
    protected ScreenHandler createScreenHandler(int syncId, PlayerInventory playerInventory) {
        return new BlastFurnaceScreenHandler(syncId, playerInventory, this, this.propertyDelegate);
    }
}

