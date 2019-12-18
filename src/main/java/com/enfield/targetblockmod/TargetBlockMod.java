package com.enfield.targetblockmod;

import org.apache.logging.log4j.Logger;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

@Mod(modid = TargetBlockMod.MODID, name = TargetBlockMod.NAME, version = TargetBlockMod.VERSION)
public class TargetBlockMod {
    public static final String MODID = "targetblockmod";
    public static final String NAME = "Target Block Mod";
    public static final String VERSION = "1.0.0";
    public static final String RESOURCE_INVENTORY = "inventory";

    public static TargetBlock targetBlock;
    public static ItemBlock itemTargetBlock;

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        preInitTargetBlock();
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        logger.info("Mod initialized: " + NAME);
    }

    private void preInitTargetBlock() {
        targetBlock = new TargetBlock();
        ForgeRegistries.BLOCKS.register(targetBlock);

        itemTargetBlock = new ItemBlock(targetBlock);

        itemTargetBlock.setRegistryName(targetBlock.getRegistryName());
        ForgeRegistries.ITEMS.register(itemTargetBlock);

        ModelResourceLocation chinaModelResourceLocation = new ModelResourceLocation(
            MODID + ":" + TargetBlock.NAME, RESOURCE_INVENTORY);
        final int DEFAULT_ITEM_SUBTYPE = 0;
        ModelLoader.setCustomModelResourceLocation(itemTargetBlock, DEFAULT_ITEM_SUBTYPE, chinaModelResourceLocation);
    }

}