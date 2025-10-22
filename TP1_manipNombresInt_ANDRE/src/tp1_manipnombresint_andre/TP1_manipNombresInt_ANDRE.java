/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_manipnombresint_andre;

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

        // 1. Saisie des deux entiers
        System.out.print("Entrez le premier entier : ");
        int a = sc.nextInt();

        System.out.print("Entrez le deuxième entier : ");
        int b = sc.nextInt();

        // Affichage des entiers saisis
        System.out.println("Vous avez saisi : a = " + a + " et b = " + b);

        // 2. Calcul et affichage des opérations de base
        int somme = a + b;
        int difference = a - b;
        int produit = a * b;

        System.out.println("Somme : " + somme);
        System.out.println("Différence : " + difference);
        System.out.println("Produit : " + produit);

        // 3. Calcul du quotient entier et du reste de la division euclidienne
        if (b != 0) { // Vérifie que la division est possible
            int quotient = a / b;
            int reste = a % b;
            System.out.println("Quotient entier de a/b : " + quotient);
            System.out.println("Reste de la division euclidienne de a par b : " + reste);
        } else {
            System.out.println("Division par zéro impossible !");
        }

        // Fermeture du scanner
        sc.close();
    }
}

    
}
