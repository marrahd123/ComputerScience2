//Lab 5 
//Marrah Delmont

import java.util.*;
import java.io.*;

public class Lab5{
    public static void main(String [] args){
        try{
            Scanner scan = new Scanner(new File("simple.html"));
            String line = "";
            while (scan.hasNext())  //while there are more lines to read
            {
                line = scan.nextLine();   //read one in
                System.out.println(line); //and print it back out
            }//while
        }//try
        catch (FileNotFoundException e){
            System.out.println("No file");//File is not found
        }//catch
    }//main
}//class