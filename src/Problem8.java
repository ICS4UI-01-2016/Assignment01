
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuk4142
 */
public class Problem8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //A = P(1+r)t
        
         //add a scanner for input
        Scanner input = new Scanner(System.in);
        
        //create 2 booleans to check if both years needed to double money and reach 1 mil
        boolean milfound = false;
        boolean doublefound = false;
        
        //print to screen and ask user for amount of money in savings account
        System.out.println("How much money do you have in your savings account?");
        //save inputed number in variable called money
        double money = input.nextDouble();
        
        //print to screen and ask user for the interest in savings account
        System.out.println("What is your savings interest in decimal form?");
        //save inputed number in variable called interest
        double interest = input.nextDouble();
                
        //create variable to count number of years 
        int years = 0;
        
        //while statement that loops infinitely
        while(true){
            //if money has not exceeded nor reached 1 mil...
        if(money<1000000 && money != 1000000){
            //increase the money by the interest rate
        money = (1 + interest)*money;
        
        //increase years by 1;
        years++;
        }
        
      
    }
        
        System.out.println("It will take " + years + "years for you");
    }
}
