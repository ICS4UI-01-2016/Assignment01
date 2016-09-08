
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author hadik9595
 */
public class Question10 {

    public static void main(String[] args) {
        //Recognizes user input
        Scanner input = new Scanner(System.in);
        //word count used to keep count of words input
        int wordCount = 0;
        //It informs the user to start and typing words
        System.out.println("Go! type away!");

        //an infinite loop
        while (true) {
            String word = input.nextLine();
            //once exit is input, the program breaks and stops
            if (word.equals("exit")) {
                //prints out the amount of words
                System.out.println("The number of words you have entered is " + wordCount);
                break;
            }
            //once a word has been input, it adds one 
            wordCount++;
        }

    }
}
