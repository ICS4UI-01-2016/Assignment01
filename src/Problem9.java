
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author agott2059
 */
public class Problem9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //add scanner
        Scanner input = new Scanner(System.in);
        //get 10 words from user
        System.out.println("Enter ten words.");
        //create array with 10 elements
        String[] words = new String[10];
        //create variable for total number of characters
        int totalChars = 0;
        //fill array with words
        for (int i = 0; i <= 9; i++) {
            words[i] = input.nextLine();
        }
        //check length of all words and add to totalChars
        for (int i = 0; i <= 9; i++) {
            totalChars = words[i].length() + totalChars;
        }
        //find average
        int average = totalChars / 10;
        //output result to user
        System.out.println("Average number of characters in each word is " + average + " characters.");
    }
}
