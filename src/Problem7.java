
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author richj0985
 */
public class Problem7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // to get user input
        Scanner input = new Scanner(System.in);
        
        double count = 6;
        int year = 1999;
        while(count < 10){
            double rate = count * 0.014;
            count = count + rate;
            year = year + 1;
        }
        
        System.out.println("The population has exceeded 10 billion at: " + year);
        
        // close scanner
        input.close();
    }
}
