/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_stats_andre;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author maxim
 */
public class TP1_stats_ANDRE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random generateurAleat = new Random();
        Scanner sc = new Scanner(System.in);

        //On crée le tableau
        int[] faces = new int[6];

        // On demande à l'utilisateur le nombre de lancer
        System.out.print("Combien de lancers de de voulez-vous faire ? ");
        int m = sc.nextInt();

        // On crée la boucle avec les itérations
        for (int i = 0; i < m; i++) {
            int resultat = generateurAleat.nextInt(6); 
            faces[resultat]++; 
        }

        // On affiche le nombre de fois que chaque face est sortie
        System.out.println("\nResultats (nombre de fois que chaque face est sortie) :");
        for (int i = 0; i < faces.length; i++) { //Donné par ChatGPT et compris
            System.out.println("Face " + (i + 1) + " : " + faces[i]);
        }

        // On affiche les résultats en % ( fait par ChatGPT mais compris )
        System.out.println("\nResultats en pourcentage :");
        for (int i = 0; i < faces.length; i++) { 
            double pourcentage = (faces[i] * 100.0) / m;
            System.out.println("Face " + (i + 1) + " : " + pourcentage + " %");
        }
    }
}
