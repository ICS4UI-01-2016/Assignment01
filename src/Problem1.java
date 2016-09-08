
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author yuk4142
 */
public class Problem1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //add scanner for input
        Scanner input = new Scanner(System.in);

        //print and ask for a name
        System.out.println("What's your name?");

        //add string to hold inputed name
        String name = input.nextLine();

        //print and saw hello using the name
        System.out.println("Hello " + name);
    }
}
