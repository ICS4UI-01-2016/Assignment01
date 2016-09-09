
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author guanv6321
 */
public class Problem6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 50 and 100 to stop at:");
        int num = input.nextInt();
        int count = 100;
        System.out.println("100");
        while(count-num>5){                 
            count = count - 5;
            System.out.println(count);
        }
        
    }
}
