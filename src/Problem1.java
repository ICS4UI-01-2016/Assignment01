
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author joudn2217
 */
public class Problem1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner in = new Scanner(System.in);
        //Created scanner to input the persons name
        System.out.println("Please input your name:");
        //prompt user for their name
        String name = in.next();
        //store the name inputted
        System.out.println("Hello " + name + "!");
        //greet the user using their name
    }
}
