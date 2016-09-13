
import java.util.Scanner;

/**
 * Create a program that will count down from 100 to 50 by 5 and 
 * stop when the count down is just greater than the number input.
 *
 * @author richj0985
 */
public class Problem6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // to get user input
        Scanner input = new Scanner(System.in);
        
        // ask the user for the number and store this number in a variable
        System.out.print("Enter a number between 50 and 100 to stop at: ");
        int number = input.nextInt();

	// ensure the number entered is between 50 and 100        
        if(number >= 50 && number <= 100){

	    // create a variable that will represent the count down
            int count = 100;

            // create a loop that will count down by 5 and stop 
	    // when the count down is just greater than or equal to the number input.
            while(count>=number){
                // output the current count down value
                System.out.println(count);

	        // count down by 5
                count = count - 5;
            }
        }

        // close scanner
        input.close();
    }
    
}
