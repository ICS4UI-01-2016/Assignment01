
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kevin Yu
 */
public class Problem10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         //add a scanner for input
        Scanner input = new Scanner(System.in);
        
        //create a boolean for the user typing exit that will stop the code when put to true
        boolean exit = false;
        
        //create variable to keep track of words entered
        int count = 0;
        
        //create variable to store word inputed by user, to check for "exit"
        String word;
        //while exit boolean is false, keep looping
        while(exit == false){
            //ask the user to input words
        System.out.println("Input any number of words you'd like(type exit to finish)");
        //input line to enable user to enter word
        word = input.nextLine();
        
        //if the inputed word equals "exit", break the while loop
        if(word.equals("exit")){
            break;
        }
        
        //increase count variable by 1 every time a word is entered
        count++;
        
        
        }
        
        //print to screen the total number of words the user inputed
        System.out.println("You inputed a total of " + count + " words");
    }
    
}
