
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author guanv6321
 */
public class Problem7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int year = 1999;
        double pop = 6;
        while (true) {
            if (pop < 10) {
                pop = pop + pop * 0.014;
                year++;
            }
            if(pop > 10){
                System.out.println(year);
                break;
            }
        }
    }
}
