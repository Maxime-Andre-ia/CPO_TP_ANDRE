/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;



import Armes.*;
import java.util.ArrayList;

public abstract class Personnage {

    // Q43 : Compteur statique partagé par TOUS les objets Personnage
    // "static" veut dire que la variable appartient à la classe, pas à un objet unique
    private static int nbPersonnages = 0; 

    
    private ArrayList<Arme> inventaire = new ArrayList<Arme>();
    private Arme armeEnMain = null;
    private String nom;
    private int niveauVie;

    public Personnage(String nomPersonnage, int vie) {
        this.nom = nomPersonnage;
        this.niveauVie = vie;
        
        // Q45 : On augmente le compteur à chaque création de personnage
        nbPersonnages++; 
    }

    // Q43 : Getter statique pour lire le nombre total de personnages
    public static int getNbPersonnages() {
        return nbPersonnages;
    }

    // Getters classiques
    public int getNiveauVie() {
        return niveauVie;
    }

    public String getNom() {
        return nom;
    }

    // Q32 : Ajouter une arme à l'inventaire (max 5)
    public void ajouterArme(Arme a) {
        if (inventaire.size() < 5) {
            inventaire.add(a);
        } else {
            System.out.println(nom + " ne peut pas porter plus de 5 armes !");
        }
    }

    // Q34 : Getter pour savoir quelle arme est portée
    public Arme getArmeEnMain() {
        return armeEnMain;
    }

    // Q35 : Choisir une arme dans l'inventaire
    public void equiperArme(String nomArme) {
        for (Arme a : inventaire) {
            if (a.getNom().equals(nomArme)) {
                armeEnMain = a;
                System.out.println(nom + " a pris l'arme : " + a.getNom());
                return;
            }
        }
        System.out.println("Arme " + nomArme + " non trouvée dans l'inventaire de " + nom);
    }

    // Q36 : Méthode toString complète
    @Override
    public String toString() {
        String info = "Personnage \"" + nom + "\" (vie = " + niveauVie + ")";
        if (armeEnMain != null) {
            info += " | Arme en main : " + armeEnMain.toString();
        } else {
            info += " | Pas d'arme en main";
        }
        return info;
    }
}