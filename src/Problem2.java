
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pawar5658
 */
public class Problem2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        int[] Num = new int[3];
        System.out.println("Please input any three numbers please.");
        Num[0] = input.nextInt();
        Num[1] = input.nextInt();
        Num[2] = input.nextInt();
        double total = Num[0]*Num[1]*Num[2];
        System.out.println("The product of these numbers is " + total);
        double total2 = Math.sqrt(total);
        System.out.println("The square root of these numbers is " + total2);
        double total3 = Math.pow(total, 2);
        System.out.println("The square of this number is " + total3);
        
            
        }
                
    }
