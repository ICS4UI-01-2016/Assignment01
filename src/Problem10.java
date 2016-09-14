
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author malcr1272
 */
public class Problem10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //to get user input
        Scanner input = new Scanner(System.in);

        //create variable to store words
        String word = new String();

        //create variable to store word count
        int number = 0;

        //run loop while word isn't exit
        while (!word.equals("exit")) {
            //asl for word and store
            System.out.println("Please enter a word");
            word = input.nextLine();

            //when exit is typed it will not add to the word count
            if (word.equals("exit")) {
                number = number;
            } else {
                //if any other word is printed it will add to word count
                number = number + 1;
            }
        }

        System.out.println("You entered " + number + " words");

        if (number == 1) {
            System.out.println("You entered " + number + "word");
        }
    }
}
