package com.gof.behavioral.decorator.turbo;

import com.gof.behavioral.decorator.Engine;
import com.gof.behavioral.decorator.FourStroke;
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
        int expected = 541;
        assertThat(expected).as("HP expected doesn't match").isEqualTo(mercedesAMG.horsePower());
    }
}