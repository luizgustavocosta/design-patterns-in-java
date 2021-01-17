package com.gof.structural.adapter.object;

import java.util.Objects;

public class RCA implements RCAConnector {

    private final String name;

    public RCA(String name) {
        this.name = name;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public int connectors() {
        return 3;
    }

    @Override
    public boolean ready() {
        return false;
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
