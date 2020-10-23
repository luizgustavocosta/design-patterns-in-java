package com.gof.behavioral.decorator.turbo;

import com.gof.behavioral.decorator.Engine;
import com.gof.behavioral.decorator.TwoStroke;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * The type Single test.
 */
class SingleTest {

    /**
     * Given an initial hp apply tuning turbo charger.
     */
    @DisplayName("Single Turbo Charger")
    @Test
    void givenAnInitialHpApplyTuningTurboCharger() {
        Engine truckCommerTS3 = new TwoStroke(107);
        truckCommerTS3 = new Single(truckCommerTS3);
        int expected = 374;
        assertThat(expected).as("HP expected doesn't match").isEqualTo(truckCommerTS3.horsePower());
    }

}