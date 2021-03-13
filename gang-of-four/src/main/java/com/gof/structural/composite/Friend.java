package com.gof.structural.composite;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Friend extends Friendship {

    private final List<Friendship> friendships;
    private final String name;
    private final String nickName;
    private final CountryAlphaCode countryAlphaCode;

    public Friend(String name, String nickName, CountryAlphaCode countryAlphaCode) {
        this.name = name;
        this.nickName = nickName;
        this.countryAlphaCode = countryAlphaCode;
        this.friendships = new ArrayList<>();
    }

    @Override
    void add(Friendship component) {
        if (!this.equals(component)) {
            getChildren().add(component);
        }
    }

    @Override
    void remove(Friendship friend) {
        this.getChildren().remove(friend);
    }

    @Override
    public void print() {
        if (friendships.size() == 1) {
            System.out.printf("%-35s %s %n","Friend of "+ this.name+ " is .:", this.getChildren());
        } else {
            System.out.printf("%-35s %s %n","Friends of "+ this.name+ " are .:", this.getChildren());
        }
        for (Friendship friendship : getChildren()) {
            if (friendship.hasFriends()) {
                friendship.print();
            } else {
                System.out.printf("Leaf .: %s%n",friendship);
            }
        }
    }

    @Override
    List<Friendship> getChildren() {
        return friendships;
    }

    @Override
    boolean hasFriends() {
        return getChildren().size() > 0;
    }

    @Override
    public String toString() {
        return nickName +" from "+ countryAlphaCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Friend friend = (Friend) o;
        return Objects.equals(name, friend.name) &&
                Objects.equals(nickName, friend.nickName) &&
                countryAlphaCode == friend.countryAlphaCode;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, nickName, countryAlphaCode);
    }
}
