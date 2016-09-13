
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Nick Joudrey
 */
public class Problem7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        //create a scanner to gather inputs
        System.out.println("Input a population int the billions (eg. 10 billion = 10:");
        //prompt user for a population
        double pop = in.nextInt();
        //store user input
        double stepone = pop/6.0;
        double steptwo = (Math.log10(stepone))/(Math.log10(1.014));
        double stepthree = steptwo + 1999;
        //working through the math to figure out what year the population with hit this population
        System.out.println("The world will hit this population in " + Math.ceil(stepthree));
        //output population
    }

}
