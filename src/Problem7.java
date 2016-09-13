/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author agott2059
 */
public class Problem7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //assign appropriate values to variables
        double initialPop = 6; //(billion)
        double finalPop = 10; //(billion)
        int startYear = 1999;
        //0.014 written instead of 1.4 percent
        double growthRate = 0.014;

        //add 1.4% to initial value until 10 billion is surpassed
        while (initialPop < finalPop) {
            //add 1.4% to initial value
            initialPop = initialPop + (initialPop * growthRate);
            //add 1 to start year everytime loop is completed
            startYear = startYear + 1;
        }
        //output result to user
        System.out.println("World population surpasses 10 billion and "
                        + "reaches: " + initialPop + " billion in the year: " + startYear + ".");
    }
}
