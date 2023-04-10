package com.afpa.www.gestionEleves;

import java.util.ArrayList;

public class Eleve {

    private String nom;
    private ArrayList<Integer> listeNotes = null;
    private double moyenne;

    public Eleve(String nom) {
        this.nom = nom;
    }
    public void ajouterNote(int note) {

    }
    //////////////GETTERS//////////////
    public String getNom() {
        return nom;
    }

    public ArrayList<Integer> getListeNotes() {
        return listeNotes;
    }

    public double getMoyenne() {
        return moyenne;
    }
    //////////////GETTERS//////////////

}
