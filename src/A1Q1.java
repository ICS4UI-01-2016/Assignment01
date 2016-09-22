
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author moore3607
 */
public class A1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //make a new scaner
        Scanner input = new Scanner (System.in);
        //asks the user for their name
        System.out.println("Please enter your name.");
        String name=(input.nextLine());
        //say hello to the user
        System.out.println("Hello " + name + ".");
        //make an array of names
        String[] nameList = new String[5];
        //loop through the array
        for(int i = 0; i < nameList.length; i++){
            System.out.println("Please enter name " + (i+1));
            nameList[i] = input.nextLine();
        }
        
        //say hello to everyone
        for(int i = 0; i < nameList.length; i++){
            System.out.println("Hello " + nameList[i]);
        }
        int num1 = 5;
        int num2 = -10;
        double total = Math.sqrt(num1 * num2);
    }
}
