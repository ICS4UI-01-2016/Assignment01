
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
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
        String[] wordList = new String[10];
        int length = 0;
        for(int i = 0; i < 10; i ++){
            System.out.println("Please enter word " + (i + 1) + ": ");
            wordList[i] = input.nextLine();
            length = length + wordList[i].length();
        }
        
        System.out.println("The total number of characters is " + length);
        
        int average = length / 10;
        System.out.println("The average number of characters is " + average);
    }
}
