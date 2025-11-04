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

        try (Scanner sc = new Scanner(System.in) // Objet qui lit au clavier
                ) {
            Convertisseur conv = new Convertisseur();   // Un convertisseur suffit pour le menu
            int choix = -1; // valeur différente de 0 pour démarrer la boucle
            // Boucle principale : on répète le menu tant que l'utilisateur ne tape pas 0
            while (choix != 0) {
                // 1) Afficher le menu
                System.out.println("\n=== Menu Convertisseur ===");
                System.out.println("1) Celsius -> Kelvin");
                System.out.println("2) Kelvin -> Celsius");
                System.out.println("3) Celsius -> Fahrenheit");
                System.out.println("4) Fahrenheit -> Celsius");
                System.out.println("5) Kelvin -> Fahrenheit");
                System.out.println("6) Fahrenheit -> Kelvin");
                System.out.println("0) Quitter");
                System.out.print("Choix : ");

                // 2) Lire un entier au clavier (ex: 1, 2, 3, …)
                // ⚠️ Version débutant : si tu tapes autre chose qu'un nombre entier, le programme plantera (c'est normal ici).
                choix = sc.nextInt();

                if (choix == 0) {
                    System.out.println("Fin du programme. A bientot !");
                    break; // on sort de la boucle
                }

                // 3) Lire la valeur à convertir (un nombre réel)
                System.out.print("Temperature à convertir : ");
                // ⚠️ Pareil : si tu tapes autre chose qu'un nombre (ex: du texte), ça plantera dans cette version simple.
                double val = sc.nextDouble();

                double res; // résultat de la conversion
                // 4) Selon le choix, on appelle la bonne méthode et on affiche
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
