
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hadik9595
 */
public class Question10 {
    public static void main(String[] args) {
        //Recognizes 
        Scanner input = new Scanner(System.in);
        int n = 0;
        System.out.println("Go! type away!");
        
        while(true){
            String word = input.nextLine();
            n++;
            
            if(word.equals("exit")){
                int totalCount = n - 1;
                System.out.println("The number of words you have entered is " + totalCount);
                break;
            }
        }
        
        
        
    }
}
