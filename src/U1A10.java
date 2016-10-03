
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author coulh9904
 */
public class U1A10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Input = new Scanner(System.in);
        String S = "EXIT";
        int Track = 0;
        String[] WStore = new String[1];
        while (S.equals("EXIT")) {
            System.out.println("Please enter word " + (Track + 1) + " or 'EXIT' to end.");
            WStore[0] = Input.nextLine();
            if (S.equals(WStore[0])) {
                break;
            }
            Track++;
        }
        System.out.println("You have entered " + Track + " words.");
    }
}
