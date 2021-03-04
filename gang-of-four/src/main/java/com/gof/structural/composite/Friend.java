package com.gof.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Friend extends Friendship {

    private final List<Friendship> friendships;
    private final String name;
    private final String nickName;
    private final Country country;

    public Friend(String name, String nickName, Country country) {
        this.name = name;
        this.nickName = nickName;
        this.country = country;
        this.friendships = new ArrayList<>();
    }

    @Override
    void add(Friendship component) {
        if (!this.equals(component)) {
            friendships.add(component);
        }
    }

    @Override
    void remove(Friendship component) {
        super.remove(component);
    }

    @Override
    public void print() {
        for (Friendship friendship : friendships) {
            if (friendship.hasFriends()) {
                System.out.println(friendship);
                friendship.print();
            } else {
                System.out.println(friendship);
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

    @Override
    public String toString() {
        return "Friend{" +
                "name='" + name + '\'' +
                ", nickName='" + nickName + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
