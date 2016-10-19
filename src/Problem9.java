
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Nick Joudrey
 */
public class Problem9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        //create a scanner to gather inputs
        int totalchars = 0;
        //total character count
        String word[];
        word = new String[10];
        //created an array to store the 10 words
        System.out.println("Please input 10 words");
        for (int i = 0; i < 9; i++) {
            word[i] = in.nextLine();
        }
        //stored the 10 words using a for loop
        for (int i = 0; i < 9; i++) {
            totalchars = totalchars + word[i].length();
        }
        //use a for loop to calculate the total amount of characters
        System.out.println("The total of the characters in the ten words is " + totalchars);
        double avglength = totalchars/10.0;
        System.out.println("The average length of each word is " + avglength);
        //divid the total by 10 to get the average
    }

}
