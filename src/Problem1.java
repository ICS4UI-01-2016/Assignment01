
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author agott2059
 */
public class Problem1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //add scanner
        Scanner input = new Scanner(System.in);
        //ask user for name
        System.out.println("What is your name?");
        //create string variable and store name in variable
        String name = input.nextLine();
        //output "hello" to user
        System.out.println("Hello " + name + "!");
    }
}
