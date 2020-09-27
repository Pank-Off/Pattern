package com.pattern.adapter;

public class AdapterToJavaClass extends JavaApp implements Database {
    @Override
    public void insert() {
        insertData();
    }

    @Override
    public void remove() {
        removeData();
    }

    @Override
    public void update() {
        updateData();
    }

    @Override
    public void select() {
        selectData();
    }
}
