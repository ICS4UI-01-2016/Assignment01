
import java.util.Scanner;

/*
 * Create a program that will count the total number of characters in a series 
 * of 10 words that the user enters and then compute and output the average word length
 */

/**
 *
 * @author richj0985
 */
public class Problem9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // to get user input
        Scanner input = new Scanner(System.in);
        
        // create an array to store all 10 words
        String[] wordList = new String[10];
        
        // create a variable to store the length of all the words
        int length = 0;
        
        // create loop to continuely as the user for a word and add the length
        // of this word until the array reaches 10 words
        for(int i = 0; i < 10; i ++){
            System.out.println("Please enter word " + (i + 1) + ": ");
            wordList[i] = input.nextLine();
            length = length + wordList[i].length();
        }
        
        System.out.println(length);
        
        // create variable to store the average length and output this to the user
        double average = length / 10.0;
        System.out.println("The average number of characters is " + average);
        
        // close scanner
        input.close();
    }
}
