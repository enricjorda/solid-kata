package com.codurance.lsp;

public class ElectricCar extends Vehicle implements ElectricVehicle, PetrolVehicle {

    private static final int BATTERY_FULL = 100;
    private int batteryLevel;

    public void fillUpWithFuel() {

        //throw new UnsupportedOperationException("It's an electric car");
        return;
    }

    @Override
    public void chargeBattery() {
        batteryLevel = BATTERY_FULL;
    }

    public int batteryLevel() {
        return batteryLevel;
    }

    @Override
    public void fill() {
        chargeBattery();
    }
}
