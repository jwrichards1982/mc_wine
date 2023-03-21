package net.jwrichards1982.mcwine.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab MCWine_Tab = new CreativeModeTab("mcwinetab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.GRAPE_SEED_RED.get());
        }
    };
}
