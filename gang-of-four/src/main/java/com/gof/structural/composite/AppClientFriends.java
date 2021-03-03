package com.gof.structural.composite;

public class AppClientFriends {

    public static void main(String[] args) {
        Friendship friendship = new Friend("Luiz Costa", "Guga", "Brazil");
        Friendship pele = new Friend("Edson Arantes", "Pelé", "Brazil");
        Friendship ronaldo = new Friend("Ronaldo", "Ronaldo R9", "Brazil");
        Friendship messi = new Friend("Lionel Messi", "Messi", "Argentina");
        Friendship terStegen = new Friend("Marc-André ter Stegen", "ter Stegen", "Germany");


        friendship.add(pele);
        friendship.add(ronaldo);
        ronaldo.add(messi);
        messi.add(terStegen);

        friendship.print();
    }
}
