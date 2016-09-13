
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author agott2059
 */
public class Review {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        /*
         System.out.println("Enter name: ");
         String name = input.nextLine();
         System.out.println("Hello " + name);
        
         String[] nameList = new String[5];
         //loop through array
         for (int i = 0; i < nameList.length; i++) {
         System.out.println("Enter name" + (i + 1));
         nameList[i] = input.nextLine();
            
         }
         for (int i = 0; i < nameList.length; i++) {
         System.out.println("Hello " + nameList[i]);
            
             
         }
         */

        int num1 = -5;
        int num2 = -10;
        double power = Math.pow(num1 * num2, 5);
        double sqRoot = Math.sqrt(num1);

        int count = 10;
        while (count > 0) {
            System.out.println(count);
            count--;
            if (count == 5) {
                System.out.println(count);
                break;
            }

        }
    }
}
