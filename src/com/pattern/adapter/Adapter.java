package com.pattern.adapter;

public class Adapter {
    public static void main(String[] args) {
        Database database = new AdapterToJavaClass();
        database.insert();
        database.remove();
        database.select();
        database.update();
    }
}
