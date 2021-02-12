package com.gof.structural.bridge.abstraction;

import com.gof.structural.bridge.implementor.Container;
import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
@DisplayName("Water craft")
class WaterCraftTest implements WithAssertions {

    private Container container;

    @BeforeEach void init(@Mock Container container) {
        this.container = container;
    }

    @DisplayName("Check the capacity")
    @Test
    void whenRequestCapacityUseTheVehicle() {
        float expected = 266_000f;
        final WaterCraft waterCraft = new WaterCraft(container);
        assertThat(expected)
                .as("Values aren't equals")
                .isEqualTo(waterCraft.getCapacity());
    }
}