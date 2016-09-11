
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Denis
 */
public class Problem10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Add new scanner
        Scanner input = new Scanner(System.in);
        // Ask the user to type in any given amount of words and tp stop type "exit"
        System.out.println("Please enter as many words as you like and then type 'exit' to finish");
        // Store the user's entered words
        String wordsEntered = input.next();
        // Store the amount of words being counted
        int num = 0;

        // Add if statement to say if 'exit' isn't entered to stop counting
        if (!wordsEntered.equals("exit")) {
            num++;
        } else {
            break;
        }

    }
}
