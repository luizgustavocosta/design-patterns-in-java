package com.gof.structural.adapter.object;

import java.util.Objects;

public class HDMI implements HDMIPort {

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
