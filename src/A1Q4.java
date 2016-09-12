
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sevcm7279
 */
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner
        Scanner input = new Scanner(System.in);
        
        // tell user to enter a number
        System.out.println("Enter a number between 1 and 10");        
        // store number in a variable
        int n = input.nextInt();
        
        // print out asterisks to the corresponding number
        if (n == 1){
            System.out.println("*");
        }
        if (n == 2){
            System.out.println("**");
        }
        if (n == 3){
            System.out.println("***");
        }
        if (n == 4){
            System.out.println("****");
        }
        if (n == 5){
            System.out.println("*****");
        }
        if (n == 6){
            System.out.println("******");
        }
        if (n == 7){
            System.out.println("*******");
        }
        if (n == 8){
            System.out.println("********");
        }
        if (n == 9){
            System.out.println("*********");
        }
        if (n == 10){
            System.out.println("**********");
        }
        
        // close the scanner
        input.close();
    }
}
