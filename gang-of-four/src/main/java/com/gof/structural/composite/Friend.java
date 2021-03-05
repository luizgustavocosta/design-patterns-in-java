package com.gof.structural.composite;

import java.util.ArrayList;
import java.util.List;

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
            friendships.add(component);
        }
    }

    @Override
    void remove(Friendship friend) {
        this.friendships.remove(friend);
    }

    @Override
    public void print() {
        if (friendships.size() == 1) {
            System.out.printf("%-35s %s %n","Friend of "+ this.name+ " is .:", this.friendships);
        } else {
            System.out.printf("%-35s %s %n","Friends of "+ this.name+ " are .:", this.friendships);
        }
        for (Friendship friendship : friendships) {
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
        return friendships.size() > 0;
    }

    public String getName() {
        return name;
    }

    public String getNickName() {
        return nickName;
    }

    @Override
    public String toString() {
        return nickName +" from "+ countryAlphaCode;
    }
}
