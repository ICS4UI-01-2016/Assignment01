
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pawar5658
 */
public class Problem10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        int total = 0;
        System.out.println("Please enter your words.");
        while(true){
            String word = input.nextLine();
            total = total + 1;
            
            if(word.equalsIgnoreCase("exit")){
                System.out.println("Your total number of words are " + (total-1));
                break;
            }
        }
    }
}
