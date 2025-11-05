package tp2_relation_1_andre;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author maxim
 */
public class Voiture {

    String modele;
    String marque;
    int puissanceCV;

    Personne proprietaire;

    public Voiture(String unModele, String uneMarque, int unePuissanceCV) {
        modele = unModele;
        marque = uneMarque;
        puissanceCV = unePuissanceCV;
        proprietaire = null;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return modele + " " + marque + " (" + puissanceCV + " CV)";
    }
}
