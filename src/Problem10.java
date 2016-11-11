
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
public class Problem10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //make a scanner
        Scanner in = new Scanner(System.in);
        //tell user to enter words
        //inform user that they will be counted untill "exit" is entered
        System.out.println("Enter words and they will be counted untill " + '"' + "exit" + '"' + " is entered.");
        //make a counter int
        int i = 1;//make 0 if you don't want to include exit
        //loop and count intill exit is entered
        while(!"exit".equals(in.next())){
            i++;
        }
        //tell user the number of words typed
        System.out.println("You typed " + i + " words.");
    }
    
}
