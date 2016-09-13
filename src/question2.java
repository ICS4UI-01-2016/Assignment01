
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lalim9800
 */
public class question2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // TODO code application logic here
        //create new array
    int[] numbers;
    //store 3 numbers in array 
    numbers= new int[3];
    //new scanner 
    Scanner input = new Scanner(System.in);
    //ask user for 3 numbers 
    System.out.println("please enter 3 numbers");
    //allow user to enter 1st number 
    numbers[0]= input.nextInt();
   // allow user to enter 2nd number
    numbers[1]=input.nextInt();
    //allow user to enter 3rd number
    numbers[2]=input.nextInt();
    //mutiply all the users numbers to obtain the product 
    int answer=(numbers[0]*numbers[1]*numbers[2]);
    //square root the product 
    double root= Math.sqrt(answer);
    //calculate product to the power of 2 
    double exp= Math.pow(answer, 2);
        //tell user thier product 
        System.out.println("the product of your number is "+ answer);
        //tell user the root of their prodcut 
        System.out.println("The root of youur product is "+ root);
        //tell user their product to the power of 2 
        System.out.println("Your product to the power of 2 is " + exp);
        
    
    
        
        
    
    
    }
    
    
}
