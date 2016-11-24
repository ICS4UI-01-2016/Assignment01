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
public class Problem10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        String word=input.nextLine();
        int wordCount=0;
        for(int i = 0; i <word.length(); i++){
            word=input.nextLine();
            wordCount++;
            if(word.equals("exit")){
                System.out.println("you have typed "+ wordCount +" words");
                break;
            }
        }
    }
}
