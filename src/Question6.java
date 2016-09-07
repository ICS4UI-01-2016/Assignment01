
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
public class Question6 {
    public static void main(String[] args) {
        // y = a ( 1.014 ) ^ x 
        int worldPop = 6; 
        double test = Math.pow(1.014, 35);
        double answer = test * 6;
       
        System.out.println();
        
        //2034 is the year.. so 35 years
        System.out.println("The population will exceed 10 billion in " + answer);
        
        
    }
}
