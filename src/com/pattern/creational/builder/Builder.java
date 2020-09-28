package com.pattern.creational.builder;


public class Builder {
    public static void main(String[] args) {
        Director director = new Director();
        IBuilder builder = new CarBuilder();
        director.setBuilder(builder);
        Car car = director.createCar();
        System.out.println(car);
    }
}
