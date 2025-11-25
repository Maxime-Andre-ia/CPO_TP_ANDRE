/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_andre;

import Personnages.Magicien;
import Personnages.Guerrier;
import Personnages.Personnage;
import Personnages.*;
import Armes.Epee;
import Armes.Baton;
import java.util.ArrayList;

/**
 *
 * @author maxim
 */
public class TP3_Heroic_Fantasy_ANDRE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Epee epee1 = new Epee("Excalibur", 7, 5);
        Epee epee2 = new Epee("Durandal", 4, 7);

        Baton baton1 = new Baton("Chêne", 4, 5);
        Baton baton2 = new Baton("Charme", 5, 6);

        System.out.println(epee1);
        System.out.println(epee2);
        System.out.println(baton1);
        System.out.println(baton2);

        ArrayList<Object> armes = new ArrayList<>();

        armes.add(epee1);
        armes.add(epee2);
        armes.add(baton1);
        armes.add(baton2);

        for (int i = 0; i < armes.size(); i++) {
            System.out.println(armes.get(i));
        }
        // --- 2.3 Création des personnages ---

        // Q26 : Création des 2 magiciens [cite: 53, 54]
        // Paramètres : Nom, PV, Confirmé (true) / Novice (false)
        Magicien mag1 = new Magicien("Gandalf", 65, true);
        Magicien mag2 = new Magicien("Garcimore", 44, false);

        // Q27 : Création des 2 guerriers [cite: 55]
        // Paramètres : Nom, PV, À cheval (true) / À pied (false)
        // Attention : "Conan" est à pied, donc false pour 'aCheval'
        Guerrier guer1 = new Guerrier("Conan", 78, false);
        Guerrier guer2 = new Guerrier("Lannister", 45, true);

        // Q28 : Tableau dynamique pour les personnages 
        // IMPORTANT : On utilise le type <Personnage> pour stocker à la fois
        // des Magiciens et des Guerriers (Polymorphisme).
        ArrayList<Personnage> personnages = new ArrayList<>();

        personnages.add(mag1);
        personnages.add(mag2);
        personnages.add(guer1);
        personnages.add(guer2);

        // Affichage des caractéristiques [cite: 57]
        System.out.println("\n--- Caractéristiques des Personnages ---");
        for (int i = 0; i < personnages.size(); i++) {
            // Cela appelle la méthode toString() de la classe Personnage
            System.out.println(personnages.get(i));
        }
        // Q38 : Créer un guerrier, un magicien, 3 bâtons et 3 épées
        Magicien gandalf = new Magicien("Gandalf", 65, true);
        Guerrier conan = new Guerrier("Conan", 78, false);

        Baton b1 = new Baton("Chêne", 4, 5);
        Baton b2 = new Baton("Charme", 5, 6);
        Baton b3 = new Baton("Sureau", 6, 4);

        Epee e1 = new Epee("Excalibur", 7, 5);
        Epee e2 = new Epee("Durandal", 4, 7);
        Epee e3 = new Epee("Katana", 6, 3);

        // Q39 : Guerrier : Ajout de 1 bâton et 2 épées, puis équipement de la 1ère épée
        conan.ajouterArme(b1);
        conan.ajouterArme(e1);
        conan.ajouterArme(e2);

        conan.equiperArme("Excalibur"); // On l'équipe

        // Q40 : Magicien : Ajout de 2 bâtons et 1 épée
        gandalf.ajouterArme(b2);
        gandalf.ajouterArme(b3);
        gandalf.ajouterArme(e3);

        // (Q41 : Nombre d'armes préférées - on a sauté le challenge Q37 pour l'instant)
        // Q42 : Afficher les caractéristiques
        System.out.println("\n--- État final des personnages ---");
        System.out.println(conan);   // Doit afficher l'arme Excalibur en main
        System.out.println(gandalf); // Doit afficher "Pas d'arme en main" (car on ne l'a pas équipé)
    }
}
