
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuk4142
 */
public class Problem6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //add a scanner for input
        Scanner input = new Scanner(System.in);
        
        //print to screen and ask user to input a number between 100 and 50
        System.out.print("Input a number between 100 and 50 to stop at:");
        
        //save inputed number in a variable
        int num = input.nextInt();
        
        //set a count variable at 100 to begin counting down
        int count = 100;
        
        System.out.println(count);
        //while the count - 5 is not smaller than the number input, keep looping
        while(count - 5>num){
            
            //subtract 5 from count each time
            count = count - 5;
            //print out the count number each time
            System.out.println(count);
        }
    }
}
