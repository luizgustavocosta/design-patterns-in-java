package com.gof.structural.adapter.object;
//https://en.wikipedia.org/wiki/Television_set
public interface TV {

    String name();
    String display();
    //tuner
    //loudspeakers
    ConnectorPort getInput();
}
