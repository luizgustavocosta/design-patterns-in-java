package com.gof.structural.decorator;

import com.gof.structural.decorator.turbo.Single;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TwoStrokeTest {

    @Test
    void givenAnInitialHpApplyTuningTurboCharger() {
        Engine truckCommerTS3 = new TwoStroke(107);
        truckCommerTS3 = new Single(truckCommerTS3);

        assertThat(truckCommerTS3.horsePower).as("").isEqualTo(107);
    }

}