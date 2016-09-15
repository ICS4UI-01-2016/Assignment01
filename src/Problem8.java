
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pawar5658
 */
public class Problem8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter the initial amount.");
        double investment = input.nextDouble();
        System.out.println("Please enter the rate in a decimal.");
        double rate = input.nextDouble();
        int year = 0;
        int year2 = 0;
        double goal = investment*2;
        while(investment < goal){
            investment = (1+rate)*investment;
            year = year+1;
        }
        System.out.println("in " + year + "year you will have " + investment + "dollars, which is double your investment.");
        while(investment < 1000000){
            investment = (1+rate)*investment;
            year2 = year2 + 1;
        }
        System.out.println("in " + year2 + "years, your investment will reach " + investment + "dollars.");
        }
}
