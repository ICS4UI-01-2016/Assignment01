
import java.util.Scanner;

/**
 * Create a program that asks the user to input a number between 1-10 and then 
 * makes a box of asterisks with the dimensions as that number.
 *
 * @author richj0985
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
        
        // checks that the number is between 0-10
        if(number > 0 && number < 11){
        
	    // output a line of asterisks for the number entered ie.  If user entered 5, output 
            // 5 lines of asterisks
	    for(int row = 0; row < number; row++ ){

	        // output a column of asterisks for the number entered ie.  If user entered 5, output 
                // 5 asterisks on the line
                for( int col=0; col < number; col++ ) {
                    System.out.print("*");
		}
                
		// after a row is finished a new line will be created
                System.out.println("");
            }
        }

        // close scanner
        input.close();
    }
   
}
