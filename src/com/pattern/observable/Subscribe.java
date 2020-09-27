package com.pattern.observable;

import java.util.List;

public class Subscribe implements Observer {

    String name;

    Subscribe(String name) {
        this.name = name;
    }

    @Override
    public void update(List<String> list) {
        System.out.println(name + " " + list);
    }
}
