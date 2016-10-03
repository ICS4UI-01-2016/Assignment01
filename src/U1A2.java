
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author coulh9904
 */
public class U1A2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Create Scanner for input
        Scanner Input = new Scanner(System.in);
        //Create Array
        int[] NumList = new int[3];
        //Task user to enter a number, and accept entered number into array slot.
        System.out.println("Please input the first number.");
        NumList[0] = Input.nextInt();
        // ''
        System.out.println("Please input the second number.");
        NumList[1] = Input.nextInt();
        // ''
        System.out.println("Please input the third number.");
        NumList[2] = Input.nextInt();
        //Multiplies numbers in array together, so as to get the product
        int Product = NumList[0] * NumList[1] * NumList[2];
        //Output product for user
        System.out.println("The product of your number is " + Product);
        //Square root of the product
        double SqrRoot = Math.sqrt(Product);
        System.out.println("The square root of the product is " + SqrRoot);
        //Square the product
        double Power = Math.pow(Product, 2);
        System.out.println("The product squared is " + Power);
    }
}
