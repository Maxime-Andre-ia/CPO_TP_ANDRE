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

    public static double CelciusVersKelvin(double tCelcius) {
        double tKelvin = tCelcius + 273.15;
        return tKelvin;
    }

    public static double KelvinVersCelcius(double tKelvin) {
        double tCelcius = tKelvin - 273.15;
        return tCelcius;
    }

    public static double FarenheitVersCelcius(double tFarenheit) {
        double tCelcius = (tFarenheit - 32) * 5 / 9;
        return tCelcius;
    }

    public static double CelciusVersFarenheit(double tCelcius) {
        double tFarenheit = (tCelcius * 9 / 5) + 32;
        return tFarenheit;
    }

    public static double KelvinVersFarenheit(double tKelvin) {
        double tFarenheit = (tKelvin - 273.15) * 9 / 5 + 32;
        return tFarenheit;
    }

    public static double FarenheitVersKelvin(double tFarenheit) {
        double tKelvin = (tFarenheit - 32) * 5 / 9 + 273.15;
        return tKelvin;
    }
        
        
        /**
         * @param args the command line arguments
         */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez une temperature en degres Celsius : ");
        double tCelsius = sc.nextDouble();

        // Formule : T(K) = T(°C) + 273.15
        double tKelvin = tCelsius + 273.15;

        // Affichage du résultat
        System.out.println("Temperature en degres Celsius : " + tCelsius);
        System.out.println("Temperature correspondante en degres Kelvin : " + tKelvin);
    }
}
