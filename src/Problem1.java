
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author malcr1272
 */
public class Problem1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //to get user input
        Scanner input = new Scanner(System.in);

        //ask user for input
        System.out.println("Please enter your name");
        String name = input.nextLine();

        //say hello to the user
        System.out.println("Hello " + name);
    }
}
