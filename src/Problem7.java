
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author tatad6701
 */
public class Problem7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Make a double for the max amount of population (10 billion)
        double maxPopulation = 10;
        // Make a double for population (6 billion)
        double population = 6;
        // Make a double for the growing rate 
        double interest = 0.014;
        // Make an integer for the number of years (Starting at 1999)
        int years = 1999;

        // For loop that counts the amount of years while doing the math, using the rate and then adding it back to the year number
        for (double i = population; i < maxPopulation; i += (i * interest)) {
            // Adding to the year count/number
            years++;
        }
        // Print out the answer
        System.out.println("The world population will exceed 10 billion in year " + years + ", counting from 1999.");
    }
}
