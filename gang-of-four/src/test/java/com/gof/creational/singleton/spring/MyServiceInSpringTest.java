package com.gof.creational.singleton.spring;

import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

@SpringBootTest
@TestInstance(TestInstance.Lifecycle.PER_METHOD)
@DisplayName("Spring Singleton")
class MyServiceInSpringTest implements WithAssertions {

    static List<Integer> hashCode = new ArrayList<>();

    @Autowired
    MyServiceInSpring service;

    @RepeatedTest(value = 3, name = "Request the bean by the {currentRepetition} time")
    @DisplayName("Singleton test")
    void whenRequestInstanceReturnTheSame() {
        assertThat(service.generateRandomNumber())
                .as("Generate some cool number")
                .isBetween(0L, 100L);

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