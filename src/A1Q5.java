
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author preej0747
 */
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create scanner to read user input
        Scanner input = new Scanner(System.in);
        
        //tell user to type in a number
        System.out.println("Please type in a number from 1-10");
        int number = input.nextInt();
        
        //output asterisks
        if(number == 1){
            System.out.println("*");
        }
        if(number == 2){
            System.out.println("**");
            System.out.println("**");
        }
        if(number == 3){
            System.out.println("***");
            System.out.println("***");
            System.out.println("***");
        }
        if(number == 4){
            System.out.println("****");
            System.out.println("****");
            System.out.println("****");
            System.out.println("****");
        }
        if(number == 5){
            System.out.println("*****");
            System.out.println("*****");
            System.out.println("*****");
            System.out.println("*****");
            System.out.println("*****");
        }
        if(number == 6){
            System.out.println("******");
            System.out.println("******");
            System.out.println("******");
            System.out.println("******");
            System.out.println("******");
            System.out.println("******");
        }
        if(number == 7){
            System.out.println("*******");
            System.out.println("*******");
            System.out.println("*******");
            System.out.println("*******");
            System.out.println("*******");
            System.out.println("*******");
            System.out.println("*******");
        }
        if(number == 8){
            System.out.println("********");
            System.out.println("********");
            System.out.println("********");
            System.out.println("********");
            System.out.println("********");
            System.out.println("********");
            System.out.println("********");
            System.out.println("********");
        }
        if(number == 9){
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
        if(number == 10){
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
