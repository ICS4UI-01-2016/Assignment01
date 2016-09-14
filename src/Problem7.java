/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author malcr1272
 */
public class Problem7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //use 6 to represent 6 billion people
        double population = 6;

        //make the year start at 1999
        int year = 1999;

        //add to population by %1.4 until 10 is reached
        while (population < 10) {
            population = (population * 1.014);
            //add a year everytime the loop runs
            year = (year + 1);
        }
        //print what year it will be
        System.out.println("The population will exceed 10 billion in the year " + year);
    }
}
