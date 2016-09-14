
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author guanv6321
 */
public class Problem6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // to get user input
        Scanner input = new Scanner(System.in);
        // asks user input for a number between 50 and 100
        System.out.println("Enter a number between 50 and 100 to stop at:");
        // variable to store number
        int num = input.nextInt();
        // variable to store the count
        int count = 100;
        // output 100 first
        System.out.println("100");
        // while count is at least 5 more than number
        while(count-num>5){ 
            // decrease count by 5
            count = count - 5;
            // output new count
            System.out.println(count);
        }
        
    }
}
