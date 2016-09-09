
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author guanv6321
 */
public class Problem3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the cost of food:");
        int food = input.nextInt();
        System.out.println("Enter the cost of DJ:");
        int DJ = input.nextInt();
        System.out.println("Enter the cost of the hall rental:");
        int hall = input.nextInt();
        System.out.println("Enter the cost of decorations:");
        int dec = input.nextInt();
        System.out.println("Enter the cost of wait staff:");
        int wait = input.nextInt();
        System.out.println("Enter the cost of miscellaneous");
        int mis = input.nextInt();
        int total = (food + DJ + hall + dec + wait + mis);
        double ticket = Math.ceil(total/35);
        System.out.println("The number of tickets required to break even is " + ticket);
    }
}
