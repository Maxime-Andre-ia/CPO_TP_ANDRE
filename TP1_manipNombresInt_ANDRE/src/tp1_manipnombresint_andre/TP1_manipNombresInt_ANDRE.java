/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_manipnombresint_andre;

import java.util.Scanner;

/**
 *
 * @author maxim
 */
public class TP1_manipNombresInt_ANDRE {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 
        // lire les entrées clavier
        Scanner sc = new Scanner(System.in);

        // Saisie des 2 entiers
        System.out.print("Entrez le premier entier : ");
        int a = sc.nextInt();

        System.out.print("Entrez le deuxieme entier : ");
        int b = sc.nextInt();

        // Afficher des entiers
        System.out.println("Vous avez saisi : a = " + a + " et b = " + b);

        // 2. Calcul et affichage des opérations de base
        int somme = a + b;
        int difference = a - b;
        int produit = a * b;

        System.out.println("Somme : " + somme);
        System.out.println("Difference : " + difference);
        System.out.println("Produit : " + produit);

        // Calcul du quotient + division euclidienne
        if (b != 0) {
            int quotient = a / b;
            int reste = a % b;
            System.out.println("Quotient entier de a/b : " + quotient);
            System.out.println("Le reste de la division euclidienne de vos deux nombre est: " + reste);
        } else {
            System.out.println("Hmm ? Une division par 0 ?? Choisi un autre nombre à diviser !");
        }       
    }
}

    
