
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ajay
 */
public class problem10 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
      int total = 0;
      System.out.println("Please enter your words");
      while(true){
        String word = input.nextLine();
         total = total+1;
 
        if(word.equalsIgnoreCase("exit")){
            System.out.println("your total number of words are " + (total-1));
            break;
        }
        
        
    }
   
}
}