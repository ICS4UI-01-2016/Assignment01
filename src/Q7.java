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
        // entering doubles that we need
        double pop = 6;
        double year = 1999;
        double high = 10;
        double amount = 1.014;
        // adding 1 year to the year
        while (pop < high){
            pop = pop * amount;
            year = year + 1;
        
    }
        //outputing the year
        System.out.println(year);
        
    }
}
