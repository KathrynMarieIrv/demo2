/**
 * Java Main.
 * 
 * @author KathrynIrving
 */

 import java.util.*;

public class Kill2 {

    public static String removal (String removeTwo) { 
        StringBuilder str = new StringBuilder(); //constructor

        

        for (int i =0; i < removeTwo.length(); i++) { //for loop to remove second character
           if(i != 1) {
            str.append(removeTwo.charAt(i));
           }
        }

        return str.toString(); //returns string
    }
    public static void main(String[] args) { //main

        if(args[0].length() < 2) { //argument stating error if less than 2 characters are entered
            System.out.println("Error: String needs at least two characters"); //Prints error
        }
        else {
            
            System.out.println(removal(args[0])); //prints string without second character
        }
    }

}