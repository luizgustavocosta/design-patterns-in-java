package com.gof.structural.adapter.object;

import com.gof.structural.adapter.domain.*;
import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Adapter by object")
class HDMIAdapterTest implements WithAssertions {


    @DisplayName("Connecting RCA and HDMI")
    @Test
    void givenAnTVWhenHaveRCAAndConsoleHaveHDMIThenConnectThem() {

        final TV<RCAConnector> rcaTV = DeviceFactory.createVintageTV();
        final Console<HDMIConnector> hdmiConsole = DeviceFactory.createPSFive();

        final String tvMessage = rcaTV.plug(new HDMIAdapter(hdmiConsole.getOutput()));

        assertThat(tvMessage).as("The tv message").isEqualTo("Plug in place colors yellow, red and white");

    }

}