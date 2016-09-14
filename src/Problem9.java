
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author whitb0039
 */
public class Problem9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //create scanner
        Scanner in = new Scanner(System.in);

        //create array
        String[] words;

        //array has 10 spaces
        words = new String[10];

        //ask user for 10 words
        System.out.println("Please input 10 words.");

        //enter all words
        for (int i = 0; i < 10; i++) {
            words[i] = in.next();
        }

        //create array for lengths
        int[] lengths;

        //array has 10 spaces
        lengths = new int[10];

        //find all lengths
        for (int i = 0; i < 10; i++) {
            lengths[i] = words[i].length();
        }
        //create double for average
        double average = 0;

        //add up all lenghts
        for (int i = 0; i < 10; i++) {
            average = average + lengths[i];
        }
        
        //create average double
        double totalChar = average;
         //find average
        average = Math.round(average/10);
        
        //output average
        System.out.println("The average number of letters per word is " + average);
        
        //output total
        System.out.println("The total number of characters is " + totalChar);

    }
}
