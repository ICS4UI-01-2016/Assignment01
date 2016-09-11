
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuk4142
 */
public class Problem9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         //add a scanner for input
        Scanner input = new Scanner(System.in);
        
        //ask user to enter 10 words
        System.out.println("Enter a series of 10 words");
        String[] wordlist = new String[10];
        for(int i = 0; i<10; i++){
            wordlist[i] = input.nextLine();
        }
    }
}
