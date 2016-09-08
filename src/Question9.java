
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hadida
 */
public class Question9 {
    public static void main(String[] args) {
        //Recognizes user input
        Scanner input = new Scanner(System.in);
        //the array that stores the 10 words user inputs
        String[] words = new String[10];
        //total of characters
        int total = 0;
 
        //Asks for 10 words and stores them in arrays
        System.out.println("Please enter 10 words");
        for (int i = 0; i < 10; i++) {
            String word = input.nextLine();
            words[i] = word;    
        }
        
        //adds up the words as the for loop changes slots of array
        for (int i = 0; i < 10; i++) {
            String first = words[i];
            int count = first.length();
            total = count + total;   
        }
        //calculates average then prints it out
        int average = total/10;
        System.out.println("The average of characters you have entered is " + average);
        
        
    }
}
