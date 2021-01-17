package com.gof.structural.adapter.domain;

public interface TV<T> {

    String name();
    String display();
    ConnectorPort getInput();
    String plug(T connector);
}
