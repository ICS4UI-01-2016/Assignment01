
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
public class Problem7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double pop = 6;
        int year = 1999;
        
        while(pop < 10){
            pop = pop*1.014;
            year = year+1;
            System.out.println("In the year " + year + "the populaion will be " + pop + "billion");
        }
        
}
}
