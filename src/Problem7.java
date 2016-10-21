/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author moraj0721
 */
public class Problem7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //poplatio  is 6(million)
        double pop = 6;
        
        //year is 1999
        int year = 1999;
        
        //increase the population by 1.4 percent each year
        while(pop <= 10){
            pop = pop * 1.014;
            year = year + 1;
        }
        
        //output the year when the population reaches over 10(million
        System.out.println(year);
    }
}
