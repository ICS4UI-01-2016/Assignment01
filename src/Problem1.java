
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author tatad6701
 */
public class Problem1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Add a scanner
        Scanner input = new Scanner(System.in);
        // Make a string for the user's name
        String name;

        // Ask the user their name
        System.out.println("Please print your name!");
        name = input.nextLine();

        // Print the user's name saying hello!
        System.out.println("Hello " + name + "!");
    }
}
