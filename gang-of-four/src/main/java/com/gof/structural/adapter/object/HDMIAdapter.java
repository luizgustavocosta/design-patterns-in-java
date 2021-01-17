package com.gof.structural.adapter.object;

public class HDMIAdapter implements RCAConnector {

    private final HDMI hdmi;

    public HDMIAdapter(HDMI hdmi) {
        this.hdmi = hdmi;
    }

    @Override
    public String name() {
        return "HDMI";
    }

    @Override
    public int connectors() {
        return hdmi.connectors();
    }

    @Override
    public boolean ready() {
        // Electronic tasks here to convert the signal
        return true;
    }

}
