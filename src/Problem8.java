
import java.util.Scanner;

/*
 * Create a program that will calculate the growth of money in a savings account.
 * Therefore the program should recieve the initial value and interest rate of the account.
 * Finally, it should calculate and output the number of years it took to double and reach 1 million.
 */

/**
 *
 * @author richj0985
 */
public class Problem8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // to get user input
        Scanner input = new Scanner(System.in);
        
        // ask the user for the initial amount and store this in a variable
        System.out.print("What is the initial amount: ");
        double initialAmount = input.nextDouble();
        
        // ask the user for the interest rate and store this in a variable
        System.out.print("What is the interest rate: ");
        double interestRate = input.nextDouble();
        
        // create variable to keep track of the balance of the accounnt
        double balance = initialAmount;
        
        // create variable to keep track of the number of years
        int year = 0;
        
        // create loop to increase the balance each year and add a year everytime one passes
        // until the balance is greater than the initialAmount doubled
        while(balance < initialAmount * 2){
            balance = (1 + interestRate) * balance;
            year = year + 1;
        }
        
        // print out the number of years it took to double
        System.out.println("The number of years it took to double is " + year);
        
        // create loop to increase the balance each year and add a year everytime one passes
        // until the balance is greater than 1 million
        while(balance < 1000000){
            balance = (1 + interestRate) * balance;
            year = year + 1;
        }
        
        // print out the number of years it took to reach a million
        System.out.println("The number of years it took to reach a million dollars " + year);
        
        // close scanner
        input.close();
    }
}
