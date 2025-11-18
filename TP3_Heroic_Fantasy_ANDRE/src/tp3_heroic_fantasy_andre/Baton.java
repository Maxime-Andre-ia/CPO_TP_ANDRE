/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_andre;

/**
 *
 * @author maxim
 */
// Fichier : Baton.java

public class Baton extends Arme {
    
    private final int age;

    
    public Baton(String nom, int niveauAttaque, int age) {
        super(nom, niveauAttaque);
        
        if (age < 100) {
            this.age = age;
        } else {
            this.age = 99; 
        }
    }
    
    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return super.toString() + " - Âge : " + age;
    }
}
