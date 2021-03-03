package com.gof.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Friend extends Friendship {

    private final List<Friendship> friendships;
    private final String name;
    private final String nickName;
    private final String country;

    public Friend(String name, String nickName, String country) {
        this.name = name;
        this.nickName = nickName;
        this.country = country;
        this.friendships = new ArrayList<>();
    }

    @Override
    void add(Friendship component) {
        friendships.add(component);
    }

    @Override
    void remove(Friendship component) {
        super.remove(component);
    }

    @Override
    public void print() {
        System.out.println("Friends of "+name+" of Country "+country);
        for (Friendship friendship : friendships) {
            if (friendship.hasFriends()) {
                friendship.print();
            }
            System.out.println("This is a "+name+" friend");
            System.out.println(friendship);
        }
    }

    @Override
    Friendship getChild() {
        return null;
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
