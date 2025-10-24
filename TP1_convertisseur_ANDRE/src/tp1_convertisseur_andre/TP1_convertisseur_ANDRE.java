/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_convertisseur_andre;

import java.util.Scanner;


/**
 *
 * @author maxim
 */
public class TP1_convertisseur_ANDRE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez une temperature en degres Celsius : ");
        double tCelsius = sc.nextDouble();

        // Formule : T(K) = T(°C) + 273.15
        double tKelvin = tCelsius + 273.15;

        // 3. Affichage du résultat
        System.out.println("Temperature en degres Celsius : " + tCelsius);
        System.out.println("Temperature correspondante en degres Kelvin : " + tKelvin);
    }
}


