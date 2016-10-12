
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author moore3607
 */
public class A1Q10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int q = 0;
        int s = 1;
        String words = "";
        while(true){
            System.out.println("Please enter word #" + (q + 1));
            words = input.nextLine();
            if(words.equals("exit")){
                System.out.println("You typed " + (q + 1) + " words.");
                break;  
            }
            q = q + 1;
            s = s + 1;
           
        }
    }
}
