package com.pattern.behavioral.chain_of_responsibility;

public abstract class Notifier {
    private Notifier next;
    private int priority;

    public Notifier(int priority) {
        this.priority = priority;
    }

    void setNext(Notifier next) {
        this.next = next;
    }

    void notifyManager(String message, int level) {
        if (priority <= level) {
            writeMessage(message);
        }
        if (next != null) {
            next.notifyManager(message, level);
        }
    }

    abstract void writeMessage(String message);
}
