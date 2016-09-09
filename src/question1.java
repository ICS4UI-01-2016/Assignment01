
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lalim9800
 */
public class question1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create new scanner 
        Scanner input = new Scanner(System.in);
        //ask user to enter name 
        System.out.println("Please enter your name");
        //create string to store users name 
         String name = input.nextLine();
         //print hello + users name 
         System.out.println(" Hello " + name);
    }
    
    
}
