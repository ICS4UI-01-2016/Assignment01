
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author malcr1272
 */
public class Problem6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //to get user input
        Scanner input = new Scanner(System.in);

        //ask user when to stop
        System.out.println("Enter a number between 50 and 100 to stop at");
        double stop = input.nextDouble();

        //make number start at 100
        int number = 100;

        //subtract from number until you need to stop
        while (number > stop) {
            System.out.println(number);
            number = (number - 5);
        }
    }
}
