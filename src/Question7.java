
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
        //the initial year of when it is 6 billion 
       int initialYear = 1999;
       //the years 
       int year = 0;

        //While loop used 
        while(true){
        double test = Math.pow(1.014, year);
        double answer = test * 6;

            //once it hits 10 billion 
            if(answer > 10){
                System.out.println("It takes about " + year + " years, meaning it would be " + (year+initialYear));
                break;
                
            }
            //adds an additional year
            year++;
        }
        
    }
}
