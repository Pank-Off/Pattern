package com.pattern.structural.facade;

import java.util.ArrayList;
import java.util.List;

public class Director {
    List<Worker> workers = new ArrayList<>();
    boolean isFinished;

    void observe(Worker worker) {
        workers.add(worker);
    }

    boolean isFinished() {
        if (!isFinished) {
            System.out.println("Waiting...");
            isFinished = true;
        }
        return isFinished;
    }
}
