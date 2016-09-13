
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author agott2059
 */
public class Problem8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //add scanner
        Scanner input = new Scanner(System.in);
        //request initial amount
        System.out.println("Enter initial amount:");
        //store initial amount in variable
        double initial = input.nextDouble();
        //request interest rate
        System.out.println("Enter interest rate in %:");
        //store interest rate in varible
        double interestRate = input.nextDouble();
        //find double of initial adnd store in variable
        double doubleInitial = initial * 2;
        //put interest rate in decimal form
        interestRate = interestRate / 100;
        //create variable for number of years passed
        int years = 0;
        //create variable to store million dollar value 
        double millionDollars = 1000000;
        //used for program to know that it has already outputed doubling result to user
        boolean doneDoubling = false;
        //loop until 1 million is reached or exeeded
        while (initial < millionDollars) {
            //interst rate and initial amount are multiplied and added back to intial to represent increase over one year
            initial = (initial * interestRate) + initial;
            //add a year to 'years'
            years = years + 1;
            //check if money has reached or exeeded double and that result has not already been outputed before
            if (initial >= doubleInitial && doneDoubling == false) {
                //output information to user
                System.out.println("Money reaches or exeeds double the initial amoumt to " + initial + " in " + years + " year(s).");
                //change boolean value to true so program does not output result more than once
                doneDoubling = true;
            }
        }
        //output result to user once loop has been exited (value reaches or exeeds 1 million dollars
        System.out.println("Initial amount reaches or exeeds 1 million dollars in " + years + " year(s). (" + initial + " dollars)");
    }
}
