
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mike
 */
public class A1Q8 {
    
    public static int doubleAmount (double a, double r){
        // store the number of years in a variable
        int t = 0;
        // store the balance in a variable
        // the balance right now is the initial amount
        double b = a;
        
        
        
        while (b < a * 2){
            // multiply balance by the interest rate
            b = (1 + r) * b;
            
            // add to the number of years
            t = t + 1;
        }
        // when the loop is complete, return the number of years
        
        return t;
        
    }
    
    public static int amountMil ( double a , double r){
        // store th number of years in a variable
        int t = 0;
        // store the balance in a variable
        // the balance right now is the initial amount
        double b = a;
        
        
        
        while (b < 1000000){
            // multiply balance by the interest rate
            b = (1 + r) * b;
            
            // add to the number of years
            t = t + 1;
        }
        // when the loop is complete, return the number of years
        
        return t;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // make a scanner
        Scanner input = new Scanner(System.in);
        
        // ask the user to enter an intial amount
        System.out.println("Enter the initial amount of money in the account");
        
        // store the amount in a variable
        double a = input.nextInt();
        
        // ask the user to enter the interest rate
        System.out.println("Enter the interest rate");
        
        // store the interest rate in a variable
        double r = input.nextInt();
        // put into decimal form
        r = r / 100;
        
        // activate years to double method
        System.out.println("Your balance will double in " +doubleAmount (a, r) + " years");
        
        // activate years to a million method
        System.out.println("Your balance will reach over 1 million in " + amountMil (a, r) + " years");
        
    }
    
}
