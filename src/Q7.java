/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author voigr4865
 */
public class Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //all doubles for year population max and percent
        double pop = 6;
        double year = 1999;
        double max = 10;
        double per = 1.014;

        //while loop for as long as the population isnt 10 
        while (pop < max) {
            pop = pop * per;
            year++;





        }
        System.out.println(year);

    }
}
