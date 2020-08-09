package com.gof.behavioral.memento;

import java.util.List;
import java.util.Stack;

/**
 * Undo mechanism
 * Is responsible for the memento’s safekeeping.
 * Never operates on or examines the contents of a memento.
 */
public class Caretaker {

    private final Stack<Memento<?>> mementos = new Stack<>();

    public void add(Memento<?> memento){
        mementos.push(memento);
    }

    public List<Memento<?>> getMementos() {
        return mementos;
    }

    public Memento<?> get(){
        if (!mementosAvailable()) {
            throw new IllegalStateException("There is no memento's available");
        }
        return mementos.pop();
    }

    public boolean mementosAvailable() {
        return mementos.size() != 0;
    }
}