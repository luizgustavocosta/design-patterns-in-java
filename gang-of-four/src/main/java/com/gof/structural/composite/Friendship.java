package com.gof.structural.composite;

import java.util.List;

//Component
public abstract class Friendship {

    void add(Friendship component){}
    void remove(Friendship component){}
    abstract List<Friendship> getChildren();
    abstract boolean hasFriends(); //operation
    abstract void print();
}
