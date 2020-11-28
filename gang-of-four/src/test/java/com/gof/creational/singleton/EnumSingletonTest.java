package com.gof.creational.singleton;

import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertAll;

@DisplayName("Enum Singleton test")
class EnumSingletonTest implements WithAssertions {

    static List<Integer> hashCode = new ArrayList<>();

    @DisplayName("Singleton enum test")
    @RepeatedTest(value = 3, name = "Request the instance Enum by the {currentRepetition} time")
    void testWithEnumSource() {
        final EnumSingleton instance = EnumSingleton.INSTANCE;
        assertAll(() -> {
            final MyService myService = instance.myService;
            assertThat(myService).as("My Service should be an instance").isNotNull();
            assertThat(myService.random()).as("Is not null").isNotNull();
            hashCode.add(myService.hashCode());
        });
    }

    @AfterAll
    static void checkAllInstances() {
        final int generatedClasses = new HashSet<>(hashCode).size();
        int expectedInstances = 1;

        Assertions.assertEquals(expectedInstances, generatedClasses,
                "The number of instances should be 1, since is Singleton");
    }
}