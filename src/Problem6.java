
import java.util.Scanner;

/*
 * create a program that will count down from 100 by 5 and 
 * stop before a number that a user inputed between 50-100
 */

/**
 *
 * @author Jon
 */
public class Problem6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // to get user input
        Scanner input = new Scanner(System.in);
        
        // ask the user for the number and store this number in a variable
        System.out.print("Enter a number between 50 and 100 to stop at: ");
        int number = input.nextInt();
        
        // create a variable that will represent the count down
        int count = 100;
        
        // create a variable top represent when the count down should stop
        boolean countDown = true;
        
        // create a loop that will count down as long as the number is between
        // 50-100 and it should continue to countdown
        while(countDown == true && number >= 50 && number <= 100){
            // if the number is still below the count it should then print out 
            // the countdown
            if(count > number){
                System.out.println(count);
            // if the number is now larger than the count it should stop
            }else if (count < number){
                countDown = false;
            // if the number is now equal to the count than it should print the
            // count and the loop should end
            }else{
                System.out.println(count);
                countDown = false;
            }
            // count down by 5
            count = count - 5;
        }
    }
    
}
