package com.gof.behavioral.memento;

import java.util.*;

/**
 * Undo mechanism
 * Is responsible for the memento’s safekeeping.
 * Never operates on or examines the contents of a memento.
 */
public class Caretaker<T> {

    private final Stack<Memento<T>> mementos = new Stack<>();

    public void add(Memento<T> memento){
        mementos.add(memento);
    }

    public Memento<T> get(){
        return mementos.pop();
    }
}