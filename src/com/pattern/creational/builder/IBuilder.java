package com.pattern.creational.builder;

public interface IBuilder {
    void createCar();

    void setName();

    void setNumber();

    void setGPS();

    Car getCar();
}
