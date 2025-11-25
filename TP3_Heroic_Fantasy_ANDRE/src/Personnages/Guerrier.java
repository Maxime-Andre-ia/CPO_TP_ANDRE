/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

import Personnages.Personnage;

/**
 *
 * @author maxim
 */
public class Guerrier extends Personnage {

    // Q23 : propre au guerrier
    private boolean aCheval;    // true = à cheval, false = à pied

    // Q24 : initialiser à cheval / à pied dans le constructeur
    public Guerrier(String nom, int vie, boolean estACheval) {
        super(nom, vie);        // initialise nom et niveauVie dans Personnage
        aCheval = estACheval;
    }

    // Q25 : setter pour cette propriété
    public void setACheval(boolean estACheval) {
        aCheval = estACheval;
    }
}
