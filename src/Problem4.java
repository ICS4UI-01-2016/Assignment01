
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author agott2059
 */
public class Problem4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create scanner
        Scanner input = new Scanner(System.in);
        //request number between 1 and 10
        System.out.println("Enter a number between 1 and 10.");
        //store number in variable
        int selectedNumber = input.nextInt();
        //output asterisks on one line using for loop until selcted number has been reached by for loop
        for (int i = 0; i < selectedNumber; i++) {
            System.out.print("*");
        }
    }
}
