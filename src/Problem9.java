
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author malcr1272
 */
public class Problem9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //to get user input
        Scanner input = new Scanner(System.in);

        //create array to store words
        String[] words = new String[10];

        //make a double to store average
        double average = 0;

        //loop 10 times to ask for words
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter in a word");
            //store words in array
            words[i] = input.nextLine();
            //add word length to the average
            average = (average + words[i].length());
        }
        //calculate average and print        
        System.out.println("The average length of letters is " + average / 10);

    }
}
