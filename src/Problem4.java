
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author malcr1272
 */
public class Problem4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //to get user input
        Scanner input = new Scanner(System.in);

        //ask user for a number
        System.out.println("Insert a number between 1 and 10");
        int number = input.nextInt();

        //print out the asterisks
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }

        //space out line 
        System.out.println("");
    }
}
