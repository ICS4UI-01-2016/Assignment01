
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kulla6503
 */
public class Problem8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Create a new Scanner to read in values
        Scanner input = new Scanner(System.in);

        // Create a variable to store the values 
        double principal;
        double interest;
        int yearDouble = 0;
        int yearMillion = 0;

        // Output our sentence to the user letting them know what they entered
        System.out.println("Enter the amount of money in your account: ");
        principal = input.nextDouble();

        // Output our sentence to the user letting them know what they entered
        System.out.println("Enter the intrest rate: ");
        interest = input.nextDouble();

        // Create a While loop
        while (true) {

            // Create a formula to calculate the interest on top of the principal amount
            double formula = (principal) * Math.pow(1 + interest, yearMillion);

            // Create a statement to continously add the years until principal doubles in value 
            if (formula <= (principal * 2)) {
                yearDouble++;
            }

            // Create a statement to continously add the years until principal doubles in value  
            if (formula <= 1000000) {
                yearMillion++;
            }

            // Stop increasing the population once reached 10 billion 
            if (formula > 1000000) {
                break;
            }
        }
        // Output our sentence to the user letting them know what they entered
        System.out.println("It will take " + yearDouble + " years to double the principal");
        System.out.println("It will take " + yearMillion + " years for the principal to reach $1 million");
    }
}
