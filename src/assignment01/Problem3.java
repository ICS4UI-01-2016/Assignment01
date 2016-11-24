/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment01;

import java.util.Scanner;

/**
 *
 * @author fostp4040
 */
public class Problem3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        //store cost for tickets
        int promTickets=35;
        //ask for Food cost
        System.out.println("Please enter the cost for the food");
        int promFood=input.nextInt();
        //ask for DJ cost
        System.out.println("Please enter the cost for the DJ");
        int promDJ=input.nextInt();
        //ask for Hall Rental cost
        System.out.println("Please enter the cost for the hall rental");
        int promHall=input.nextInt();
        //ask for Decor cost
        System.out.println("Please enter the cost for the Decor");
        int promDecor=input.nextInt();
        //ask for Wait Staff cost
        System.out.println("Please enter the cost for the wait staff");
        int promStaff=input.nextInt();
        //ask for Misc. expenses
        System.out.println("Please enter the cost for any miscellaneous expenses");
        int promMisc=input.nextInt();
        //add up and display total
        int promTotal=promFood+promDJ+promHall+promDecor+promStaff+promMisc;
        System.out.println("the cost for Prom is "+ promTotal);
        //calculate and display total tickets needed to be sold
        int promSell=promTotal/promTickets;
        System.out.println("you will need to sell "+ promSell+" tickets to break even");
    }
}
