
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author butlj9437
 */
public class Problem2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //make a scanner
        Scanner in = new Scanner(System.in);
        //tell user to enter 3 numbers
        System.out.println("Please enter 3 numbers");
        //get numbers from user
        double[] numberlist = {in.nextDouble(), in.nextDouble(), in.nextDouble()};
        //tell user product of all the numbers
        System.out.println("This is the product of all the numbers");
        double product = 1;
        for(int i=0;i<3;i++){
            product = product * numberlist[i];
        }
        System.out.println(product);
        //tell user the square of the product
        System.out.println("This is the square of the product");
        System.out.println(Math.pow(product, 2));
        //tell user the square root of the product
        System.out.println("This is the square root of the product");
        System.out.println(Math.sqrt(product));
    }
}
