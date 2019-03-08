public class StackTester {
  public static void main (String [] args) {
    LinkedStack<Character> ls = new LinkedStack<Character>();

    ls.push (new Character ('a'));
    ls.push (new Character ('b'));
    ls.push (new Character ('c'));
    System.out.println(ls);
    

    // try{
    //   ls.pop();
    //   ls.pop();
    //   ls.pop();
    //   ls.pop();
    // }//try
    // catch (EmptyStackException e){
    //   if (ls.isEmpty()){
    //   System.out.println("Stack is empty");
    //   }//if
    // }//catch
    
    //System.out.println(ls.peek());
    Character alph = 'a';
    
    System.out.println(ls.contains(alph));
    System.out.println(ls.contains('f'));
  }//main
}//StackTester
