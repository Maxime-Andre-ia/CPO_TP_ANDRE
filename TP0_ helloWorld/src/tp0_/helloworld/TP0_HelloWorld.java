/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp0_.helloworld;

import java.util.Scanner;

/**
 *
 * @author maxim
 */// Maxime ANDRE, TP0, 20/10/2025
    public class TP0_HelloWorld {

    public static void main(String[] args) {
        String prenom;
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("Quel est votre prénom ?");
        prenom = sc.nextLine();

        System.out.println("Bonjour " + prenom + " !");
        System.out.println("Au revoir " + prenom + " !");
    }
}
