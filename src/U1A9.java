
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author coulh9904
 */
public class U1A9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Input = new Scanner(System.in);
        //New string array, WordStore (WStore)
        String[] WStore = new String[10];
        //New Int array, LenghtStore (LStore)
        int[] LStore = new int[10];
        //Integer, Wordnumber(WNum). This will be used to progress while loops and select array places
        int WNum = 0;
        //Records all inputted words and their lengths. Obviously it does this 10 times.
        while (WNum < 9) {
            System.out.println("Please enter word " + (WNum + 1));
            WStore[WNum] = Input.nextLine();
            LStore[WNum] = WStore[WNum].length();
            WNum = WNum + 1;
        }
        //Reset WNum to 0 for next loop
        WNum = 0;
        //TotalCharacters(TotalChar) will acquire the lengths from the LStore array and add them.
        int TotalChar = 0;
        //The while loop that allows TotalChar to acquire all lengths
        while (WNum < 9) {
            TotalChar = TotalChar + LStore[WNum];
            WNum = WNum + 1;
        }
        //Divide TotalChar by the number of words to get the average, and output to screen
        System.out.println("The average length is " + TotalChar / 10 + ".");
    }
}
