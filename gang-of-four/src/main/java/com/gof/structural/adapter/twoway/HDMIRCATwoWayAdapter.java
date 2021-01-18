package com.gof.structural.adapter.twoway;

import com.gof.structural.adapter.domain.HDMIConnector;
import com.gof.structural.adapter.domain.RCAConnector;

public class HDMIRCATwoWayAdapter implements HDMIConnector, RCAConnector {

    private HDMIConnector hdmi;
    private RCAConnector rca;
    private final int connectors;
    private final String name;

    public HDMIRCATwoWayAdapter(HDMIConnector hdmi) {
        this.hdmi = hdmi;
        this.connectors = hdmi.connectors();
        this.name = hdmi.name();
    }

    public HDMIRCATwoWayAdapter(RCAConnector rca) {
        this.rca = rca;
        this.connectors = rca.connectors();
        this.name = rca.name();
    }

    @Override
    public String name() {
        return this.name;
    }

    @Override
    public int connectors() {
        return this.connectors;
    }

    @Override
    public String speed() {
        return hdmi.speed();
    }

    @Override
    public String connectCable() {
        return hdmi.connectCable();
    }

    @Override
    public String connectCables() {
        return rca.connectCables();
    }
}
