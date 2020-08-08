package com.gof.behavioral.memento;

import java.util.List;

public class State<T> {

    private final List<T> states;

    private State(List<T> states) {
        this.states = states;
    }

    public List<T> getStates() {
        return states;
    }

    public static StateBuilder getAStateBuilder() {
        return new StateBuilder();
    }

    @Override
    public String toString() {
        return "State{" +
                "states=" + states +
                '}';
    }

    public static class StateBuilder {
        private List<?> states;

        public StateBuilder withStates(List<?> states) {
            this.states = states;
            return this;
        }

        public State<?> create() {
            return new State<>(states);
        }
    }
}
