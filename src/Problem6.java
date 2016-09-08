
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author tatad6701
 */
public class Problem6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Add new scanner
        Scanner input = new Scanner(System.in);
        // Make a new integer for the user's input
        int count = 100;
        // Ask the user to input a number 
        System.out.println("Please insert a number between 50 and 100");
        // Make an integer for the user's input
        int num = input.nextInt();


        // Subtract the users input by 5
        while (count > num) {
            count = count - 5;
            System.out.println(count);

            // If the user's input is greater than or less than 50, break the loop
            if (count > 100 && count < 50) {
                System.out.println("Invalid input.");
                break;
            }
        }
    }
}
