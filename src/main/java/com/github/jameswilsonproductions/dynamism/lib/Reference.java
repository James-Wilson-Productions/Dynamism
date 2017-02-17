package com.github.jameswilsonproductions.dynamism.lib;

/**
 * Created by JamesWilsonProductions on 2/16/2017.
 * Do not distribute without proper permission.
 */

public class Reference {
    public static final String MOD_ID = "dynamism";
    public static final String MOD_NAME = "Dynamism";
    public static final String MOD_VERSION = "0.1";

    public static final String CLIENT_PROXY = "com.github.jameswilsonproductions.dynamism.proxy.ClientProxy";
    public static final String SERVER_PROXY = "com.github.jameswilsonproductions.dynamism.proxy.ServerProxy";

    public static final String ACCEPTED_VERSIONS = "[1.10.2]";

    public enum DynamismBlocks{
        ENERGYTESTBLOCK("energy_block_test", "energy_block_test");

        private String unlocalizedName;
        private String registryName;

        DynamismBlocks(String unlocalizedName, String registryName) {
            this.unlocalizedName = unlocalizedName;
            this.registryName = registryName;
        }

        public String getUnlocalizedName() {
            return unlocalizedName;
        }

        public String getRegistryName() {
            return registryName;
        }
    }
}
