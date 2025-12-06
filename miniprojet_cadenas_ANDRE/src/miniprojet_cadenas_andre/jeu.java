/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miniprojet_cadenas_andre;

import java.util.Random;

/**
 *
 * @author maxim
 */
public final class jeu {

    private final int[] combinaisonSecrete; 
    private int tentativeActuelle;    
    private final int MAX_TENTATIVES = 5;
    
    // Le constructeur (au démarrage)
    public jeu() {
        combinaisonSecrete = new int[4];
        initialiserJeu();
    }
    
    // Pour commencer une partie
    public void initialiserJeu() {
        Random rand = new Random();
        tentativeActuelle = 0;
        // On tire 4 chiffres au hasard
        for (int i = 0; i < 4; i++) {
            combinaisonSecrete[i] = rand.nextInt(10); 
        }
        // Petite aide pour tricher (s'affiche en bas dans la sortie)
        System.out.println("CODE SECRET : " + combinaisonSecrete[0] + combinaisonSecrete[1] + combinaisonSecrete[2] + combinaisonSecrete[3]);
    }
    
    // C'EST ICI QUE TU AVAIS L'ERREUR AVANT
    // On remplace le message d'erreur par la vraie vérification
    public int[] verifierCombinaison(int[] proposition) {
        int exacts = 0;
        int tropHauts = 0;
        int tropBas = 0;
        
        for (int i = 0; i < 4; i++) {
            if (proposition[i] == combinaisonSecrete[i]) {
                exacts++;
            } else if (proposition[i] > combinaisonSecrete[i]) {
                tropHauts++;
            } else {
                tropBas++;
            }
        }
        
        tentativeActuelle = tentativeActuelle + 1;
        return new int[]{exacts, tropHauts, tropBas};
    }
    
    // Les fonctions pour récupérer les infos
    public int getTentativeActuelle() {
        return tentativeActuelle;
    }
    
    public int getMaxTentatives() {
        return MAX_TENTATIVES;
    }
}