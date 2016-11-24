/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment01;

import java.util.Scanner;

/**
 *
 * @author fostp4040
 */
public class Problem2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        // ask user for three numbers
        System.out.println("Please enter three numbers");
        // create an array
        int[] numberList = new int[3];
        //store the numbers given
        for(int i = 0; i < numberList.length; i++){
             numberList[i] = input.nextInt();
        }
        //multiply the numbers
        int numProduct=numberList[0]*numberList[1]*numberList[2];
        //square the product
        double numPow=Math.pow(numProduct,2);
        //square root the product
        double numSqrt=Math.sqrt(numProduct);
        //display the product, squared product and the square rooted product
        System.out.println("the product is "+ numProduct);
        System.out.println("the squared product is "+ numPow);
        System.out.println("the square rooted product is "+ numSqrt);
    }
}
