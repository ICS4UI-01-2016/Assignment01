
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nick Joudrey
 */
public class Problem10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        //create scanner to input words
        System.out.println("Please enter any number of words on different lines:");
        int count = 0;
        //prompt user for words and set word count to 0
        
        while(true){
           String s = input.nextLine();
           //store string
           count = count + 1;
           //every time a word is typed count it
           if(s.equalsIgnoreCase("exit")){
               count = count - 1;
               System.out.println("You typed " + count + " words");
               break;
               //unless it is exit then take it out of the count, break the while and output the number of words
        }
        }
        
        
        
      
        
    }

}
