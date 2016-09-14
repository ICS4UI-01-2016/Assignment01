
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author guanv6321
 */
public class Problem10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // to get user input
        Scanner input = new Scanner(System.in);
        // variable for how many words have been typed
        int count = 0;
        // while loop
        while(true){
            // asks user input for a word
            System.out.println("Enter a word");
            // variable to store the word
            String word = input.nextLine();
            // if word was 'exit'
            if(word.equals("exit")){
                // output how many words were typed 
                System.out.println("The number of words you have entered is " + count);
                // end the loop
                break;
            }
            // increase the count
            count++;
        }
    }
}
