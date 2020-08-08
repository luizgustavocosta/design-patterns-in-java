package com.gof.behavioral.memento;

import java.util.Arrays;

public class AppMainMemento {

    public static void main(String[] args) {

        final State<?> firstCheckPoint = State.getAStateBuilder()
                .withStates(Arrays.asList("1", "2", "3"))
                .create();
        Originator firstOriginator = new Originator(firstCheckPoint);

        Caretaker careTaker = new Caretaker();

        careTaker.add(firstOriginator.createMemento());

        final State<?> secondCheckPoint = State.getAStateBuilder()
                .withStates(Arrays.asList(58, 62, 70, 94))
                .create();

        Originator secondOriginator = new Originator(secondCheckPoint);
        careTaker.add(secondOriginator.createMemento());

        System.out.println("Memento works as a stack");
        System.out.println("Memento's available = " + careTaker.mementosAvailable());
        System.out.println("First memento  = " + careTaker.get());
        System.out.println("Second memento  = " + careTaker.get());
        System.out.println("Third memento  = " + careTaker.get());

    }
}

