
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author watsk8668
 */
public class Problem9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // input scanner
        Scanner input = new Scanner(System.in);

        // create an array to store the words
        String[] words = new String[10];

        // get the 10 words
        for (int i = 0; i < words.length; i++) {
            System.out.println("Please enter a word");
            words[i] = input.nextLine();
        }

        // create a variable to store the amount of characters
        int total = 0;

        // add the 10 words characters 
        for (int i = 0; i < words.length; i++) {
            total = total + words[i].length();
        }

        // print out total to the screen
        System.out.println(total / 10);

    }
}
