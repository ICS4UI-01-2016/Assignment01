
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author coulh9904
 */
public class U1A8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Input = new Scanner(System.in);
        System.out.println("Please enter your balance.");
        //Takes and saves the balance as "Balance"
        double Balance = Input.nextDouble();
        System.out.println("Please enter your interest rate in percent.");
        //Saves Interest rate as "r"
        double r = Input.nextInt();
        //Change r to a decimal (as opposed to a percent)
        r = r / 100;
        int Years = 0;
        //Creates control Balance... BalanceSave(BalanceS)
        double BalanceS = Balance;
        //Runs the interest formula until the Balance is 1 million dollars
        while (1000000 >= Balance) {
            Balance = (1 + r) * Balance;
            Years++;
        }
        //Resets the Balance to it's original number
        Balance = BalanceS;
        //New year value for part 2 here
        int Years2 = 0;
        //Runs the interest formula until the Balance is double what it was at the start, BalanceS is the control variable here
        while ((BalanceS * 2) >= Balance) {
            Balance = (1 + r) * Balance;
            Years2++;
        }
        //Output the results for user reference
        System.out.println("The you will have doubled your money in " + Years2 + " years.");
        System.out.println("The you will have one million dollars in " + Years + " years.");
    }
}
