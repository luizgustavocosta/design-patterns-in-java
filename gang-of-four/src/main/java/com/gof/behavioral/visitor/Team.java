package com.gof.behavioral.visitor;

import java.util.List;

/**
 * The type Team.
 */
public class Team {

    private final String name;
    private final String uniformColor;
    private final List<Player> players;

    /**
     * Instantiates a new Team.
     *
     * @param name         the name
     * @param uniformColor the uniform color
     * @param players      the players
     */
    public Team(String name, String uniformColor, List<Player> players) {
        this.name = name;
        this.uniformColor = uniformColor;
        this.players = players;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets uniform color.
     *
     * @return the uniform color
     */
    public String getUniformColor() {
        return uniformColor;
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
     * The type Team builder.
     */
    public static final class TeamBuilder {
        private String name;
        private String uniformColor;
        private List<Player> players;

        private TeamBuilder() {
        }

        /**
         * A team team builder.
         *
         * @return the team builder
         */
        public static TeamBuilder aTeam() {
            return new TeamBuilder();
        }

        /**
         * With name team builder.
         *
         * @param name the name
         * @return the team builder
         */
        public TeamBuilder withName(String name) {
            this.name = name;
            return this;
        }

        /**
         * With uniform color team builder.
         *
         * @param uniformColor the uniform color
         * @return the team builder
         */
        public TeamBuilder withUniformColor(String uniformColor) {
            this.uniformColor = uniformColor;
            return this;
        }

        /**
         * With players team builder.
         *
         * @param players the players
         * @return the team builder
         */
        public TeamBuilder withPlayers(List<Player> players) {
            this.players = players;
            return this;
        }

        /**
         * Build team.
         *
         * @return the team
         */
        public Team build() {
            return new Team(name, uniformColor, players);
        }
    }
}
