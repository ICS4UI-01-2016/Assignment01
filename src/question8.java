
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author munta
 */
public class question8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //new scanner
         Scanner input = new Scanner(System.in);
         //ask user to enter an initial amount
         System.out.println("please enter the initial amount");
         //allow user to enter a initial amount
         double startingamount=input.nextDouble();
         //ask user to enetr a intrest rate
         System.out.println("please enter a intrest rate");
         double rate=input.nextDouble();
         //put rate into to decimal number
         rate=rate/100;
         double doublemoney=startingamount*2;
         //set double at a max of a million dollars
         double mildollars=1000000;
         //set starting years at 0 
         double years=0;
         //set boolean to false 
         boolean donecalculating=false;
         //whule the amount is less than 1 million dollars,keep adding intrest
         while(startingamount< mildollars){
            startingamount=(startingamount* rate)+ startingamount;
            years=years+1;
            //if done calcualting is still false and the amount has exceeded double its value how long it takes to double 
            if(startingamount>=doublemoney&& donecalculating==false){
                //tell user doubling time 
                System.out.println("It will take " + years + " for the initial amount to double");
                //set done calculating to ture, to stop the loop of calculating intrest
                 donecalculating=true;
            }
            
          
                
            
         }
       
    
        System.out.println("it will take " +years+ " for the amount to hit 1 million $$");
}
}
