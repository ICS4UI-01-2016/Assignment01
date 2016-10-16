/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author watsk8668
 */
public class Problem7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create variables
        int year = 1999;
        int n = 1;
        double p = 6e9;
        
        // calculate when the population reaches 10 billion
        while(p < 1e10){
            p = p * Math.pow((1 + 0.014),n);
            year++;
        }
        
        // tell the user when the population will exceed 10 billion people
        System.out.println("The population will exceed 10 billion in " + year);
        
    }
}
