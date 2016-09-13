
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuk4142
 */
public class Problem7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         
        
        //create a new variable to store the year(starting at 1999)
        int year = 1999;
        

        //create the new variable to store the population(starting at 6) in billions
        double population = 6;
        
        //while loop to state that as long as the population does not exceed 10
        while(population<10){
            //increase the population by 14%(multiply by 1.014)
            population = population * 1.014;
            //and add +1 to the year
            year = year + 1;
        }
        
        
        //when the while loop stops, print out the final year in which the population exceeds 10 billion
            System.out.println("The world population will exceed 10 billion in " + year);
    
}
}
