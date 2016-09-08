
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
public class Question5 {

    public static void main(String[] args) {
        //Recognizes user input
        Scanner input = new Scanner(System.in);

        //asks user for a number between 1-10
        System.out.println("Enter a number between 1-10 for asterisks");
        int number = input.nextInt();

        //Checks if the number is in between the number 1 and 10 
        if (number <= 10 && number >= 1) {
            //a loop used to print *
            for (int i = 0; i < number; i++) {
                //this is to press enter and move on to the next line
                if (i != 0) {
                    System.out.println("");
                }

                //prints out asterisks according to the number they asked for.
                for (int j = 0; j < number; j++) {
                    System.out.print("*");
                }

                //Once it's done printing asterisks, it separated SUCCESSFULLY BUILD from the rest of code
                if (i == number - 1) {
                    System.out.println("");
                }
            }
            //informs user that the number is not valid
        } else {
            System.out.println("Not within the range given!");
        }
    }
}
