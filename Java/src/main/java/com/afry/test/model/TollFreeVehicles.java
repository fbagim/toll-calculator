package com.afry.test.model;

/**
 * TollFreeVehicles - to specify Toll Free Vehicle types
 */
public enum TollFreeVehicles {
    MOTORBIKE("Motorbike"),
    TRACTOR("Tractor"),
    EMERGENCY("Emergency"),
    DIPLOMAT("Diplomat"),
    FOREIGN("Foreign"),
    MILITARY("Military");
    private final String type;
    TollFreeVehicles(String type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }
}
