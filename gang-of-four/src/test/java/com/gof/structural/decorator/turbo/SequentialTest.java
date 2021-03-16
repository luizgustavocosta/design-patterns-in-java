package com.gof.structural.decorator.turbo;

import com.gof.structural.decorator.Engine;
import com.gof.structural.decorator.FourStroke;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * The type Sequential test.
 */
class SequentialTest {

    /**
     * Given an initial hp apply tuning turbo charger.
     */
    @DisplayName("Sequential Turbo Charger")
    @Test
    void givenAnInitialHpApplyTuningTurboCharger() {
        Engine mercedesAMG = new FourStroke(416);
        mercedesAMG = new Sequential(mercedesAMG);
        int expected = 540;
        assertThat(expected).as("HP expected doesn't match").isEqualTo(mercedesAMG.horsePower());
    }
}