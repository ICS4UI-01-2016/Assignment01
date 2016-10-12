
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author hadik9595
 */
public class Question4 {

    public static void main(String[] args) {
        //recognize user input
        Scanner input = new Scanner(System.in);

        //asks for a number of asterisks
        System.out.println("Enter a number between 1-10 for asterisks");
        int number = input.nextInt();

        if (number <= 10 && number >= 1) {
            //a for loop used to output the amount of stars
            for (int i = 0; i < number; i++) {
                System.out.print("*");
                //Separates BUILD SUCCESFUL 
                if (i == number - 1) {
                    System.out.println("");
                }
            }

            //tells user to re enter a number
        } else {
            System.out.println("Not within the range given!");
        }

    }
}
