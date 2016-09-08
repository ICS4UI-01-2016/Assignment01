
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author watsk8668
 */
public class Problem5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // input scanner
        Scanner input = new Scanner(System.in);
        
        // get the number between 1 and 10
        System.out.println("Enter a number between 1 and 10: ");
        int num = input.nextInt();
        
        // if the number is between 1 and 10 output the same number of asterisks
        if(num >= 1 | num <= 10){
            if(num == 1){
                System.out.println("*");
            }
            if(num == 2){
                System.out.println("**");
                System.out.println("**");
            }
            if(num == 3){
                System.out.println("***");
                System.out.println("***");
                System.out.println("***");
            }
            if(num == 4){
                System.out.println("****");
                System.out.println("****");
                System.out.println("****");
                System.out.println("****");
            }
            if(num == 5){
                System.out.println("*****");
                System.out.println("*****");
                System.out.println("*****");
                System.out.println("*****");
                System.out.println("*****");
            }
            if(num == 6){
                System.out.println("******");
                System.out.println("******");
                System.out.println("******");
                System.out.println("******");
                System.out.println("******");
                System.out.println("******");
            }
            if(num == 7){
                System.out.println("*******");
                System.out.println("*******");
                System.out.println("*******");
                System.out.println("*******");
                System.out.println("*******");
                System.out.println("*******");
                System.out.println("*******");
            }
            if(num == 8){
                System.out.println("********");
                System.out.println("********");
                System.out.println("********");
                System.out.println("********");
                System.out.println("********");
                System.out.println("********");
                System.out.println("********");
                System.out.println("********");
                
            }
            if(num == 9){
                System.out.println("*********");
                System.out.println("*********");
                System.out.println("*********");
                System.out.println("*********");
                System.out.println("*********");
                System.out.println("*********");
                System.out.println("*********");
                System.out.println("*********");
                System.out.println("*********");
            }
            if(num == 10){
                System.out.println("**********");
                System.out.println("**********");
                System.out.println("**********");
                System.out.println("**********");
                System.out.println("**********");
                System.out.println("**********");
                System.out.println("**********");
                System.out.println("**********");
                System.out.println("**********");
                System.out.println("**********");
            }
        }
        
        
        
        
    }
}
