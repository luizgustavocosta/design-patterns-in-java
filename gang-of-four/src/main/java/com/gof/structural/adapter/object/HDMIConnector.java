package com.gof.structural.adapter.object;

public interface HDMIConnector extends ConnectorPort {

    String name();
    String speed();
    String connectCable();
}
