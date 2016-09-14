
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author guanv6321
 */
public class Problem1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // to get user input
        Scanner input = new Scanner(System.in);
        // ask user input for name
        System.out.println("What is your name? ");
        // variable to store the word
        String name = input.nextLine();
        // outputs word to screen
        System.out.println("Hello " + name);
    }
}
