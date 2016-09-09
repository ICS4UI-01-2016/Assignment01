
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Denis
 */
public class Problem10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Add new scanner
        Scanner input = new Scanner(System.in);
        // Create a string for the words typed by the user
        String words = "";
        // Ask the user to type in any given amount of words and tp stop type "exit"
        System.out.println("Please enter as many words as you like and then type 'exit' to finish");
        // Create aa while loop and an integer for the user's input 
        while (true) {
            String enteredWords = input.next();
            if (enteredWords.equals("exit")) {
                String[] allWords = words.split("  ");
                System.out.println(allWords.length - 1 + " words");
                break;
            } else {
                words += " " + input;
            }

        }

    }

}
