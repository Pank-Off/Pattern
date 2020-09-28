package com.pattern.creational.builder;

public class Director {
    IBuilder builder;

    void setBuilder(IBuilder builder) {
        this.builder = builder;
    }

    Car createCar() {
        builder.createCar();
        builder.setGPS();
        builder.setName();
        builder.setNumber();
        Car car = builder.getCar();
        return car;
    }
}
