/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp0_.addition;

import java.util.Scanner;

/**
 *
 * @author maxim
 */// Maxime ANDRE, 20/10/2025
public class TP0_Addition {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int nb;
        int result;
        int ind;

        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer le nombre :");
        nb = sc.nextInt();

        result = 0;
        ind = 1;

        while (ind < nb) {
            result = result + ind;
            ind++;
        }
        System.out.println("La somme des " + nb + " entiers est: " + result);
    }
}