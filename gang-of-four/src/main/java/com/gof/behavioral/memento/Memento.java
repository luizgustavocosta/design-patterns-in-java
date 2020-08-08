package com.gof.behavioral.memento;

/**
 * SolverState
 * Stores internal state of the Originator object.
 * The memento may store as much or as little of the originator’s internal state as necessary at its originator’s discretion.
 * Protects against access by objects other than the originator. Mementos have effectively two interfaces.
 * Caretaker sees a narrow interface to the Memento—it can only pass the memento to other objects.
 * Originator, in contrast, sees a wide interface, one that lets it access all the data necessary to restore itself
 * to its previous state.
 * Ideally, only the originator that produced the memento would be permitted to access the memento’s internal state.
 * @param <T>
 */
public class Memento<T> {

    private final State<T> state;

    public Memento(State<T> state){
        this.state = state;
    }

    public State<T> getState(){
        return state;
    }

    @Override
    public String toString() {
        return "Memento{" +
                "state=" + state.getStates() +
                '}';
    }
}