
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kulla6503
 */
public class Problem7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Create a new Scanner to read in values
        Scanner input = new Scanner(System.in);
        
        // Create a variable to store the year
        int year = 1999; 
        
        // Create a varaible to store the population 
        double population = 6; 
        
        // Create a while loop to continously increase the years with respect to population 
        while(true){
            
            // Create a statement to calculate the rate
            if(population<10) {
            population = (population + population * 0.014);
            
            // Used to add the years as population grows 
            year = year + 1;  
            }
            
            // Create a statement to prevent population from exceeding 10 
            if(population>10) {
                
            // Output our sentence to the user letting them know what they entered
            System.out.println("In " + year + " the population will be 10 Billion");
            break;     
            }
               
        } 
       
         
       
        
}
} 
