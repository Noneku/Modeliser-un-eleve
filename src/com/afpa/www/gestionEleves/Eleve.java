package com.afpa.www.gestionEleves;

import java.util.ArrayList;

public class Eleve {

    private String nom;
    private ArrayList<Integer> listeNotes = new ArrayList<Integer>();
    private double moyenne;

    public Eleve(String nom) {
        this.nom = nom;

        if(listeNotes.isEmpty()) { listeNotes = null; };
    }
    public void ajouterNote(int note) {
        ArrayList<Integer> arrList = listeNotes;
        arrList.add(note);

        // Calcul Moyenne
        int total = 0;

        for (int i = 0; i < arrList.size(); i++) {
            total += arrList.get(i);
        }

        this.moyenne = total / arrList.size();

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


    @Override
    public String toString() {
        return "Eleve{" +
                "nom='" + nom + '\'' +
                ", listeNotes=" + listeNotes +
                ", moyenne=" + moyenne +
                '}';
    }
}
