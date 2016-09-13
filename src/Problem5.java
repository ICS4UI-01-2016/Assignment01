
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuk4142
 */
public class Problem5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         //add a scanner for input
        Scanner input = new Scanner(System.in);
        
        //print to screen and ask user to input a number between 1 and 10
        System.out.println("Input a number between 1 and 10");
        
        //save inputed number in a variable
        int num = input.nextInt();
        
        //for loop to repeat the asterisks lines in multiple columns equal to the number inputed
        for(int y = 0; y < num; y ++){
        //for loop to continuously print asterisks on the same line until the number of asterisks
        for(int i = 0; i < num; i ++){
          //print out 1 askterisks
        System.out.print("*");
        }
          //create new line(so "BUILD SUCCESSFUL" is not on the same line as the asterisks' - makes it look more neat)
        System.out.println(" ");
    }
        
    }
}
