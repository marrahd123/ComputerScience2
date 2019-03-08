import java.util.*;

public class CharStack
{
    
  private final int MAX_CAP = 100;//no expression can exceed 100 characters in size
  private int top; //location of top item on the stack
  private char [] s; //The stack

  public CharStack()
  {
    s = new char[MAX_CAP];
    top = -1;
  }

  public void push(char element)
  {
    top ++;
    s[top] = element;
  }

  public char pop ()
  {
    return s[top--];
  }
  
  public char peek(){
    //PRE: none
    //POS: none
    //TAS: return the object at the top of this stack
    return s[top];
  }
  
  public boolean isEmpty()
  {
    return (top == -1); //since top starts at 0, if -1, that means it is empty
  }

  public boolean isFull()
  {
    return top == MAX_CAP-1;
  }
  
  public String toString()
  {
    String ret = " ";
    for (int i = top; i >=0; i--)
      ret = ret + s[i];
    return ret;
  }
}//end class