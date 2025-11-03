/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_andre;

import bieres_andre.BouteilleBiere;

/**
 *
 * @author maxim
 */
public class TP2_Bieres_ANDRE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Q11 — on utilise le constructeur à 3 paramètres
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvee des Trolls", 7.0f, "Dubuisson");
        BouteilleBiere leffe = new BouteilleBiere("Leffe", 6.6f, "Abbaye de Leffe");
        BouteilleBiere guinness = new BouteilleBiere("Guinness", 4.2f, "Guinness Brewery");
        BouteilleBiere punk = new BouteilleBiere("Punk IPA", 5.6f, "BrewDog");

        // Q12 — on décapsule quelques bouteilles
        uneBiere.Decapsuler();
        guinness.Decapsuler();

        // Q13/Q14 — affichage via println (utilise toString)
        System.out.println(uneBiere);
        System.out.println(leffe);
        System.out.println(guinness);
        System.out.println(punk);
    }
}
