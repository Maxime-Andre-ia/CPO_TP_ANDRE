/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bieres_andre;

/**
 *
 * @author maxim
 */
public class BouteilleBiere {

    
    String nom;
    float degreAlcool;
    String brasserie;
    boolean ouverte;

    
    public void lireEtiquette() {
        System.out.println("Bouteille de " + nom + " (" + degreAlcool + " degrés)");
        System.out.println("Brasserie : " + brasserie);
    }

    public BouteilleBiere(String unNom, float unDegre, String uneBrasserie) {
        nom = unNom;
        degreAlcool = unDegre;
        brasserie = uneBrasserie;
        ouverte = false; // par défaut, la bouteille est fermée
    }
}
