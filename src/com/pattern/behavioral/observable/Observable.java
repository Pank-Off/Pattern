package com.pattern.behavioral.observable;

public class Observable {

    public static void main(String[] args) {
        Shop shop = new Shop();
        shop.addVacancy("Cooker");
        shop.addVacancy("Waiter");
        shop.addObserver(new Subscribe("First"));
        shop.addObserver(new Subscribe("Second"));
        shop.addVacancy("Director");
        shop.removeVacancy("Cooker");
        shop.addObserver(new Subscribe(("Third")));
        shop.addVacancy("Kek");
    }
}
