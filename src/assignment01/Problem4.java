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
public class Problem4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        //ask the user to enter an number between 1 and 10
        System.out.println("Please enter a number between 1 and 10");
        int number=input.nextInt();
        if(number==1){
            System.out.println("*");
        }else if(number==2){
            System.out.println("**");
        }else if(number==3){
            System.out.println("***");
        }else if(number==4){
            System.out.println("****");
        }else if(number==5){
            System.out.println("*****");
        }else if(number==6){
            System.out.println("******");
        }else if(number==7){
            System.out.println("*******");
        }else if(number==8){
            System.out.println("********");
        }else if(number==9){
            System.out.println("*********");
        }else if(number==10){
            System.out.println("**********");
        }
    }
}
