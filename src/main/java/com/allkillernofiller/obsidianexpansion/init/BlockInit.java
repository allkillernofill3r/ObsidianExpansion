package com.allkillernofiller.obsidianexpansion.init;

import com.allkillernofiller.obsidianexpansion.ObsidianExpansion;
import com.allkillernofiller.obsidianexpansion.block.ObsidianGlass;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ObsidianExpansion.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ObsidianExpansion.MOD_ID);

    public static void registerBlocks() {
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    public static final RegistryObject<Block> WEAK_OBSIDIAN = BLOCKS.register("weak_obsidian",
            () -> new Block(Block.Properties.from(Blocks.COBBLESTONE)));
    public static final RegistryObject<SlabBlock> OBSIDIAN_SLAB = BLOCKS.register("obsidian_slab",
            () -> new SlabBlock(Block.Properties.from(Blocks.OBSIDIAN)));
    public static final RegistryObject<StairsBlock> OBSIDIAN_STAIRS = BLOCKS.register("obsidian_stairs",
            () -> new StairsBlock(Blocks.OBSIDIAN.getBlock().getDefaultState(), Block.Properties.from(Blocks.OBSIDIAN)));
    public static final RegistryObject<DoorBlock> OBSIDIAN_DOOR = BLOCKS.register("obsidian_door",
            () -> new DoorBlock(Block.Properties.from(Blocks.OBSIDIAN).notSolid()));
    public static final RegistryObject<FenceBlock> OBSIDIAN_FENCE = BLOCKS.register("obsidian_fence",
            () -> new FenceBlock(Block.Properties.from(Blocks.OBSIDIAN)));
    public static final RegistryObject<FenceGateBlock> OBSIDIAN_FENCE_GATE = BLOCKS.register("obsidian_fence_gate",
            () -> new FenceGateBlock(Block.Properties.from(Blocks.OBSIDIAN)));
    public static final RegistryObject<ObsidianGlass> OBSIDIAN_GLASS = BLOCKS.register("obsidian_glass",
            () -> new ObsidianGlass(Block.Properties.from(Blocks.OBSIDIAN).sound(SoundType.GLASS).notSolid()));
    public static final RegistryObject<Block> WEAK_CRYING_OBSIDIAN = BLOCKS.register("weak_crying_obsidian",
            () -> new Block(Block.Properties.from(Blocks.COBBLESTONE)));
    public static final RegistryObject<SlabBlock> CRYING_OBSIDIAN_SLAB = BLOCKS.register("crying_obsidian_slab",
            () -> new SlabBlock(Block.Properties.from(Blocks.CRYING_OBSIDIAN)));
    public static final RegistryObject<StairsBlock> CRYING_OBSIDIAN_STAIRS = BLOCKS.register("crying_obsidian_stairs",
            () -> new StairsBlock(Blocks.CRYING_OBSIDIAN.getBlock().getDefaultState(), Block.Properties.from(Blocks.CRYING_OBSIDIAN)));
    public static final RegistryObject<DoorBlock> CRYING_OBSIDIAN_DOOR = BLOCKS.register("crying_obsidian_door",
            () -> new DoorBlock(Block.Properties.from(Blocks.CRYING_OBSIDIAN).notSolid()));
    public static final RegistryObject<FenceBlock> CRYING_OBSIDIAN_FENCE = BLOCKS.register("crying_obsidian_fence",
            () -> new FenceBlock(Block.Properties.from(Blocks.CRYING_OBSIDIAN)));
    public static final RegistryObject<FenceGateBlock> CRYING_OBSIDIAN_FENCE_GATE = BLOCKS.register("crying_obsidian_fence_gate",
            () -> new FenceGateBlock(Block.Properties.from(Blocks.CRYING_OBSIDIAN)));
    public static final RegistryObject<ObsidianGlass> CRYING_OBSIDIAN_GLASS = BLOCKS.register("crying_obsidian_glass",
            () -> new ObsidianGlass(Block.Properties.from(Blocks.CRYING_OBSIDIAN).sound(SoundType.GLASS).notSolid()));


    public static final RegistryObject<Item> WEAK_OBSIDIAN_ITEM = ITEMS.register("weak_obsidian",
            () -> new BlockItem(BlockInit.WEAK_OBSIDIAN.get(), new Item.Properties().group(ObsidianExpansion.TAB)));
    public static final RegistryObject<Item> OBSIDIAN_SLAB_ITEM = ITEMS.register("obsidian_slab",
            () -> new BlockItem(BlockInit.OBSIDIAN_SLAB.get(), new Item.Properties().group(ObsidianExpansion.TAB)));
    public static final RegistryObject<Item> OBSIDIAN_DOOR_ITEM = ITEMS.register("obsidian_door",
            () -> new BlockItem(BlockInit.OBSIDIAN_DOOR.get(), new Item.Properties().group(ObsidianExpansion.TAB)));
    public static final RegistryObject<Item> OBSIDIAN_STAIRS_ITEM = ITEMS.register("obsidian_stairs",
            () -> new BlockItem(BlockInit.OBSIDIAN_STAIRS.get(), new Item.Properties().group(ObsidianExpansion.TAB)));
    public static final RegistryObject<Item> OBSIDIAN_FENCE_ITEM = ITEMS.register("obsidian_fence",
            () -> new BlockItem(BlockInit.OBSIDIAN_FENCE.get(), new Item.Properties().group(ObsidianExpansion.TAB)));
    public static final RegistryObject<Item> OBSIDIAN_FENCE_GATE_ITEM = ITEMS.register("obsidian_fence_gate",
            () -> new BlockItem(BlockInit.OBSIDIAN_FENCE_GATE.get(), new Item.Properties().group(ObsidianExpansion.TAB)));
    public static final RegistryObject<Item> OBSIDIAN_GLASS_ITEM = ITEMS.register("obsidian_glass",
            () -> new BlockItem(BlockInit.OBSIDIAN_GLASS.get(), new Item.Properties().group(ObsidianExpansion.TAB)));
    public static final RegistryObject<Item> WEAK_CRYING_OBSIDIAN_ITEM = ITEMS.register("weak_crying_obsidian",
            () -> new BlockItem(BlockInit.WEAK_CRYING_OBSIDIAN.get(), new Item.Properties().group(ObsidianExpansion.TAB)));
    public static final RegistryObject<Item> CRYING_OBSIDIAN_SLAB_ITEM = ITEMS.register("crying_obsidian_slab",
            () -> new BlockItem(BlockInit.CRYING_OBSIDIAN_SLAB.get(), new Item.Properties().group(ObsidianExpansion.TAB)));
    public static final RegistryObject<Item> CRYING_OBSIDIAN_DOOR_ITEM = ITEMS.register("crying_obsidian_door",
            () -> new BlockItem(BlockInit.CRYING_OBSIDIAN_DOOR.get(), new Item.Properties().group(ObsidianExpansion.TAB)));
    public static final RegistryObject<Item> CRYING_OBSIDIAN_STAIRS_ITEM = ITEMS.register("crying_obsidian_stairs",
            () -> new BlockItem(BlockInit.CRYING_OBSIDIAN_STAIRS.get(), new Item.Properties().group(ObsidianExpansion.TAB)));
    public static final RegistryObject<Item> CRYING_OBSIDIAN_FENCE_ITEM = ITEMS.register("crying_obsidian_fence",
            () -> new BlockItem(BlockInit.CRYING_OBSIDIAN_FENCE.get(), new Item.Properties().group(ObsidianExpansion.TAB)));
    public static final RegistryObject<Item> CRYING_OBSIDIAN_FENCE_GATE_ITEM = ITEMS.register("crying_obsidian_fence_gate",
            () -> new BlockItem(BlockInit.CRYING_OBSIDIAN_FENCE_GATE.get(), new Item.Properties().group(ObsidianExpansion.TAB)));
    public static final RegistryObject<Item> CRYING_OBSIDIAN_GLASS_ITEM = ITEMS.register("crying_obsidian_glass",
            () -> new BlockItem(BlockInit.CRYING_OBSIDIAN_GLASS.get(), new Item.Properties().group(ObsidianExpansion.TAB)));
}
