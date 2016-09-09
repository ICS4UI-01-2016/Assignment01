
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author guanv6321
 */
public class Problem5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of asterisks");
        int num = input.nextInt();
        
        for (int i = 0; i < num; i++) {
            System.out.println("*");
            
        }
       
         
    }
}
