
import java.util.Scanner;

/**
 * Create program that will count the number of words entered by the user
 * until they enter the word "exit".
 *
 * @author richj0985
 */
public class Problem10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // to get user input
        Scanner input = new Scanner(System.in);
        
        // create variable to know when to stop the program
        boolean exit = false;
        
        // create variable to count the number of words entered
        int count = 0;
        
        // create loop to continuesly ask the user for a word and count the number
        // of words until the user enters "exit" (in any case)
        while(exit == false){
            // prompt user for a word
            System.out.println("Enter a word: ");
            String word = input.nextLine();

	    // check to see if the user entered the work "exit" and
            // if yes then we have hit the sentinel and no more words can be entered
            if(word.equalsIgnoreCase("exit")){
                exit = true;
            } else{
                count = count + 1;
            }
        }
        
        // output the number of words to the user
        System.out.println("You have entered " + count + " word(s).");
        
        // close scanner
        input.close();
    }
}
