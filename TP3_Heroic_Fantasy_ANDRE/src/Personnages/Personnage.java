/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

/**
 *
 * @author maxim
 */


public abstract class Personnage {

    private final String nom;
    private final int niveauVie;

    public Personnage(String nomPersonnage, int vie) {
        nom = nomPersonnage;
        niveauVie = vie;
    }

    public int getNiveauVie() {
        return niveauVie;
    }

    public String getNom() {
        return nom;
    }

    @Override
    public String toString() {
        return "Personnage \"" + nom + "\" (vie = " + niveauVie + ")";
    }
}


