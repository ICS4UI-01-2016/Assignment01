
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author voigr4865
 */
public class Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //scanner
        Scanner input = new Scanner(System.in);
        
        //asks the user to input a number between 50 and 100
        System.out.println("Please enter a number between 50 and 100 that you would like the count to stop at");
        int num = input.nextInt();
        int start = 100;

        //loop to count down until the number is reached 
        while (num < start){
            System.out.println(start);
            start = (start - 5);
        }
            






    
}
}
