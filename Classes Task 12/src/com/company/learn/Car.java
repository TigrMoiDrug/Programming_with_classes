package com.company.learn;

public class Car {

    private String brand;
    private int fuelAmount;
    private Wheel [] wheels;
    private int maxFuel;           // пусть у этой машины бак будет 70 литров

    public Car (String brand, int fuelAmount, Wheel[] wheels, int maxFuel){
        this.brand = brand;
        this.fuelAmount = fuelAmount;
        this.wheels = wheels;
        this.maxFuel = maxFuel;
    }

    public void setFuelAmount(int fuelAmount) {
        if (fuelAmount <= maxFuel){
            this.fuelAmount = fuelAmount;
        }
    }

    public void setWheels(Wheel[] wheels) {
        int numberOfWheels = 4;
        if (wheels.length == numberOfWheels){
            for (int i = 0; i < numberOfWheels; i++){
                wheels[i] = new Wheel(false);
            }
        }
        else {
            System.out.println("Проблемы с колёсами!");
        }
    }

    public void setMaxFuel(int maxFuel) {
        this.maxFuel = maxFuel;
    }

    public int getMaxFuel() {
        return maxFuel;
    }

    public String getBrand() {
        return brand;
    }

    public int getFuelAmount() {
        return fuelAmount;
    }

    public Wheel[] getWheels() {
        return wheels;
    }

    public void fuel (){
        if (getFuelAmount() < getMaxFuel() ){
            int count;

            count = getMaxFuel() - getFuelAmount();
            setFuelAmount(getFuelAmount() + count);

            System.out.println("Машина запрвлена на "+count+" литров.");
            System.out.println("Сейчас в баке "+getFuelAmount()+" литров.");
        }
    }

    public void repairWheels(){
        for (Wheel wheel : wheels) {
            Wheel.repair(wheel);
        }
    }

    public boolean ride (Engine engine){
        boolean drive = false;
       if (getFuelAmount() > 0 && getWheels().length == 4 && engine.isRunning()){
           drive = true;
       }
       return drive;
    }
}
