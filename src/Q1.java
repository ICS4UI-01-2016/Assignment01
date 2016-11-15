
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author snowc4636
 */
public class Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // To get user input
        
        Scanner input = new Scanner (System.in);
        
        // Ask for the user input
        System.out.println("Please enter your name ");
        String name = input.nextLine();
        
        // Say hello to the user
        System.out.println("Hello " + name);
    }
}
