
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ajay
 */
public class problem3 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input  = new Scanner(System.in);
        System.out.println("Please enter the costs of the food, DJ, hall rental, decorations, wait staff and miscellaneous exepnse");
        //input the cost for everything
        int one = input.nextInt();
        int two = input.nextInt();
        int three = input.nextInt();
        int four = input.nextInt();
        int five = input.nextInt();
        int six = input.nextInt();
        //adds all of the costs
        double sum = one+two+three+four+five+six;
        System.out.println("you total is " + sum + " and it wil take " + Math.ceil(sum/35) + " tickets to break even");
        
    }
}
