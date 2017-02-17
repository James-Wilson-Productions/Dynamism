package com.github.jameswilsonproductions.dynamism.proxy;

import com.github.jameswilsonproductions.dynamism.init.ModBlocks;

/**
 * Created by JamesWilsonProductions on 2/16/2017.
 * Do not distribute without proper permission.
 */

public class ClientProxy implements CommonProxy {
    @Override
    public void init() {
        ModBlocks.registerRenders();
    }
}
