
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
public class Problem6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //make a Scanner
        Scanner in = new Scanner(System.in);
        //ask for a number from 50-100
        System.out.println("Enter a number from 50-100.");
        //get int from user
        int num = in.nextInt();
        //from 50-100 only
        if(num>49 && num < 101){
            for(int i = 100; i > num; i = i-5){
                System.out.println(i);
            }
        }else{
            //tell user what went wrong
            System.out.println("input error: number not from 50-100.");
        }
    }
    
}
