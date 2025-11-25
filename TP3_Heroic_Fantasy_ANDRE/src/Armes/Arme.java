/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author maxim
 */
public abstract class Arme {
    
    private final String nom;
    private final int niveauAttaque;

    public Arme(String nom, int niveauAttaque) {
        this.nom = nom;
        
        if (niveauAttaque <= 100) {
            this.niveauAttaque = niveauAttaque;
        } else {
            this.niveauAttaque = 100; 
            System.out.println("Le niveau d'attaque a été plafonne à 100.");
        }
    }

    public int getNiveauAttaque() {
        return niveauAttaque;
    }

    public String getNom() {
        return nom;
    }

    @Override
    public String toString() {
        return "Arme : " + nom + " - Niveau d'attaque : " + niveauAttaque;
    }
}