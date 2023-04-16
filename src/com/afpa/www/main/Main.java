package com.afpa.www.main;

import com.afpa.www.gestionEleves.Eleve;
import com.afpa.www.gestionEleves.GroupesEleves;

public class Main {
    public static void main(String[] args) {
        Eleve eleve1 = new Eleve("Nassim");
        Eleve eleve2 = new Eleve("Camille");

        GroupesEleves groupesEleves = new GroupesEleves();

        groupesEleves.ajouterEleves(eleve1);
        groupesEleves.ajouterEleves(eleve2);

        System.out.println(groupesEleves.chercher("Nassim"));

    }
}