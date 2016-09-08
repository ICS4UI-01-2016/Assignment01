
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author watsk8668
 */
public class Problem6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // input scanner
        Scanner input = new Scanner(System.in);
        
        // get number
        System.out.print("Please enter a number between 100 and 50 to stop at: ");
        int num = input.nextInt();
        
        int count = 100;
        
        while(count >= num){
            System.out.println(count);
            
            count = count - 5;
        }
    }
}
