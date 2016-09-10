
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author munta
 */
public class question10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //new scanner 
        Scanner input = new Scanner(System.in);
        //create new initeger for counter
        int wordcount = 0;
        //ask user to enter words
        System.out.println("please enter as many words as you like");
        //while true allow user to enter words, untill the word "exit" is entered 
        while (true) {
            //allow user to enter words 
            String word = input.nextLine();
            //if the user enters exit then break the program
            if (word.equals("exit")) {
                break;
            }
            //add one to the word counter each time to keep track of how many words the user has entered 
            wordcount = wordcount + 1;
        }

        System.out.println(" you have typed " + wordcount + " words !!!!!!!!!!!");

    }
}
