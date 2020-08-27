package com.gof.behavioral.visitor;

import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.time.ZonedDateTime;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class RefereeBeforeStartMatchTest implements WithAssertions {

    List<Player> players;

    @BeforeAll
    void setUp() {
        players = Stream.of(
                Player.PlayerBuilder.aPlayer().withFirstName("Edson")
                        .withLastName("Nascimento")
                        .withNumber(10)
                        .withDob(ZonedDateTime.now())
                        .build(),
                Player.PlayerBuilder.aPlayer().withFirstName("Romario")
                        .withLastName("Souza")
                        .withNumber(0)
                        .withDob(ZonedDateTime.now())
                        .build()).collect(Collectors.toList());

    }

    @Test
    void given_list_of_check_when_before_start_match_then_visit_them() {
        RefereeBeforeStartMatch node
                = new RefereeBeforeStartMatch(players,
                Team.TeamBuilder.aTeam().withUniformColor("black").build(),
                Team.TeamBuilder.aTeam().withUniformColor("blue").build());
        Throwable throwable = catchThrowable(() -> node.accept(new RefereeVisitor(node)));
        assertThat(throwable).as("Found an issue["+throwable.getMessage()+"]").isInstanceOf(IllegalStateException.class);

    }
}