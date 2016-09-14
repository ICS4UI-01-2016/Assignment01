
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author guanv6321
 */
public class Problem5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // to get user input
        Scanner input = new Scanner(System.in);
        // asks user input for a number between 1 and 10
        System.out.println("Please enter the number of asterisks");
        // variable to store number
        int num = input.nextInt();
        // if number is not between 1 and 10
        if(num < 1 || num > 10){
        // if number is between 1 and 10    
        }else{    
        // loop for how many rows of asterisks
        for (int x = 0; x < num; x++) {
            // loop for how many asterisks printed per row
            for (int i = 0; i < num; i++) {
                // output asterisks according to number
                System.out.print("*");
            }
            // output final answer
            System.out.println("");
        }
        }
    }
}
