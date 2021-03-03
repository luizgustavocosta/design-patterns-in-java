package com.gof.structural.composite;

//Component
public abstract class Friendship {

    void add(Friendship component){}
    void remove(Friendship component){}
    abstract Friendship getChild();
    abstract boolean hasFriends(); //operation
    abstract void print();
}
