
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author whitb0039
 */
public class Problem5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create scanner
        Scanner in = new Scanner(System.in);

        //ask for number of asterisks
        System.out.println("Please input a number.");

        //input number of asterisks
        int numberAstrk = in.nextInt();

        //loop until i = number of asterisks
        for (int x = 0; x < numberAstrk; x++) {
            for (int i = 0; i < numberAstrk; i++) {
                System.out.print("*"); //print an asterisks
            }
            System.out.println(""); //print a space
        }
    }
}
