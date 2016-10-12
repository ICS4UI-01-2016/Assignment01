
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author moore3607
 */
public class A1Q8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("What is the initial amount put into the savings account?");
        double initial = input.nextDouble();
        System.out.println("What is the interest rate for this account?");
        double interest = input.nextDouble();
        double total = initial;
        int years = 0;
        int years2 = 0;

        while (total <= 1000000) {
            total = (1 + interest) * total;
            years = years + 1;


            if (total >= 1000000) {
                System.out.println("The account will reach $1000000 in " + years + " years.");
            }
        }
        
        total = initial;
        while (total < initial * 2) {
            total = (1 + interest) * total;
            years2 = years2 + 1;
            if (total >= initial * 2) {
                System.out.println("The initial amount in the account will double after " + years2 + " years.");
            }
        }


    }
}
