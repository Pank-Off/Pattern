package com.pattern.structural.bridge;

public class Game extends Program {

    public Game(Developer developer) {
        super(developer);
    }

    @Override
    void doWork() {
        developer.writeCode();
        System.out.println(" play game");
    }

}
