package com.gof.structural.adapter.twoways;

import com.gof.structural.adapter.object.HDMI;
import com.gof.structural.adapter.object.HDMIConnector;
import com.gof.structural.adapter.object.RCA;
import com.gof.structural.adapter.object.RCAConnector;

/**
 * Mocking the Two way by interface, since in GOF book they handle this by class
 */
public class HDMIRCATwoWayAdapter implements HDMIConnector, RCAConnector {

    private HDMI hdmi;
    private RCA rca;
    private final int connectors;
    private final String name;

    public HDMIRCATwoWayAdapter(HDMI hdmi) {
        this.hdmi = hdmi;
        this.connectors = hdmi.connectors();
        this.name = hdmi.name();
    }

    public HDMIRCATwoWayAdapter(RCA rca) {
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
