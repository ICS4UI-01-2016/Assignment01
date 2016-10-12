
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author moore3607
 */
public class A1Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //making a new scanner to detect inputs
        Scanner input = new Scanner (System.in);
        //asks the user to enter a number between 50 and 100 inclusive
        System.out.println("Please enter a number between 50 and 100 inclusive.");
        int n = input.nextInt();
        for (int i = 100; i >= n; i=i-5) {
            System.out.println(i);
          
        }
        
    }
}
