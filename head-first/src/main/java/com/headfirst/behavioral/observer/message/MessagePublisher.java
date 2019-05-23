package com.headfirst.behavioral.observer.message;

import java.util.ArrayList;
import java.util.List;

public class MessagePublisher implements Subject {

    private List<Observer> observers = new ArrayList<>();

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyUpdate(Message message) {
        observers.forEach(observer ->  observer.notifyUpdate(message));
    }
}
