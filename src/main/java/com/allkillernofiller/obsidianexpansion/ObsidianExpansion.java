package com.allkillernofiller.obsidianexpansion;

import com.allkillernofiller.obsidianexpansion.init.BlockInit;
import com.allkillernofiller.obsidianexpansion.init.ItemInit;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("obsidianexpansion")
public class ObsidianExpansion {
    public static final String MOD_ID = "obsidianexpansion";

    public ObsidianExpansion() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        BlockInit.registerBlocks();
        ItemInit.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());

        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public void doClientStuff(final FMLClientSetupEvent event) {
        RenderTypeLookup.setRenderLayer(BlockInit.OBSIDIAN_DOOR.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.OBSIDIAN_GLASS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.CRYING_OBSIDIAN_DOOR.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.CRYING_OBSIDIAN_GLASS.get(), RenderType.getCutout());
    }

    public static final ItemGroup TAB = (new ItemGroup("expansionTab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(BlockInit.WEAK_OBSIDIAN.get());
        }
    }).setTabPath("expansion_tab");
}
