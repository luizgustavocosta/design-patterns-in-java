package com.gof.behavioral.memento;

/**
 * ConstraintSolver
 * Creates a memento containing a snapshot of its current internal state.
 * Uses the memento to restore its internal state.
 * @param <T>
 */
public class Originator<T> {

    private State<T> state;

    public Originator(State<T> state) {
        this.state = state;
    }


    public void setMemento(Memento<T> memento) {
        this.state = memento.getState();
    }

    public Memento<T> createMemento(){
        return new Memento<T>(state);
    }
}
