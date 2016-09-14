
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author preej0747
 */
public class A1Q9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a scanner to read user output
        Scanner input = new Scanner(System.in);
        
        //make array that stores all the words
        String wordList[] = new String[10];
        
        //loop through array
        for(int i = 0; i < wordList.length; i++){
            System.out.println("Please enter word " + (i + 1));
            wordList[i] = input.nextLine();
        }
        
        //make a variable called average to determine the average
        double average  = 0;
        
        //find the length of all the words in the array
        for(int i = 0; i < 10; i++){
            average = (average + wordList[i].length());
        }
        
        //tell user what the average is
        System.out.println("The average is " + average / 10);
    }
}
