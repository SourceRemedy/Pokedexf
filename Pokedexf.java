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
            //Normal
            { "No effect against: Ghost", "Not very effective against: Rock and Steel", "Super effective against: N/A", "Weak to: Fighting", "Resists: N/A", "Immune to: Ghost" },
            //Fighting
            { "No effect against: Ghost", "Not very effective against: Flying, Poison, Bug, Psychic, and Fairy", "Super effective against: Normal, Rock, Steel, Ice, and Dark", "Weak to: Flying, Psychic, and Fairy", "Resists: Rock, Bug, and Dark", "Immune to: N/A" },
            //Flying
            { "No effect against: N/A", "Not very effective against: Rock, Steel, and Electric", "Super effective against: Fighting, Bug, and Grass", "Weak to: Rock, Electric and Ice", "Resists: Fighting, Bug, and Grass", "Immune to: Ground" },
            //Poison
            { "No effect against: Steel", "Not very effective against: Poison, Ground, Rock, and Ghost", "Super effective against: Grass and Fairy", "Weak to: Ground and Psychic", "Resists: Fighting, Poison, Bug, Grass, and Fairy", "Immune to: N/A" },
            //Ground
            { "No effect against: Flying", "Not very effective against: Bug and Grass", "Super effective against: Poison, Rock, Steel, Fire and Electric", "Weak to: Water, Grass, and Ice", "Resists: Poison and Rock", "Immune to: Electric" },
            //Rock
            { "No effect against: N/A", "Not very effective against: Fighting, Ground, and Steel", "Super effective against: Flying, Bug, Fire, and Ice", "Weak to: Fighting, Ground, Steel, Water, and Grass", "Resists: Normal, Flying, Poison, and Fire", "Immune to: N/A" },
            //Bug
            { "No effect against: N/A", "Not very effective against: Fighting, Flying, Poison, Ghost, Steel, Fire, and Fairy", "Super effective against: Grass, Psychic, and Dark", "Weak to: Flying, Rock, and Fire", "Resists: Fighting, Ground, and Grass", "Immune to: N/A" },
            //Ghost
            { "No effect against: Normal", "Not very effective against: Dark", "Super effective against: Ghost and Psychic", "Weak to: Ghost and Dark", "Resists: Poison and Bug", "Immune to: Normal and Fighting" },
            //Steel
            { "No effect against: N/A", "Not very effective against: Steel, Fire, Water, and Electric", "Super effective against: Rock, Ice, and Fairy", "Weak to: Fighting, Ground, and Fire", "Resists: Normal, Flying, Rock, Bug, Steel, Grass, Psychic, Ice, Dragon, and Fairy", "Immune to: Poison" },
            //Fire
            { "" },
            //Water
            { "" },
            //Grass
            { "" },
            //Electric
            { "" },
            //Psychic
            { "" },
            //Ice
            { "" },
            //Dragon
            { "" },
            //Dark
            { "" },
            //Fairy
            { "" },
        };
        
        if (option.equals("Pokedex")) {
            System.out.println("Okay, now what is the name of the Pokemon you wish to search for?");
            String name = kb.nextLine();
            System.out.println ("Okay, what would you like to learn about this pokemon?");
            System.out.println ("Type the letter you would like.");
            System.out.println("\tA.  Number/Category \tB.  Types \tC.  Description");
            String info = kb.nextLine();
            if (name.equals("Bulbasaur") && info.equals("A")) {
                System.out.print(data[0][0]);
            }
            if (name.equals("Bulbasaur") && info.equals("B")) {
                System.out.print(data[0][1]);
            }
            if (name.equals("Bulbasaur") && info.equals("C")) {
                System.out.print(data[0][2]);
            }
            if (name.equals("Ivysaur") && info.equals("A")) {
                System.out.print(data[1][0]);
            }
            if (name.equals("Ivysaur") && info.equals("B")) {
                System.out.print(data[1][1]);
            }
            if (name.equals("Ivysaur") && info.equals("C")) {
                System.out.print(data[1][2]);
            }
            if (name.equals("Venusaur") && info.equals("A")) {
                System.out.print(data[2][0]);
            }
            if (name.equals("Venusaur") && info.equals("B")) {
                System.out.print(data[2][1]);
            }
            if (name.equals("Venusaur") && info.equals("C")) {
                System.out.print(data[2][2]);
            }
            if (name.equals("Charmander") && info.equals("A")) {
                System.out.print(data[3][0]);
            }
            if (name.equals("Charmander") && info.equals("B")) {
                System.out.print(data[3][1]);
            }
            if (name.equals("Charmander") && info.equals("C")) {
                System.out.print(data[3][2]);
            }
            if (name.equals("Charmeleon") && info.equals("A")) {
                System.out.print(data[4][0]);
            }
            if (name.equals("Charmeleon") && info.equals("B")) {
                System.out.print(data[4][1]);
            }
            if (name.equals("Charmeleon") && info.equals("C")) {
                System.out.print(data[4][2]);
            }
            if (name.equals("Charizard") && info.equals("A")) {
                System.out.print(data[5][0]);
            }
            if (name.equals("Charizard") && info.equals("B")) {
                System.out.print(data[5][1]);
            }
            if (name.equals("Charizard") && info.equals("C")) {
                System.out.print(data[5][2]);
            }
            if (name.equals("Squirtle") && info.equals("A")) {
                System.out.print(data[6][0]);
            }
            if (name.equals("Squirtle") && info.equals("B")) {
                System.out.print(data[6][1]);
            }
            if (name.equals("Squirtle") && info.equals("C")) {
                System.out.print(data[6][2]);
            }
            if (name.equals("Wartortle") && info.equals("A")) {
                System.out.print(data[7][0]);
            }
            if (name.equals("Wartortle") && info.equals("B")) {
                System.out.print(data[7][1]);
            }
            if (name.equals("Wartortle") && info.equals("C")) {
                System.out.print(data[7][2]);
            }
            if (name.equals("Blastoise") && info.equals("A")) {
                System.out.print(data[8][0]);
            }
            if (name.equals("Blastoise") && info.equals("B")) {
                System.out.print(data[8][1]);
            }
            if (name.equals("Blastoise") && info.equals("C")) {
                System.out.print(data[8][2]);
            }
            if (name.equals("Caterpie") && info.equals("A")) {
                System.out.print(data[9][0]);
            }
            if (name.equals("Caterpie") && info.equals("B")) {
                System.out.print(data[9][1]);
            }
            if (name.equals("Caterpie") && info.equals("C")) {
                System.out.print(data[9][2]);
            }
            if (name.equals("Metapod") && info.equals("A")) {
                System.out.print(data[10][0]);
            }
            if (name.equals("Metapod") && info.equals("B")) {
                System.out.print(data[10][1]);
            }
            if (name.equals("Metapod") && info.equals("C")) {
                System.out.print(data[10][2]);
            }
            if (name.equals("Butterfree") && info.equals("A")) {
                System.out.print(data[11][0]);
            }
            if (name.equals("Butterfree") && info.equals("B")) {
                System.out.print(data[11][1]);
            }
            if (name.equals("Butterfree") && info.equals("C")) {
                System.out.print(data[11][2]);
            }
            if (name.equals("Weedle") && info.equals("A")) {
                System.out.print(data[12][0]);
            }
            if (name.equals("Weedle") && info.equals("B")) {
                System.out.print(data[12][1]);
            }
            if (name.equals("Weedle") && info.equals("C")) {
                System.out.print(data[12][2]);
            }
            if (name.equals("Kakuna") && info.equals("A")) {
                System.out.print(data[13][0]);
            }
            if (name.equals("Kakuna") && info.equals("B")) {
                System.out.print(data[13][1]);
            }
            if (name.equals("Kakuna") && info.equals("C")) {
                System.out.print(data[13][2]);
            }
            if (name.equals("Beedrill") && info.equals("A")) {
                System.out.print(data[14][0]);
            }
            if (name.equals("Beedrill") && info.equals("B")) {
                System.out.print(data[14][1]);
            }
            if (name.equals("Beedrill") && info.equals("C")) {
                System.out.print(data[14][2]);
            }
            if (name.equals("Pidgey") && info.equals("A")) {
                System.out.print(data[15][0]);
            }
            if (name.equals("Pidgey") && info.equals("B")) {
                System.out.print(data[15][1]);
            }
            if (name.equals("Pidgey") && info.equals("C")) {
                System.out.print(data[15][2]);
            }
            if (name.equals("Pidgeotto") && info.equals("A")) {
                System.out.print(data[16][0]);
            }
            if (name.equals("Pidgeotto") && info.equals("B")) {
                System.out.print(data[16][1]);
            }
            if (name.equals("Pidgeotto") && info.equals("C")) {
                System.out.print(data[16][2]);
            }
            if (name.equals("Pidgeot") && info.equals("A")) {
                System.out.print(data[17][0]);
            }
            if (name.equals("Pidgeot") && info.equals("B")) {
                System.out.print(data[17][1]);
            }
            if (name.equals("Pidgeot") && info.equals("C")) {
                System.out.print(data[17][2]);
            }
            if (name.equals("Rattata") && info.equals("A")) {
                System.out.print(data[18][0]);
            }
            if (name.equals("Rattata") && info.equals("B")) {
                System.out.print(data[18][1]);
            }
            if (name.equals("Rattata") && info.equals("C")) {
                System.out.print(data[18][2]);
            }
            if (name.equals("Raticate") && info.equals("A")) {
                System.out.print(data[19][0]);
            }
            if (name.equals("Raticate") && info.equals("B")) {
                System.out.print(data[19][1]);
            }
            if (name.equals("Raticate") && info.equals("C")) {
                System.out.print(data[19][2]);
            }
            if (name.equals("Spearow") && info.equals("A")) {
                System.out.print(data[20][0]);
            }
            if (name.equals("Spearow") && info.equals("B")) {
                System.out.print(data[20][1]);
            }
            if (name.equals("Spearow") && info.equals("C")) {
                System.out.print(data[20][2]);
            }
            if (name.equals("Fearow") && info.equals("A")) {
                System.out.print(data[21][0]);
            }
            if (name.equals("Fearow") && info.equals("B")) {
                System.out.print(data[21][1]);
            }
            if (name.equals("Fearow") && info.equals("C")) {
                System.out.print(data[21][2]);
            }
            if (name.equals("Ekans") && info.equals("A")) {
                System.out.print(data[22][0]);
            }
            if (name.equals("Ekans") && info.equals("B")) {
                System.out.print(data[22][1]);
            }
            if (name.equals("Ekans") && info.equals("C")) {
                System.out.print(data[22][2]);
            }
            if (name.equals("Arbok") && info.equals("A")) {
                System.out.print(data[23][0]);
            }
            if (name.equals("Arbok") && info.equals("B")) {
                System.out.print(data[23][1]);
            }
            if (name.equals("Arbok") && info.equals("C")) {
                System.out.print(data[23][2]);
            }
            if (name.equals("Pikachu") && info.equals("A")) {
                System.out.print(data[24][0]);
            }
            if (name.equals("Pikachu") && info.equals("B")) {
                System.out.print(data[24][1]);
            }
            if (name.equals("Raichu") && info.equals("C")) {
                System.out.print(data[25][2]);
            }
            if (name.equals("Raichu") && info.equals("A")) {
                System.out.print(data[25][0]);
            }
            if (name.equals("Raichu") && info.equals("B")) {
                System.out.print(data[25][1]);
            }
            if (name.equals("Sandshrew") && info.equals("C")) {
                System.out.print(data[26][2]);
            }
            if (name.equals("Sandshrew") && info.equals("A")) {
                System.out.print(data[26][0]);
            }
            if (name.equals("Sandshrew") && info.equals("B")) {
                System.out.print(data[26][1]);
            }
            if (name.equals("Sandslash") && info.equals("C")) {
                System.out.print(data[27][2]);
            }
            if (name.equals("Sandslash") && info.equals("A")) {
                System.out.print(data[27][0]);
            }
            if (name.equals("Sandslash") && info.equals("B")) {
                System.out.print(data[27][1]);
            }
            if (name.equals("Nidoran Female") && info.equals("C")) {
                System.out.print(data[28][2]);
            }
            if (name.equals("Nidoran Female") && info.equals("A")) {
                System.out.print(data[28][0]);
            }
            if (name.equals("Nidoran Female") && info.equals("B")) {
                System.out.print(data[28][1]);
            }
            if (name.equals("Nidorina") && info.equals("C")) {
                System.out.print(data[29][2]);
            }
            if (name.equals("Nidorina") && info.equals("A")) {
                System.out.print(data[29][0]);
            }
            if (name.equals("Nidorina") && info.equals("B")) {
                System.out.print(data[29][1]);
            }
            if (name.equals("Nidoqueen") && info.equals("C")) {
                System.out.print(data[30][2]);
            }
            if (name.equals("Nidoqueen") && info.equals("A")) {
                System.out.print(data[30][0]);
            }
            if (name.equals("Nidoqueen") && info.equals("B")) {
                System.out.print(data[30][1]);
            }
            if (name.equals("Nidoran Male") && info.equals("C")) {
                System.out.print(data[31][2]);
            }
            if (name.equals("Nidoran Male") && info.equals("A")) {
                System.out.print(data[31][0]);
            }
            if (name.equals("Nidoran Male") && info.equals("B")) {
                System.out.print(data[31][1]);
            }
            if (name.equals("Nidorino") && info.equals("C")) {
                System.out.print(data[32][2]);
            }
            if (name.equals("Nidorino") && info.equals("A")) {
                System.out.print(data[32][0]);
            }
            if (name.equals("Nidorino") && info.equals("B")) {
                System.out.print(data[32][1]);
            }
            if (name.equals("Nidoking") && info.equals("C")) {
                System.out.print(data[33][2]);
            }
            if (name.equals("Nidoking") && info.equals("A")) {
                System.out.print(data[33][0]);
            }
            if (name.equals("Nidoking") && info.equals("B")) {
                System.out.print(data[33][1]);
            }
            if (name.equals("Clefairy") && info.equals("C")) {
                System.out.print(data[34][2]);
            }
            if (name.equals("Clefairy") && info.equals("A")) {
                System.out.print(data[34][0]);
            }
            if (name.equals("Clefairy") && info.equals("B")) {
                System.out.print(data[34][1]);
            }
            if (name.equals("Clefable") && info.equals("C")) {
                System.out.print(data[35][2]);
            }
            if (name.equals("Clefable") && info.equals("A")) {
                System.out.print(data[35][0]);
            }
            if (name.equals("Clefable") && info.equals("B")) {
                System.out.print(data[35][1]);
            }
            if (name.equals("Vulpix") && info.equals("C")) {
                System.out.print(data[36][2]);
            }
            if (name.equals("Vulpix") && info.equals("A")) {
                System.out.print(data[36][0]);
            }
            if (name.equals("Vulpix") && info.equals("B")) {
                System.out.print(data[36][1]);
            }
            if (name.equals("Ninetales") && info.equals("C")) {
                System.out.print(data[37][2]);
            }
            if (name.equals("Ninetales") && info.equals("A")) {
                System.out.print(data[37][0]);
            }
            if (name.equals("Ninetales") && info.equals("B")) {
                System.out.print(data[37][1]);
            }
            if (name.equals("Jigglypuff") && info.equals("C")) {
                System.out.print(data[38][2]);
            }
            if (name.equals("Jigglypuff") && info.equals("A")) {
                System.out.print(data[38][0]);
            }
            if (name.equals("Jigglypuff") && info.equals("B")) {
                System.out.print(data[38][1]);
            }
            if (name.equals("Wigglytuff") && info.equals("C")) {
                System.out.print(data[39][2]);
            }
            if (name.equals("Wigglytuff") && info.equals("A")) {
                System.out.print(data[39][0]);
            }
            if (name.equals("Wigglytuff") && info.equals("B")) {
                System.out.print(data[39][1]);
            }
            if (name.equals("Zubat") && info.equals("A")) {
                System.out.print(data[40][0]);
            }
            if (name.equals("Zubat") && info.equals("B")) {
                System.out.print(data[40][1]);
            }
            if (name.equals("Zubat") && info.equals("C")) {
                System.out.print(data[40][2]);
            }
            if (name.equals("Golbat") && info.equals("A")) {
                System.out.print(data[41][0]);
            }
            if (name.equals("Golbat") && info.equals("B")) {
                System.out.print(data[41][1]);
            }
            if (name.equals("Golbat") && info.equals("C")) {
                System.out.print(data[41][2]);
            }
            if (name.equals("Oddish") && info.equals("A")) {
                System.out.print(data[42][0]);
            }
            if (name.equals("Oddish") && info.equals("B")) {
                System.out.print(data[42][1]);
            }
            if (name.equals("Oddish") && info.equals("C")) {
                System.out.print(data[42][2]);
            }
            if (name.equals("Gloom") && info.equals("A")) {
                System.out.print(data[43][0]);
            }
            if (name.equals("Gloom") && info.equals("B")) {
                System.out.print(data[43][1]);
            }
            if (name.equals("Gloom") && info.equals("C")) {
                System.out.print(data[43][2]);
            }
            if (name.equals("Vileplume") && info.equals("A")) {
                System.out.print(data[44][0]);
            }
            if (name.equals("Vileplume") && info.equals("B")) {
                System.out.print(data[44][1]);
            }
            if (name.equals("Vileplume") && info.equals("C")) {
                System.out.print(data[44][2]);
            }
            if (name.equals("Paras") && info.equals("A")) {
                System.out.print(data[45][0]);
            }
            if (name.equals("Paras") && info.equals("B")) {
                System.out.print(data[45][1]);
            }
            if (name.equals("Paras") && info.equals("C")) {
                System.out.print(data[45][2]);
            }
            if (name.equals("Parasect") && info.equals("A")) {
                System.out.print(data[46][0]);
            }
            if (name.equals("Parasect") && info.equals("B")) {
                System.out.print(data[46][1]);
            }
            if (name.equals("Parasect") && info.equals("C")) {
                System.out.print(data[46][2]);
            }
            if (name.equals("Venonat") && info.equals("A")) {
                System.out.print(data[47][0]);
            }
            if (name.equals("Venonat") && info.equals("B")) {
                System.out.print(data[47][1]);
            }
            if (name.equals("Venonat") && info.equals("C")) {
                System.out.print(data[47][2]);
            }
            if (name.equals("Venomoth") && info.equals("A")) {
                System.out.print(data[48][0]);
            }
            if (name.equals("Venomoth") && info.equals("B")) {
                System.out.print(data[48][1]);
            }
            if (name.equals("Venomoth") && info.equals("C")) {
                System.out.print(data[48][2]);
            }
            if (name.equals("Diglett") && info.equals("A")) {
                System.out.print(data[49][0]);
            }
            if (name.equals("Diglett") && info.equals("B")) {
                System.out.print(data[49][1]);
            }
            if (name.equals("Diglett") && info.equals("C")) {
                System.out.print(data[49][2]);
            }
            if (name.equals("Dugtrio") && info.equals("A")) {
                System.out.print(data[50][0]);
            }
            if (name.equals("Dugtrio") && info.equals("B")) {
                System.out.print(data[50][1]);
            }
            if (name.equals("Dugtrio") && info.equals("C")) {
                System.out.print(data[50][2]);
            }
            if (name.equals("Meowth") && info.equals("A")) {
                System.out.print(data[51][0]);
            }
            if (name.equals("Meowth") && info.equals("B")) {
                System.out.print(data[51][1]);
            }
            if (name.equals("Meowth") && info.equals("C")) {
                System.out.print(data[51][2]);
            }
            if (name.equals("Persian") && info.equals("A")) {
                System.out.print(data[52][0]);
            }
            if (name.equals("Persian") && info.equals("B")) {
                System.out.print(data[52][1]);
            }
            if (name.equals("Persian") && info.equals("C")) {
                System.out.print(data[52][2]);
            }
            if (name.equals("Psyduck") && info.equals("A")) {
                System.out.print(data[53][0]);
            }
            if (name.equals("Psyduck") && info.equals("B")) {
                System.out.print(data[53][1]);
            }
            if (name.equals("Psyduck") && info.equals("C")) {
                System.out.print(data[53][2]);
            }
            if (name.equals("Golduck") && info.equals("A")) {
                System.out.print(data[54][0]);
            }
            if (name.equals("Golduck") && info.equals("B")) {
                System.out.print(data[54][1]);
            }
            if (name.equals("Golduck") && info.equals("C")) {
                System.out.print(data[54][2]);
            }
            if (name.equals("Mankey") && info.equals("A")) {
                System.out.print(data[55][0]);
            }
            if (name.equals("Mankey") && info.equals("B")) {
                System.out.print(data[55][1]);
            }
            if (name.equals("Mankey") && info.equals("C")) {
                System.out.print(data[55][2]);
            }
            if (name.equals("Primeape") && info.equals("A")) {
                System.out.print(data[56][0]);
            }
            if (name.equals("Primeape") && info.equals("B")) {
                System.out.print(data[56][1]);
            }
            if (name.equals("Primeape") && info.equals("C")) {
                System.out.print(data[56][2]);
            }
            if (name.equals("Growlithe") && info.equals("A")) {
                System.out.print(data[57][0]);
            }
            if (name.equals("Growlithe") && info.equals("B")) {
                System.out.print(data[57][1]);
            }
            if (name.equals("Growlithe") && info.equals("C")) {
                System.out.print(data[57][2]);
            }
            if (name.equals("Arcanine") && info.equals("A")) {
                System.out.print(data[58][0]);
            }
            if (name.equals("Arcanine") && info.equals("B")) {
                System.out.print(data[58][1]);
            }
            if (name.equals("Arcanine") && info.equals("C")) {
                System.out.print(data[58][2]);
            }
            if (name.equals("Poliwag") && info.equals("A")) {
                System.out.print(data[59][0]);
            }
            if (name.equals("Poliwag") && info.equals("B")) {
                System.out.print(data[59][1]);
            }
            if (name.equals("Poliwag") && info.equals("C")) {
                System.out.print(data[59][2]);
            }
            if (name.equals("Poliwhirl") && info.equals("A")) {
                System.out.print(data[60][0]);
            }
            if (name.equals("Poliwhirl") && info.equals("B")) {
                System.out.print(data[60][1]);
            }
            if (name.equals("Poliwhirl") && info.equals("C")) {
                System.out.print(data[60][2]);
            }
            if (name.equals("Poliwrath") && info.equals("A")) {
                System.out.print(data[61][0]);
            }
            if (name.equals("Poliwrath") && info.equals("B")) {
                System.out.print(data[61][1]);
            }
            if (name.equals("Poliwrath") && info.equals("C")) {
                System.out.print(data[61][2]);
            }
            if (name.equals("Abra") && info.equals("A")) {
                System.out.print(data[62][0]);
            }
            if (name.equals("Abra") && info.equals("B")) {
                System.out.print(data[62][1]);
            }
            if (name.equals("Abra") && info.equals("C")) {
                System.out.print(data[62][2]);
            }
            if (name.equals("Kadabra") && info.equals("A")) {
                System.out.print(data[63][0]);
            }
            if (name.equals("Kadabra") && info.equals("B")) {
                System.out.print(data[63][1]);
            }
            if (name.equals("Kadabra") && info.equals("C")) {
                System.out.print(data[63][2]);
            }
            if (name.equals("Alakazam") && info.equals("A")) {
                System.out.print(data[64][0]);
            }
            if (name.equals("Alakazam") && info.equals("B")) {
                System.out.print(data[64][1]);
            }
            if (name.equals("Alakazam") && info.equals("C")) {
                System.out.print(data[64][2]);
            }
            if (name.equals("Machop") && info.equals("A")) {
                System.out.print(data[65][0]);
            }
            if (name.equals("Machop") && info.equals("B")) {
                System.out.print(data[65][1]);
            }
            if (name.equals("Machop") && info.equals("C")) {
                System.out.print(data[65][2]);
            }
            if (name.equals("Machoke") && info.equals("A")) {
                System.out.print(data[66][0]);
            }
            if (name.equals("Machoke") && info.equals("B")) {
                System.out.print(data[66][1]);
            }
            if (name.equals("Machoke") && info.equals("C")) {
                System.out.print(data[66][2]);
            }
            if (name.equals("Machamp") && info.equals("A")) {
                System.out.print(data[67][0]);
            }
            if (name.equals("Machamp") && info.equals("B")) {
                System.out.print(data[67][1]);
            }
            if (name.equals("Machamp") && info.equals("C")) {
                System.out.print(data[67][2]);
            }
            if (name.equals("Bellsprout") && info.equals("A")) {
                System.out.print(data[68][0]);
            }
            if (name.equals("Bellsprout") && info.equals("B")) {
                System.out.print(data[68][1]);
            }
            if (name.equals("Bellsprout") && info.equals("C")) {
                System.out.print(data[68][2]);
            }
            if (name.equals("Weepinbell") && info.equals("A")) {
                System.out.print(data[69][0]);
            }
            if (name.equals("Weepinbell") && info.equals("B")) {
                System.out.print(data[69][1]);
            }
            if (name.equals("Weepinbell") && info.equals("C")) {
                System.out.print(data[69][2]);
            }
            if (name.equals("Victreebel") && info.equals("A")) {
                System.out.print(data[70][0]);
            }
            if (name.equals("Victreebel") && info.equals("B")) {
                System.out.print(data[70][1]);
            }
            if (name.equals("Victreebel") && info.equals("C")) {
                System.out.print(data[70][2]);
            }
            if (name.equals("Tentacool") && info.equals("A")) {
                System.out.print(data[71][0]);
            }
            if (name.equals("Tentacool") && info.equals("B")) {
                System.out.print(data[71][1]);
            }
            if (name.equals("Tentacool") && info.equals("C")) {
                System.out.print(data[71][2]);
            }
            if (name.equals("Tentacruel") && info.equals("A")) {
                System.out.print(data[72][0]);
            }
            if (name.equals("Tentacruel") && info.equals("B")) {
                System.out.print(data[72][1]);
            }
            if (name.equals("Tentacruel") && info.equals("C")) {
                System.out.print(data[72][2]);
            }
            if (name.equals("Geodude") && info.equals("A")) {
                System.out.print(data[73][0]);
            }
            if (name.equals("Geodude") && info.equals("B")) {
                System.out.print(data[73][1]);
            }
            if (name.equals("Geodude") && info.equals("C")) {
                System.out.print(data[73][2]);
            }
            if (name.equals("Graveler") && info.equals("A")) {
                System.out.print(data[74][0]);
            }
            if (name.equals("Graveler") && info.equals("B")) {
                System.out.print(data[74][1]);
            }
            if (name.equals("Graveler") && info.equals("C")) {
                System.out.print(data[74][2]);
            }
            if (name.equals("Golem") && info.equals("A")) {
                System.out.print(data[75][0]);
            }
            if (name.equals("Golem") && info.equals("B")) {
                System.out.print(data[75][1]);
            }
            if (name.equals("Golem") && info.equals("C")) {
                System.out.print(data[75][2]);
            }
            if (name.equals("Ponyta") && info.equals("A")) {
                System.out.print(data[76][0]);
            }
            if (name.equals("Ponyta") && info.equals("B")) {
                System.out.print(data[76][1]);
            }
            if (name.equals("Ponyta") && info.equals("C")) {
                System.out.print(data[76][2]);
            }
            if (name.equals("Rapidash") && info.equals("A")) {
                System.out.print(data[77][0]);
            }
            if (name.equals("Rapidash") && info.equals("B")) {
                System.out.print(data[77][1]);
            }
            if (name.equals("Rapidash") && info.equals("C")) {
                System.out.print(data[77][2]);
            }
            if (name.equals("Slowpoke") && info.equals("A")) {
                System.out.print(data[78][0]);
            }
            if (name.equals("Slowpoke") && info.equals("B")) {
                System.out.print(data[78][1]);
            }
            if (name.equals("Slowpoke") && info.equals("C")) {
                System.out.print(data[78][2]);
            }
            if (name.equals("Slowbro") && info.equals("A")) {
                System.out.print(data[79][0]);
            }
            if (name.equals("Slowbro") && info.equals("B")) {
                System.out.print(data[79][1]);
            }
            if (name.equals("Slowbro") && info.equals("C")) {
                System.out.print(data[79][2]);
            }
            if (name.equals("Magnemite") && info.equals("A")) {
                System.out.print(data[80][0]);
            }
            if (name.equals("Magnemite") && info.equals("B")) {
                System.out.print(data[80][1]);
            }
            if (name.equals("Magnemite") && info.equals("C")) {
                System.out.print(data[80][2]);
            }
            if (name.equals("Magneton") && info.equals("A")) {
                System.out.print(data[81][0]);
            }
            if (name.equals("Magneton") && info.equals("B")) {
                System.out.print(data[81][1]);
            }
            if (name.equals("Magneton") && info.equals("C")) {
                System.out.print(data[81][2]);
            }
            if (name.equals("Farfetch'd") && info.equals("A")) {
                System.out.print(data[82][0]);
            }
            if (name.equals("Farfetch'd") && info.equals("B")) {
                System.out.print(data[82][1]);
            }
            if (name.equals("Farfetch'd") && info.equals("C")) {
                System.out.print(data[82][2]);
            }
            if (name.equals("Doduo") && info.equals("A")) {
                System.out.print(data[83][0]);
            }
            if (name.equals("Doduo") && info.equals("B")) {
                System.out.print(data[83][1]);
            }
            if (name.equals("Doduo") && info.equals("C")) {
                System.out.print(data[83][2]);
            }
            if (name.equals("Dodrio") && info.equals("A")) {
                System.out.print(data[84][0]);
            }
            if (name.equals("Dodrio") && info.equals("B")) {
                System.out.print(data[84][1]);
            }
            if (name.equals("Dodrio") && info.equals("C")) {
                System.out.print(data[84][2]);
            }
            if (name.equals("Seel") && info.equals("A")) {
                System.out.print(data[85][0]);
            }
            if (name.equals("Seel") && info.equals("B")) {
                System.out.print(data[85][1]);
            }
            if (name.equals("Seel") && info.equals("C")) {
                System.out.print(data[85][2]);
            }
            if (name.equals("Dewgong") && info.equals("A")) {
                System.out.print(data[86][0]);
            }
            if (name.equals("Dewgong") && info.equals("B")) {
                System.out.print(data[86][1]);
            }
            if (name.equals("Dewgong") && info.equals("C")) {
                System.out.print(data[86][2]);
            }
            if (name.equals("Grimer") && info.equals("A")) {
                System.out.print(data[87][0]);
            }
            if (name.equals("Grimer") && info.equals("B")) {
                System.out.print(data[87][1]);
            }
            if (name.equals("Grimer") && info.equals("C")) {
                System.out.print(data[87][2]);
            }
            if (name.equals("Muk") && info.equals("A")) {
                System.out.print(data[88][0]);
            }
            if (name.equals("Muk") && info.equals("B")) {
                System.out.print(data[88][1]);
            }
            if (name.equals("Muk") && info.equals("C")) {
                System.out.print(data[88][2]);
            }
            if (name.equals("Shellder") && info.equals("A")) {
                System.out.print(data[89][0]);
            }
            if (name.equals("Shellder") && info.equals("B")) {
                System.out.print(data[89][1]);
            }
            if (name.equals("Shellder") && info.equals("C")) {
                System.out.print(data[89][2]);
            }
            if (name.equals("Cloyster") && info.equals("A")) {
                System.out.print(data[90][0]);
            }
            if (name.equals("Cloyster") && info.equals("B")) {
                System.out.print(data[90][1]);
            }
            if (name.equals("Cloyster") && info.equals("C")) {
                System.out.print(data[90][2]);
            }
            if (name.equals("Gastly") && info.equals("A")) {
                System.out.print(data[91][0]);
            }
            if (name.equals("Gastly") && info.equals("B")) {
                System.out.print(data[91][1]);
            }
            if (name.equals("Gastly") && info.equals("C")) {
                System.out.print(data[91][2]);
            }
            if (name.equals("Haunter") && info.equals("A")) {
                System.out.print(data[92][0]);
            }
            if (name.equals("Haunter") && info.equals("B")) {
                System.out.print(data[92][1]);
            }
            if (name.equals("Haunter") && info.equals("C")) {
                System.out.print(data[92][2]);
            }
            if (name.equals("Gengar") && info.equals("A")) {
                System.out.print(data[93][0]);
            }
            if (name.equals("Gengar") && info.equals("B")) {
                System.out.print(data[93][1]);
            }
            if (name.equals("Gengar") && info.equals("C")) {
                System.out.print(data[93][2]);
            }
            if (name.equals("Onix") && info.equals("A")) {
                System.out.print(data[94][0]);
            }
            if (name.equals("Onix") && info.equals("B")) {
                System.out.print(data[94][1]);
            }
            if (name.equals("Onix") && info.equals("C")) {
                System.out.print(data[94][2]);
            }
            if (name.equals("Drowzee") && info.equals("A")) {
                System.out.print(data[95][0]);
            }
            if (name.equals("Drowzee") && info.equals("B")) {
                System.out.print(data[95][1]);
            }
            if (name.equals("Drowzee") && info.equals("C")) {
                System.out.print(data[95][2]);
            }
            if (name.equals("Hypno") && info.equals("A")) {
                System.out.print(data[96][0]);
            }
            if (name.equals("Hypno") && info.equals("B")) {
                System.out.print(data[96][1]);
            }
            if (name.equals("Hypno") && info.equals("C")) {
                System.out.print(data[96][2]);
            }
            if (name.equals("Krabby") && info.equals("A")) {
                System.out.print(data[97][0]);
            }
            if (name.equals("Krabby") && info.equals("B")) {
                System.out.print(data[97][1]);
            }
            if (name.equals("Krabby") && info.equals("C")) {
                System.out.print(data[97][2]);
            }
            if (name.equals("Kingler") && info.equals("A")) {
                System.out.print(data[98][0]);
            }
            if (name.equals("Kingler") && info.equals("B")) {
                System.out.print(data[98][1]);
            }
            if (name.equals("Kingler") && info.equals("C")) {
                System.out.print(data[98][2]);
            }
            if (name.equals("Voltorb") && info.equals("A")) {
                System.out.print(data[99][0]);
            }
            if (name.equals("Voltorb") && info.equals("B")) {
                System.out.print(data[99][1]);
            }
            if (name.equals("Voltorb") && info.equals("C")) {
                System.out.print(data[99][2]);
            }
            if (name.equals("Electrode") && info.equals("A")) {
                System.out.print(data[100][0]);
            }
            if (name.equals("Electrode") && info.equals("B")) {
                System.out.print(data[100][1]);
            }
            if (name.equals("Electrode") && info.equals("C")) {
                System.out.print(data[100][2]);
            }
            if (name.equals("Exeggcute") && info.equals("A")) {
                System.out.print(data[101][0]);
            }
            if (name.equals("Exeggcute") && info.equals("B")) {
                System.out.print(data[101][1]);
            }
            if (name.equals("Exeggcute") && info.equals("C")) {
                System.out.print(data[101][2]);
            }
            if (name.equals("Exeggutor") && info.equals("A")) {
                System.out.print(data[102][0]);
            }
            if (name.equals("Exeggutor") && info.equals("B")) {
                System.out.print(data[102][1]);
            }
            if (name.equals("Exeggutor") && info.equals("C")) {
                System.out.print(data[102][2]);
            }
            if (name.equals("Cubone") && info.equals("A")) {
                System.out.print(data[103][0]);
            }
            if (name.equals("Cubone") && info.equals("B")) {
                System.out.print(data[103][1]);
            }
            if (name.equals("Cubone") && info.equals("C")) {
                System.out.print(data[103][2]);
            }
            if (name.equals("Marowak") && info.equals("A")) {
                System.out.print(data[104][0]);
            }
            if (name.equals("Marowak") && info.equals("B")) {
                System.out.print(data[104][1]);
            }
            if (name.equals("Marowak") && info.equals("C")) {
                System.out.print(data[104][2]);
            }
            if (name.equals("Hitmonlee") && info.equals("A")) {
                System.out.print(data[105][0]);
            }
            if (name.equals("Hitmonlee") && info.equals("B")) {
                System.out.print(data[105][1]);
            }
            if (name.equals("Hitmonlee") && info.equals("C")) {
                System.out.print(data[105][2]);
            }
            if (name.equals("Hitmonchan") && info.equals("A")) {
                System.out.print(data[106][0]);
            }
            if (name.equals("Hitmonchan") && info.equals("B")) {
                System.out.print(data[106][1]);
            }
            if (name.equals("Hitmonchan") && info.equals("C")) {
                System.out.print(data[106][2]);
            }
            if (name.equals("Lickitung") && info.equals("A")) {
                System.out.print(data[107][0]);
            }
            if (name.equals("Lickitung") && info.equals("B")) {
                System.out.print(data[107][1]);
            }
            if (name.equals("Lickitung") && info.equals("C")) {
                System.out.print(data[107][2]);
            }
            if (name.equals("Koffing") && info.equals("A")) {
                System.out.print(data[108][0]);
            }
            if (name.equals("Koffing") && info.equals("B")) {
                System.out.print(data[108][1]);
            }
            if (name.equals("Koffing") && info.equals("C")) {
                System.out.print(data[108][2]);
            }
            if (name.equals("Weezing") && info.equals("A")) {
                System.out.print(data[109][0]);
            }
            if (name.equals("Weezing") && info.equals("B")) {
                System.out.print(data[109][1]);
            }
            if (name.equals("Weezing") && info.equals("C")) {
                System.out.print(data[109][2]);
            }
            if (name.equals("Rhyhorn") && info.equals("A")) {
                System.out.print(data[110][0]);
            }
            if (name.equals("Rhyhorn") && info.equals("B")) {
                System.out.print(data[110][1]);
            }
            if (name.equals("Rhyhorn") && info.equals("C")) {
                System.out.print(data[110][2]);
            }
            if (name.equals("Rhydon") && info.equals("A")) {
                System.out.print(data[111][0]);
            }
            if (name.equals("Rhydon") && info.equals("B")) {
                System.out.print(data[111][1]);
            }
            if (name.equals("Rhydon") && info.equals("C")) {
                System.out.print(data[111][2]);
            }
            if (name.equals("Chansey") && info.equals("A")) {
                System.out.print(data[112][0]);
            }
            if (name.equals("Chansey") && info.equals("B")) {
                System.out.print(data[112][1]);
            }
            if (name.equals("Chansey") && info.equals("C")) {
                System.out.print(data[112][2]);
            }
            if (name.equals("Tangela") && info.equals("A")) {
                System.out.print(data[113][0]);
            }
            if (name.equals("Tangela") && info.equals("B")) {
                System.out.print(data[113][1]);
            }
            if (name.equals("Tangela") && info.equals("C")) {
                System.out.print(data[113][2]);
            }
            if (name.equals("Kangaskhan") && info.equals("A")) {
                System.out.print(data[114][0]);
            }
            if (name.equals("Kangaskhan") && info.equals("B")) {
                System.out.print(data[114][1]);
            }
            if (name.equals("Kangaskhan") && info.equals("C")) {
                System.out.print(data[114][2]);
            }
            if (name.equals("Horsea") && info.equals("A")) {
                System.out.print(data[115][0]);
            }
            if (name.equals("Horsea") && info.equals("B")) {
                System.out.print(data[115][1]);
            }
            if (name.equals("Horsea") && info.equals("C")) {
                System.out.print(data[115][2]);
            }
            if (name.equals("Seadra") && info.equals("A")) {
                System.out.print(data[116][0]);
            }
            if (name.equals("Seadra") && info.equals("B")) {
                System.out.print(data[116][1]);
            }
            if (name.equals("Goldeen") && info.equals("C")) {
                System.out.print(data[117][2]);
            }
            if (name.equals("Goldeen") && info.equals("A")) {
                System.out.print(data[117][0]);
            }
            if (name.equals("Goldeen") && info.equals("B")) {
                System.out.print(data[117][1]);
            }
            if (name.equals("Seaking") && info.equals("C")) {
                System.out.print(data[118][2]);
            }
            if (name.equals("Seaking") && info.equals("A")) {
                System.out.print(data[118][0]);
            }
            if (name.equals("Seaking") && info.equals("B")) {
                System.out.print(data[118][1]);
            }
            if (name.equals("Staryu") && info.equals("C")) {
                System.out.print(data[119][2]);
            }
            if (name.equals("Staryu") && info.equals("A")) {
                System.out.print(data[119][0]);
            }
            if (name.equals("Staryu") && info.equals("B")) {
                System.out.print(data[119][1]);
            }
            if (name.equals("Starmie") && info.equals("A")) {
                System.out.print(data[120][0]);
            }
            if (name.equals("Starmie") && info.equals("B")) {
                System.out.print(data[120][1]);
            }
            if (name.equals("Starmie") && info.equals("C")) {
                System.out.print(data[120][2]);
            }
            if (name.equals("Mr. Mime") && info.equals("A")) {
                System.out.print(data[121][0]);
            }
            if (name.equals("Mr. Mime") && info.equals("B")) {
                System.out.print(data[121][1]);
            }
            if (name.equals("Mr. Mime") && info.equals("C")) {
                System.out.print(data[121][2]);
            }
            if (name.equals("Scyther") && info.equals("A")) {
                System.out.print(data[122][0]);
            }
            if (name.equals("Scyther") && info.equals("B")) {
                System.out.print(data[122][1]);
            }
            if (name.equals("Scyther") && info.equals("C")) {
                System.out.print(data[122][2]);
            }
            if (name.equals("Jynx") && info.equals("A")) {
                System.out.print(data[123][0]);
            }
            if (name.equals("Jynx") && info.equals("B")) {
                System.out.print(data[123][1]);
            }
            if (name.equals("Jynx") && info.equals("C")) {
                System.out.print(data[123][2]);
            }
            if (name.equals("Electabuzz") && info.equals("A")) {
                System.out.print(data[124][0]);
            }
            if (name.equals("Electabuzz") && info.equals("B")) {
                System.out.print(data[124][1]);
            }
            if (name.equals("Electabuzz") && info.equals("C")) {
                System.out.print(data[124][2]);
            }
            if (name.equals("Magmar") && info.equals("A")) {
                System.out.print(data[125][0]);
            }
            if (name.equals("Magmar") && info.equals("B")) {
                System.out.print(data[125][1]);
            }
            if (name.equals("Magmar") && info.equals("C")) {
                System.out.print(data[125][2]);
            }
            if (name.equals("Pinsir") && info.equals("A")) {
                System.out.print(data[126][0]);
            }
            if (name.equals("Pinsir") && info.equals("B")) {
                System.out.print(data[126][1]);
            }
            if (name.equals("Pinsir") && info.equals("C")) {
                System.out.print(data[126][2]);
            }
            if (name.equals("Tauros") && info.equals("A")) {
                System.out.print(data[127][0]);
            }
            if (name.equals("Tauros") && info.equals("B")) {
                System.out.print(data[127][1]);
            }
            if (name.equals("Tauros") && info.equals("C")) {
                System.out.print(data[127][2]);
            }
            if (name.equals("Magikarp") && info.equals("A")) {
                System.out.print(data[128][0]);
            }
            if (name.equals("Magikarp") && info.equals("B")) {
                System.out.print(data[128][1]);
            }
            if (name.equals("Magikarp") && info.equals("C")) {
                System.out.print(data[128][2]);
            }
            if (name.equals("Gyarados") && info.equals("A")) {
                System.out.print(data[129][0]);
            }
            if (name.equals("Gyarados") && info.equals("B")) {
                System.out.print(data[129][1]);
            }
            if (name.equals("Gyarados") && info.equals("C")) {
                System.out.print(data[129][2]);
            }
            if (name.equals("Lapras") && info.equals("A")) {
                System.out.print(data[130][0]);
            }
            if (name.equals("Lapras") && info.equals("B")) {
                System.out.print(data[130][1]);
            }
            if (name.equals("Lapras") && info.equals("C")) {
                System.out.print(data[130][2]);
            }
            if (name.equals("Ditto") && info.equals("A")) {
                System.out.print(data[131][0]);
            }
            if (name.equals("Ditto") && info.equals("B")) {
                System.out.print(data[131][1]);
            }
            if (name.equals("Ditto") && info.equals("C")) {
                System.out.print(data[131][2]);
            }
            if (name.equals("Eevee") && info.equals("A")) {
                System.out.print(data[132][0]);
            }
            if (name.equals("Eevee") && info.equals("B")) {
                System.out.print(data[132][1]);
            }
            if (name.equals("Eevee") && info.equals("C")) {
                System.out.print(data[132][2]);
            }
            if (name.equals("Vaporeon") && info.equals("A")) {
                System.out.print(data[133][0]);
            }
            if (name.equals("Vaporeon") && info.equals("B")) {
                System.out.print(data[133][1]);
            }
            if (name.equals("Vaporeon") && info.equals("C")) {
                System.out.print(data[133][2]);
            }
            if (name.equals("Jolteon") && info.equals("A")) {
                System.out.print(data[134][0]);
            }
            if (name.equals("Jolteon") && info.equals("B")) {
                System.out.print(data[134][1]);
            }
            if (name.equals("Jolteon") && info.equals("C")) {
                System.out.print(data[134][2]);
            }
            if (name.equals("Flareon") && info.equals("A")) {
                System.out.print(data[135][0]);
            }
            if (name.equals("Flareon") && info.equals("B")) {
                System.out.print(data[135][1]);
            }
            if (name.equals("Flareon") && info.equals("C")) {
                System.out.print(data[135][2]);
            }
            if (name.equals("Porygon") && info.equals("A")) {
                System.out.print(data[136][0]);
            }
            if (name.equals("Porygon") && info.equals("B")) {
                System.out.print(data[136][1]);
            }
            if (name.equals("Porygon") && info.equals("C")) {
                System.out.print(data[136][2]);
            }
            if (name.equals("Omanyte") && info.equals("A")) {
                System.out.print(data[137][0]);
            }
            if (name.equals("Omanyte") && info.equals("B")) {
                System.out.print(data[137][1]);
            }
            if (name.equals("Omanyte") && info.equals("C")) {
                System.out.print(data[137][2]);
            }
            if (name.equals("Omastar") && info.equals("A")) {
                System.out.print(data[138][0]);
            }
            if (name.equals("Omastar") && info.equals("B")) {
                System.out.print(data[138][1]);
            }
            if (name.equals("Omastar") && info.equals("C")) {
                System.out.print(data[138][2]);
            }
            if (name.equals("Kabuto") && info.equals("A")) {
                System.out.print(data[139][0]);
            }
            if (name.equals("Kabuto") && info.equals("B")) {
                System.out.print(data[139][1]);
            }
            if (name.equals("Kabuto") && info.equals("C")) {
                System.out.print(data[139][2]);
            }
            if (name.equals("Kabutops") && info.equals("A")) {
                System.out.print(data[140][0]);
            }
            if (name.equals("Kabutops") && info.equals("B")) {
                System.out.print(data[140][1]);
            }
            if (name.equals("Kabutops") && info.equals("C")) {
                System.out.print(data[140][2]);
            }
            if (name.equals("Aerodactyl") && info.equals("A")) {
                System.out.print(data[141][0]);
            }
            if (name.equals("Aerodactyl") && info.equals("B")) {
                System.out.print(data[141][1]);
            }
            if (name.equals("Aerodactyl") && info.equals("C")) {
                System.out.print(data[141][2]);
            }
            if (name.equals("Snorlax") && info.equals("A")) {
                System.out.print(data[142][0]);
            }
            if (name.equals("Snorlax") && info.equals("B")) {
                System.out.print(data[142][1]);
            }
            if (name.equals("Snorlax") && info.equals("C")) {
                System.out.print(data[142][2]);
            }
            if (name.equals("Articuno") && info.equals("A")) {
                System.out.print(data[143][0]);
            }
            if (name.equals("Articuno") && info.equals("B")) {
                System.out.print(data[143][1]);
            }
            if (name.equals("Articuno") && info.equals("C")) {
                System.out.print(data[143][2]);
            }
            if (name.equals("Zapdos") && info.equals("A")) {
                System.out.print(data[144][0]);
            }
            if (name.equals("Zapdos") && info.equals("B")) {
                System.out.print(data[144][1]);
            }
            if (name.equals("Zapdos") && info.equals("C")) {
                System.out.print(data[144][2]);
            }
            if (name.equals("Moltres") && info.equals("A")) {
                System.out.print(data[145][0]);
            }
            if (name.equals("Moltres") && info.equals("B")) {
                System.out.print(data[145][1]);
            }
            if (name.equals("Moltres") && info.equals("C")) {
                System.out.print(data[145][2]);
            }
            if (name.equals("Dratini") && info.equals("A")) {
                System.out.print(data[146][0]);
            }
            if (name.equals("Dratini") && info.equals("B")) {
                System.out.print(data[146][1]);
            }
            if (name.equals("Dratini") && info.equals("C")) {
                System.out.print(data[146][2]);
            }
            if (name.equals("Dragonair") && info.equals("A")) {
                System.out.print(data[147][0]);
            }
            if (name.equals("Dragonair") && info.equals("B")) {
                System.out.print(data[147][1]);
            }
            if (name.equals("Dragonair") && info.equals("C")) {
                System.out.print(data[147][2]);
            }
            if (name.equals("Dragonite") && info.equals("A")) {
                System.out.print(data[148][0]);
            }
            if (name.equals("Dragonite") && info.equals("B")) {
                System.out.print(data[148][1]);
            }
            if (name.equals("Dragonite") && info.equals("C")) {
                System.out.print(data[148][2]);
            }
            if (name.equals("Mewtwo") && info.equals("A")) {
                System.out.print(data[149][0]);
            }
            if (name.equals("Mewtwo") && info.equals("B")) {
                System.out.print(data[149][1]);
            }
            if (name.equals("Mewtwo") && info.equals("C")) {
                System.out.print(data[149][2]);
            }
            if (name.equals("Mew") && info.equals("A")) {
                System.out.print(data[150][0]);
            }
            if (name.equals("Mew") && info.equals("B")) {
                System.out.print(data[150][1]);
            }
            if (name.equals("Mew") && info.equals("C")) {
                System.out.print(data[150][2]);
            }
            if (name.equals("Pikachu") && info.equals("C")) {
                System.out.print(data[24][2]);
            }
            if (name.equals("Seadra") && info.equals("C")) {
                System.out.print(data[116][2]);
            }
        
    }
        
        if (option.equals("Type Information")) {
            System.out.println("Ok, now what type would you like to search for?");
            String type = kb.nextLine();
            System.out.println("Okay, now what would you like to learn about this type?");
            System.out.println("Type the letter that you would like.");
            System.out.println("\tA.  No effects \tB.  Not very effectives \tC.  Super Effectives \tD.  Weaknesses \tE.  Resistances \tF. Immunities");
            String info = kb.nextLine();
            if (type.equals("Normal") && info.equals("A")) {
                System.out.print (typeData[0][0]);
            }
            if (type.equals("Normal") && info.equals("B")) {
                System.out.print (typeData[0][1]);
            }
            if (type.equals("Normal") && info.equals("C")) {
                System.out.print (typeData[0][2]);
            }
            if (type.equals("Normal") && info.equals("D")) {
                System.out.print (typeData[0][3]);
            }
            if (type.equals("Normal") && info.equals("E")) {
                System.out.print (typeData[0][4]);
            }
            if (type.equals("Normal") && info.equals("F")) {
                System.out.print (typeData[0][5]);
            }
            if (type.equals("Fighting") && info.equals("A")) {
                System.out.print (typeData[1][0]);
            }
            if (type.equals("Fighting") && info.equals("B")) {
                System.out.print (typeData[1][1]);
            }
            if (type.equals("Fighting") && info.equals("C")) {
                System.out.print (typeData[1][2]);
            }
            if (type.equals("Fighting") && info.equals("D")) {
                System.out.print (typeData[1][3]);
            }
            if (type.equals("Fighting") && info.equals("E")) {
                System.out.print (typeData[1][4]);
            }
            if (type.equals("Fighting") && info.equals("F")) {
                System.out.print (typeData[1][5]);
            }
            if (type.equals("Flying") && info.equals("A")) {
                System.out.print (typeData[2][0]);
            }
            if (type.equals("Flying") && info.equals("B")) {
                System.out.print (typeData[2][1]);
            }
            if (type.equals("Flying") && info.equals("C")) {
                System.out.print (typeData[2][2]);
            }
            if (type.equals("Flying") && info.equals("D")) {
                System.out.print (typeData[2][3]);
            }
            if (type.equals("Flying") && info.equals("E")) {
                System.out.print (typeData[2][4]);
            }
            if (type.equals("Flying") && info.equals("F")) {
                System.out.print (typeData[2][5]);
            }
            if (type.equals("Poison") && info.equals("A")) {
                System.out.print (typeData[3][0]);
            }
            if (type.equals("Poison") && info.equals("B")) {
                System.out.print (typeData[3][1]);
            }
            if (type.equals("Poison") && info.equals("C")) {
                System.out.print (typeData[3][2]);
            }
            if (type.equals("Poison") && info.equals("D")) {
                System.out.print (typeData[3][3]);
            }
            if (type.equals("Poison") && info.equals("E")) {
                System.out.print (typeData[3][4]);
            }
            if (type.equals("Poison") && info.equals("F")) {
                System.out.print (typeData[3][5]);
            }
            if (type.equals("Ground") && info.equals("A")) {
                System.out.print (typeData[4][0]);
            }
            if (type.equals("Ground") && info.equals("B")) {
                System.out.print (typeData[4][1]);
            }
            if (type.equals("Ground") && info.equals("C")) {
                System.out.print (typeData[4][2]);
            }
            if (type.equals("Ground") && info.equals("D")) {
                System.out.print (typeData[4][3]);
            }
            if (type.equals("Ground") && info.equals("E")) {
                System.out.print (typeData[4][4]);
            }
            if (type.equals("Ground") && info.equals("F")) {
                System.out.print (typeData[4][5]);
            }
            if (type.equals("Rock") && info.equals("A")) {
                System.out.print (typeData[5][0]);
            }
            if (type.equals("Rock") && info.equals("B")) {
                System.out.print (typeData[5][1]);
            }
            if (type.equals("Rock") && info.equals("C")) {
                System.out.print (typeData[5][2]);
            }
            if (type.equals("Rock") && info.equals("D")) {
                System.out.print (typeData[5][3]);
            }
            if (type.equals("Rock") && info.equals("E")) {
                System.out.print (typeData[5][4]);
            }
            if (type.equals("Rock") && info.equals("F")) {
                System.out.print (typeData[5][5]);
            }
            if (type.equals("Bug") && info.equals("A")) {
                System.out.print (typeData[6][0]);
            }
            if (type.equals("Bug") && info.equals("B")) {
                System.out.print (typeData[6][1]);
            }
            if (type.equals("Bug") && info.equals("C")) {
                System.out.print (typeData[6][2]);
            }
            if (type.equals("Bug") && info.equals("D")) {
                System.out.print (typeData[6][3]);
            }
            if (type.equals("Bug") && info.equals("E")) {
                System.out.print (typeData[6][4]);
            }
            if (type.equals("Bug") && info.equals("F")) {
                System.out.print (typeData[6][5]);
            }
            if (type.equals("Ghost") && info.equals("A")) {
                System.out.print (typeData[7][0]);
            }
            if (type.equals("Ghost") && info.equals("B")) {
                System.out.print (typeData[7][1]);
            }
            if (type.equals("Ghost") && info.equals("C")) {
                System.out.print (typeData[7][2]);
            }
            if (type.equals("Ghost") && info.equals("D")) {
                System.out.print (typeData[7][3]);
            }
            if (type.equals("Ghost") && info.equals("E")) {
                System.out.print (typeData[7][4]);
            }
            if (type.equals("Ghost") && info.equals("F")) {
                System.out.print (typeData[7][5]);
            }
            if (type.equals("Steel") && info.equals("A")) {
                System.out.print (typeData[8][0]);
            }
            if (type.equals("Steel") && info.equals("B")) {
                System.out.print (typeData[8][1]);
            }
            if (type.equals("Steel") && info.equals("C")) {
                System.out.print (typeData[8][2]);
            }
            if (type.equals("Steel") && info.equals("D")) {
                System.out.print (typeData[8][3]);
            }
            if (type.equals("Steel") && info.equals("E")) {
                System.out.print (typeData[8][4]);
            }
            if (type.equals("Steel") && info.equals("F")) {
                System.out.print (typeData[8][5]);
            }
            if (type.equals("Fire") && info.equals("A")) {
                System.out.print (typeData[9][0]);
            }
            if (type.equals("Fire") && info.equals("B")) {
                System.out.print (typeData[9][1]);
            }
            if (type.equals("Fire") && info.equals("C")) {
                System.out.print (typeData[9][2]);
            }
            if (type.equals("Fire") && info.equals("D")) {
                System.out.print (typeData[9][3]);
            }
            if (type.equals("Fire") && info.equals("E")) {
                System.out.print (typeData[9][4]);
            }
            if (type.equals("Fire") && info.equals("F")) {
                System.out.print (typeData[9][5]);
            }
            if (type.equals("Water") && info.equals("A")) {
                System.out.print (typeData[10][0]);
            }
            if (type.equals("Water") && info.equals("B")) {
                System.out.print (typeData[10][1]);
            }
            if (type.equals("Water") && info.equals("C")) {
                System.out.print (typeData[10][2]);
            }
            if (type.equals("Water") && info.equals("D")) {
                System.out.print (typeData[10][3]);
            }
            if (type.equals("Water") && info.equals("E")) {
                System.out.print (typeData[10][4]);
            }
            if (type.equals("Water") && info.equals("F")) {
                System.out.print (typeData[10][5]);
            }
            if (type.equals("Grass") && info.equals("A")) {
                System.out.print (typeData[11][0]);
            }
            if (type.equals("Grass") && info.equals("B")) {
                System.out.print (typeData[11][1]);
            }
            if (type.equals("Grass") && info.equals("C")) {
                System.out.print (typeData[11][2]);
            }
            if (type.equals("Grass") && info.equals("D")) {
                System.out.print (typeData[11][3]);
            }
            if (type.equals("Grass") && info.equals("E")) {
                System.out.print (typeData[11][4]);
            }
            if (type.equals("Grass") && info.equals("F")) {
                System.out.print (typeData[11][5]);
            }
            if (type.equals("Electric") && info.equals("A")) {
                System.out.print (typeData[12][0]);
            }
            if (type.equals("Electric") && info.equals("B")) {
                System.out.print (typeData[12][1]);
            }
            if (type.equals("Electric") && info.equals("C")) {
                System.out.print (typeData[12][2]);
            }
            if (type.equals("Electric") && info.equals("D")) {
                System.out.print (typeData[12][3]);
            }
            if (type.equals("Electric") && info.equals("E")) {
                System.out.print (typeData[12][4]);
            }
            if (type.equals("Electric") && info.equals("F")) {
                System.out.print (typeData[12][5]);
            }
            if (type.equals("Psychic") && info.equals("A")) {
                System.out.print (typeData[13][0]);
            }
            if (type.equals("Psychic") && info.equals("B")) {
                System.out.print (typeData[13][1]);
            }
            if (type.equals("Psychic") && info.equals("C")) {
                System.out.print (typeData[13][2]);
            }
            if (type.equals("Psychic") && info.equals("D")) {
                System.out.print (typeData[13][3]);
            }
            if (type.equals("Psychic") && info.equals("E")) {
                System.out.print (typeData[13][4]);
            }
            if (type.equals("Psychic") && info.equals("F")) {
                System.out.print (typeData[13][5]);
            }
            if (type.equals("Ice") && info.equals("A")) {
                System.out.print (typeData[14][0]);
            }
            if (type.equals("Ice") && info.equals("B")) {
                System.out.print (typeData[14][1]);
            }
            if (type.equals("Ice") && info.equals("C")) {
                System.out.print (typeData[14][2]);
            }
            if (type.equals("Ice") && info.equals("D")) {
                System.out.print (typeData[14][3]);
            }
            if (type.equals("Ice") && info.equals("E")) {
                System.out.print (typeData[14][4]);
            }
            if (type.equals("Ice") && info.equals("F")) {
                System.out.print (typeData[14][5]);
            }
            if (type.equals("Dragon") && info.equals("A")) {
                System.out.print (typeData[15][0]);
            }
            if (type.equals("Dragon") && info.equals("B")) {
                System.out.print (typeData[15][1]);
            }
            if (type.equals("Dragon") && info.equals("C")) {
                System.out.print (typeData[15][2]);
            }
            if (type.equals("Dragon") && info.equals("D")) {
                System.out.print (typeData[15][3]);
            }
            if (type.equals("Dragon") && info.equals("E")) {
                System.out.print (typeData[15][4]);
            }
            if (type.equals("Dragon") && info.equals("F")) {
                System.out.print (typeData[15][5]);
            }
            if (type.equals("Dark") && info.equals("A")) {
                System.out.print (typeData[16][0]);
            }
            if (type.equals("Dark") && info.equals("B")) {
                System.out.print (typeData[16][1]);
            }
            if (type.equals("Dark") && info.equals("C")) {
                System.out.print (typeData[16][2]);
            }
            if (type.equals("Dark") && info.equals("D")) {
                System.out.print (typeData[16][3]);
            }
            if (type.equals("Dark") && info.equals("E")) {
                System.out.print (typeData[16][4]);
            }
            if (type.equals("Dark") && info.equals("F")) {
                System.out.print (typeData[16][5]);
            }
            if (type.equals("Fairy") && info.equals("A")) {
                System.out.print (typeData[17][0]);
            }
            if (type.equals("Fairy") && info.equals("B")) {
                System.out.print (typeData[17][1]);
            }
            if (type.equals("Fairy") && info.equals("C")) {
                System.out.print (typeData[17][2]);
            }
            if (type.equals("Fairy") && info.equals("D")) {
                System.out.print (typeData[17][3]);
            }
            if (type.equals("Fairy") && info.equals("E")) {
                System.out.print (typeData[17][4]);
            }
            if (type.equals("Fairy") && info.equals("F")) {
                System.out.print (typeData[17][5]);
            }
            
        }
    
 }
}
