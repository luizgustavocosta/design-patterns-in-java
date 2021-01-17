package com.gof.structural.adapter.domain;

public interface HDMIConnector extends ConnectorPort {

    String name();
    String speed();
    String connectCable();
}
