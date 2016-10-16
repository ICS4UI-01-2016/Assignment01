
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author watsk8668
 */
public class Problem8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // scanner
        Scanner input = new Scanner(System.in);
        // get the initial balance
        System.out.print("Please enter the amount of money deposited:  ");
        double initial = input.nextDouble();
        // get the rate
        System.out.print("Please enter the annual rate of interest in decimal form:  ");
        double r = input.nextDouble();
        // create variables to store the years
        int yearDouble = 0;
        int yearMillion = 0;

        // keep looping untill all the answers are complete
        while (true) {
            // create a variable to store the formula
            double formula = (initial) * Math.pow((1 + r), yearMillion);

            // add to the year if the formula is smaller or equal to double  initial 
            if (formula <= (initial * 2)) {
                yearDouble++;
            }

            // add 1 to the year if the formula is smaller of equal to 1 million
            if (formula <= 1000000) {
                yearMillion++;
            }
            
            // so no infinite loop
            if(formula > 1000000){
                break;
            }
        }
        // print the answers to the screen
            System.out.println("It takes " + yearDouble + 
                    " years to double the initial value and " + yearMillion + 
                    " years to reach a million dollars");
    }
}
