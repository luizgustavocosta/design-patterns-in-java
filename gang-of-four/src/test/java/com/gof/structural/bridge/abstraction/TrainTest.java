package com.gof.structural.bridge.abstraction;

import com.gof.structural.bridge.implementor.Container;
import com.gof.structural.bridge.implementor.dimension.Dimension;
import com.gof.structural.bridge.implementor.dimension.InteriorMeasurement;
import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.*;

@DisplayName("Train")
class TrainTest implements WithAssertions {

    @Mock
    Container container;
    @Mock
    Dimension dimension;
    @Mock
    InteriorMeasurement interiorMeasurement;

    private final float capacity = 1f;

    @BeforeEach
    void init() {
        MockitoAnnotations.initMocks(this);
        when(container.getDimension()).thenReturn(dimension);
        when(dimension.getInteriorMeasurement()).thenReturn(interiorMeasurement);
        when(interiorMeasurement.getCapacity()).thenReturn(capacity);
    }

    @DisplayName("Check the capacity")
    @Test
    void whenRequestCapacityUseTheVehicle() {
        float trainCapacity = 42;
        final Train vehicle = new Train(container);

        assertThat(vehicle.getCapacity())
                .as("The capacity expected is "+trainCapacity)
                .isEqualTo(capacity * trainCapacity);

    }

}