package com.gof.structural.composite;

import static com.gof.structural.composite.Country.*;

public class AppClient {

    public static void main(String[] args) {
        final Country brazil = BRAZIL;

        Friendship friendship = new Friend("Luiz Costa", "Guga", brazil);
        Friendship pele = new Friend("Edson Arantes", "Pelé", brazil);
        Friendship ronaldo = new Friend("Ronaldo", "Ronaldo R9", brazil);
        friendship.add(pele);
        pele.add(pele);
        friendship.add(ronaldo);

        Friendship messi = new Friend("Lionel Messi", "Messi", ARGENTINA);
        Friendship lalas = new Friend("Alexi Lalas", "Lalas", USA);
        ronaldo.add(messi);
        ronaldo.add(lalas);

        Friendship ramos = new Friend("Tab Ramos", "tab", USA);
        lalas.add(ramos);

        Friendship maradona = new Friend("Diego Maradona", "Maradona", ARGENTINA);
        Friendship cannigia = new Friend("Claudio Caniggia", "Caniggia", ARGENTINA);
        maradona.add(cannigia) ;

        Friendship marcAndre = new Friend("Marc-André ter Stegen", "ter Stegen", DEUTSCHLAND);
        Friendship busquets = new Friend("Sergio Busquets Burgos", "Busquetes", SPAIN);
        Friendship tevez = new Friend("Carlito Tevez", "Tevez", ARGENTINA);

        messi.add(marcAndre);
        messi.add(busquets);
        messi.add(maradona);
        messi.add(tevez);
        messi.add(messi);

        friendship.print();
    }
}
