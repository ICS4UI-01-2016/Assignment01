
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author preej0747
 */
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //make scanner to collect user input
        Scanner input = new Scanner(System.in);
        
        //ask user how much tickets cost
        System.out.println("How much do tickets cost?");
        int tickets = input.nextInt();
        
        //ask user how much everything costs
        
        //food
        System.out.println("How much will the food cost?");
        int food = input.nextInt();
        
        //dj
        System.out.println("How much will the DJ cost?");
        int dj = input.nextInt();
        
        //hall rental
        System.out.println("How much will it cost to rent the hall?");
        int hall = input.nextInt();
        
        //decorations
        System.out.println("How much will all the decorations cost?");
        int decor = input.nextInt();
        
        //wait staff
        System.out.println("How much will the wait staff cost?");
        int waiters = input.nextInt();
        
        //miscellaneous expenses
        System.out.println("How much will any micsellaneous expenses cost?");
        int misc = input.nextInt();
        
        //calculate the totals
        int total = (food + dj + hall + decor + waiters + misc);
        int ticketTotal = total / tickets;
        
        //tells user how many tickets they need to sell to break even
        System.out.println(ticketTotal + " ticket(s) need to be sold in order to break even");
                }
}
