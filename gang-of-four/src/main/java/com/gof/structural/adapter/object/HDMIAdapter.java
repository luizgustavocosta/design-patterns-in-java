package com.gof.structural.adapter.object;

public class HDMIAdapter implements RCAConnector {

    private final HDMI hdmi;

    public HDMIAdapter(HDMI hdmi) {
        this.hdmi = hdmi;
    }

    @Override
    public String name() {
        return hdmi.name();
    }

    @Override
    public int connectors() {
        return hdmi.connectors();
    }

    @Override
    public boolean receiveSignal() {
        // Electronic tasks here to convert the signal HDMI to RCA
        // For instance hdmi.getPins() of audio and video
        return true;
    }
}
