
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pawar5658
 */
public class Problem7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        double pop = 6;
        int year = 1999;
        
        while(pop < 10){
            pop = pop*1.014;
            year = year+1;
        }
        System.out.println("In the year " + year + " the population will be " + pop + " billion.");
    }
}
