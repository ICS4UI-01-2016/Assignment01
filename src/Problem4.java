
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author moraj0721
 */
public class Problem4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //make a new scanner
        Scanner input = new Scanner(System.in);
        
        //have them enter a number between 1 and 10
        System.out.println("Please enter a number between 1 and 10.");
        int request = input.nextInt();
        
        //print out the number they requested
        for(int i = 0; i < request; i++){
            System.out.print("*");
        }
        System.out.println("");
    }
}
