
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
        
        Scanner input = new Scanner(System.in);
        
        
        int[] numList = new int [3];
        
        for(int i = 0; i < numList.length; i++){
            System.out.println("Input a number");
            numList[i] = input.nextInt();
           
    }
        double numProduct = numList[0] * numList[1] * numList[2];
        double numSqrt = Math.sqrt(numProduct);
        System.out.println("The product of the numbers is " + numProduct);
        System.out.println("The square root of the product of the numbers is  " + numSqrt);
    }
}
