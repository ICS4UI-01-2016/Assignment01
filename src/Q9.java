
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author snowc4636
 */
public class Q9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner (System.in);
        
        System.out.println("Please enter 10 words of your choice ");
        
        
        
        double av = 0;
        
        for(int i = 0; i < 10; i++){
            String[] word = new String[10];
            word[i] = input.nextLine();
             av = (av + word[i].length());
        }

        System.out.println("Average length of the words is " + av / 10 + " characters");
    }
}
