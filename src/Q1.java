
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author voigr4865
 */
public class Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Scanner for the code
        Scanner input = new Scanner(System.in);
        
        //asks user for their name
        System.out.println("What is your name?");
        
        //user inputs their name
        String name = input.nextLine();
        
        //Says hello to the person
        System.out.println("Hello " + name);
        
        
        
    }
}
