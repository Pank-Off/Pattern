package com.pattern.observable;

import java.util.ArrayList;
import java.util.List;

public class Shop implements Publisher {
    private List<Observer> observers = new ArrayList<>();
    private List<String> vacancies = new ArrayList<>();

    void addVacancy(String vacancy) {
        vacancies.add(vacancy);
        notifyAllObservers();
    }

    void removeVacancy(String vacancy) {
        vacancies.remove(vacancy);
        notifyAllObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update(vacancies);
        }
    }
}
