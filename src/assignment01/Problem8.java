/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment01;

/**
 *
 * @author fostp4040
 */
public class Problem8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double interest1= 0.025;
        double intial1=1000;
        double interest2= 0.025;
        double intial2=1000;
        int year1=1;
        int year2=1;
        double newAmount1=intial1;
        double newAmount2=intial2;
        while(newAmount1<intial1*2){
            newAmount1=(1+interest1)*newAmount1;
            year1=year1+1;
            if(newAmount1==intial1*2){
                break;
            }
        }
        while(newAmount2<1000000){
            newAmount2=(1+interest2)*newAmount2;
            year2=year2+1;
            if(newAmount2==1000000){
                break;
            }
        }
        System.out.println("the money will double in "+year1+" years");
        System.out.println("the money will reach 1 million in "+year2+" years");
    }
}
