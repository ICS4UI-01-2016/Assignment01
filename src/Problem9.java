
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Josh
 */
public class Problem9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] words = new String[10];
        Scanner in = new Scanner(System.in);
        System.out.println("Input 10 words:");
        for(int i=0; i<10; i++){
            words[i] = in.nextLine();
        }
        double wordsum = 0;
        for(int i=0; i<10; i++){
            wordsum = wordsum + words[i].length();
        }
        System.out.print("The average length of the words is ");
        System.out.println(wordsum/10);
    }
    
}
