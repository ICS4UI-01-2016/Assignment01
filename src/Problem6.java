
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author moraj0721
 */
public class Problem6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //make a new scanner
        Scanner input = new Scanner(System.in);
        
        //Enter the number they'd like the countdown to stop before
        System.out.println("Please enter a number.");
        int stop = input.nextInt();
        
        //set the countdown to 100
        int start = 100;
        System.out.println("Begin Countdown");
        
        //stop right before the countdown would be less than the number the user entered
        while(stop < start){
            System.out.println(start);
            start = start - 5;
        }
    }
}
