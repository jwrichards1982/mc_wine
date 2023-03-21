package net.jwrichards1982.mcwine.item;

import net.jwrichards1982.mcwine.MCWine;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MCWine.MOD_ID);

    public static final RegistryObject<Item> GRAPE_SEED_RED = ITEMS.register("grape_seed_red",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MCWine_Tab)));
    public static final RegistryObject<Item> GRAPE_SEED_WHITE = ITEMS.register("grape_seed_white",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MCWine_Tab)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
