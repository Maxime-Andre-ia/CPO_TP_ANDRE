/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_andre;

/**
 *
 * @author maxim
 */
public class TP2_manip_ANDRE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tartiflette assiette1 = new Tartiflette(500);
        Tartiflette assiette2 = new Tartiflette(600);

        Tartiflette assiette3 = assiette2;

        System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories);
        System.out.println("nb de calories de Assiette 3 : " + assiette3.nbCalories);

        assiette3.nbCalories++;

        System.out.println(" après modification d'une seule tartiflette ");
        System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories);
        System.out.println("nb de calories de Assiette 3 : " + assiette3.nbCalories);
        Tartiflette tmp = assiette1;

        assiette1 = assiette2;

        assiette2 = tmp;
        Moussaka[] table = new Moussaka[10];

        for (int i = 0; i < table.length; i++) {
            table[i] = new Moussaka();  // exécute new Moussaka() 10 fois
        }
    }
}
