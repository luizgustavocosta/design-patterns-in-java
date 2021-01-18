package com.gof.structural.adapter.domain;

public class CathodeRayTube implements TV<RCAConnector> {

    private final RCAConnector videoInput;
    private final String name;

    public CathodeRayTube(String name, RCAConnector videoInput) {
        this.videoInput = videoInput;
        this.name = name;
    }

    @Override
    public String display() {
        return "CRT";
    }

    @Override
    public ConnectorPort getInput() {
        return videoInput;
    }

    @Override
    public String plug(RCAConnector type) {
        return "Plug in place colors yellow, red and white";
    }

    @Override
    public String name() {
        return this.name;
    }

    @Override
    public String toString() {
        return "CathodeRayTube{" +
                "videoInput=" + videoInput +
                ", name='" + name + '\'' +
                '}';
    }
}

