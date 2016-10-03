
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hadida
 */
public class Question3 {
    public static void main(String[] args) {
        //Reads user's input
        Scanner input = new Scanner(System.in);
        //Creating an array of 6 slots
        int[] promExpenses =  new int[6];
        int adding = promExpenses[0];
        
        //Asks for expenses and assigns them to arrays 
        System.out.println("Please enter the food, DJ, the hall rental, the decorations, the wait staff, and any miscellaneous");
        for (int i = 0; i < promExpenses.length; i++) {
            int expense = input.nextInt();
            promExpenses[i] = expense;   
        }
        
        //Adds up the expenses using arrays
        for (int i = 0; i < promExpenses.length; i++) {
            adding = adding + promExpenses[i];      
        }
        
        //rounds the total of expenses divided by ticket cost
        double total = Math.ceil(adding/35);
        //prints out the amounts
        System.out.println("Your overall expense is $" + adding + " and the amount required to break even is $" + total );
    }
   
}
