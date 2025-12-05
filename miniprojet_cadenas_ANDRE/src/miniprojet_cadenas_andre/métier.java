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

public final class métier {
    
    private final int[] combinaisonSecrete; 
    private int tentativeActuelle;
    private final int MAX_TENTATIVES = 5;
    
    public métier() {
        combinaisonSecrete = new int[4];
        initialiserJeu();
    }
    
    public void initialiserJeu() {
        Random rand = new Random();
        tentativeActuelle = 0;
        for (int i = 0; i < 4; i++) {
            combinaisonSecrete[i] = rand.nextInt(10); 
        }
    }
    
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
        
        tentativeActuelle++;
        return new int[]{exacts, tropHauts, tropBas};
    }
    
    public int getTentativeActuelle() {
        return tentativeActuelle;
    }
    
    public int getMaxTentatives() {
        return MAX_TENTATIVES;
    }
    
    public boolean estPerdu() {
        return tentativeActuelle >= MAX_TENTATIVES;
    }
    
    public boolean estGagne(int nbExacts) {
        return nbExacts == 4;
    }
}