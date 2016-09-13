
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author whitb0039
 */
public class Problem1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //inport scanner
        Scanner in = new Scanner(System.in);

        //ask user for name
        System.out.println("Please input your name");

        //name variable is next input
        String name = in.next();

        //output hello user
        System.out.println("Hello " + name + "!");
    }
}
