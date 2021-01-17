package com.gof.structural.adapter.object;

import java.util.Objects;

public class RCA implements RCAConnector {

    private final String name;

    private static final RCA INSTANCE = new RCA();

    private RCA() {
        this.name = "RCA";
    }

    public static RCA getInstance() { return INSTANCE; }

    @Override
    public String name() {
        return name;
    }

    @Override
    public int connectors() {
        return 3;
    }

    @Override
    public String connectCables() {
        return "A/V separated via RCA";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RCA rca = (RCA) o;
        return name.equals(rca.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
