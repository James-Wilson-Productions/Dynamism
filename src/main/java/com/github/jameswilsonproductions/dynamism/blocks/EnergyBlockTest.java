package com.github.jameswilsonproductions.dynamism.blocks;

import com.github.jameswilsonproductions.dynamism.lib.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

/**
 * Created by JamesWilsonProductions on 2/17/2017.
 * Do not distribute without proper permission.
 */

public class EnergyBlockTest extends Block {
    public EnergyBlockTest() {
        super(Material.IRON);

        setUnlocalizedName(Reference.DynamismBlocks.ENERGYTESTBLOCK.getUnlocalizedName());
        setRegistryName(Reference.DynamismBlocks.ENERGYTESTBLOCK.getRegistryName());

        setHardness(1.0f);
        setSoundType(SoundType.METAL);
    }
}
