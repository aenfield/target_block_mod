package com.enfield.targetblockmod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.BlockRenderLayer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class TargetBlock extends Block {
    public static final String NAME = "target";
    private static final String UNLOCALIZED_NAME = "target_block";
    private static final String REGISTRY_NAME = "target_block_registry";

    public TargetBlock() {
        super(Material.ROCK);

        this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);

        this.setUnlocalizedName(UNLOCALIZED_NAME);
        this.setRegistryName(REGISTRY_NAME);
    }

    @SideOnly(Side.CLIENT)
    public BlockRenderLayer getBlockLayer() {
        return BlockRenderLayer.SOLID;
    }
}
