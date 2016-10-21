
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author moraj0721
 */
public class Problem10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //make a new scanner
        Scanner input = new Scanner(System.in);
        
        //number of wors
        int numb = 0;
        
        //string
        String word = new String();
        
        //ask to enter words
        System.out.println("Enter words until you are happy with the amount, then type 'exit' to check how many words you entered. " );
        
        //everytime they enter a new word add 1 to numb
        while(!word.equals("exit")){
            word = input.nextLine();
            numb++;
        }
        
        //print out the number of words they entered
        if(word.equals("exit")){
            numb = numb -1;
            System.out.println("You entered " + numb + " words." );
        }
    }
}
