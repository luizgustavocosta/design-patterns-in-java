package com.gof.structural.adapter.domain;

public class QuantumLightEmittingDiode implements TV<HDMIConnector> {

    private final HDMIConnector input;
    private final String name;

    public QuantumLightEmittingDiode(HDMIConnector input, String name) {
        this.input = input;
        this.name = name;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public String display() {
        return "QLED";
    }

    @Override
    public ConnectorPort getInput() {
        return input;
    }

    @Override
    public String plug(HDMIConnector type) {
        return "connecting device..."+input.name();
    }

    @Override
    public String toString() {
        return "QuantumLightEmittingDiode{" +
                "input=" + input +
                ", name='" + name + '\'' +
                '}';
    }
}
