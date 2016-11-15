
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author snowc4636
 */
public class Q10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
         
         System.out.println("Enter any number of words.");
       
         boolean ex = false;
         
         int wordC = 0;
         
         while (ex == false) {
            
             String word = input.nextLine();
            
             if (word.equals("exit") == true) {
                 
                 ex = true;   
             } else {
                 
                 wordC++;
             }
         }
         
         System.out.println("Number of Entries:" + wordC);
 
    }
    }

