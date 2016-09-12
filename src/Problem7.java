
import java.util.Scanner;

/*
 * Create a program that will determine the year the population at 6 billion (1999) will
 * exceed 10 billion at a increase of 1.4% each year.
 */

/**
 *
 * @author richj0985
 */
public class Problem7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // to get user input
        Scanner input = new Scanner(System.in);
        
        // create variable to store the increasing population starting at  billion
        double population = 6.0;
        
        // create a variable to store the increasing population starting at 1999
        int year = 1999;
        
        // continue looping until the populating exceeds 10 billion
        // the rate should equal the 14% of the populating each year
        // the population should then increase by that rate calculated
        // finally the year should increase by 1
        while(population < 10.0){
            double rate = population * 0.014;
            population = population + rate;
            year = year + 1;
        }
        
        // print out the final year that the population will exceed 10 billion
        System.out.println("The population has exceeded 10 billion at: " + year);
        
        // close scanner
        input.close();
    }
}
