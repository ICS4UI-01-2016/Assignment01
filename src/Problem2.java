
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author yuk4142
 */
public class Problem2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //add a scanner for input
        Scanner input = new Scanner(System.in);

        //create an array 3 spots long called numList
        int[] numList = new int[3];

        //for the int i that equals 0, while i is smaller than numList length(3), keep adding 1 to i
        for (int i = 0; i < numList.length; i++) {
            //ask user to input a number each loop
            System.out.println("Input a number");
            //add the inputed number to the specific spot in the array stated by the integer "i"
            numList[i] = input.nextInt();

        }
        //multiply the 3 inputed numbers stored in the array, and store the product in a double called numProduct
        double numProduct = numList[0] * numList[1] * numList[2];
        //square of the numProduct, storing the resulting answer in a double called numSq
        double numSq = Math.pow(numProduct, 2);
        //square root the numProduct, storing the resulting answer in a double called numSqrt
        double numSqrt = Math.sqrt(numProduct);

        //print out the product of the numbers in numList array
        System.out.println("The product of the numbers is " + numProduct);
        //print out the square of numProduct
        System.out.println("The square of the product of the numbers is " + numSq);
        //print out the square root of numProduct
        System.out.println("The square root of the product of the numbers is " + numSqrt);
    }
}
