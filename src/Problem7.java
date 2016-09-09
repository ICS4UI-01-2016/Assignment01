
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
        // Add a new scanner 
        Scanner input = new Scanner(System.in);

        // Make an integer for population
        int population = 6;
        // Make an integer for the interest rate 
        double interest = 0.014;
        // Make an integer for the number of years
        int years = 0;

        // Make a double for the answer
        double answer = input.nextDouble();

        while (true) {
            answer = ((population * interest) + population);
            years++;
            System.out.println(years);
            if (population > 10) {
                // Print the number of years 
                System.out.println("The population will exceed 10 billion in " + answer);
                break;
            }
        }
    }
}
