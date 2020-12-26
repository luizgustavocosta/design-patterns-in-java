package com.gof.structural.adapter;

public class USB implements Connector {

    @Override
    public boolean connect(ConnectorType connectorType) {
        return false;
    }
}
