
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ajay
 */
public class problem6 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("Input a number between 100 - 50");
        int num = input.nextInt();
       int start = 100;
       
       while(num < start){
           System.out.println(start);
           start = (start - 5);
       }
        
    }
}
