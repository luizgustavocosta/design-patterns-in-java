package com.gof.behavioral.visitor;

import java.time.ZonedDateTime;
import java.util.UUID;

/**
 * The type Player.
 */
public class Player {

    private final String id;
    private final String firstName;
    private final String lastName;
    private final int number;
    private final ZonedDateTime dob;

    /**
     * Instantiates a new Player.
     *
     * @param firstName the first name
     * @param lastName  the last name
     * @param number    the number
     * @param dob       the dob
     */
    public Player(String firstName, String lastName, int number, ZonedDateTime dob) {
        this.id = UUID.randomUUID().toString();
        this.firstName = firstName;
        this.lastName = lastName;
        this.number = number;
        this.dob = dob;
    }

    /**
     * Gets id.
     *
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * Gets first name.
     *
     * @return the first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Gets last name.
     *
     * @return the last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Gets number.
     *
     * @return the number
     */
    public int getNumber() {
        return number;
    }

    /**
     * Gets dob.
     *
     * @return the dob
     */
    public ZonedDateTime getDob() {
        return dob;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return firstName +" "+ lastName;
    }

    /**
     * The type Player builder.
     */
    public static final class PlayerBuilder {
        private UUID id;
        private String firstName;
        private String lastName;
        private int number;
        private ZonedDateTime dob;

        private PlayerBuilder() {
        }

        /**
         * A player player builder.
         *
         * @return the player builder
         */
        public static PlayerBuilder aPlayer() {
            return new PlayerBuilder();
        }

        /**
         * With id player builder.
         *
         * @param id the id
         * @return the player builder
         */
        public PlayerBuilder withId(UUID id) {
            this.id = id;
            return this;
        }

        /**
         * With first name player builder.
         *
         * @param firstName the first name
         * @return the player builder
         */
        public PlayerBuilder withFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        /**
         * With last name player builder.
         *
         * @param lastName the last name
         * @return the player builder
         */
        public PlayerBuilder withLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        /**
         * With number player builder.
         *
         * @param number the number
         * @return the player builder
         */
        public PlayerBuilder withNumber(int number) {
            this.number = number;
            return this;
        }

        /**
         * With dob player builder.
         *
         * @param dob the dob
         * @return the player builder
         */
        public PlayerBuilder withDob(ZonedDateTime dob) {
            this.dob = dob;
            return this;
        }

        /**
         * Build player.
         *
         * @return the player
         */
        public Player build() {
            return new Player(firstName, lastName, number, dob);
        }
    }
}
