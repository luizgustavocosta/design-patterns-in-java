package com.gof.behavioral.memento;

import java.util.Stack;

/**
 * Undo mechanism
 * Is responsible for the memento’s safekeeping.
 * Never operates on or examines the contents of a memento.
 */
public class Caretaker {

    private final Stack<Memento<?>> mementos = new Stack<>();

    public void add(Memento<?> memento){
        mementos.add(memento);
    }

    public Memento<?> get(){
        if (0 == mementosAvailable()) {
            throw new IllegalStateException("There is no memento's available");
        }
        return mementos.pop();
    }

    public int mementosAvailable() {
        return mementos.size();
    }
}