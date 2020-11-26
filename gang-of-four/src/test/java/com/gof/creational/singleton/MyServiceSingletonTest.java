package com.gof.creational.singleton;

import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

@TestInstance(TestInstance.Lifecycle.PER_METHOD)
@DisplayName("Quarkus Singleton")
class MyServiceSingletonTest implements WithAssertions {

    static List<Integer> hashCode = new ArrayList<>();

    @AfterAll
    static void testIt() {
        final int generatedClasses = new HashSet<>(hashCode).size();
        int expectedInstances = 1;

        Assertions.assertEquals(expectedInstances, generatedClasses,
                "The number of instances should be 1, since is Singleton");
    }

    @RepeatedTest(value = 3, name = "Request the bean by the {currentRepetition} time")
    @DisplayName("Singleton test")
    void whenRequestInstanceReturnTheSame() {
        short tasks = 1;
        final MyServiceSingleton service = MyServiceSingleton.getInstance();
        assertThat(service.countTasks())
                .as("The number of tasks tasks is 1")
                .isEqualTo(tasks);

        hashCode.add(service.hashCode());
    }
}