/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment01;

import java.util.Scanner;

/**
 *
 * @author fostp4040
 */
public class Problem6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        //ask user for a number between 50 and 100
        System.out.println("Please enter a number between 50 and 100");
        int min = input.nextInt();
        int count = 100;
        //countdown from five
        System.out.println(count);
         while(count > min){
             count=count-5;
             System.out.println(count);
             //stop when count reaches min
             if(count == min||count-5<min){
                 break;
             }
         }
    }
}
