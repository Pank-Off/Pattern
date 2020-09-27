package com.pattern.observable;

public interface Publisher {
    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyAllObservers();
}
