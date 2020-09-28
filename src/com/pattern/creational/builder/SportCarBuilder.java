package com.pattern.creational.builder;

public class SportCarBuilder implements IBuilder {
    private SportCar car;

    @Override
    public void createCar() {
        car = new SportCar();
    }

    @Override
    public void setName() {
        car.setName("Ferrari");
    }

    @Override
    public void setNumber() {
        car.setNumber(53645);
    }

    @Override
    public void setGPS() {
        car.setGPS(true);
    }

    @Override
    public Car getCar() {
        return car;
    }
}
