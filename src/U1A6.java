
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author coulh9904
 */
public class U1A6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Input = new Scanner(System.in);
        System.out.println("Please enter a number between 50 and 100 inclusive.");
        //Takes and saves the number as "VNum"
        int VNumCtrl = Input.nextInt();
        //If user input isn't between 50 and 100, it basically detonates.
        if (VNumCtrl < 50 || VNumCtrl > 100) {
            System.out.println("That is not correct. Program terminated.");
            //If it is within perameters
        } else {
            //Creates a control variable for the while loop
            int VNum = 100;
            //Here is said while loop - The counter will run through this loop until Counter is < VNum - 1 (Because there's 1 Asterix by default)
            while (VNum >= VNumCtrl) {
                VNum = VNum - 5;
                System.out.println(VNum + 5);
            }

        }
    }
}