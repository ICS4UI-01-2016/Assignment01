
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
public class Question8 {

    public static void main(String[] args) {

        //recognizes user input
        Scanner input = new Scanner(System.in);
        //asks for initial amount
        System.out.println("Please enter your initial balance");
        double initial = input.nextDouble();

        //asks for rate in decimals
        System.out.println("Please enter the rate (decimals)");
        double rate = input.nextDouble();

        //year1 is for when it reaches million, year2 is for when initial amount doubles
        double year1 = 0;
        double year2 = 0;
      

        //a infinite loop: increases the exponent of year1 by 1 as it multiples initial
        while (true) {
            
            double test = Math.pow((rate + 1), year1);
            double answer = test * initial;
            year1++;

            //ask Lamont if it has to be over or right under the double of the amount ? (840 or 799)?
            if (answer <= (2 * initial)) {
                year2++;
            }

            //Once it reaches just around 1 million (Doesn't always work out) and is done processing, it prints out results
            if (answer >= 1000000) {
                System.out.println("In about " + (year1-1) + " years your savings will reach 1 million and it takes " + year2);
                break;
            }

        }

    }
}
