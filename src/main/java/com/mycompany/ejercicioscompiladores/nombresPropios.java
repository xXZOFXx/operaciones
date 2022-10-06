/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicioscompiladores;




import java.util.ArrayList;
import java.util.Scanner;

public class nombresPropios {
    
    
    public static void main(String[] args) {
          Scanner in = new Scanner(System.in);
        System.out.println("Input a Text:");
        String text = in.nextLine();

        ArrayList<String> properNouns = getProperNouns(text);

        System.out.println("nombres propios: ");
        for (String s : properNouns) {
            System.out.println(s);
        }
    }
    
    
    
    /*
    This Method Accepts a String and returns all proper nouns in that String
    */
    static public ArrayList<String> getProperNouns(String text) {
        // this just initializes an array of short words which are often used in nouns that are multiplr words long
        // it is done this way because it leads to simpler conditions later on and is more readable
        ArrayList<String> short_words = new ArrayList<String>();
        short_words.add("Raul");
        short_words.add("Ortega");
        short_words.add("Ricardo");
        short_words.add("Zuñiga");
         short_words.add("Joanna");
        short_words.add("Tellez");
        short_words.add("Fernando");
        short_words.add("Gonzalez");
        short_words.add("Ismael");
        short_words.add("Equihua");



        ArrayList<String> results = new ArrayList<String>();
        //text = text + " fin"; I will confess I have no idea what this line was supposed to do
        String[] words = text.split(" ");
        String currentNoun = "";

        for (int i = 0; i < words.length; i++) {
            String word = words[i];

            // The following block does not proper;y deal with the start of sentences
            if (Character.isUpperCase(word.charAt(0)) || (short_words.contains(word) && i < words.length-1)) {
                // The following line appends spaces before words incorrectly
                currentNoun = currentNoun + " " + word;

                // Occams Razor
                currentNoun = currentNoun.trim();
            } else {
                // this block saves the proper noun and prepares to find the next
                if (!currentNoun.equals("") && !short_words.contains(currentNoun)) {
                    results.add(currentNoun);
                }
                currentNoun = "";
            }
        }

        return results;
    }
}
    


