package com.pattern.structural.bridge;

public class SQLProgram extends Program {
    public SQLProgram(Developer developer) {
        super(developer);
    }

    @Override
    void doWork() {
        developer.writeCode();
        System.out.println(" createQuery");
    }

}
