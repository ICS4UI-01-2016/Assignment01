
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Josh
 */
public class Problem8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creat a scanner
        Scanner in = new Scanner(System.in);
        //ask user for start balance
        System.out.println("Enter your account balence:");
        //get start balance from user
        double balance = in.nextInt();
        double startBalance = balance;
        //ask user for interest rate in decimal form
        System.out.println("What is the interest rate in decimal form:");
        //get interest rate in decimal form
        double rate = in.nextDouble();
        //aa interest until balance had doubled
        for(int i=0;balance<startBalance*2;i++){
            balance = balance*(rate+1);
            if(balance > startBalance*2){
                //output number of years it takes
                System.out.println("It would take " + i + " years for the balance to be twice what it started as.");
            }
        }
        balance = startBalance;
        //add intrest until balance in 1 million
        for(int i=0;balance<1000000;i++){
            balance = balance*(rate+1);
            if(balance > 1000000){
                //output number of years it takes
                System.out.println("It would take " + i + " years for the balance to be 1 million.");
            }
        }
        //catch if balance starts larger than 1 million
        if(startBalance >= 1000000){
            System.out.println("The balance is already 1 million.");
        }
    }
    
}
