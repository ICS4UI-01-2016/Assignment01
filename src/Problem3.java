
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author moraj0721
 */
public class Problem3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //make a new scanner
        Scanner input = new Scanner(System.in);

        //enter the cost of food
        System.out.println("Please input the cost of food.");
        double food = input.nextDouble();

        //enter the cost of dj
        System.out.println("Please input the cost of dj.");
        double dj = input.nextDouble();

        //enter the cost of hall rental
        System.out.println("Please input the cost of the hall rental.");
        double hall = input.nextDouble();

        //enter the cost of decorations
        System.out.println("Please input the cost of decorations.");
        double decor = input.nextDouble();

        //enter the cost of wait staff
        System.out.println("Please input the cost of wait staff.");
        double staff = input.nextDouble();

        //enter the cost of any miscellaneous expenses
        System.out.println("Please input the cost of any miscellaneous expenses.");
        double misc = input.nextDouble();

        //get the total
        double total = food + dj + hall + decor + staff + misc;
        
        //calculate how many tickets they would need
        double numTickets = total/35;
        
        //tell the user the amount of ticket
        System.out.println("You would have to sell " + numTickets + " to break even.");
        
        
    }
}
