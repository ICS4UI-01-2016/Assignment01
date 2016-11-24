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
public class Problem5 {

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
            //display 1 line of 1 '*' if number is 1
            System.out.println("*");
        }else if(number==2){
            //display 2 lines of 2 '*' if number is 2
            System.out.println("**");
            System.out.println("**");
        }else if(number==3){
            //display 3 lines of 3 '*' if number is 3
            System.out.println("***");
            System.out.println("***");
            System.out.println("***");
        }else if(number==4){
            //display 4 lines of 4 '*' if number is 4
            System.out.println("****");
            System.out.println("****");
            System.out.println("****");
            System.out.println("****");
        }else if(number==5){
            //display 5 lines of 5 '*' if number is 5
            System.out.println("*****");
            System.out.println("*****");
            System.out.println("*****");
            System.out.println("*****");
            System.out.println("*****");
        }else if(number==6){
            //display 6 lines of 6 '*' if number is 6
            System.out.println("******");
            System.out.println("******");
            System.out.println("******");
            System.out.println("******");
            System.out.println("******");
            System.out.println("******");
        }else if(number==7){
            //display 7 lines of 7 '*' if number is 7
            System.out.println("*******");
            System.out.println("*******");
            System.out.println("*******");
            System.out.println("*******");
            System.out.println("*******");
            System.out.println("*******");
            System.out.println("*******");
        }else if(number==8){
            //display 8 lines of 8 '*' if number is 8
            System.out.println("********");
            System.out.println("********");
            System.out.println("********");
            System.out.println("********");
            System.out.println("********");
            System.out.println("********");
            System.out.println("********");
            System.out.println("********");
        }else if(number==9){
            //display 9 lines of 9 '*' if number is 9
            System.out.println("*********");
            System.out.println("*********");
            System.out.println("*********");
            System.out.println("*********");
            System.out.println("*********");
            System.out.println("*********");
            System.out.println("*********");
            System.out.println("*********");
            System.out.println("*********");
        }else if(number==10){
            //display 10 lines of 10 '*' if number is 10
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
