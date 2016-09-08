
import java.util.Scanner;

/*
 * Create a program that asks the user to input a number between 1-10 and then 
 * makes a box of astreaks with the dimensions as that number.
 */

/**
 *
 * @author Jon
 */
public class Problem5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // to get user input
        Scanner input = new Scanner(System.in);
        
        // ask for a number between 1-10 and store this number in a variable
        System.out.println("Please enter a number between 1 and 10:");
        int number = input.nextInt();
        
        // create two new variables that represent the dimensions of the box and
        // are equal to the number entered
        int column = number;
        int row = number;
        
        // checks that the number is between 0-10
        if(number > 0 && number < 11){
        
        // create a loop that counts the amount of rows created making sure the
        // row variable is above 0
        // after that a new row is made and therefore decreases by 1
        // once a new row is created the row number must be reset
            while(row > 0){
                row --;
                column = number;
                // create a loop that adds the astricks to that row by subtracting the
                // columns variable until it reaches 0, finishing that row of astricks
                while(column > 0){
                    System.out.print("*");
                    column --;             
                }
                // after a row is finished a new line will be created
                System.out.println("");
            }
        }
        // close scanner
        input.close();
    }
    
}
