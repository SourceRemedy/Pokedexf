/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokedexf;

import java.util.Scanner;

/**
 *
 * @author 734260
 */
public class Pokedexf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);
        System.out.println("Hello trainer! Which of my lovely features would you like to use?");
        System.out.println("\t1.  Pokédex \t2.  Type Information");
        String option = kb.nextLine();
        
        String[][] data = {
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
        }; 
        
        String[][] typeData = {
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
            { "" },
        };
        
        if (option.equals("Pokedex")) {
            System.out.println("Okay, now what is the name of the Pokemon you wish to search for?");
            String name = kb.nextLine();
            System.out.println ("Okay, what would you like to learn about this pokemon?");
            System.out.println ("Type the letter you would like.");
            System.out.println("\tA.  Number/Category \tB.  Types \tC.  Description");
            String info = kb.nextLine();
            
        
    }
        
        if (option.equals("Type Information")) {
            System.out.println("Ok, now what type would you like to search for?");
            String type = kb.nextLine();
            System.out.println("Okay, now what would you like to learn about this type?");
            System.out.println("Type the letter that you would like.");
            System.out.println("\tA.  No effects \tB.  Not very effectives \tC.  Super Effectives \tD.  Weaknesses \tE.  Resistances \tF. Immunities");
            String info = kb.nextLine();
            
            
        }
    
 }
}
