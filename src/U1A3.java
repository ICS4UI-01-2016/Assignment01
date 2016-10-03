
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author coulh9904
 */
public class U1A3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Adds a Scanner entitled "Input"
        Scanner Input = new Scanner(System.in);
        //Asks user how many variables(costs) they with to enter.
        System.out.println("How many different costs do you wish to enter?");
        //Takes and saves the number of variables as "VNum"
        int VNum = Input.nextInt();
        //Creates an array that carries the number of variables the user has requested
        int[] NumList = new int[VNum];
        //This Counter will be used to operate the while loop that runs the user inputs
        int Counter = 1;
        //Here is said while loop - The counter will run through this loop until Counter is < VNum
        while (Counter <= VNum) {
            //Takes the user inputs for however many inputs the user requested(saved as VNum)
            System.out.println("Please enter cost " + Counter);
            //Stores user input in the Array using the Counter (Array starts at 0, Counter starts at 1.... Counter-1
            NumList[Counter - 1] = Input.nextInt();
            //Adds one to the Counter, so as to progress and stop the loop when the number of user requested inputs has been reached
            Counter = Counter + 1;
        }
        //Total will be the added sum of the inputs.
        int Total = 0;
        //Same function as previous counter, new name for posterity.
        int Counter2 = 1;
        //Same base operating idea as previous loop. 
        while (Counter2 <= VNum) {
            //Adds upp all the numbers stored in the array(NumList).
            Total = Total + NumList[Counter2 - 1];
            //Operates counter, so as to run through all user inputs
            Counter2 = Counter2 + 1;
        }
        //Outputs total cost for prom
        System.out.println("The total cost of the Prom is " + Total);
        //Figures out how many tickets are solt, and rounds UP for break even point
        double Tickets = Math.ceil(Total / 35.0);
        //Outputs the number of tickets required to break even for user reference.
        System.out.println("The total number of tickets that will need to be sold to break even are " + Tickets);
    }
}
