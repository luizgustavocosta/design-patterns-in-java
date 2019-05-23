package com.headfirst.behavioral.observer.message;

interface Subject extends Observer {

    void attach(Observer observer);
    void detach(Observer observer);
}
