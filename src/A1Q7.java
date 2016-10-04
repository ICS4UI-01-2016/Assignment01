/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sevcm7279
 */
public class A1Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a varible to store the number of years that have past
        int y = 0;
        // store the initial population in a varible
        double p = 6; // in billions

        // increase pop by 1.4% until the pop exceeds 10 bil
        while (p < 10) {
            p = p * 1.014;
            // add to the years passed
            y = y + 1;
            if (p >= 10) {
                // add the number of years past to the initial year 1999
                y = y + 1999;
                // dsplay the year
                System.out.println(y);
            }
        }
    }
}
