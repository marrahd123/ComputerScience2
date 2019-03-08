public class LinkedStack<T> implements StackADT<T> {
  private LinearNode<T> top;  //A reference to the top of the stack
  private int count;       //The number of items on the stack

  //Constructor
  public LinkedStack() {
    count = 0;
    top = null;
  }

  public T pop() throws EmptyStackException {
    //Removes and returns the top item on the stack
    if (isEmpty()){
      throw new EmptyStackException("stack");
    }
    T result = (T)top.getElement();
    top = top.getNext();
    count--;
      
    return result;
  }//pop

  public T peek() throws EmptyStackException {
    //Returns the first item in the list
    //currently not implemented
    if (isEmpty())
      throw new EmptyStackException("stack");
      
    T result = (T)top.getElement();
    return result;
  }

  public void push (T element) {
    //Add this data to the top of the stack
    LinearNode<T> temp = new LinearNode<T>(element);
    temp.setNext(top);     //Set next field to head references
    top = temp;            //Set head to reference the new node
    count++;
  }

  public boolean isEmpty() {
    //TASK: return true if 0 items on the stack; false otherwise
    return count == 0;
  }

  public String toString() {
    //Returns the list contents as a String
    LinearNode<T> trav = top;
    String cat = "";
    while (trav != null)
    {
      cat = cat + trav.getElement().toString();
      trav = trav.getNext();
    }
    return cat;
  }//toString
  
  public boolean contains(T element){
    
    LinearNode trav = top;
    while (trav != null){
      T current = (T) trav.getElement();
      if (current.equals(element))
        return true;
      trav = trav.getNext();
    }//while
    return false;
  }//contains
}
