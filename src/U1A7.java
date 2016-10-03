
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author coulh9904
 */
public class U1A7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double WorldPop = 6;
        int Year = 1999;
        System.out.println("");
        while(WorldPop < 10){
            WorldPop = WorldPop * 1.014;
            Year = Year + 1;
        }
        System.out.println("The population will reach 10 billion in " + Year);
    }
}
