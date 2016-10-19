
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author snowc4636
 */
public class Q8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);


        System.out.println("Please enter the initial value ");

        double initial = input.nextDouble();

        System.out.println("Please enter the rate ");

        double interest = input.nextDouble();

        double all = initial;

        int year = 0;

        int Milyears = 0;

        for (int i = 0; all <= 2 * initial; i++) {
            all = (1 + (interest * 0.01)) * all;
            year = i;

        }

        System.out.println("The time it will take is " + year + " years ");

        for (int i = 0; all <= 1000000; i++) {
            all = (1 + (interest * 0.01)) * all;
            Milyears = i;
        }

        System.out.println("The time it will take is " + Milyears + " years ");
    }
}
