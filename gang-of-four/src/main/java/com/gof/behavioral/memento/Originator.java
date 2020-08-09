package com.gof.behavioral.memento;

import java.util.Objects;

/**
 * ConstraintSolver
 * Creates a memento containing a snapshot of its current internal state.
 * Uses the memento to restore its internal state.
 */
public class Originator {

    private State<?> state;

    public Originator(State<?> state) {
        this.state = state;
    }

    public void setState(State<?> state) {
        this.state = state;
    }

    public void setMemento(Memento<?> memento) {
        Objects.requireNonNull(memento);
        this.state = memento.getState();
    }

    public Memento<?> createMemento(){
        return new Memento<>(this.state);
    }
}
