package com.gof.structural.composite;

import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;

@DisplayName("Composite Design Pattern")
class FriendTest implements WithAssertions {

    Friendship me, otherFriend, anotherFriend;

    @BeforeEach
    void setUp() {
        me = new Friend("Luiz", "Guga", CountryAlphaCode.BR);
        otherFriend = new Friend("Gustav", "Gus", CountryAlphaCode.DE);
        anotherFriend = new Friend("Costa", "costa", CountryAlphaCode.ES);
    }

    @DisplayName("Add friends")
    @Test
    void addFriends() {
        me.add(otherFriend);
        me.add(anotherFriend);
        assertThat(me.getChildren().size()).as("My friends").isEqualTo(2);
    }

    @DisplayName("Remove a friend")
    @Test
    void removeFriend() {
        me.add(otherFriend);
        me.add(anotherFriend);
        assertThat(me.getChildren().size()).as("My friends").isEqualTo(2);

        me.remove(anotherFriend);
        assertThat(me.getChildren().size()).as("My friends").isEqualTo(1);
    }

    @DisplayName("Not add yourself as friend")
    @Test
    void notAddYourself() {
        Friendship myClone = new Friend("Luiz", "Guga", CountryAlphaCode.BR);

        me.add(myClone);
        me.add(anotherFriend);

        assertAll(() -> {
            assertThat(me.hasFriends()).as("Should I Have friends?").isTrue();
            assertThat(me.getChildren().size()).as("My friends").isEqualTo(1);
        });
    }
}