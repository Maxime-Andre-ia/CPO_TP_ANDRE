package Personnages;

import tp3_heroic_fantasy_andre.EtreVivant;import Armes.*;
import java.util.ArrayList;

public abstract class Personnage implements EtreVivant {

    // Q43 : Compteur statique partagé par TOUS les objets Personnage
    private static int nbPersonnages = 0; 

    private final ArrayList<Arme> inventaire = new ArrayList<>();
    private Arme armeEnMain = null;
    private final String nom;
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
        System.out.println("Arme " + nomArme + " non trouvee dans l'inventaire de " + nom);
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

    // Q50 : La fatigue fait perdre 10 points
    @Override
    public void seFatiguer() {
        niveauVie -= 10;
        System.out.println(nom + " se fatigue (-10 PV).");
    }

    // Q51 : Est vivant si vie > 0
    @Override
    public boolean estVivant() {
        return niveauVie > 0;
    }

    // Q52 : Subir une attaque (baisse les PV)
    @Override
    public void estAttaque(int points) {
        niveauVie -= points;
        System.out.println(nom + " est attaque et perd " + points + " points !");
    }
    // Q53 : Méthode abstraite pour l'attaque (à définir dans Guerrier et Magicien)
    public abstract void attaquer(Personnage cible);
}