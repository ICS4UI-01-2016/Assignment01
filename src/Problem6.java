
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
        
        System.out.print("Enter a number between 50 and 100 to stop at: ");
        int number = input.nextInt();
        int count = 100;
        
        while(number >= 50 && number <= 100){
            if(count > number){
                System.out.println(count);
            }else if (count < number){
                break;
            }else{
                System.out.println(count);
                break;
            }
            count = count - 5;
        }
    }
    
}
