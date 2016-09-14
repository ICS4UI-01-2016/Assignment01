
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author guanv6321
 */
public class Problem7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // to get user input 
        Scanner input = new Scanner(System.in);
        // variable for year
        int year = 1999;
        // variable for population in billions
        double pop = 6;
        // while loop
        while (true) {
            // if population is less than 10 billion
            if (pop < 10) {
                // variable for new population
                pop = pop + pop * 0.014;
                // increase the year by 1
                year++;
            }
            // if population exceeds 10 billion
            if(pop > 10){
                // output the year
                System.out.println("The population will exceed 10 billion in " + year);
                // end the loop
                break;
            }
        }
    }
}
