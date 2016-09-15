
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
public class problem4 {
     public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
         System.out.println("Enter a number between 1-10 for asterisks ");
         int num = input.nextInt();
         
         
         if (num == 1){
             System.out.println("*");
         }
         
        if (num == 2){
             System.out.println("**");
         }
        if (num == 3){
             System.out.println("***");
         }
        if (num == 4){
             System.out.println("****");
         }
        if (num == 5){
             System.out.println("*****");
         }
        if (num == 6){
             System.out.println("******");
         }
        if (num == 7){
             System.out.println("*******");
         }
        if (num == 8){
             System.out.println("********");
         }
         if (num == 9){
             System.out.println("*********");
         }
         if (num == 10){
             System.out.println("**********");
         }
         
         }
        
}

