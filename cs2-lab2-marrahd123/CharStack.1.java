public class CharStack
{
  private final int MAX_CAP = 100;
  private int top; //location of top item on the stack
  private char [] s; //The stack

  public CharStack(){
    //PRE: none
    //POS: stack is empty with default capacity 
    //TAS: Create an empty stack with a default capacity
    s = new char[MAX_CAP];
    top = -1;
  }

  public void push(char element){
    //PRE: stack is not full
    //POS: item is added to top of stack and stack is one more element
    //TAS: Add a new item to the stack
    top ++;
    s[top] = element;
  }

  public char pop (){
    //PRE: top >= 0
    //POS: top<exit> = top<enter> -1
    //TAS: remove and return the item on the top of the stack
    char ret = s[top--];
    return ret;
  }

  public boolean isEmpty(){
    //PRE: none
    //POS: none
    //TAS: Return whether or not the stack is empty. HINT: look
    //     at the constructor.
    return (top == -1); //since top starts at 0, if -1, that means it is empty
  }

  public boolean isFull(){
    //PRE: none
    //POS: none 
    //TAS: return whether or not the stack is full
    return top == MAX_CAP-1;
  }
  
  public char peek(){
    //PRE: none
    //POS: none
    //TAS: return the object at the top of this stack
    return s[top];
  }
  
  public String toString(){
    //PRE:none
    //POS:none 
    //TAS: creates and returns all the characters on the stack left to right, starting at the top.
    
    String ret = " ";
    for (int i = top; i >=0; i--)
      ret = ret + s[i];
    return ret;
  }
  
  public int size(){
    return (top + 1);
  }
}
