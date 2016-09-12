
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sevcm7279
 */
public class A1Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner
        Scanner input = new Scanner (System.in);
        
        // ask the user to enter a number
        System.out.println("Enter a number between 50 and 100 to stop at");
        // store the number in a variable
        int n = input.nextInt();
        
        // count down from 100 until reach number
        for (int i = 100; i >= n; i=i-5){
            System.out.println(i);
             
        }
    }
}
