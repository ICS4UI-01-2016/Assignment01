
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author voigr4865
 */
public class Q9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //scanner 
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 10 words");
        double avs = 0;
        //for loop to count through the string array and to add length then devide by 10
        for (int i = 0; i < 10; i++) {
            String[] word = new String[10];
            word[i] = input.nextLine();
            avs = (avs + word[i].length());
        }
        System.out.println("the average length of all words is " + avs / 10);
    }
}
