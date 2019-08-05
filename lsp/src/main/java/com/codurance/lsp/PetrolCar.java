package com.codurance.lsp;

public class PetrolCar extends Vehicle implements PetrolVehicle, ElectricVehicle {
    private static final int FUEL_TANK_FULL = 100;
    private int fuelTankLevel = 0;

    @Override
    public void fillUpWithFuel() {
        this.fuelTankLevel = FUEL_TANK_FULL;
    }

    public void chargeBattery() {
       // throw new UnsupportedOperationException("A petrol car cannot be recharged");
        return;
    }

    public int fuelTankLevel() {
        return fuelTankLevel;
    }

    @Override
    public void fill() {
        fillUpWithFuel();
    }
}
