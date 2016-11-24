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
public class Problem9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        String[] wordList = new String[10];
        int wordTotal=0;
        for(int i = 0; i < 10; i++){
            wordList[i]=input.nextLine();
            System.out.println(wordList[i].length());
            wordTotal=wordTotal+wordList[i].length();
            System.out.println(wordTotal);
            if(i==10){
                break;
                
            }
        }
        int wordAverage=wordTotal/10;
        System.out.println(wordAverage);
    }
}
