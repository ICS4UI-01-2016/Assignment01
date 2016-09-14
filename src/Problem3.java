
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
        // to get user input
        Scanner input = new Scanner(System.in);
        // user input for cost of food, DJ, hall rental, decorations, wait staff, miscellaneous
        System.out.println("Enter the cost of food:");
        // variable to store the numbers
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
        // calculating the total of all of the numbers entered
        int total = (food + DJ + hall + dec + wait + mis);
        // calculating how many tickets needed to break even
        double ticket = Math.ceil(total/35);
        // output the numer of tickets to screen
        System.out.println("The number of tickets required to break even is " + ticket);
    }
}
