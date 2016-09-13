
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author agott2059
 */
public class Problem6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create scanner
        Scanner input = new Scanner(System.in);
        //request number from user
        System.out.println("Enter a number between 50 and 100 to count down to.");
        //store number as integer
        int selectedNumber = input.nextInt();
        //inform user program is counting down
        System.out.println("Counting Down...");
        //for loop to countdown while countdown is higher than the selected number
        for (int i = 100; i > selectedNumber; i = i) {
            //check if countdown is at beggining
            if (i == 100) {
                //output 100 as the first number automatically(countdown always begins at 100)
                System.out.println(i);
            }
            //if countdown is at number that is rounded up to the nearest 5, stop
            if (i > selectedNumber && i < (selectedNumber + 5)) {
                break;
            } else {
                //else, subract 5 from countdown
                i = i - 5;
                //output current countdown
                System.out.println(i);
            }
        }

    }
}
