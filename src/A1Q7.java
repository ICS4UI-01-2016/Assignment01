/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author preej0747
 */
public class A1Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         //create variable that represents population
        double pop = 6;
        
        //create variable that represents year
        int year = 1999;
        
        //calculate when the population will reach 10 billion
        while(pop <= 10){
            pop = pop * 1.014;
            year = year + 1;
        }
       
        //tell user what the answer is
        System.out.println("The population will reach 10 billion in " + year);
    }
}
        
