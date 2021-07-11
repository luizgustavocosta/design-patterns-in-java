package com.gof.behavioral.visitor;

import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class RefereeBeforeStartMatchTest implements WithAssertions {

    List<Player> players;

    @BeforeAll
    void setUp() {
        players = Stream.of(
                Player.builder()
                        .id("1")
                        .firstName("Edson")
                        .lastName("Nascimento")
                        .number(10)
                        .dob(ZonedDateTime.now())
                        .build(),
                Player.builder()
                        .id("2")
                        .firstName("Romario")
                        .lastName("Souza")
                        .number(0)
                        .dob(ZonedDateTime.now())
                        .build()).collect(Collectors.toList());
    }

    @Test
    void given_list_of_check_when_before_start_match_then_visit_them() {
        RefereeBeforeStartMatch node
                = new RefereeBeforeStartMatch(players,
                Team.builder().uniformColor("black").build(),
                Team.builder().uniformColor("blue").build(),
                LocalDateTime.MAX);
        Throwable throwable = catchThrowable(() -> node.accept(new RefereeVisitor()));
        assertThat(throwable).as("Found an issue["+throwable.getMessage()+"]")
                .isInstanceOf(IllegalStateException.class);
    }
}