package com.pattern.creational.builder;

public class SportCar implements Car {
    private String name;
    private int number;
    private boolean GPS;

    @Override
    public String toString() {
        return "SportCar{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", GPS=" + GPS +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setGPS(boolean GPS) {
        this.GPS = GPS;
    }

}
