/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_andre;

/**
 *
 * @author maxim
 */
public class TP3_Heroic_Fantasy_ANDRE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Epee epee1 = new Epee("Excalibur", 7, 5);
        Epee epee2 = new Epee("Durandal", 4, 7);

        Baton baton1 = new Baton("Chêne", 4, 5);
        Baton baton2 = new Baton("Charme", 5, 6);

        System.out.println(epee1);
        System.out.println(epee2);
        System.out.println(baton1);
        System.out.println(baton2);
    }
}
