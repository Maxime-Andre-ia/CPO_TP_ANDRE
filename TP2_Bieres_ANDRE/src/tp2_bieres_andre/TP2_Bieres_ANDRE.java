/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_andre;

import bieres_andre.BouteilleBiere;

/**
 *
 * @author maxim
 */
public class TP2_Bieres_ANDRE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    BouteilleBiere uneBiere = new BouteilleBiere(); 

    uneBiere.nom = "Cuvée des trolls";             
    uneBiere.degreAlcool = 7.0f;                   

   
    uneBiere.brasserie = "Dubuisson";               
    uneBiere.ouverte = false;                       
    uneBiere.lireEtiquette();                       

  
    BouteilleBiere secondeBiere = new BouteilleBiere(); 
    secondeBiere.nom = "Leffe";                         
    secondeBiere.degreAlcool = 6.6f;                    
    secondeBiere.brasserie = "Abbaye de Leffe";         
    secondeBiere.ouverte = false;
    secondeBiere.lireEtiquette();                       

        
}