
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kulla6503
 */
public class Problem1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // create a new Scanner to read in values
        Scanner input = new Scanner(System.in);

        // Ask the user for a name 
        System.out.println("Please Enter your name: ");
        String name = input.nextLine();

        // Say hello to the user 
        System.out.println("Hello " + name);

    }
}
