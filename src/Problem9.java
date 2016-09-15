
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pawar5658
 */
public class Problem9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        String[] average = new String[10];
        int[] main = new int[10];
        int av = 0;
        while(av < 9){
            System.out.println("Please enter your words " + (av + 1));
            average[av] = input.nextLine();
            main[av] = average[av].length();
            av = av + 1;
        }
        av = 0;
        int total = 0;
        while (av < 9){
            total = total + main[av];
            av = av + 1;
        }
        System.out.println("Your average length is " + total/10);
            
        }
    }
