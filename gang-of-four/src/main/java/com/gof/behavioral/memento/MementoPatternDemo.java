package com.gof.behavioral.memento;

import java.util.Arrays;
import java.util.List;

@SuppressWarnings("ALL")
public class MementoPatternDemo {

    public static void main(String[] args) {

        Originator<List<State>> firstOriginator =
                new Originator(State.getAStateBuilder().withStates(Arrays.asList("1","2","3")).create());

        Caretaker careTaker = new Caretaker<>();

        final Memento<List<State>> firstMemento = firstOriginator.createMemento();
        careTaker.add(firstMemento);

        Originator<List<Integer>> secondOriginator =
                new Originator(State.getAStateBuilder().withStates(Arrays.asList(99,42,50)).create());

        careTaker.add(firstMemento);
        careTaker.add(secondOriginator.createMemento());

        System.out.println("Mementos = " + careTaker);
        System.out.println("n element = " + careTaker.get());
        System.out.println("n - 1 element  = " + careTaker.get());

    }
}

