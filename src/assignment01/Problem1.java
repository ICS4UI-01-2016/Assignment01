/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment01;

import java.util.Scanner;

/**
 *
 * @author fostp4040
 */
public class Problem1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        // ask the user for their name
        System.out.println("Please enter your Name");
        //get the user's name
        String name = input.nextLine();
        //display the user's name
        System.out.println("Hello "+ name);
    }
}
