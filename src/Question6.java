
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hadida
 */
public class Question6 {
    public static void main(String[] args) {
        //recognize user input
        Scanner input = new Scanner(System.in);
        
        //asks user for a number between 50-100 and stores it
        System.out.println("Enter a number between 50 and 100 to stop at:");
        int number = input.nextInt();
        //Takes the number user inputs and minuses it from 100 then divides it by 5 to get amount for loop
        int loop = (100 - number)/5;
        
        //For loop used to count down until it hits the number (or close to) user inputs
        for (int i = 0; i < loop+1; i++) {
            //prints out the numbers
            System.out.println(100 - (i*5));
        }
    
    }
}
