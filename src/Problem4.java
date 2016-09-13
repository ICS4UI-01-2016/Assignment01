
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author whitb0039
 */
public class Problem4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //create scanner
        Scanner in = new Scanner(System.in);

        //ask for number of asterisks
        System.out.println("Please input a number between 1 and 10.");


        while (true) {

            //input number of asterisks
            int numberAstrk = in.nextInt();

            if (numberAstrk > 0 && numberAstrk < 11) {

                //loop until i = number of asterisks
                for (int i = 0; i < numberAstrk; i++) {
                    System.out.print("*"); //print an asterisks
                }
                System.out.println("");
                break;
            } else {
                //ask for number of asterisks
                System.out.println("Please input a valid number.");
            }
        }
    }
}
