
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author malcr1272
 */
public class Problem8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //to get user input
        Scanner input = new Scanner(System.in);

        //ask for the initial amount of money
        System.out.println("What is the initial amount of money in the account?");
        double initial = input.nextDouble();

        //ask for the interest rate
        System.out.println("What is the interest rate?");
        double rate = input.nextDouble();

        //create double for loop to stop at
        double end = (initial * 2);

        //create variable to store years
        int years = (0);

        //add money until until it reaches double
        while (initial < end) {
            initial = ((1 + rate) * initial);
            //add year every loop
            years = (years + 1);
        }
        //print out how many years it will take to double
        System.out.println("It will take " + years + " years to double your balance");

        //add money until 1000000 is reached
        while (initial < 1000000) {
            initial = ((1 + rate) * initial);
            //add year every loop
            years = (years + 1);
        }
        //print out how many years it will reach 1 million
        System.out.println("It will take " + years + " years to reach 1 million dollars");
    }
}
