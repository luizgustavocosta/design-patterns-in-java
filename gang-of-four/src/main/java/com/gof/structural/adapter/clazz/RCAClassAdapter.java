package com.gof.structural.adapter.clazz;

import com.gof.structural.adapter.domain.HDMIConnector;
import com.gof.structural.adapter.domain.RCA;
import com.gof.structural.adapter.domain.RCAConnector;

import java.util.Objects;

public class RCAClassAdapter extends RCA implements HDMIConnector {

    private final RCAConnector connector;

    public RCAClassAdapter(RCAConnector connector) {
        this.connector = connector;
    }

    @Override
    public String speed() {
        return "N/A";
    }

    @Override
    public String connectCable() {
        // Get the correct signal for audio and video
        // Electronic stuffs :)
        return connector.connectCables();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        RCAClassAdapter that = (RCAClassAdapter) o;
        return Objects.equals(connector, that.connector);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), connector);
    }
}
