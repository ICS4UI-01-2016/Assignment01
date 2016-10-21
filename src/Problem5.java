
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author moraj0721
 */
public class Problem5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //make a new scanner
        Scanner input = new Scanner(System.in);
        
        //ask them for a number between 1 and 10
        System.out.println("Please enter a number between 1 and 10.");
        int request = input.nextInt();
        
        //how many lines they requested
        for(int i = 0; i < request; i++){
            
        //how many asterisks in each line
        for(int i2 = 0; i2 < request; i2++){
            System.out.print("*");
        }
        System.out.println("");
        
    }
}
}