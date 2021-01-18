package com.gof.structural.adapter.clazz;

import com.gof.structural.adapter.domain.*;
import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.regex.Pattern;

@DisplayName("Adapter by class")
class RCAClassAdapterTest implements WithAssertions {

    @DisplayName("Connecting HDMI and RCA")
    @Test
    void givenAnTVWhenHaveHDMIAndConsoleHaveRCAThenConnectThem() {

        final TV<HDMIConnector> hdmiTV = DeviceFactory.createQLedTV();
        final Console<RCAConnector> rcaConsole = DeviceFactory.createSNES();

        final String tvMessage = hdmiTV.plug(new RCAClassAdapter(rcaConsole.getOutput()));

        assertThat(tvMessage).as("The expected message should be")
                .containsPattern(Pattern.compile("Connecting device [a-zA-Z]*. Done, enjoy your time :\\)$"));
    }

}

