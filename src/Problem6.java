
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author joudn2217
 */
public class Problem6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        // create a scanner in input data from user
        System.out.println("Please enter a number between 100 and 50:");
        //prompt user for a number
        int count = 100;
        //set what it will count down from
        while (true) {
            //create while to continue running count
            int number = in.nextInt();
            //save inputed number
            if (number >= 50 && number <= 100) {
                System.out.println(count);
                while ((count - 5) >= number) {
                    count = count - 5;
                    System.out.println(count);
                    //subtract 5 each time and output while it is greater than the number inputted
                }
                break;
                //break when done counting
            } else {
                System.out.println("Please input a valid number:");
                //ask for a valid number
            }
        }
    }
}
