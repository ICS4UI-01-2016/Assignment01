
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lalim9800
 */
public class question6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //new scanner 
         Scanner input = new Scanner(System.in);
         //tell user to enter a number between 50 and 100 
         System.out.println("Please enter a number between 50 and 100");
          //allow user to enter a number 
         int number=input.nextInt();
         //set new integer to 100
         int counter=100;
         //while the numbered enter by the user is less than the counter,decrease the counter by 5 each time 
         while(number<counter){
             //output counter to the screen 
             System.out.println(""+counter);
             //decrese counter by 5 
             counter=counter-5;
         }
         
         
       
    }
    
    
}
