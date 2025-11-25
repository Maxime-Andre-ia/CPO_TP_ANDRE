/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

/**
 *
 * @author maxim
 */


public class Magicien extends Personnage {

    // Q44 : Compteur statique
    private static int nbMagiciens = 0;

    // Q23 : Attribut d'instance
    private boolean confirme;   // true = confirmé, false = novice

    // Q24 & Q45 : Constructeur
    public Magicien(String nom, int vie, boolean estConfirme) {
        super(nom, vie);
        this.confirme = estConfirme;
        
        nbMagiciens++;
    }

    // Q25 : Setter
    public void setConfirme(boolean estConfirme) {
        this.confirme = estConfirme;
    }

    // Getter (utile pour les combats)
    public boolean getConfirme() {
        return confirme;
    }

    // Méthode statique pour lire le nombre de magiciens
    public static int getNbMagiciens() {
        return nbMagiciens;
    }
    
    // Q46 : Destructeur
    @Override
    protected void finalize() {
        if (nbMagiciens > 0) {
            nbMagiciens--;
        }
    }

    // Q53 : L'attaque du Magicien (VERSION UNIQUE ET CORRECTE)
    @Override
    public void attaquer(Personnage cible) {
        if (getArmeEnMain() != null) {
            
            // 1. Récupérer le niveau d'attaque de l'arme
            int degats = getArmeEnMain().getNiveauAttaque();

            // 2. Si c'est un Bâton, on multiplie par l'âge
            if (getArmeEnMain() instanceof Armes.Baton baton) {
                int age = baton.getAge();
                degats *= age;
            }

            // 3. Si le magicien est confirmé, dégâts divisés par 2
            if (this.confirme) {
                degats /= 2;
            }

            // 4. Le magicien se fatigue
            seFatiguer();

            // 5. On applique les dégâts
            System.out.println(getNom() + " attaque " + cible.getNom() + " avec " + getArmeEnMain().getNom() + " !");
            cible.estAttaque(degats);

        } else {
            System.out.println(getNom() + " essaie d'attaquer mais n'a pas d'arme !");
            seFatiguer();
        }
    }
}