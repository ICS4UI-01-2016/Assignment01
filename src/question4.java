
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lalim9800
 */
public class question4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //new scanner 
         Scanner input = new Scanner(System.in);
         //ask user to enter a number between 1 and 10 
        System.out.println("plese enter a number between 1 and 10");
        //user enters number 
        int asterisks=input.nextInt();
        //print the number of astericks based on the number the user enters
        for(int i=0;i<asterisks;i++){
            //print astericks
            System.out.print("*");
        }
         
        
       
    }
}
