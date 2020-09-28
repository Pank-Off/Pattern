package com.pattern.creational.builder;

public class CarBuilder implements IBuilder {
    private CityCar car;

    @Override
    public void createCar() {
        car = new CityCar();
    }

    @Override
    public void setName() {
        car.setName("Logan");
    }

    @Override
    public void setNumber() {
        car.setNumber(12345);
    }

    @Override
    public void setGPS() {
        car.setGPS(false);
    }

    @Override
    public Car getCar() {
        return car;
    }

}
