
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hadida
 */
public class Question9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = new String[10];
        int total = 0;
 
        System.out.println("Please enter 10 words");
        for (int i = 0; i < 10; i++) {
            String word = input.nextLine();
            words[i] = word;    
        }
        
        
        for (int i = 0; i < 10; i++) {
            String first = words[i];
            int count = first.length();
            total = count + total;   
        }
        //prints ou
        System.out.println(total);
        
        
    }
}
