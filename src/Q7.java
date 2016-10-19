/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author snowc4636
 */
public class Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double pop = 6;
        double year = 1999;
        double high = 10;
        double amount = 1.014;
        
        while (pop < high){
            pop = pop * amount;
            year = year + 1;
        
    }
        System.out.println(year);
        
    }
}
