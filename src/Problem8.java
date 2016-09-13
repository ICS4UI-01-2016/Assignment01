
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
       
        
         //add a scanner for input
        Scanner input = new Scanner(System.in);
        
        //create 2 booleans to check if both years needed to double money and reach 1 mil
        boolean milfound = false;
        boolean doublefound = false;
        
        //print to screen and ask user for amount of money in savings account
        System.out.println("How much money do you have in your savings account?");
        //save inputed number in variable called money
        double money = input.nextDouble();
        //create variable to hold the number of x2 of original money
        double dmoney = money*2;
        //print to screen and ask user for the interest in savings account
        System.out.println("What is your savings interest in decimal form?");
        //save inputed number in variable called interest
        double interest = input.nextDouble();
                
        //create variable to count number of years for money to reach double and mil 
        int yearsmil = 0;
        int yearsd = 0;
        //while statement that loops infinitely
        while(true){


        //increase the money by the interest rate
            money = (1 + interest)*money;
        
        //increase yearsd by 1 if the money has not yet doubled;
        if(doublefound ==false){
          yearsd++;  
        }
        //increase yearsmil by 1 if the money has not yet reached 1 mil
        if(milfound == false){
         yearsmil++;   
        }
        
        //if money has exceeded or reached 1 mil...
        if(money>1000000 || money == 1000000){
            //set milfound boolean to true
        milfound = true;
        //if double has already been found, break the while loop
        if(doublefound == true){
                break;
            }
        }
        //if money has doubled...
        if(money>dmoney||money == dmoney){
            //set the doubelfound boolean to true
         doublefound =true;
         //if mil has already been found, break the while loop
            if(milfound == true){
                break;
            }
        }
    }
        //print out how long the answer of years for the money to reach 1 mil and to double
        System.out.println("It will take " + yearsmil + " years for the money in your savings account to reach 1 million, and " + yearsd + " years for the money in your savings account to double.");
    }
}
