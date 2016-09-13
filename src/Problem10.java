
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author whitb0039
 */
public class Problem10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //create scanner
        Scanner in = new Scanner(System.in);

        //ask for any number of words
        System.out.println("please input any number of words.");

        //create the counting integer
        int count = 0;

        //while true
        while (true) {
 
            //create a string every time
            String test = in.next();
 
            //if the string is "exit"
            if (test.equals("exit")) {
                break; //break the loop
            } else { //otherwise
                count = count + 1; //add one to total word count
            }
        }
        //output how many words were typed
        System.out.println("You typed " + count + " words.");
    }
}
