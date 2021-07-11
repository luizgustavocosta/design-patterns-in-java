package com.gof.behavioral.visitor;

import lombok.AllArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@AllArgsConstructor
class RefereeBeforeStartMatch implements NodeMatch {

    private final List<Player> players;
    private final Team home;
    private final Team away;
    private final LocalDateTime matchDate;

    @Override
    public void accept(VisitorRefereeTasks visitor) {
        visitor.visit(matchDate);
        visitor.visit(home, away);
        visitor.visit(players);
        // Here is possible call any other method of visitor, if any.
    }
}
