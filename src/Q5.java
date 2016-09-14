
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author voigr4865
 */
public class Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        //scanner 
        Scanner input = new Scanner(System.in);
        
        //ask user for a number between 1 and 10
        System.out.println("Please enter a number between 1 and 10");
        int as = input.nextInt();
        
        
        //for loop for all input numbers
        for(int i = 0; i < as; i++){
            if(as == 1){
            System.out.println("*");
        }
        if(as == 2){
            System.out.println("**");
        }
        if(as == 3){
            System.out.println("***");
        }
        if(as == 4){
            System.out.println("****");
        }
        if(as == 5){
            System.out.println("*****");
        }
        if(as == 6){
            System.out.println("******");
        }
        if(as == 7){
            System.out.println("******");
        }
        if(as == 8){
            System.out.println("********");
        }
        if(as == 9){
            System.out.println("*********");
        }
        if(as == 10){
            System.out.println("**********");
        }
            
            
            
        }
        
    }
}
