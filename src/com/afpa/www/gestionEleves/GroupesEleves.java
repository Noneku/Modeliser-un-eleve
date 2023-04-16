package com.afpa.www.gestionEleves;

import java.util.ArrayList;

public class GroupesEleves {
    final ArrayList<Eleve> listeEleves = new ArrayList<>();

    public int nombre() {
        return 0;
    }

    public ArrayList<Eleve> getListeEleves() {
        return listeEleves;
    }

    public void ajouterEleves(Eleve eleve) {
        listeEleves.add(eleve);
    }

    public Eleve chercher(String nom) {

        for (Eleve eleve : listeEleves
        ) {
            if (eleve.getNom().equals(nom)) return eleve;
        }
        return null;
    }
}
