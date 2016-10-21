
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author moraj0721
 */
public class Problem9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //make a new scanner
        Scanner input = new Scanner(System.in);
        
        //ask for the 10 words
        System.out.println("Please input 10 words.");
        
        //make array to store the words
        String words[] = new String[10];
        
        
        //ask the user for each word
        for(int i = 0; i < words.length; i++){
            System.out.println("Enter word " + (i + 1) );
            words[i] = input.nextLine();
            
        }
        
        //create the averages
        double average = 0;
        double average2 = 0;
        
        //get the length of each words and store it
        for(int i = 0; i < 10; i++){
            average = (average + words[i].length());
        }
        
        //take all the characters and divide by 10
        average2 = average / 10;
        
        System.out.println("The average length of the words is " + average2);
    }
}
