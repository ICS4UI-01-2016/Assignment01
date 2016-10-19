
import java.util.Scanner;

 /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author snowc4636
 */
public class Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // To get user input
        
        Scanner input = new Scanner (System.in);
        
        System.out.println("Please enter a number between 50 and 100 ");
        int number = input.nextInt();
        int beg = 100;
        
        while (number < beg){
            System.out.println(beg);
            beg = (beg - 5);
        }
        
        
    }
}
