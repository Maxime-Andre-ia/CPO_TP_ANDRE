/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_relation_1_andre;

/**
 *
 * @author maxim
 */
public class TP2_relation_1_ANDRE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Voiture uneClio = new Voiture("Clio", "Renault", 5);
        Voiture uneAutreClio = new Voiture("Clio", "Renault", 5);
        Voiture une2008 = new Voiture("2008", "Peugeot", 6);
        Voiture uneMicra = new Voiture("Micra", "Nissan", 4);

        Personne bob = new Personne("Bobby", "Sixkiller");
        Personne reno = new Personne("Reno", "Raines");

        System.out.println(
                "liste des voitures disponibles " + uneClio
                + "\n" + uneAutreClio
                + "\n" + une2008
                + "\n" + uneMicra);
        bob.liste_voitures[0] = uneClio;
        bob.nbVoitures = 1;
        uneClio.proprietaire = bob;

        System.out.println("la premiere voiture de Bob est " + bob.liste_voitures[0]);
        bob.liste_voitures[bob.nbVoitures] = une2008;
        bob.nbVoitures = bob.nbVoitures + 1;
        une2008.proprietaire = bob;

        reno.liste_voitures[reno.nbVoitures] = uneMicra;
        reno.nbVoitures = reno.nbVoitures + 1;
        uneMicra.proprietaire = reno;

        reno.liste_voitures[reno.nbVoitures] = uneAutreClio;
        reno.nbVoitures = reno.nbVoitures + 1;
        uneAutreClio.proprietaire = reno;

        System.out.println("Voitures de Bob :");
        System.out.println(" - " + bob.liste_voitures[0] + " (proprio: " + bob + ")");
        System.out.println(" - " + bob.liste_voitures[1] + " (proprio: " + bob + ")");

        System.out.println("Voitures de Reno :");
        System.out.println(" - " + reno.liste_voitures[0] + " (proprio: " + reno + ")");
        System.out.println(" - " + reno.liste_voitures[1] + " (proprio: " + reno + ")");
    }
}
