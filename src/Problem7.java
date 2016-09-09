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
        double r = 0.014;
        double a = 0;
        
        // calculate when the population reaches 10 billion (formula: a = p(1+r)^n;)
        while(a < 1e10){
            a = p * Math.pow((1+r),n);
            n = n++;
        }
        
        // add n to the year
        year = year + n;
        
        // tell the user when the population will exceed 10 billion people
        System.out.println("The population will exceed 10 billion in " + year);
        
    }
}
