
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author watsk8668
 */
public class Review {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int number = 3; 
        double decimal = 3.44;
        char letter = 'a';
        boolean light = true;    // variables should start with lower case letters then camel case
    
        Scanner input = new Scanner(System.in);    // capital means that it isnt a primitive
        
        // ask user for input
        System.out.println("Please enter your name");
        String name = input.nextLine();
        
        // say hello to the user
        System.out.println("Hello " + name);
        
        // create an array to store names
        String[] nameList = new String[5];
        
        // loop through the array
        for(int i = 0; i < nameList.length; i++) {
            System.out.println("Please enter name " + (i+1));
            nameList[i] = input.nextLine();
        }
        // say hello to everyone
        for(int i = 0; i < nameList.length; i++) {
            System.out.println("Hello " + nameList[i]);
        }
        
        int num1 = 5;
        int num2 = 10;
        int total = Math.round(num1 * num2); // .ceil rounds up .floor rounds down .round rounds to the nearest whole number
        
        // while loop (- 1 till 0)
        int count = 10;
        while(count > 0) {
            System.out.println(count);
            count--;
        }
        
    }
}
