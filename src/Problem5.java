
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
public class Problem5 {
     public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
         System.out.println("Enter a number between 1-10 for asterisks ");
         int box = input.nextInt();
         
         if (box == 1){
             System.out.println("*");
         }
         
        if (box == 2){
             System.out.println("**");
             System.out.println("**");
         }
        if (box == 3){
             System.out.println("***");
             System.out.println("***");
             System.out.println("***");
         }
        if (box == 4){
             System.out.println("****");
             System.out.println("****");
             System.out.println("****");
             System.out.println("****");
             
         }
        if (box == 5){
             System.out.println("*****");
             System.out.println("*****");
             System.out.println("*****");
             System.out.println("*****");
             System.out.println("*****");
         }
        if (box == 6){
             System.out.println("******");
             System.out.println("******");
             System.out.println("******");
             System.out.println("******");
             System.out.println("******");
             System.out.println("******");
         }
        if (box == 7){
             System.out.println("*******");
             System.out.println("*******");
             System.out.println("*******");
             System.out.println("*******");
             System.out.println("*******");
             System.out.println("*******");
             System.out.println("*******");
         }
        if (box == 8){
             System.out.println("********");
             System.out.println("********");
             System.out.println("********");
             System.out.println("********");
             System.out.println("********");
             System.out.println("********");
             System.out.println("********");
         }
         if (box == 9){
             System.out.println("*********");
             System.out.println("*********");
             System.out.println("*********");
             System.out.println("*********");
             System.out.println("*********");
             System.out.println("*********");
             System.out.println("*********");
             System.out.println("*********");
             System.out.println("*********");
         }
         if (box == 10){
             System.out.println("**********");
             System.out.println("**********");
             System.out.println("**********");
             System.out.println("**********");
             System.out.println("**********");
             System.out.println("**********");
             System.out.println("**********");
             System.out.println("**********");
             System.out.println("**********");
             System.out.println("**********");
         }
}
}