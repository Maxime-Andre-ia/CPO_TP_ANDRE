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

    private static int nbMagiciens = 0;

    private boolean confirme;   

    public Magicien(String nom, int vie, boolean estConfirme) {
        super(nom, vie);
        this.confirme = estConfirme;
        
        nbMagiciens++;
    }

    public void setConfirme(boolean estConfirme) {
        this.confirme = estConfirme;
    }

    public boolean getConfirme() {
        return confirme;
    }

    public static int getNbMagiciens() {
        return nbMagiciens;
    }
    
    @Override
    protected void finalize() {
        if (nbMagiciens > 0) {
            nbMagiciens--;
        }
    }

    @Override
    public void attaquer(Personnage cible) {
        if (getArmeEnMain() != null) {
            
            int degats = getArmeEnMain().getNiveauAttaque();

            if (getArmeEnMain() instanceof Armes.Baton baton) {
                int age = baton.getAge();
                degats *= age;
            }

            if (this.confirme) {
                degats /= 2;
            }

            seFatiguer();

            System.out.println(getNom() + " attaque " + cible.getNom() + " avec " + getArmeEnMain().getNom() + " !");
            cible.estAttaque(degats);

        } else {
            System.out.println(getNom() + " essaie d'attaquer mais n'a pas d'arme !");
            seFatiguer();
        }
    }
}