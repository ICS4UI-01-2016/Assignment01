
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author butlj9437
 */
public class Problem1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //make a scanner
        Scanner in = new Scanner(System.in);
        //ask user to enter name
        System.out.println("What is your name user?");
        //get name and greet user
        System.out.println("Hello " + in.nextLine() + ".");
    }
}
