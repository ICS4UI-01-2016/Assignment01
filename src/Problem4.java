
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author guanv6321
 */
public class Problem4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);       
        System.out.println("Enter a number between 1 and 10: ");
        int num = input.nextInt();
        for(int i = 0; i < num; i++){
            System.out.print("*");
        }
        System.out.println("");
    }
}
