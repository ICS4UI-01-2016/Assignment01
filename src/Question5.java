
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
public class Question5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a number between 50 and 100 to stop at:");
        int number = input.nextInt();
        int loop = (100 - number)/5;
        
        for (int i = 0; i < loop+1; i++) {
            System.out.println(100 - (i*5));
        }
    
    }
}
