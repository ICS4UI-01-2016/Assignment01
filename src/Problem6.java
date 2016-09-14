
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author whitb0039
 */
public class Problem6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create scanner
        Scanner in = new Scanner(System.in);

        //ask for number of asterisks
        System.out.println("Please input a number between 50 and 100.");

        while (true) {

            //next input is number to count to
            int number = in.nextInt();

            if (number > 49 && number < 101) {

                //create the int count with value of 100
                int count = 100;

                //while the input number is less than the count
                while (number <= count) {
                    System.out.println(count); //output the count
                    count = count - 5; //count down 5 from the previous count
                }
                System.out.println("");
                break;
            }else{
                System.out.println("Please input a valid number");
            }
        }
    }
}
