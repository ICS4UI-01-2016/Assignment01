
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author richj0985
 */
public class Problem10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // to get user input
        Scanner input = new Scanner(System.in);
        boolean exit = false;
        
        int count = 0;
        
        while(exit == false){
            System.out.println("Enter a word: ");
            String word = input.nextLine();
            if(word.equalsIgnoreCase("exit")){
                exit = true;
            } else{
                count = count + 1;
            }
        }
        
        System.out.println("You have entered " + count + " words.");
    }
}
