package com.github.jameswilsonproductions.dynamism.lib;

/**
 * Created by JamesWilsonProductions on 2/16/2017.
 * Do not distribute without proper permission.
 */

public enum Energy {
    DF("dynamismFlux", "energy_dynamism_flux");

    private String name;
    private String symbol;

    Energy(String name, String symbol) {
        this.name = name;
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public String getSymbol() {
        return symbol;
    }
}
