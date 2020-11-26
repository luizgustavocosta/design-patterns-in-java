package com.gof.creational.singleton.quarkus;

import io.quarkus.test.junit.QuarkusTest;
import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.*;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

@QuarkusTest
@TestInstance(TestInstance.Lifecycle.PER_METHOD)
@DisplayName("Quarkus Singleton")
class MyServiceInQuarkusTest implements WithAssertions {

    static List<Integer> hashCode = new ArrayList<>();

    @Inject
    MyServiceInQuarkus service;

    @RepeatedTest(value = 3, name = "Request the bean by the {currentRepetition} time")
    @DisplayName("Singleton test")
    void whenRequestInstanceReturnTheSame() {
        assertThat(service.generateRandomNumber())
                .as("Generating some cool number")
                .isBetween(101L, 200L);

        hashCode.add(service.hashCode());
    }

    @AfterAll
    static void testIt() {
        final int generatedClasses = new HashSet<>(hashCode).size();
        int expectedInstances = 1;

        Assertions.assertEquals(expectedInstances, generatedClasses,
                "The number of instances should be 1, since is Singleton");
    }
}