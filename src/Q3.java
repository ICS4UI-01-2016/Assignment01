
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author voigr4865
 */
public class Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        //scanner
        Scanner input = new Scanner(System.in);
        
        //ticket price
        int tic = 35;
        
        //new array for the expenses
        double[] exp = new double[6];
        
        //array for the expenses strings
        String[] expType = {"Food", "DJ", "Hall Rental", "Decorations", "Staff", "Misc"};
        
        System.out.println("Please input the following expenses");
        
        //for loop to go through the strings and ask for prices
        for(int i = 0; i < exp.length; i++){
             System.out.println(expType[i]);
             exp[i] = input.nextDouble();
             
        }
        //all the math to add the expenses and makes the total cost
        double total = (exp[0] + exp[1] + exp[2] + exp[3] + exp[4] + exp[5]);
        System.out.println("The total cost of expenses is " + total);
        
        //math for amount of tickets they will need
        double tick = Math.ceil(total / tic);
        System.out.println("You will need " + tick + " tickets");
        
    }
}
