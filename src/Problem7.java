
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
public class Problem7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("The world population in 1999 is 6 billion");
        int year = 1999;
        double pop = 6;
        for(int i=0; pop<10;i++){
            pop = pop * 1.014;
            if(pop>10){
                year = year+i;
            }
        }
        System.out.println("In the year " + year + " the population will be over 10 billion");
    }
    
}
