
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author moraj0721
 */
public class A1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //make a new scanner
        Scanner input = new Scanner(System.in);
        
        //ask the user for their name
        System.out.println("Please enter your name.");
        
        //user input
        String name = input.nextLine();
        
        //say hello
        System.out.println("Hello " + name + "!");
    }
}
