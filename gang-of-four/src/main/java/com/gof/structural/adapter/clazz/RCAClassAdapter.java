package com.gof.structural.adapter.clazz;

import com.gof.structural.adapter.domain.HDMIConnector;
import com.gof.structural.adapter.domain.RCA;

public class RCAClassAdapter extends RCA implements HDMIConnector {

    public RCAClassAdapter() {
        super();
    }

    @Override
    public String speed() {
        return "N/A";
    }

    @Override
    public String connectCable() {
        // Get the correct signal for audio and video
        // Electronic stuffs :)
        return super.connectCables();
    }
}
