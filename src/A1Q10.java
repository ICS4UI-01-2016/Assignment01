
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
public class A1Q10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner to allow user to enter words
        Scanner input = new Scanner(System.in);
        
        // store word count in a variable
        int count = 0;
        
        // store the previous word entered in a string
        String word = "";
        
        // create a while loop to allow continous inputs
        while (true){
            // ask user to enter a word
            System.out.println("Enter a word other than exit (exit = close)");
            
            // change the word to the new one the user entered
            word = input.nextLine();
            
            // add to the word count
            count = count + 1;
            
            // if the user enters exit, stop loop
            if (word.equals("exit")){
                break;
                
            }
            
        }
        // print the word count, minus 1 to subtract when exit was entered
        System.out.println(count - 1);
    }
    
}
