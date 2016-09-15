
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pawar5658
 */
public class Problem3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        int[] Cost = new int[6];
        
        System.out.println("Please enter the cost of the food.");
        Cost[0] = input.nextInt();
        System.out.println("Please enter the cost of the DJ.");
        Cost[1] = input.nextInt();
        System.out.println("Please enter the cost for the rental hall.");
        Cost[2] = input.nextInt();
        System.out.println("Please enter the cost of the staff.");
        Cost[3] = input.nextInt();
        System.out.println("Please enter the cost of the decorations.");
        Cost[4] = input.nextInt();
        System.out.println("Please enter the cost of any miscallaneous expenses.");
        Cost[5] = input.nextInt();
        double total = Cost[0]+Cost[1]+Cost[2]+Cost[3]+Cost[4]+Cost[5];
        System.out.println("The total expenses of this prom will be " + total + ".");
        double tickets = total/35;
        System.out.println("The prom will need to sell " + Math.ceil(tickets) + "to break even.");
    }
}
