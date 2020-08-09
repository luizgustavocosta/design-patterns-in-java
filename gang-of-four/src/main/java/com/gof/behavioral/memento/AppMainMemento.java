package com.gof.behavioral.memento;

import java.util.Arrays;
import java.util.Collections;
import java.util.Optional;

public class AppMainMemento {

    public static void main(String[] args) {

        Originator originator = new Originator(State.getAStateBuilder()
                .withStates(Arrays.asList("2005", "2006"))
                .create());

        final Caretaker careTaker = new Caretaker();
        careTaker.add(originator.createMemento());

        originator.setState(State.getAStateBuilder()
                .withStates(Arrays.asList("2019", "2018", "2017"))
                .create());

        careTaker.add(originator.createMemento());

        originator.setState(State.getAStateBuilder()
                .withStates(Collections.singletonList("2020"))
                .create());

        careTaker.add(originator.createMemento());

        while (careTaker.mementosAvailable()) {
            final Memento<?> memento = careTaker.get();
            final Optional<?> findLastYear = memento.getState().getStates().stream()
                    .filter(state -> !state.equals("2020"))
                    .findFirst();
            if (findLastYear.isPresent()) {
                originator.setMemento(memento);
                System.out.println("Find the years " + originator.createMemento().getState() + ", do you want to go back ?");
            } else {
                System.out.println("Looking for other year checkpoint, different from 2020 ..:"+memento);
            }
        }
    }
}

