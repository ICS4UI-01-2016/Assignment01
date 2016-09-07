
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
public class Question7 {
    public static void main(String[] args) {    
       int initialYear = 1999;
       int n = 0;

        //While looping forever 
        while(true){
        double test = Math.pow(1.014, n);
        double answer = test * 6;
        n++;
            //once it hits 10 billion 
            if(answer > 10){
                System.out.println("It takes about " + n + " years, meaning it would be " + (n+initialYear));
                break;
                
            }
        }
        
    }
}
