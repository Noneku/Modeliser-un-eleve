package com.afpa.www.main;

import com.afpa.www.gestionEleves.Eleve;

public class Main {
    public static void main(String[] args) {
        Eleve eleve1 = new Eleve("Nassim");

        eleve1.ajouterNote(15);
        eleve1.ajouterNote(15);
        eleve1.ajouterNote(6);

        System.out.println(eleve1.getListeNotes());

        System.out.println(eleve1.getMoyenne());

    }
}