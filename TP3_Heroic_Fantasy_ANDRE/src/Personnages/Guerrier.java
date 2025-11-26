/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

/**
 *
 * @author maxim
 */
public class Guerrier extends Personnage {

    private static int nbGuerriers = 0;

    private boolean aCheval;    // true = à cheval, false = à pied

    public Guerrier(String nom, int vie, boolean estACheval) {
        super(nom, vie);        // Initialise Personnage (et augmente le compteur total)
        this.aCheval = estACheval;
        
        nbGuerriers++;
    }

    public void setACheval(boolean estACheval) {
        this.aCheval = estACheval;
    }

    public boolean getACheval() {
        return aCheval;
    }

    public static int getNbGuerriers() {
        return nbGuerriers;
    }
    
    @Override
    protected void finalize() {
        if (nbGuerriers > 0) {
            nbGuerriers--;
        }
    }

    @Override
    public void attaquer(Personnage cible) {
        if (getArmeEnMain() != null) {
            
            int degats = getArmeEnMain().getNiveauAttaque();

            if (getArmeEnMain() instanceof Armes.Epee) {
                int finesse = ((Armes.Epee) getArmeEnMain()).getFinesse();
                degats *= finesse;
            }

            if (this.aCheval) {
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