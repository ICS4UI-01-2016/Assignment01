
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sevcm7279
 */
public class A1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // make a new scanner
        Scanner input = new Scanner (System.in);
        
        // ask user for5 their name
        System.out.println("Please enter your name.");
        
        // store the user's name input in a string
        String name = input.nextLine();
        
        // say hello to user
        System.out.println("Hello " + name + ". :)");
        
        //close scanner
        input.close();
        
    }
}
