
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Josh
 */
public class Problem5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //make a scanner
        Scanner in = new Scanner(System.in);
        //ask user for number from 1-10
        System.out.println("Enter a number from 1-10.");
        //get int from user
        int num = in.nextInt();
        //only if from 1-10
        if(num>0 && num<11){
            //loop num number of times
            for(int i = 0; i < num; i++){
                //make a line of * length of num
                for(int ii = 0; ii < num; ii++){
                    //print * on same line
                    System.out.print("*");
                }
                //start new line
                System.out.println("");
            }
        }else{
            //tell user what went wrong
            System.out.print("input error: number not from 1-10.");
            //move to next line to move BUILD SUCCESSFUL
            System.out.println("");
        }
    }
    
}
