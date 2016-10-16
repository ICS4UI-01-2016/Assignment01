
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author watsk8668
 */
public class Problem10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // input scanner
        Scanner input = new Scanner(System.in);
        // create an array to store the words
        List<String> words = new ArrayList<>();
        // loop the program until exit is entered
        for (int i = 0; true; i++) {
            // enter a word
            System.out.println("Please enter a word");
            words.add(input.nextLine());

            // if exit is typed print out i and end
            if (words.contains("exit")) {
                System.out.println(i);
                break;
            }
        }

    }
}
