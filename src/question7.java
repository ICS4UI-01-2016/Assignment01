/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lalim9800
 */
public class question7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       double start=6;//crrate starting poluation amount
       double maximum=10;//create maximum population amount
       int i=1;//set new integer eqaul to 1 
      //while ture calculate the grouth of the poulation each year 
       while(true){
        start=6 *(Math.pow(1.014,i));
       
       
        //if the population exceeds the maxiumun (10) break loop;
        if(start>10){
            break;
            
           }
        //add one to the integer each time 
         i=i+1;
        }
       //increase year by one each time
        int year=1999+i;
        //tell user when the population will exceed 10 billion.
        System.out.println(" The population will exceed 10 billion in " +year);
       
}
}