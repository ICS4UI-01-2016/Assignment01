
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pawar5658
 */
public class Problem6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please input a number between 100 and 50.");
        int num = input.nextInt();
        int start = 100;
        
        while(num < start){
            System.out.println(start);
            start = (start -5);
        }
    }
}
