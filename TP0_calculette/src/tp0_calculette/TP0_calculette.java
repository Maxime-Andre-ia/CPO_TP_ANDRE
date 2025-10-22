/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp0_calculette;

import java.util.Scanner;

/**
 *
 * @author maxim
 */// Maxme ANDRE, 20/10/2025
public class TP0_calculette {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("Entrez l'operateur:");
        System.out.println("1) Addition");
        System.out.println("2) Soustraction");
        System.out.println("3) Multiplication");
        System.out.println("4) Division");
        System.out.println("5) Modulo");

        Scanner sc = new Scanner(System.in);
        int operateur;

        System.out.println("Entrez votre Operateur (entre 1 et 5):");
        operateur = sc.nextInt();

        if (operateur < 1 || operateur > 5) {
            System.out.println("Erreur: Votre operateur doit etre entre 1 et 5.");
            return;
        }

      
        int operande1;
        int operande2;
        System.out.println("entrez votre premier nombre");
        operande1 = sc.nextInt();
        System.out.println("Entrez votre deuxième nombre:");
        operande2 = sc.nextInt();

       
        if ((operateur == 4 || operateur == 5) && operande2 == 0) {
            System.out.println("Vous ne pouvez pas divisez par 0.");
            return;
        }

        int resultatInt;
        switch (operateur) {
            case 1 -> {
                
                resultatInt = operande1 + operande2;
                System.out.println("Resultat: " + resultatInt);
            }
            case 2 -> {
                
                resultatInt = operande1 - operande2;
                System.out.println("Resultat: " + resultatInt);
            }
            case 3 -> {
               
                resultatInt = operande1 * operande2;
                System.out.println("Resultat: " + resultatInt);
            }
            case 4 -> {
                
                double resultatDiv = (double) operande1 / operande2;
                System.out.println("Resultat: " + resultatDiv);
            }
            case 5 -> {
                
                resultatInt = operande1 % operande2;
                System.out.println("Resultat: " + resultatInt);
            }
        }
    }
}