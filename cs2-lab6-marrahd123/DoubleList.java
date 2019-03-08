import java.util.NoSuchElementException;
public class DoubleList<T>
{
  private DoubleNode<T> front, rear;
  private int count;

  //Creates an empty list using the default capacity.
  public DoubleList()
  {
    rear = null;
    front = null;
    count = 0;
  }//end DoubleList()
  
  public boolean isEmpty()
  {
    return (count == 0);
  }//end isEmpty()

  public int size()
  {
    return count;
  }
//reference to front of list:
  public T first() 
  {
    if (isEmpty())
    {
      throw new EmptyCollectionException("list");
    }
    return front.getElement();
  }//end first
  
//reference to end of list:
  public T last()
  {
    if (isEmpty())
    {
      throw new EmptyCollectionException("list");
    }
    return rear.getElement();
  }

  public boolean contains(T target)
  {
    boolean found = false;
    DoubleNode<T> trav = front;
    DoubleNode<T> result = null;

    while(!found && trav != null){
      if (target.equals(trav.getElement())){
        found = true;
      }else{
        trav = trav.getNext();
      }
    }
    return found;
  }//end contains

  public void addToFront(T element)
  {
    DoubleNode<T> node = new DoubleNode<T> (element);
    if (isEmpty())
      rear = node;
    else //Non-empty list
    {
      node.setNext (front);
      front.setPrevious (node);
    }//else
    front = node;
    count++;
  }//end addToFront

  public void addToRear(T element)
  {
    DoubleNode<T> node = new DoubleNode<T> (element);
      if (isEmpty())
        front = node;
      else //Non-empty list
      {
        rear.setNext(node);
        node.setPrevious(rear);
      }
    
      rear = node;
      count++;

  }//end addToRear
  
//Adds the specified element after the specified target element:
   public void addAfter(T target, T element)throws EmptyCollectionException, NoSuchElementException
   {
    if (!this.contains(target)) 
      throw new NoSuchElementException("list");
    if (this.isEmpty()) 
      throw new EmptyCollectionException("list");
    DoubleNode<T> insertNode = new DoubleNode(element);
    DoubleNode<T> current = front;
    while (!target.equals(current.getElement()))
       current = current.getNext();
    //ASSERT: current references the node containing target
    if (current == rear) {		 
        insertNode.setPrevious(rear);
        rear.setNext(insertNode);
        rear = rear.getNext();
    }//if
    else { //4. General Case
       insertNode.setPrevious(current);
       insertNode.setNext (current.getNext());
       current.getNext().setPrevious(insertNode);
       current.setNext(insertNode);
    }
    count++;
  }//addAfter


// Removes and returns the first element in this list.
  public T removeFirst() throws EmptyCollectionException
  {
    if (isEmpty())         
      throw new EmptyCollectionException("List");      
    DoubleNode<T> result = front;      
    front = front.getNext();  
    
    if (front == null)         
      rear = null;	  
    else	     
      front.setPrevious(null);     

    count--;      
    return result.getElement(); 
  }//removeFirst

// Removes and returns the last element in this list.
  public T removeLast() throws EmptyCollectionException
  {
    if (isEmpty())         
      throw new EmptyCollectionException("list");      

    DoubleNode<T> result = rear;      
    rear = rear.getPrevious();      

    if (rear == null)         
      front = null;	  
    else	     
      rear.setNext(null);       

    count--;      
    return result.getElement(); 
  }

  //Removes and returns the specified element.
  public T remove(T targetelement)throws EmptyCollectionException
  { 
    boolean found = false;
    DoubleNode<T> previous = null;
    DoubleNode<T> current = front;
      
    while (current != null && !found)
    {
      if (targetelement.equals (current.getElement()))
        found = true;
      else
      {
        previous = current;
        current = current.getNext();
      }//else
    }//while
      
    if (!found)
      throw new NoSuchElementException ("list");

	  if (size() == 1)
		  front = rear = null;
	  else if (current == front)
	  {
		  front = current.getNext();
		  front.setPrevious(null);
	  }//else if
	  else if (current == (rear))
	  {
		  rear = previous;
		  rear.setNext(null);
	  }// else if
	  else
	  {
		  previous.setNext(current.getNext());
		  current.getNext().setPrevious(previous);
	  }//else
	count--;

	return current.getElement();
	}// remove

//Returns a string representation of this list:
  public String toString()
  {
    String result = "";
    DoubleNode<T> trav = front;

    while(trav != null)
    {
       result += trav.getElement();
       trav = trav.getNext();
    }
    return result;
  }//end toString
}//end class
