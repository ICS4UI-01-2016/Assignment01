/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author moore3607
 */
public class A1Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double endpop = 10;
        int year = 1999;
        for(double currentpop = 6; currentpop <= endpop; ){
            currentpop = currentpop * 1.014;
            year++;
            if(currentpop >= endpop){
                System.out.println("The year that the population exceeds 10 billion will be " + year);
            }
        }
        
    }
}
