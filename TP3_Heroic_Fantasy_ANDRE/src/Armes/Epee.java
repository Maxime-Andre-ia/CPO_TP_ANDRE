/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

import Armes.Arme;

/**
 *
 * @author maxim
 */

public class Epee extends Arme {
    
    private final int finesse;

    public Epee(String nom, int niveauAttaque, int finesse) {
        super(nom, niveauAttaque);
        
        if (finesse < 100) {
            this.finesse = finesse;
        } else {
            this.finesse = 99; 
        }
    }
    
    public int getFinesse() {
        return finesse;
    }
    
    
    @Override
    public String toString() {
        return super.toString() + " - Finesse : " + finesse;
    }
}