
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author moore3607
 */
public class A1Q9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        int total = 0;
        int[] Ccount = new int[10];
        String[] words = new String[10]; 
        
        for(int i = 0; i <= 9; i++){
            System.out.println("Please enter word #" + (i + 1));
            words[i] = input.nextLine();
        }
        for(int w = 0; w <= 9; w++){
            Ccount[w] = words[w].length(); 
        }
        for(int q = 1; q <= 9; q = q+2){
             total = Ccount[q-1] + Ccount[q] + total;
        }
        System.out.println("The total amount of letters is " + total);
        double average = total/10;
        System.out.println("The average word length is " + average);
                                
    }
}
