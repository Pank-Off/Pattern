package com.pattern.behavioral.chain_of_responsibility;

public class Report extends Notifier {

    public Report(int priority) {
        super(priority);
    }

    @Override
    void writeMessage(String message) {
        System.out.println("Report: " + message);
    }
}
