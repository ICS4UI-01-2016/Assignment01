
import java.util.Scanner;

/**
 * Create a program that will calculate the growth of money in a savings account.
 * Therefore the program should receive the initial value and interest rate of the account.
 * Finally, it should calculate and output the number of years it took to double and reach 1 million.
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
        
        // create loop to determine how many years it takes for the balance to double
	// increase the balance each year with interest and add a year everytime one passes
        // until the balance is greater than the initialAmount doubled

        // create variable to keep track of the balance of the account
        double balance = initialAmount;
        
        // create variable to keep track of the number of years
        int years = 0;
        
        while(balance < initialAmount * 2){
            balance = (1 + interestRate) * balance;
            years = years + 1;
        }
        
        // print out the number of years it took to double
        System.out.println("The number of years it took to double is " + years);
        
        //
        // create loop to determine how many years it will take to reach more than
        //
        // reset the balance back to initialAmount and reset years to 0
        balance = initialAmount;
        years = 0;
        
        // create loop to increase the balance each year and add a year everytime one passes
        // until the balance is greater than 1 million
        while(balance < 1000000){
            balance = (1 + interestRate) * balance;
            years = years + 1;
        }
        
        // print out the number of years it took to reach a million
	if(years > 0){
            System.out.println("The number of years it took to reach a million dollars is " + years );
        }else{
            System.out.println("The number of years it took to reach a million dollars is " + years + " since the initial amount is 1 million or more1.");
	}
        
        // close scanner
        input.close();
    }
}
