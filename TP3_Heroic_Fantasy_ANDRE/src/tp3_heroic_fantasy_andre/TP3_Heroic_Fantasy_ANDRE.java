/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_andre;

import Personnages.Magicien;
import Personnages.Guerrier;
import Personnages.Personnage;
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

        Baton baton1 = new Baton("Chene", 4, 5);
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
        System.out.println("\n--- Caracteristiques des Personnages ---");
        for (int i = 0; i < personnages.size(); i++) {
            // Cela appelle la méthode toString() de la classe Personnage
            System.out.println(personnages.get(i));
        }
        // Q38 : Créer un guerrier, un magicien, 3 bâtons et 3 épées
        Magicien gandalf = new Magicien("Gandalf", 65, true);
        Guerrier conan = new Guerrier("Conan", 78, false);

        Baton b1 = new Baton("Chene", 4, 5);
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
        System.out.println("\n--- Etat final des personnages ---");
        System.out.println(conan);   // Doit afficher l'arme Excalibur en main
        System.out.println(gandalf); // Doit afficher "Pas d'arme en main" (car on ne l'a pas équipé)
        // Q54 : Création des personnages
        gandalf = new Magicien("Gandalf", 65, true);
        conan = new Guerrier("Conan", 78, false);
        // Q54 : Affichage des compteurs
        System.out.println("--- Statistiques ---");
        System.out.println("Total personnages : " + Personnage.getNbPersonnages());
        System.out.println("Total guerriers : " + Guerrier.getNbGuerriers());
        System.out.println("Total magiciens : " + Magicien.getNbMagiciens());

        // Q54 : Affichage des infos de base
        System.out.println("\n--- Avant l'effort ---");
        System.out.println(gandalf);
        System.out.println(conan);

        // Q55 : Le guerrier se fatigue
        System.out.println("\n--- Le guerrier se fatigue ---");
        conan.seFatiguer();

        // Q56 : Vérification de l'état du guerrier
        System.out.println(conan);
        if (conan.estVivant()) {
            System.out.println("Conan est toujours vivant !");
        } else {
            System.out.println("Conan est mort de fatigue...");
        }

        // Q57 : Le guerrier attaque le magicien
        System.out.println("\n--- Le guerrier attaque le magicien ---");
        conan.attaquer(gandalf); // Conan tape Gandalf

        // Affichage final après le coup
        System.out.println(gandalf);
        System.out.println(conan);
    // --- 5.3 & 5.4 Test du COMBAT FINAL (Morrrrtall Combat) ---
        
        System.out.println("\n--- DUEL FINAL ---");
        
        // Q61 : Création des persos : Magicien (non confirmé) et Guerrier (à cheval)
        // On réutilise les variables existantes en écrasant leur contenu
        gandalf = new Magicien("Gandalf", 65, false); // false = non confirmé
        conan = new Guerrier("Conan", 78, true);      // true = à cheval

        // Q62 : On leur donne des armes (on utilise les armes créées au tout début du main)
        conan.ajouterArme(epee1);      // Excalibur
        conan.ajouterArme(baton1);     // Chêne
        
        gandalf.ajouterArme(baton2);   // Charme
        gandalf.ajouterArme(epee2);    // Durandal

        // Q63 : On les équipe
        conan.equiperArme("Excalibur");
        gandalf.equiperArme("Charme");

        // Affichage initial
        System.out.println("\n--- Debut du combat ---");
        System.out.println(gandalf);
        System.out.println(conan);

        // Q64 : Attaque du Magicien
        // Calcul : Arme(5) * Age(6) = 30 dégâts
        System.out.println("\n-> Gandalf attaque !");
        gandalf.attaquer(conan);     
        System.out.println(conan); 

        // Q65 : Attaque du Guerrier
        // Calcul : Arme(7) * Finesse(5) = 35. Divisé par 2 (à cheval) = 17 dégâts
        System.out.println("\n-> Conan replique !");
        conan.attaquer(gandalf);
        System.out.println(gandalf);

        // Q66 : Vérification si vivants
        System.out.println("\n--- Bilan ---");
        if (gandalf.estVivant() && conan.estVivant()) {
            System.out.println("Les deux combattants sont encore debout !");
        } else {
            System.out.println("Il y a un mort...");
        }
    }
}
