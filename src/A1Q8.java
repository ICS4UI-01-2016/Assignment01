
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author preej0747
 */
public class A1Q8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create scanner to read user input
        Scanner input = new Scanner(System.in);
        
        //ask user what their initial balance is
        System.out.println("What is your accout balance?");
        double balance = input.nextInt();
        
        //ask user what their interest rate is
        System.out.println("What is the interest rate?");
        double ir = input.nextInt();
        
        //create variable that represents how long it takes for the balance to reach $1 000 000
        int mTime = 0;
        int million = 1000000;
        
        //calculate how long it takes for the balance to reach $1 000 000
        while(balance <= million){
        balance = (1 + ir) * balance;
        mTime = mTime + 1;
    }
        
        //tell user how many years it will take for the balance to reach a million
        System.out.println("It will take " + mTime + " year(s) for your balance to reach $1 000 000");
        
        //create variable that represents how long it will take for the balance to double
        int dTime = 0;
        double Double = balance * 2;
        
        //calculate how many years it will take for the balance to double
        while(balance <= Double){
            balance = (1 + ir) * balance;
            dTime = dTime + 1;
        }
            
        //tell user how many years it will take  for the balance to double
        System.out.println("It will take " + dTime + " year(s) for your balance to double"); 
    }
}
