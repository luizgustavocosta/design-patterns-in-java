package com.gof.structural.bridge.abstraction;

import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Vehicle")
class VehicleTest implements WithAssertions {

    @DisplayName("Validate parameter")
    @Test
    void whenSendAContainerThenValidate() {
        Throwable throwable = catchThrowable(() -> {
            new Vehicle(null) {
                @Override
                public float getCapacity() {
                    return 0;
                }
            };
        });

        assertThat(throwable)
                .as("Has the message")
                .hasMessage("The vehicle should have a container");
    }
}