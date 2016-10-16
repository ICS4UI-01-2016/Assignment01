
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author watsk8668
 */
public class Problem1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // input scanner
        Scanner input = new Scanner(System.in);
        
        // ask the user their name
        System.out.println("Please enter your name: ");
        
        // store the name
        String name = input.nextLine();
        
        // say hello
        System.out.println("Hello " + name + "!");
        
        
    }
}
