/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_guessmynumber_mandre;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author maxim
 */
public class TP1_guessMyNumber_ANDRE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random generateurAleat = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("Choisissez un niveau de difficulte :");
        System.out.println("1 - Facile (0 a 50)");
        System.out.println("2 - Normal (0 a 100)");
        System.out.println("3 - Difficile (0 a 200)");
        int niveau = sc.nextInt();

        int max = 100;
        if (niveau == 1) {
            max = 50;
        } else if (niveau == 3) {
            max = 200;
        }

        int n = generateurAleat.nextInt(max + 1);
        int compteur = 0;
        int choix = -1;

        System.out.println("Devinez le nombre entre 0 et " + max);

        while (choix != n) {
            System.out.print("Votre choix : ");
            choix = sc.nextInt();
            compteur++;

            if (choix == n) {
                System.out.println("Ggs ! Vous avez gagne en " + compteur + " essais !");
            } else if (choix > n) {
                if (choix - n > 20) {
                    System.out.println("Vraaaiment trop grand !");
                } else {
                    System.out.println("Trop grand !");
                }
            } else {
                if (n - choix > 20) {
                    System.out.println("Vraaaiment trop petit !");
                } else {
                    System.out.println("Trop petit !");
                }
            }
        }
    }
}