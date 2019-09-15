package com.gof.behavioral.visitor;

import java.time.LocalDateTime;
import java.util.List;

/**
 * The type Referee before start match.
 */
public class RefereeBeforeStartMatch implements NodeMatch {

    private final List<Player> players;
    private final Team home;
    private final Team teamVisitor;

    /**
     * Instantiates a new Referee before start match.
     *
     * @param players     the players
     * @param home        the home
     * @param teamVisitor the team visitor
     */
    public RefereeBeforeStartMatch(List<Player> players, Team home, Team teamVisitor) {
        this.players = players;
        this.home = home;
        this.teamVisitor = teamVisitor;
    }

    @Override
    public void accept(VisitorRefereeTasks visitor) {
        visitor.checkPlayers();
        visitor.checkDateAndTime();
        visitor.checkTeams();
        // Here is possible call any other method of visitor, if any.
    }

    /**
     * Gets players.
     *
     * @return the players
     */
    public List<Player> getPlayers() {
        return players;
    }

    /**
     * Gets home.
     *
     * @return the home
     */
    public Team getHome() {
        return home;
    }

    /**
     * Gets team visitor.
     *
     * @return the team visitor
     */
    public Team getTeamVisitor() {
        return teamVisitor;
    }

    /**
     * Gets match date.
     *
     * @return the match date
     */
    public LocalDateTime getMatchDate() {
        return LocalDateTime.now();
    }
}
