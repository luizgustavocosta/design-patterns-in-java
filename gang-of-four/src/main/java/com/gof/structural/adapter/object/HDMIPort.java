package com.gof.structural.adapter.object;

import java.util.Arrays;
import java.util.List;


//https://en.wikipedia.org/wiki/HDMI
public interface HDMIPort extends ConnectorPort {

    default List<String> getPins() {
        return
                Arrays.asList(
                        "TMDS Data2+",
                        "TMDS Data2 Shield",
                        "TMDS Data2−",
                        "TMDS Data1+",
                        "TMDS Data1 Shield",
                        "TMDS Data1−",
                        "TMDS Data0",
                        "TMDS Data0 Shield",
                        "TMDS Data0−",
                        "TMDS Clock+",
                        "TMDS Clock Shield",
                        "TMDS Clock−",
                        "CEC",
                        "Reserved (HDMI 1.0–1.3a)",
                        "SCL (I²C serial clock for DDC)",
                        "SDA (I²C serial data for DDC)",
                        "Ground (for DDC, CEC, ARC, and HEC)",
                        "+5 V (min. 0.055 A)[3]",
                        "Hot Plug Detect (all versions)");
    }
}
