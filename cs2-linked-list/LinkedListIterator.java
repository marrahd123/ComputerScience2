import java.util.NoSuchElementException;
import java.util.Iterator;

public class LinkedListIterator<T> implements Iterator<T>{
  private LinearNode<T> first;
  private int size;

  public LinkedListIterator(LinearNode<T> first, int size){
    this.first = first;
    this.size = size;
  }

  public boolean hasNext(){
    return (first != null);
  }

  public T next(){
    if (!hasNext()){
      throw new NoSuchElementException();
    }
    T result = first.getElement();
    first = first.getNext();
    return result;
  }

  public void remove(){
    throw new UnsupportedOperationException();
  }
}