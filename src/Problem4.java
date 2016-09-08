
import java.util.Scanner;

/*
 * Create a program that asks for a number between 1-10 and then outputs
 * the same number of astricks in a row as the number the user entered
 */

/**
 *
 * @author Jon
 */
public class Problem4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // to get user input
        Scanner input = new Scanner(System.in);
        
        // ask for a number between 1-10 and store this number in a variable
        System.out.println("Please enter a number between 1 and 10:");
        int number = input.nextInt();
        
        // create loop that makes sure the number is between 1-10
        // while it is it will input one atrick and then subract the number by
        // 1 until it is not larger than 0 and therefore will stop
        while(number > 0 && number < 11){
            System.out.print("*");
            number --;             
        }
        
        // print extra line
        System.out.println("");
        
        // close scanner
        input.close();
    }
    
}
