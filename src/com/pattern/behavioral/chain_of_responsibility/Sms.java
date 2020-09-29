package com.pattern.behavioral.chain_of_responsibility;

public class Sms extends Notifier {

    public Sms(int priority) {
        super(priority);
    }

    @Override
    void writeMessage(String message) {
        System.out.println("Sms: " + message);
    }
}
