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

        Magicien mag1 = new Magicien("Gandalf", 65, true);
        Magicien mag2 = new Magicien("Garcimore", 44, false);

        Guerrier guer1 = new Guerrier("Conan", 78, false);
        Guerrier guer2 = new Guerrier("Lannister", 45, true);

        
        ArrayList<Personnage> personnages = new ArrayList<>();

        personnages.add(mag1);
        personnages.add(mag2);
        personnages.add(guer1);
        personnages.add(guer2);

        System.out.println("\n--- Caracteristiques des Personnages ---");
        for (int i = 0; i < personnages.size(); i++) {
            System.out.println(personnages.get(i));
        }
        Magicien gandalf = new Magicien("Gandalf", 65, true);
        Guerrier conan = new Guerrier("Conan", 78, false);

        Baton b1 = new Baton("Chene", 4, 5);
        Baton b2 = new Baton("Charme", 5, 6);
        Baton b3 = new Baton("Sureau", 6, 4);

        Epee e1 = new Epee("Excalibur", 7, 5);
        Epee e2 = new Epee("Durandal", 4, 7);
        Epee e3 = new Epee("Katana", 6, 3);

        conan.ajouterArme(b1);
        conan.ajouterArme(e1);
        conan.ajouterArme(e2);

        conan.equiperArme("Excalibur"); 

        gandalf.ajouterArme(b2);
        gandalf.ajouterArme(b3);
        gandalf.ajouterArme(e3);

        System.out.println("\n--- Etat final des personnages ---");
        System.out.println(conan);   
        System.out.println(gandalf); 
        
        gandalf = new Magicien("Gandalf", 65, true);
        conan = new Guerrier("Conan", 78, false);

        System.out.println("--- Statistiques ---");
        System.out.println("Total personnages : " + Personnage.getNbPersonnages());
        System.out.println("Total guerriers : " + Guerrier.getNbGuerriers());
        System.out.println("Total magiciens : " + Magicien.getNbMagiciens());


        System.out.println("\n--- Avant l'effort ---");
        System.out.println(gandalf);
        System.out.println(conan);

        System.out.println("\n--- Le guerrier se fatigue ---");
        conan.seFatiguer();

        System.out.println(conan);
        if (conan.estVivant()) {
            System.out.println("Conan est toujours vivant !");
        } else {
            System.out.println("Conan est mort de fatigue...");
        }

        System.out.println("\n--- Le guerrier attaque le magicien ---");
        conan.attaquer(gandalf); // Conan tape Gandalf

        System.out.println(gandalf);
        System.out.println(conan);
        
        System.out.println("\n--- DUEL FINAL ---");
        
        gandalf = new Magicien("Gandalf", 65, false); 
        conan = new Guerrier("Conan", 78, true);      

        conan.ajouterArme(epee1);      
        conan.ajouterArme(baton1);    
        
        gandalf.ajouterArme(baton2);  
        gandalf.ajouterArme(epee2);  
        
        conan.equiperArme("Excalibur");
        gandalf.equiperArme("Charme");

        System.out.println("\n--- Debut du combat ---");
        System.out.println(gandalf);
        System.out.println(conan);

        System.out.println("\n-> Gandalf attaque !");
        gandalf.attaquer(conan);     
        System.out.println(conan); 

        
        System.out.println("\n-> Conan replique !");
        conan.attaquer(gandalf);
        System.out.println(gandalf);

        System.out.println("\n--- Bilan ---");
        if (gandalf.estVivant() && conan.estVivant()) {
            System.out.println("Les deux combattants sont encore debout !");
        } else {
            System.out.println("Il y a un mort...");
        }
    }
}
