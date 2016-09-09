
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author guanv6321
 */
public class Problem9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in); 
        int[] length = new int[10];
        for(int i = 0; i < 10; i++){
            System.out.println("Enter a word");    
            String word = input.nextLine();
            length[i] = word.length();
        }
        double avg = (length[0] + length[1] + length[2] + length[3] + length[4] + length[5] + length[6] + length[7] + length[8] + length[9])/10;
        System.out.println(avg);
    }
}
