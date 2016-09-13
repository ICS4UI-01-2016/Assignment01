
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author yuk4142
 */
public class Problem9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //add a scanner for input
        Scanner input = new Scanner(System.in);

        //create an array that can has 10 spots
        String[] wordlist = new String[10];

        double wlength = 0;
        //ask user to enter 10 words
        System.out.println("Enter a series of 10 words");

        //for the created "i" variable, while "i" is smaller than 10, keep adding 1 to "i"
        for (int i = 0; i < 10; i++) {
            //keep jotting down the 10 inputed user words 
            wordlist[i] = input.nextLine();
        }

        //go through the for loop from 1 - 10 of the 10 words again 
        for (int y = 0; y < 10; y++) {
            //add up the length's of each of the words into a single variable
            wlength = wlength + wordlist[y].length();
        }
        //divide final product of all 10 word length's by 10 to find average word length
        double avglength = wlength / 10;

        //print out avglength/final answer to screen
        System.out.println("The average word length is " + avglength);
    }
}
