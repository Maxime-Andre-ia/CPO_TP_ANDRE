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

    @Override
    public void attaquer(Personnage cible) {
        // On vérifie d'abord si le guerrier a une arme
        if (getArmeEnMain() != null) {
            
            // 1. Récupérer le niveau d'attaque de l'arme
            int degats = getArmeEnMain().getNiveauAttaque();

            // 2. Si c'est une épée, on applique le multiplicateur de finesse
            // "instanceof" permet de vérifier si l'arme est bien de type Epee
            if (getArmeEnMain() instanceof Armes.Epee) {
                // On "cast" (transforme) l'arme en Epee pour accéder à getFinesse()
                int finesse = ((Armes.Epee) getArmeEnMain()).getFinesse();
                degats *= finesse;
            }

            // 3. Si le guerrier est à cheval, dégâts divisés par 2
            if (this.aCheval) {
                degats /= 2;
            }

            // 4. Le guerrier se fatigue
            seFatiguer();

            // 5. On applique les dégâts
            System.out.println(getNom() + " attaque " + cible.getNom() + " avec " + getArmeEnMain().getNom() + " !");
            cible.estAttaque(degats);

        } else {
            // Cas où le guerrier n'a pas d'arme
            System.out.println(getNom() + " essaie d'attaquer mais n'a pas d'arme !");
            seFatiguer(); // Il se fatigue quand même à s'agiter
        }
    }
}