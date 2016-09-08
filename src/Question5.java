
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
        
        System.out.println("Enter a number between 1-10 for asterisks");
        int number = input.nextInt();
        
        if(number <= 10 && number >= 1){
            for (int i = 0; i < number; i++) {
                if(i != 0){
                System.out.println("");
                }
             for (int j = 0; j < number; j++) {
                System.out.print("*"); 
                 
                }
               if(i == number -1  ){
                    System.out.println("");
        }
        }
    }else{
            System.out.println("Not within the range given!");
        }
}
}
