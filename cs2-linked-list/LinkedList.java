import java.util.NoSuchElementException;
import java.util.Iterator;

public class LinkedList<T> implements Iterable<T>{
  private int count;
  private LinearNode<T> front, rear;

  /**
   * Creates an empty list.
   */
  public LinkedList(){
    count = 0;
    front = rear = null;
  }

  /**
   * Returns a reference to the first element in this list.
   *
   * @return  a reference to the first element in this list
   * @throws  EmptyCollectionException  if the list is empty
   */
  public T first() throws EmptyCollectionException{
    if (front == null){
      throw new EmptyCollectionException("list");
    }
    return front.getElement();
  }

  /**
   * Returns a reference to the last element in this list.
   *
   * @return  a reference to the last element in this list
   * @throws  EmptyCollectionException  if the list is empty
   */
  public T last() throws EmptyCollectionException{
    if (rear == null){
      throw new EmptyCollectionException("list");
    }
    return rear.getElement();
  }

  /**
   * Returns true if the specified element is found in this list and
   * false otherwise.
   *
   * @param targetElement              the element that is sought in the list
   * @return                           true if the element is found
   * @throws EmptyCollectionException  if the list is empty
   */
  public boolean contains(T target) throws EmptyCollectionException{
    if(isEmpty()){
      throw new EmptyCollectionException("list");
    }
    LinearNode<T> trav = front;
    while (trav != null){
      if (trav.getElement().equals(target)){
        return true;
      }
      trav = trav.getNext();
    }
    return false;
  }

  /**
   * Returns true if this list contains no elements.
   *
   * @return  true if this list contains no elements
   */
  public boolean isEmpty(){
    return (count == 0);
  }

  /**
   * Returns the number of elements in this list.
   *
   * @return  the integer representation of number of elements in this list
   */
  public int size(){
    return count;
  }

  /**
   * Returns a string representation of this list.
   *
   * @return  a string representation of this list
   */
  public String toString(){
    String result = "";
    LinearNode<T> trav = front;
    while (trav != null){
      result += trav.getElement();
      trav = trav.getNext();
    }
    return result;
  }

  /**
   * Adds the specified element to the front of this list.
   *
   * @param element  the element to be added to the front of the list
   */
  public void addToFront(T element){
    LinearNode<T> node = new LinearNode<T>(element);
    node.setNext(front);
    front = node;
    // modify rear when adding to an empty list
    if (isEmpty()){
      rear = node;
    }
    count++;
  }

  /**
   * Adds the specified element to the rear of this list.
   *
   * @param element  the element to be added to the list
   */
  public void addToRear(T element){
    LinearNode<T> node = new LinearNode<T>(element);
    // modify both front and rear when appending to an empty list
    if (isEmpty()){
      front = rear = node;
    }else{
      rear.setNext(node);
      rear = node;
    }
    count++;
  }

  /**
   * Adds the specified element after the specified target element.
   *
   * @param element  the element to be added after the target element
   * @param target   the target that the element is to be added after
   * @throws NoSuchElementException if the target is not found
   */
  public void addAfter(T target, T element) throws NoSuchElementException{
    if(isEmpty()){
      throw new NoSuchElementException();
    }
    // find target node
    LinearNode<T> trav = front;
    while(trav != null &&
          !trav.getElement().equals(target)){
      trav = trav.getNext();
    }
    if(trav == null){
      // target not found
      throw new NoSuchElementException();
    }else if(trav == rear){
      // add to rear -> update rear
      addToRear(element);
    }else{
      // target found
      LinearNode<T> node = new LinearNode<T>(element);
      node.setNext(trav.getNext()); // make new node point to node after target
      trav.setNext(node);           // make target point to new node
      count++;
    }
  }

  /**
   * Removes the first element in this list and returns a reference
   * to it.
   *
   * @return                           a reference to the first element of
   *                                   this list
   * @throws EmptyCollectionException  if an empty collection exception occurs
   */
  public T removeFirst() throws EmptyCollectionException
  //PRE: list is not empty
  //POS: first node is removed / list has one less node
  //TAS: remove first element and return it
  
  //if (count == 1)
  //{
  //  T result = head.getElement();
  //  head = null;
  //  tail = null;
  //  return result;
  //}
  //else {
  //  T result = head.getElement();
  //  head = head.getNext();
  //  count--;
  //  return result;
  // }
    
  }
  {
    T result = null;

    if(isEmpty()){
      throw new EmptyCollectionException("list");
    }

    result = front.getElement();
    front = front.getNext();
    count--;

    if(isEmpty()){
      // reset rear after removing the last node
      rear = null;
    }

    return result;
  }//end removeFirst()

  /**
   * Removes the last element in this list and returns a reference
   * to it.  Throws an EmptyListException if the list is empty.
   *
   * @return                           the last element in this list
   * @throws EmptyCollectionException  if an empty collection exception occurs
   */
  public T removeLast() throws EmptyCollectionException{
    T result = null;

    if(isEmpty()){
      throw new EmptyCollectionException("list");
    }
    if(count == 1){
      return removeFirst();
    }else{
      // find second to last node
      LinearNode<T> trav = front;
      while(trav.getNext() != rear){
        trav = trav.getNext();
      }
      result = rear.getElement();
      rear = trav;
      trav.setNext(null);
      count--;
    }
    return result;
  }

  /**
   * Removes the first instance of the specified element from this
   * list and returns a reference to it.
   *
   * @param targetElement              the element to be removed from the list
   * @return                           a reference to the removed element
   * @throws EmptyCollectionException  if an empty collection exception occurs
   * @throws NoSuchElementException    if the specified element is not found
  */
  public T remove (T element) throws EmptyCollectionException,
                                     NoSuchElementException{
    if(isEmpty()){
      throw new EmptyCollectionException("list");
    }

    // does it exist?
    if(!contains(element)){
      throw new NoSuchElementException();
    }

    // is it front node?
    if(front.getElement().equals(element)){
      // remove front node
      return removeFirst();
    }

    // it must be in the list after the front node
    // invariables:
    // 1. we will find the node
    // 2. it must be after the front node
    // current points the node to remove
    // previous points to the node before it
    LinearNode<T> previous = front;
    LinearNode<T> current = front.getNext();
    while(current != null &&
          !current.getElement().equals(element)){
      previous = current;
      current = current.getNext();
    }
    previous.setNext(current.getNext());
    // is it the last node?
    if(rear == current){
      // update rear when removing the last node
      rear = previous;
    }
    count--;
    return current.getElement();
  }

  public Iterator<T> iterator()
  {
    return new LinkedListIterator<T>(front, count);
  }
  
}
