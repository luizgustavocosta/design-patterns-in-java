package com.gof.structural.adapter.domain;

import java.util.Objects;

public class HDMI implements HDMIConnector {

    private final String name;

    private static final HDMI INSTANCE = new HDMI();

    private HDMI() {
        this.name = "HDMI";
    }

    public static HDMI getInstance() { return INSTANCE; }

    @Override
    public String name() {
        return name;
    }

    @Override
    public String speed() {
        return "48 Gbit/s";
    }

    @Override
    public String connectCable() {
        return "Video and audio together via HDMI";
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
