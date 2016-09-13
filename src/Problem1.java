
import java.util.Scanner;

/**
 * Create a program that asks the user what their name is and then outputs
 * hello and then the users name.
 *
 * @author richj0985
 */
public class Problem1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // to get user input
        Scanner input = new Scanner(System.in);
        
        // ask the user to input their name
        System.out.println("Please enter your name:");
        String name = input.nextLine();
        
        // say hello to the user
        System.out.println("Hello " + name + "!");
        
        // close scanner
        input.close();
    }
}
