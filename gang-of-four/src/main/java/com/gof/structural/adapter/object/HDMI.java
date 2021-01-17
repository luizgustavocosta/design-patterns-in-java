package com.gof.structural.adapter.object;

import java.util.Objects;

public class HDMI implements ConnectorPort {

    private final String name;

    public HDMI(String name) {
        this.name = name;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public int connectors() {
        return 1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HDMI hdmi = (HDMI) o;
        return Objects.equals(name, hdmi.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
