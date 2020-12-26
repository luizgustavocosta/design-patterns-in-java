package com.gof.structural.adapter;

public class VGA implements Connector {

    @Override
    public boolean connect(ConnectorType connectorType) {
        return false;
    }
}
