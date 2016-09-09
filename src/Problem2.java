
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author guanv6321
 */
public class Problem2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int[] num = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter the number:");
            num[i] = input.nextInt();
        }
        int product = num[0]*num[1]*num[2];
        double square = Math.pow(product, 2);
        double root = Math.sqrt(product);
        System.out.println("Product: " + product);
        System.out.println("Square of Product: " + square);
        System.out.println("Square Root of Product: " + root);
    }
}
