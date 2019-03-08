//Program 2
//Marrah Delmont

import java.util.*;
import java.io.*;

public class program2
{
   public static void main(String [] args) throws IOException 
   {
        LinkedQueue<String> queue = new LinkedQueue<String>();
        String word = "";
        String line = "";
        Scanner scan = new Scanner(new File("challenge.html"));
        char c;
        while (scan.hasNext()) 
        {
            boolean tag = false;
            line = scan.nextLine();
            for(int i =0; i<line.length(); i++)
            {
                c = line.charAt(i); 
                if (c == '<')
                {
                    tag = true;
                }//if
                else if(c == '>')
                {
                    tag = false;
                }//else if
                else
                {
                   if((c == '/') || (c == '=') || (c== '+') ||
                    (c == '.') || (c== '1') || (c=='2') || (c== '3') || (c== '4') ||(c== '5') ||
                    (c== '6') || (c== '7') || (c== '8') || (c== '9') || (c== '0') || (c == '!') ||
                    (c == ':') || (c == '#') || (c == '[') || (c== ']') || (c == '-')||
                    (c == ';') || (c == '&'))
                    {
                        queue.enqueue(word);//putting the word onto the queue
                        word = "";//resetting word to empty since we finished the word
                    }
                    else if((!tag) && (c != ' '))//if the line is not equal to a space 
                        word = word + c;//adding that character to the word
                    else if(c == ' ')//if we reached a space
                    {
                        if (word.length() != 0)
                        {
                            queue.enqueue(word);//putting the word onto the queue
                            word = "";//resetting word to empty since we finished the word
                        }
                    }//else inner
                }//else outer
            }//for
        }//while
        while(!queue.isEmpty())
        {
            System.out.println(queue.dequeue());
        }//while
    }//main
}//end class

