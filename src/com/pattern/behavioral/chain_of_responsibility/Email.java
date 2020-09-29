package com.pattern.behavioral.chain_of_responsibility;

public class Email extends Notifier {

    public Email(int priority) {
        super(priority);
    }

    @Override
    void writeMessage(String message) {
        System.out.println("Email: " + message);
    }
}
