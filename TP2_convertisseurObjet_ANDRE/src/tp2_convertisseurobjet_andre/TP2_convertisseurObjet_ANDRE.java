/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_andre;

import java.util.Scanner;

/**
 *
 * @author maxim
 */
public class TP2_convertisseurObjet_ANDRE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in) 
                ) {
            Convertisseur conv = new Convertisseur();   
            int choix = -1; 
           
            while (choix != 0) {
                
                System.out.println("\n=== Menu Convertisseur ===");
                System.out.println("1) Celsius -> Kelvin");
                System.out.println("2) Kelvin -> Celsius");
                System.out.println("3) Celsius -> Fahrenheit");
                System.out.println("4) Fahrenheit -> Celsius");
                System.out.println("5) Kelvin -> Fahrenheit");
                System.out.println("6) Fahrenheit -> Kelvin");
                System.out.println("0) Quitter");
                System.out.print("Choix : ");

                
                choix = sc.nextInt();

                if (choix == 0) {
                    System.out.println("Fin du programme. A bientot !");
                    break; 
                }

                
                System.out.print("Temperature à convertir : ");
                
                double val = sc.nextDouble();

                double res; 
                
                switch (choix) {
                    case 1 -> {
                        res = conv.celsiusVersKelvin(val);
                        System.out.println(val + " °C = " + res + " K");
                    }
                    case 2 -> {
                        res = conv.kelvinVersCelsius(val);
                        System.out.println(val + " K = " + res + " °C");
                    }
                    case 3 -> {
                        res = conv.celsiusVersFahrenheit(val);
                        System.out.println(val + " °C = " + res + " °F");
                    }
                    case 4 -> {
                        res = conv.fahrenheitVersCelsius(val);
                        System.out.println(val + " °F = " + res + " °C");
                    }
                    case 5 -> {
                        res = conv.kelvinVersFahrenheit(val);
                        System.out.println(val + " K = " + res + " °F");
                    }
                    case 6 -> {
                        res = conv.fahrenheitVersKelvin(val);
                        System.out.println(val + " °F = " + res + " K");
                    }
                    default ->
                        System.out.println("Choix inconnu. Reessaie.");
                }

            }

        }
    }
}
