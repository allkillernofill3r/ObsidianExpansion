package com.allkillernofiller.obsidianexpansion.init;

import com.allkillernofiller.obsidianexpansion.ObsidianExpansion;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ObsidianExpansion.MOD_ID);

    public static final RegistryObject<Item> OBSIDIAN_SHARD = ITEMS.register("obsidian_shard",
            () -> new Item(new Item.Properties().group(ObsidianExpansion.TAB)));
    public static final RegistryObject<Item> OBSIDIAN_STICK = ITEMS.register("obsidian_stick",
            () -> new Item(new Item.Properties().group(ObsidianExpansion.TAB)));
    public static final RegistryObject<Item> CRYING_OBSIDIAN_SHARD = ITEMS.register("crying_obsidian_shard",
            () -> new Item(new Item.Properties().group(ObsidianExpansion.TAB)));
    public static final RegistryObject<Item> CRYING_OBSIDIAN_STICK = ITEMS.register("crying_obsidian_stick",
            () -> new Item(new Item.Properties().group(ObsidianExpansion.TAB)));
}
