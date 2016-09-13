
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author agott2059
 */
public class Problem5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //create scanner
        Scanner input = new Scanner(System.in);
        //request number between 1 and 10
        System.out.println("Enter a number between 1 and 10.");
        //store number in variable
        int selectedNumber = input.nextInt();
        //print new line of asterisks as many times as required
        for (int i = 0; i < selectedNumber; i++) {
            //do not put space between lines for the first row of asterisks
            if (i != 0) {
                //create new line for asterisks    
                System.out.println("");
            }
            //insert appropriate number of asterisks for each line
            for (int s = 0; s < selectedNumber; s++) {
                System.out.print("*");
            }
        }
    }
}
