
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author preej0747
 */
public class A1Q10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create scanner to read user input
        Scanner input = new Scanner(System.in);
        
        //create variable that represents the amount of words the user has entered
        int amount = 0;
        
        //allow user to enter in as many words as they want
        for(int i = 0; i < 100000000; i++){
            System.out.println("Please enter a word. When you are done typing a word, please type exit");
            String word = input.nextLine();
            amount = amount + 1;
            if(word.equals("exit")){
                break;
            }
        }
        
        //tell user how many words you entered
        System.out.println("You entered " + amount + "words");
    }
}
