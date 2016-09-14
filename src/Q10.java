
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author voigr4865
 */
public class Q10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //scanner
         Scanner input = new Scanner(System.in);
         
         int num = 0;
         String word = new String();
         System.out.println("Enter a word");
         
         //while you havent entered exit continue with the loop
         while(!word.equals("exit")){
             
             word = input.nextLine();
             num++;
         } 
         //when exit is typed end loop and outpu the number of words input
         if(word.equals("exit")){
             num = num - 1;
             System.out.println("You input " + num + " words");
         }
                
    }
}
