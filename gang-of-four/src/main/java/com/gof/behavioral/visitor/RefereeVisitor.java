package com.gof.behavioral.visitor;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZonedDateTime;
import java.util.List;

public class RefereeVisitor implements VisitorRefereeTasks {

    @Override
    public void visit(Team home, Team away) {
        if (home.getUniformColor().equals(away.getUniformColor())) {
            throw new IllegalStateException("An uniform change is required");
        }
    }

    @Override
    public void visit(LocalDateTime localDateTime) {
        if (localDateTime.isBefore(LocalDateTime.now())) {
            throw new IllegalStateException("Date and time not allowed for this match.");
        }
    }

    @Override
    public void visit(List<Player> players) {
        players.forEach(RefereeVisitor::checkPlayer);
    }

    private static void checkPlayer(Player player) {
        if (player.getNumber() == 0) {
            throw new IllegalStateException("This player ["+player.getFirstName()+"] requires a number.");
        }
        ZonedDateTime ageRequired = ZonedDateTime.now().minus(Period.ofYears(18));
        if (player.getDob().isBefore(ageRequired)) {
            throw new IllegalStateException("Sorry, the minimum age is 18 years old.");
        }
    }
}
