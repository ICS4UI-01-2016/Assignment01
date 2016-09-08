
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
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
        
        System.out.print("What is the initial amount: ");
        double initialAmount = input.nextDouble();
        
        System.out.print("What is the interest rate: ");
        double interestRate = input.nextDouble();
        
        double balance = initialAmount;
        double doubled = initialAmount * 2;
        
        int year = 0;
        
        while(balance < doubled){
            balance = (1 + interestRate) * balance;
            year = year + 1;
        }
        
        System.out.println("The number of years it took to double is " + year);
        
        while(balance < 1000000){
            balance = (1 + interestRate) * balance;
            year = year + 1;
        }
        
        System.out.println("The number of years it took to reach a million dollars " + year);
    }
}
