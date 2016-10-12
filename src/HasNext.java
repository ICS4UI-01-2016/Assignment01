
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hadik9595
 */
public class HasNext {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String text = "Hello. My Name is Lamont";
        Scanner input = new Scanner(text);
        while(input.hasNext()){
            String s = input.next();
            System.out.println(s);
        }
        
    }
}
