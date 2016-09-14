
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author whitb0039
 */
public class Problem8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //create scanner
        Scanner in = new Scanner(System.in);

        //ask user for the initial amount
        System.out.println("please input an initial amount");

        //next input is initial amount
        double initial = in.nextInt();

        //ask for a percentage
        System.out.println("please input the interest rate as a percentage");

        //next input is the percentage
        double intrst = in.nextInt();

        //create the double total
        double total = initial;

        //create the in nmberYears to double
        int nmberYears = 0;

        //create int number of years until 1 million
        int milYears = 0;

        //while the total is less than twice the initial
        for (int i = 0; total <= 2 * initial; i++) {
            total = (1 + (intrst * 0.01)) * total; //find new total
            nmberYears = i; //record number of years past
        }

        //number of years it took to double
        System.out.println("It will take " + nmberYears + " years to double.");

        //until total is equal to or more than a million
        for (int i = 0; total <= 1000000; i++) {
            total = (1 + (intrst * 0.01)) * total; //find new total
            milYears = i; //record number of years
        }

        //output number of years it took for a million
        System.out.println("It will take " + milYears + " years to earn a million dollars.");


    }
}
