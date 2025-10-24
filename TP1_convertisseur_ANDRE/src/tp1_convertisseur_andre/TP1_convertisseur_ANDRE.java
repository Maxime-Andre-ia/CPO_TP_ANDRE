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

    public static double CelciusVersKelvin(double tcelcius) {
        double tkelvin = tcelcius + 273.15;
        return tkelvin;
    }

    public static double KelvinVersCelcius(double tkelvin) {
        double tcelcius = tkelvin - 273.15;
        return tcelcius;
    }

    public static double FarenheitVersCelcius(double tfarenheit) {
        double tcelcius = (tfarenheit - 32) / 1.8;
        return tcelcius;
    }

    public static double CelciusVersFarenheit(double tcelcius) {
        double tfarenheit = (tcelcius * 1.8) + 32;
        return tfarenheit;
    }

    public static double KelvinVersFarenheit(double tkelvin) {
        double tfarenheit = CelciusVersFarenheit(KelvinVersCelcius(tkelvin));
        return tfarenheit;
    }

    public static double FarenheitVersKelvin(double tfarenheit) {
        double tcelcius = FarenheitVersCelcius(tfarenheit);
        double tkelvin = CelciusVersKelvin(tcelcius);
        return tkelvin;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                           choisir la conversion:
                           1= celcius vers kelvin
                           2= Kelvin Vers celcius
                           3= ferenheit vers celcius
                           4=celcius vers farenheint
                           5=kelcin vers farenheit
                           6= farenheint vers kelvin""");
        
        int choix = sc.nextInt();
        if (choix == 1) {
            System.out.println("choisire une temperature en degré");
            double temperaturec = sc.nextDouble();
            double temperaturek = CelciusVersKelvin(temperaturec);
            System.out.println("en kelvin la temerature est " + temperaturek);
        } else {
            if (choix == 2) {
                System.out.println("choisire une temperature en kelvin");
                double temperaturec = sc.nextDouble();
                double temperaturek = KelvinVersCelcius(temperaturec);
                System.out.println("en celcius la temerature est " + temperaturek);
            } else {
                if (choix == 3) {
                System.out.println("choisire une temperature en farenheit");
                double temperaturec = sc.nextDouble();
                double temperaturek = FarenheitVersCelcius(temperaturec);
                System.out.println("en celcius la temerature est "+temperaturek);
                } else{
                if (choix==4){
                System.out.println("choisire une temperature en celcius");
        double temperaturec = sc.nextDouble();
        double temperaturek = CelciusVersFarenheit(temperaturec);
        System.out.println("en farenheit la temerature est "+temperaturek);}else{
                if (choix==5){
                System.out.println("choisire une temperature en kelvin");
        double temperaturec = sc.nextDouble();
        double temperaturek = KelvinVersFarenheit(temperaturec);
        System.out.println("en farenheit la temerature est "+temperaturek);} else{
                if (choix==6){
                System.out.println("choisire une temperature en farenheit");
        double temperaturec = sc.nextDouble();
        double temperaturek = FarenheitVersKelvin(temperaturec);
        System.out.println("en kelvin la temerature est "+temperaturek);}}}}
            }
        }

    }

}