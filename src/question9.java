
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author munta
 */
public class question9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //new scnner 
         Scanner input = new Scanner(System.in);
         //create new array for words 
         String[] words;
         //set arrays max value to 10 
         words = new String [10];
         //ask user to enter 1o words 
         System.out.println("please enter 10 words");
         //store all words entered by the user 
         for (int i = 0; i < 10; i++) {
            words[i]=input.nextLine();
                    
            
        }
         //caculate the length of each word entered by the user 
         for (int l = 0; l < 10; l++) {
            words[l].length();
            
            
        }
         //calculate the average word length 
        int totalchar= words.length/10;
        //tell user the average word length
        System.out.println(" The average word length of all the words are " + totalchar );
        
        
         
         
         
         
         
         
    }
    
}
