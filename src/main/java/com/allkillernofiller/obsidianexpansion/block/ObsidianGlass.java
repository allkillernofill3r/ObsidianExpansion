package com.allkillernofiller.obsidianexpansion.block;

import net.minecraft.block.BlockState;
import net.minecraft.block.GlassBlock;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;

public class ObsidianGlass extends GlassBlock {
    public ObsidianGlass(Properties properties) {
        super(properties);
    }

    @Override
    public boolean isSideInvisible(BlockState state, BlockState adjacentBlockState, Direction side) {
        if (adjacentBlockState.getBlock() instanceof ObsidianGlass) {
            if (adjacentBlockState.getRenderType() == state.getRenderType()) {
                return true;
            }
        }

        return super.isSideInvisible(state, adjacentBlockState, side);
    }

    @Override
    public boolean propagatesSkylightDown(BlockState state, IBlockReader reader, BlockPos pos) {
        return true;
    }
}
