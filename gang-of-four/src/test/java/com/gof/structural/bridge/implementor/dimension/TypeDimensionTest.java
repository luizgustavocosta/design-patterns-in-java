package com.gof.structural.bridge.implementor.dimension;

import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Type dimension")
class TypeDimensionTest implements WithAssertions {

    @ParameterizedTest
    @EnumSource(TypeDimension.class)
    @DisplayName("Pass through dimensions")
    void whenGiveAnEntryThenValidate(TypeDimension typeDimension) {
        final Dimension dimension = typeDimension.getDimension();
        assertAll(() -> {
            assertThat(dimension.getContainerWeight()).as("Has weight value").isNotNull();
            assertThat(dimension.getDoorOpen()).as("Has door open value").isNotNull();
            assertThat(dimension.getInteriorMeasurement()).as("Has interior").isNotNull();
        });
    }

}