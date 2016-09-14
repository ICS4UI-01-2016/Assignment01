
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author preej0747
 */
public class A1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //make scanner to get user input
        Scanner input = new Scanner(System.in);
        
        //ask user for input
        System.out.println("What is your name?");
        String name = input.nextLine();
        
        //say hello
        System.out.println("Hello " + name);
    }
}
