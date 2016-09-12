
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author sevcm7279
 */
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner
        Scanner input = new Scanner(System.in);

        // tell user a number
        System.out.println("Enter a number between 1 and 10");
        // store the number in a variable
        int n = input.nextInt();
        
        // print the number of asterisks according to number entered
        // print same rows as number
        if (n == 1) {
            for (int i = 0; i < n; i++) {
                System.out.println("*");
            }
        }
        if (n == 2) {
            for (int i = 0; i < n; i++) {
                System.out.println("**");
            }
        }
        if (n == 3) {
            for (int i = 0; i < n; i++) {
                System.out.println("***");
            }
        }
        if (n == 4) {
            for (int i = 0; i < n; i++) {
                System.out.println("****");
            }
        }
        if (n == 5) {
            for (int i = 0; i < n; i++) {
                System.out.println("*****");
            }
        }
        if (n == 6) {
            for (int i = 0; i < n; i++) {
                System.out.println("******");
            }
        }
        if (n == 7) {
            for (int i = 0; i < n; i++) {
                System.out.println("*******");
            }
        }
        if (n == 8) {
            for (int i = 0; i < n; i++) {
                System.out.println("********");
            }
        }
        if (n == 9) {
            for (int i = 0; i < n; i++) {
                System.out.println("*********");
            }
        }
        if (n == 10) {
            for (int i = 0; i < n; i++) {
                System.out.println("**********");
            }
        }
        
        // close scanner
        input.close();
    }
}
