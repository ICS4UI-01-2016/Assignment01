
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
public class Problem8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        //create a scanner to gather inputs
        System.out.println("Please input your intial amount of money and the interest rate as a decimal(ie. 100$ = 1.0) per year on seperate lines:");
        //prompt user for input
        double intamo = in.nextDouble();
        //store intial amount
        double ir = 1.0 + in.nextDouble();
        //store interest rate
        
        //DOUBLING TIME MATH AND OUTPUT BELOW
        double stepone = (Math.log10(2.0))/(Math.log10(ir));
        System.out.println("Therefore it will take " + stepone + " years for your intial balance to double");
        
        //TIME TO A MILLION MATH AND OUTPUT BELOW
        double stepa = (Math.log10(1000000.0/intamo))/(Math.log10(ir));
        System.out.println("Therefore it will take " + stepa + " years for your intial balance to go up to one million");
    }

}
