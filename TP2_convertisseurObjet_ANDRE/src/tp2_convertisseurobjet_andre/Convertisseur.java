/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_convertisseurobjet_andre;

/**
 *
 * @author maxim
 */
public class Convertisseur {
   int nbConversions;

    // Q3: nbConversions initialisé à 0 dans le constructeur
    public Convertisseur() {
        nbConversions = 0;
    }

    // ⚠️ Méthodes NON static (Q3)
    public double celsiusVersKelvin(double tC) {
        nbConversions++;
        return tC + 273.15;
    }

    public double kelvinVersCelsius(double tK) {
        nbConversions++;
        return tK - 273.15;
    }

    public double celsiusVersFahrenheit(double tC) {
        nbConversions++;
        return tC * 9.0 / 5.0 + 32.0;
    }

    public double fahrenheitVersCelsius(double tF) {
        nbConversions++;
        return (tF - 32.0) * 5.0 / 9.0;
    }

    public double kelvinVersFahrenheit(double tK) {
        nbConversions++;
        return (tK - 273.15) * 9.0 / 5.0 + 32.0;
    }

    public double fahrenheitVersKelvin(double tF) {
        nbConversions++;
        return (tF - 32.0) * 5.0 / 9.0 + 273.15;
    }

    @Override
    public String toString() {
        // Q3: exactement cette chaîne
        return "nb de conversions" + nbConversions;
    }
}
 
