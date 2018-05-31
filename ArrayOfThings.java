import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;


//Branden Hart 5/31/2018


public class ArrayOfNumbers {  // Class name
    public static void main(String[] args) { // class main

        System.out.println(convertToNum("Aaron")); //returns [65, 97, 114, 111, 110]
        System.out.println(convertToNum("Carl")); //returns [67, 97, 114, 108]
        System.out.println(convertToNum("Ted")); //returns [84, 101, 100]
        System.out.println(convertToNum("ooo")); //returns [111, 111, 111]
    }

    public static List<Integer> convertToNum(String str){
        List<Integer> asciiArr = new ArrayList<Integer>(); //Here I created a List to store my converted letters form the passed-in String

        int nameLength = str.length();//Declared and initialized an integer to store the length of the argument String

        for(int i = 0; i < nameLength; i++){ //for loop to iterate through the String argument
            char character = str.charAt(i);//Stores the letter at the current index to a 'char' object
            int ascii = (int)character; //Converts the current alphabet character to it's ASCII value
            asciiArr.add(ascii);//Adds the newly converted integer object to a List.

        }

        return asciiArr;

    }
}