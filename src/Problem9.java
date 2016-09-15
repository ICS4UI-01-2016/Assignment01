
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
public class Problem9 {
    public static void main(String[] args) {
 Scanner input = new Scanner(System.in);
 String[] avrg = new String[10];
 int[] boss = new int[10];
 int av = 0;
 while(av < 9){
     System.out.println("Please enter your words " + (av + 1));   
     avrg[av] = input.nextLine();
     boss[av] = avrg[av].length();
     av = av + 1;
    }
 av = 0;
 int total = 0;
 while(av < 9){
     total = total + boss[av];
     av = av + 1;
             
 }
        System.out.println("your average length is " + total/10);
}
}