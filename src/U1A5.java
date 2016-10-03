
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author coulh9904
 */
public class U1A5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Input = new Scanner(System.in);
        System.out.println("Please enter a number between 1 and 10 inclusive.");
        //Takes and saves the number as "VNum"
        int VNum = Input.nextInt();
        //If user input isn't between 1 and 10, it basically detonates.
        if (VNum < 1 || VNum > 10) {
            System.out.println("That is not correct. Program terminated.");
            //If it is within perameters
        } else {
            int Counter = 1;
            //Creates a String for the Asterix with one default *... which will need to be accounded for leter.
            String Asterix = "*";
            //Here is said while loop - The counter will run through this loop until Counter is < VNum - 1 (Because there's 1 Asterix by default)
            while (Counter <= VNum - 1) {
                Asterix = Asterix + "*";
                //Adds one to the Counter, so as to progress and stop the loop when the number of user requested asterix has been reached
                Counter = Counter + 1;
            }
            //Reset the counter for the next Loop
            Counter = 1;
            //Prints out all your asterix.
            while (Counter <= VNum) {
                System.out.println(Asterix);
                //Keep the counter going!
                Counter = Counter + 1;
            }
        }
    }
}
