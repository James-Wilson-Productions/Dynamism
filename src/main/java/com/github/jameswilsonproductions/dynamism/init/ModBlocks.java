package com.github.jameswilsonproductions.dynamism.init;

import com.github.jameswilsonproductions.dynamism.blocks.EnergyBlockTest;
import com.github.jameswilsonproductions.dynamism.lib.Reference;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by JamesWilsonProductions on 2/17/2017.
 * Do not distribute without proper permission.
 */

public class ModBlocks {
    public static Block energyBlockTest;

    public static void init(){
        energyBlockTest = new EnergyBlockTest();
    }

    public static void register(){
        registerBlock(energyBlockTest);
    }

    private static void registerBlock(Block block){
        GameRegistry.register(energyBlockTest);
        ItemBlock itemBlock = new ItemBlock(block);
        itemBlock.setRegistryName(block.getRegistryName());
        GameRegistry.register(itemBlock);
    }

    public static void registerRenders(){
        registerRender(energyBlockTest);
    }

    private static void registerRender(Block block){
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
    }
}
