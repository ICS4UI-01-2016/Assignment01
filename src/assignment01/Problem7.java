/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment01;



/**
 *
 * @author fostp4040
 */
public class Problem7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double popmax=10;
        double pop=6;
        int popYear=1999;
        while(pop < popmax){
             pop=pop*1.014;
             popYear=popYear+1;
             //stop when count reaches min
             if(pop == popmax){
                 break;
             }
         } System.out.println("the population of earth will reach 10 billion at the year "+popYear);
    }
}
