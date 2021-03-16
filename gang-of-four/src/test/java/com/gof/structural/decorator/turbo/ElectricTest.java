package com.gof.structural.decorator.turbo;

import com.gof.structural.decorator.Electrical;
import com.gof.structural.decorator.Engine;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ElectricTest {

    @DisplayName("Electric Turbo Charger by software")
    @Test
    void givenAnInitialHpApplyTuningTurboCharger() {
        Engine tesla = new Electrical(463);
        tesla = new Electric(tesla);
        int expected = 694;
        assertThat(expected).as("HP expected doesn't match").isEqualTo(tesla.horsePower());
    }

}