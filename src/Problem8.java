
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
public class Problem8 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.println("Please enter the initial amount ");
        double inv = input.nextDouble();
        System.out.println("Please enter the the rate in a decimal");
        double rate = input.nextDouble();
        int year = 0;
        int year2 = 0;
        double goal = inv*2;
        while(inv < goal){
            inv = (1+rate)*inv;
            year = year+1;
        }
        System.out.println("in " + year +" years you will have " + inv + " dollars, which is double your investment");
        while(inv < 1000000){
            inv = (1+rate)*inv;
            year2 = year2 + 1;
        }
    System.out.println("in " + year2 + "years, your investment will reach " + inv + " dollars");
}
}