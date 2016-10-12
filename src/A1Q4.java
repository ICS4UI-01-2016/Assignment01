
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author moore3607
 */
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //making a new scanner to detect inputs
        Scanner input = new Scanner(System.in); 
        //asks the user to enter a number bewteen 1 and 10 inclusive
        System.out.println("Please enter a number between 1 and 10 inclusive.");
        //accepts the number that the user enters
        int number = input.nextInt();
        
        if(number == 1){
            System.out.println("*");
        }
        if(number == 2){
            System.out.println("**");
        }
        if(number == 3){
            System.out.println("***");
        }
        if(number == 4){
            System.out.println("****");
        }
        if(number == 5){
            System.out.println("*****");
        }
        if(number == 6){
            System.out.println("******");
        }
        if(number == 7){
            System.out.println("*******");
        }
        if(number == 8){
            System.out.println("********");
        }
        if(number == 9){
            System.out.println("*********");
        }
        if(number == 10){
            System.out.println("**********");
        }
    }
}
