import java.util.Scanner;

public class CharStackTester{
  public static void main(String[] args){
    CharStack stack = new CharStack();
    
  //Continue to test all other methods to make sure
  //they work as they should.
  
    //Test push and pop
    stack.push ('a'); //stack = a
    stack.push ('b'); //stack = ba
    stack.push ('c'); //stack = cba
    
    //Test pop, isEmpty, peek, and toString//
    System.out.println("Top: " + stack.peek());//PEEK
    System.out.println(stack.pop()); //shows c
    System.out.println(stack.isEmpty()); //Checks if empty
    System.out.println(stack.pop()); //shows b
    System.out.println(stack.isEmpty()); //Checks if empty
    System.out.println(stack.pop()); //shows a
    System.out.println(stack.isEmpty()); //Checks if empty
    System.out.println(stack.toString());//toString
    
    //Your next task, once you have demonstrated a tested and working stack, 
    //is to make your stack evaluate a parenthesized expression for correctness. In other words,
    //(A+B) is a properly parenthesized expression
    //((A+B)-(C*D)) is a properly parenthesized expression
    //((A+B) is not correct and A+B) is not correct.
    //You may assume single letter variable names.
    
    Scanner s = new Scanner(System.in);
    
    System.out.println ("Enter a mathematical expression with parenthesis:  ");
    String x = s.nextLine();
    boolean error = false;
    
    for(int i = 0; i< x.length(); i++){
      if (x.charAt(i) == '(')
        stack.push(x.charAt(i));
      else if(x.charAt(i) == ')'){
        if (!stack.isEmpty())
          stack.pop();
        else
          error = true;
      }//end else if
    }//end for
    
    if((stack.isEmpty()) && !(error))
      System.out.println("Proper parenthesis.");
    else if((!stack.isEmpty()))
      System.out.println("Improper - too many left ( parenthesis.");
    else if (error)
      System.out.println("Improper - too many right ) parenthesis.");
  }//end main
}//end CharStack
import java.util.Scanner;

public class CharStackTester{
  public static void main(String[] args){
    CharStack stack = new CharStack();
    
  //Continue to test all other methods to make sure
  //they work as they should.
  
    //Test push and pop
    stack.push ('a'); //stack = a
    stack.push ('b'); //stack = ba
    stack.push ('c'); //stack = cba
    
    //Test pop, isEmpty, peek, and toString//
    System.out.println("Top: " + stack.peek());//PEEK
    System.out.println(stack.pop()); //shows c
    System.out.println(stack.isEmpty()); //Checks if empty
    System.out.println(stack.pop()); //shows b
    System.out.println(stack.isEmpty()); //Checks if empty
    System.out.println(stack.pop()); //shows a
    System.out.println(stack.isEmpty()); //Checks if empty
    System.out.println(stack.toString());//toString
    
    //Your next task, once you have demonstrated a tested and working stack, 
    //is to make your stack evaluate a parenthesized expression for correctness. In other words,
    //(A+B) is a properly parenthesized expression
    //((A+B)-(C*D)) is a properly parenthesized expression
    //((A+B) is not correct and A+B) is not correct.
    //You may assume single letter variable names.
    
    Scanner s = new Scanner(System.in);
    
    System.out.println ("Enter a mathematical expression with parenthesis:  ");
    String x = s.nextLine();
    boolean error = false;
    
    for(int i = 0; i< x.length(); i++){
      if (x.charAt(i) == '(')
        stack.push(x.charAt(i));
      else if(x.charAt(i) == ')'){
        if (!stack.isEmpty())
          stack.pop();
        else
          error = true;
      }//end else if
    }//end for
    
    if((stack.isEmpty()) && !(error))
      System.out.println("Proper parenthesis.");
    else if((!stack.isEmpty()))
      System.out.println("Improper - too many left ( parenthesis.");
    else if (error)
      System.out.println("Improper - too many right ) parenthesis.");
  }//end main
}//end CharStack
