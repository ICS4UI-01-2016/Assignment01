
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author tatad6701
 */
public class Problem5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Add a new scanner 
        Scanner input = new Scanner(System.in);
        // Ask the user to enter a number between 1-10
        System.out.println("Please enter a number bewtween 1-10");

        // Make a integer to store the amount of asterisks
        int num = input.nextInt();

        // Make a for loop to print the same amount of asterisks
        for (int x = 0; x < num; x++) {
            for (int i = 0; i < num; i++) {
                System.out.print("*");
            }
            // Making the asterisks be moved to a next line
            System.out.println();
        }
    }
}
