
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author joudn2217
 */
public class Problem3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        //create a scanner to get user inputs
        System.out.println("What was the price of food for prom?");
        int food = in.nextInt();
        System.out.println("What was the price of the DJ for prom?");
        int dj = in.nextInt();
        System.out.println("What was the price of the hall rental for prom?");
        int hall = in.nextInt();
        System.out.println("What was the price of the decorations for prom?");
        int decor = in.nextInt();
        System.out.println("What was the price of the wait staff for prom?");
        int staff = in.nextInt();
        System.out.println("What was the price of miscellaneous expenses for prom?");
        int misc = in.nextInt();
        //ask user for the expenses then input and save them
        int total = food + dj + hall + decor + staff + misc;
        System.out.println("The total cost is " + total);
        //total the expenses and output them
        double numtix = Math.ceil(total / 35);
        System.out.println("Therefore " + numtix + " need to be sold in order to break even");
        //calculate the number of tickets that need to be sold and output them
    }
}
