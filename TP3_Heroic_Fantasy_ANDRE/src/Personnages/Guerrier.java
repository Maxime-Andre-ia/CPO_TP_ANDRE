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

    // Q44 : Compteur statique (propre à la classe, pas à l'objet)
    private static int nbGuerriers = 0;

    // Q23 : Attribut d'instance
    private boolean aCheval;    // true = à cheval, false = à pied

    // Q24 & Q45 : UNIQUE Constructeur fusionné
    public Guerrier(String nom, int vie, boolean estACheval) {
        super(nom, vie);        // Initialise Personnage (et augmente le compteur total)
        this.aCheval = estACheval;
        
        // On augmente le compteur spécifique aux guerriers
        nbGuerriers++;
    }

    // Q25 : Setter
    public void setACheval(boolean estACheval) {
        this.aCheval = estACheval;
    }

    // Getter pour l'attribut aCheval (utile pour les combats plus tard)
    public boolean getACheval() {
        return aCheval;
    }

    // Méthode statique pour lire le nombre de guerriers
    public static int getNbGuerriers() {
        return nbGuerriers;
    }
    
    // Q46 : Destructeur (si tu veux l'ajouter maintenant)
    @Override
    protected void finalize() {
        if (nbGuerriers > 0) {
            nbGuerriers--;
        }
    }
}