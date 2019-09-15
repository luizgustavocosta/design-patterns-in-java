package com.gof.behavioral.visitor;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZonedDateTime;


/**
 * The type Referee visitor.
 */
public class RefereeVisitor implements VisitorRefereeTasks {

    private final RefereeBeforeStartMatch node;

    /**
     * Instantiates a new Referee visitor.
     *
     * @param node the node
     */
    RefereeVisitor(RefereeBeforeStartMatch node) {
        this.node = node;
    }

    @Override
    public void checkTeams() {
        if (node.getHome().getUniformColor().equals(node.getTeamVisitor().getUniformColor())) {
            throw new IllegalStateException("An uniform change is required");
        }
    }

    @Override
    public void checkDateAndTime() {
        LocalDateTime currentLocalDateAndTime = LocalDateTime.now();
        if (node.getMatchDate().isBefore(currentLocalDateAndTime)) {
            throw new IllegalStateException("Date and time not allowed for this match.");
        }
    }

    @Override
    public void checkPlayers() {
        node.getPlayers().forEach(RefereeVisitor::checkPlayer);
    }

    private static void checkPlayer(Player player) {
        if (player.getNumber() == 0) {
            throw new IllegalStateException("This player ["+player.getName()+"] requires a number.");
        }
        ZonedDateTime ageRequired = ZonedDateTime.now().minus(Period.ofYears(18));
        if (player.getDob().isBefore(ageRequired)) {
            throw new IllegalStateException("Sorry, only player with 18 years old are allowed.");
        }
    }
}
