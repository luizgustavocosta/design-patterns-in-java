package com.gof.structural.composite;

import static com.gof.structural.composite.CountryAlphaCode.*;

public class AppClient {

    public static void main(String[] args) {
        final CountryAlphaCode brazil = BR;

        Friendship friendship = new Friend("Luiz Costa", "Guga", brazil);
        Friendship pele = new Friend("Edson Arantes", "Pelé", brazil);
        Friendship ronaldo = new Friend("Ronaldo", "Fenomeno", brazil);
        friendship.add(pele);
        friendship.add(ronaldo);

        Friendship messi = new Friend("Lionel Messi", "Messi", AR);
        Friendship lalas = new Friend("Alexi Lalas", "Lalas", US);
        ronaldo.add(messi);
        ronaldo.add(lalas);

        Friendship ramos = new Friend("Tab Ramos", "Ramos", US);
        lalas.add(ramos);

        Friendship maradona = new Friend("Diego Maradona", "Maradona", AR);
        Friendship cannigia = new Friend("Claudio Caniggia", "Caniggia", AR);
        Friendship tevez = new Friend("Carlito Tevez", "Tevez", AR);
        maradona.add(cannigia);
        maradona.add(tevez);

        Friendship marcAndre = new Friend("Marc-André ter Stegen", "ter Stegen", DE);
        Friendship busquets = new Friend("Sergio Busquets Burgos", "Busquetes", ES);

        messi.add(marcAndre);
        messi.add(busquets);
        messi.add(maradona);
        messi.add(messi);

        friendship.print();

        System.out.println("//////////////////////////////////////////");
        System.out.println("Now..let's removing one friendship");
        friendship.remove(ronaldo);

        friendship.print();
    }
}
