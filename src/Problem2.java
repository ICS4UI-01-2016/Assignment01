
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
public class Problem2 {
     public static void main(String[] args) {
        // TODO code application logic here
        Scanner input  = new Scanner(System.in);
        int[] Num = new int[3];
        System.out.println("Please enter your numbers ");
        Num[0] = input.nextInt();
        Num[1] = input.nextInt();
        Num[2] = input.nextInt();
        double total = Num[0]*Num[1]*Num[2];
         System.out.println("your multiplied total is " + total);
        double total2 = Math.sqrt(total);
         System.out.println("your number square rooted is " + total2);
         double total3 = Math.pow(total, 2);
         System.out.println("your number squared is " + total3);
         
         
}
}