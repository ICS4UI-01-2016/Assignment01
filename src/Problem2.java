
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author agott2059
 */
public class Problem2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create scanner
        Scanner input = new Scanner(System.in);
        //create array with 3 elements
        int[] numbers = new int[3];
        //use for loop to get three numbers from user and fill array
        for (int i = 0; i < numbers.length; i++) {
            //request numbers in sequential order
            System.out.println("Enter number " + (i + 1));
            //store number in array
            numbers[i] = input.nextInt();
            //if array has been filled, exit for loop
            if (i == 2) {
                break;
            }
        }
        //multiply the three numbers together
        int finalNum = numbers[0] * numbers[1] * numbers[2];
        //output final number
        System.out.println("Final Number is: " + finalNum);

    }
}
