
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mike
 */
public class A1Q9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner
        Scanner input = new Scanner(System.in);
        
        // create a string array to store 10 words
        String[] words = new String [10];
        
        // create a variable to store the total number of characters
        double t = 0;
        
        // create a loop to allow user to enter the words 10 times
        for (int i = 0; i < 10; i++) {
            // ask user to enter a word
            System.out.println("Enter a word");
            
            // store the owrd in the array
            words[i] = input.nextLine();
            
            // add the word length to the total
            t = t + words[i].length();          
        }
        // print out the calculated average
        System.out.println("The average number of characters is "+t/10);
    }
    
}
