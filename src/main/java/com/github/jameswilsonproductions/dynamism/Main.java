package com.github.jameswilsonproductions.dynamism;

import com.github.jameswilsonproductions.dynamism.lib.Reference;
import com.github.jameswilsonproductions.dynamism.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by JamesWilsonProductions on 2/16/2017.
 * Do not distribute without proper permission.
 */

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION, acceptedMinecraftVersions = Reference.ACCEPTED_VERSIONS)
public class Main {
    @Mod.Instance
    public static Main INSTANCE;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.SERVER_PROXY)
    public static CommonProxy commonProxy;

    @Mod.EventHandler
    public static void preInit(FMLPreInitializationEvent e){

    }

    @Mod.EventHandler
    public static void init(FMLInitializationEvent e){

    }

    @Mod.EventHandler
    public static void postInit(FMLPostInitializationEvent e){

    }
}
