
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author moraj0721
 */
public class Problem8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //make a new scanner
        Scanner input = new Scanner(System.in);
        
        //ask for the intial amount of money in the account
        System.out.println("Enter the intial amout of money in your savings account. ");
        double initial = input.nextDouble();
        
        //ask for the interest rate
        System.out.println("Enter the interest rate.");
        double rate = input.nextDouble();
        
        //the initial money double
        double twotimes = initial * 2;
        
        //set the year to zero
        int year = 0;
        
        //add one year until the intial amount has been doubled
        while(initial < twotimes){
            initial = (1 + rate)*initial;
            year = year + 1;
            
            }
        
        //tell the user how many years it would take for their amount to double
        System.out.println("It would take " + year + " years for your initial money to double.");
        
        //add one year until the account balance has reached 1 million
        while(initial < 1000000){
            initial = (1 + rate)*initial;
            year = year + 1;
        }
        
        //tell the user how many years it would take for the balance to reach 1 million
        System.out.println("It will take " + year + " years for your bank account to have 10 million dollars");
    }
}
