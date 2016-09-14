
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author voigr4865
 */
public class Q8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //scanner
        Scanner input = new Scanner(System.in);
              
        double year = 0.0;

        System.out.println("Please put in an initial value");

        double balance = input.nextDouble();

        System.out.println("What is the rate?");

        double r = input.nextDouble();

        double end = balance * 2;
        //while loop while the balance isnt doubles yet to continue
        while (balance < end) {
            balance = ((1 + r) * balance);
            year = year + 1;

        }
        System.out.println("It will take " + year + " to double your money");
        //while loop while the balance isnt a million yet to continue
        while (balance < 1000000) {
            balance = ((1 + r) * balance);
            year = year + 1;
        }
        System.out.println("It will take " + year + " to reach 1000000 dollars");
    }
}
