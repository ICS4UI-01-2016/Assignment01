
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author snowc4636
 */
public class Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // To get user input
        
        Scanner input = new Scanner (System.in);
        
        //Enter amount of words
        
        System.out.println("Please enter a number between 1 and 10 ");
        int ask = input.nextInt();
        //if it = 1, output 1 and so on
        if (ask == 1){
            System.out.println("*");
        }
        if (ask == 2){
            System.out.println("**");
        }
        if (ask == 3){
            System.out.println("***");
        }
        if (ask == 4){
            System.out.println("****");
        }
        if (ask == 5){
            System.out.println("*****");
        }
        if (ask == 6){
            System.out.println("******");
        }
        if (ask == 7){
            System.out.println("*******");
        }
        if (ask == 8){
            System.out.println("********");
        }
        if (ask == 9){
            System.out.println("*********");
        }
        if (ask == 10){
            System.out.println("**********");
        }
        
         
         
    }
}
