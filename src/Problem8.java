
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author guanv6321
 */
public class Problem8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the initial amount:");
        double initial = input.nextDouble();
        System.out.println("Enter the interest rate in decimal form:");
        double rate = input.nextDouble();
        int year1 = 0;
        int year2 = 0;      
        while (true) {
            double answer = Math.pow((1+rate), year2);
            double balance = answer*initial;
            if (balance <= (2 * initial)) {
                year1++;                
            }
           
            if (balance <= 1000000) {               
                year2++;
            }
            if (balance > 1000000) {
                break;
            }         
        }
        System.out.println("It takes " + year1 + " years to double and " + year2 + " years to reach 1 million");
    }
}
