
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

public class Question {
    
    public static void main(String[] args) {
        //Reads user input
        Scanner input = new Scanner(System.in);
        
        //asks for name and stores it
        System.out.println("What is your name?");
        String name = input.nextLine();
        
        //responds (output)
        System.out.println("Hello, " + name +"!");
        
        
        
    }
}
