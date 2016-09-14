
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author malcr1272
 */
public class Practice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //define variables
int number =5;
char letter = 'a';
boolean LightSwitch = true;

//to get user input
Scanner input = new Scanner(System.in);

//ask user for input
System.out.println("Please enter your name");
String name = input.nextLine();

//say hello to the user
System.out.println("Hello " + name);

//make an array of names
String[] namelist = new String[5];

//loop through the array
for(int i=0; i < namelist.length; i++){
    System.out.println("please enter name " + (i+1));
    namelist[i] = input.nextLine();
}

//say hello to everyone
for(int i = 0; i <namelist.length; i++){
    System.out.println("hello " + namelist[i]);
}

int num1 = 5; 
int num2 = -10;
double total = Math.PI;
System.out.println(total);
    }
}
