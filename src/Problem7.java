/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author whitb0039
 */
public class Problem7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //create start double
        double start = 6;

        //create int i
        int i = 1;

        //while true
        while (true) {
            start = 6 * (Math.pow(1.014, i)); //run the formula for the number of years
            
            if(start > 10){ //if the start is greater than 10 
                break; //break the loop
            }
            
            i = i + 1; //add 1 to i
        }

        //year int is 1999 + number of years it takes to get 10 billion
        int year = 1999 + i; 
        
        //output year
        System.out.println("in the year " + year + " the population will exceed 10 billion");
    }
}
