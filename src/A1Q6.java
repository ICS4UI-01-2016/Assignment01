
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author preej0747
 */
public class A1Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a scanner to read user input  
        Scanner input = new Scanner(System.in);
        
        //tell user to pick a number for the timer to stop at
        System.out.println("Pick a number between 50-100 for the timer to stop at");
        int number = input.nextInt();
        
        //make a variable that represents the count
        int count = 105;
        
        //subtract 5 from 100 until it equals the number
        while(count != number){
            count = count - 5;
            System.out.println(count);
        }
}
}
