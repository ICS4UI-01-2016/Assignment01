
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Thomas
 */
public class Problem10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //add scanner
        Scanner input = new Scanner(System.in);
        //request words from user
        System.out.println("Enter any number of words.");
        //create boolean variable and set to false
        boolean exitLoop = false;
        //create integer variable for word count
        int wordCount = 0;
        //loop while boolean:"exitLoop" is false (exit has not been entered)
        while (exitLoop == false) {
            //store input in variable
            String wordEntered = input.nextLine();
            //check if the word entered is "exit"
            if (wordEntered.equals("exit") == true) {
                //if word entered is "exit", set boolean to true so program will exit loop
                exitLoop = true;   
            } else {
                //if word entered is not "exit", add to word count
                wordCount++;
            }
        }
        //output result to user
        System.out.println("Number of Entries:" + wordCount);

    }
}
