package com.gof.structural.adapter.object;

public class HDMIAdapter implements RCAConnector {

    private final HDMIConnector hdmi;

    public HDMIAdapter(HDMIConnector hdmi) {
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
    public String connectCables() {
        // Electronic tasks here to convert the signal to HDMI
        // For instance hdmi.getPins() of audio and video
        return hdmi.connectCable();
    }
}
