/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_andre;

/**
 *
 * @author maxim
 */
public class Magicien extends Personnage {

    // Q23 : propre au magicien
    private boolean confirme;   // true = confirmé, false = novice

    // Q24 : initialiser confirmé / novice dans le constructeur
    public Magicien(String nom, int vie, boolean estConfirme) {
        super(nom, vie);        // initialise nom et niveauVie dans Personnage
        confirme = estConfirme;
    }

    // Q25 : setter pour cette propriété
    public void setConfirme(boolean estConfirme) {
        confirme = estConfirme;
    }
}