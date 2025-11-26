package Personnages;

import tp3_heroic_fantasy_andre.EtreVivant;import Armes.*;
import java.util.ArrayList;

public abstract class Personnage implements EtreVivant {

    private static int nbPersonnages = 0; 

    private final ArrayList<Arme> inventaire = new ArrayList<>();
    private Arme armeEnMain = null;
    private final String nom;
    private int niveauVie;

    public Personnage(String nomPersonnage, int vie) {
        this.nom = nomPersonnage;
        this.niveauVie = vie;
        
        nbPersonnages++; 
    }

    public static int getNbPersonnages() {
        return nbPersonnages;
    }

    public int getNiveauVie() {
        return niveauVie;
    }

    public String getNom() {
        return nom;
    }

    public void ajouterArme(Arme a) {
        if (inventaire.size() < 5) {
            inventaire.add(a);
        } else {
            System.out.println(nom + " ne peut pas porter plus de 5 armes !");
        }
    }

    public Arme getArmeEnMain() {
        return armeEnMain;
    }

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

    @Override
    public void seFatiguer() {
        niveauVie -= 10;
        System.out.println(nom + " se fatigue (-10 PV).");
    }

    @Override
    public boolean estVivant() {
        return niveauVie > 0;
    }

    @Override
    public void estAttaque(int points) {
        niveauVie -= points;
        System.out.println(nom + " est attaque et perd " + points + " points !");
    }
    public abstract void attaquer(Personnage cible);
}