// Program 1 //
//Marrah Delmont
import java.util.*;
public class program1
{
  
   public static boolean isOperand(char c){
    if(
      (c>='a' && c<='z') ||
      (c>='A' && c<='Z') ||
      (c>='0' && c<='9')){
        return true;
      }else{
        return false;
      }
  }

  public static boolean isOperator(char c){
    return c=='+' || c=='-' || c=='*' || c=='/';
  }
  
  public static int precedenceOrder(char c){
    if(c == '*' || c == '/' ){
      return 2;
    }else {
      return 1;
    }
  }

    public static void main (String [] args)
    {
        CharStack stack = new CharStack();
        Scanner s = new Scanner(System.in);
    
        System.out.println("Please input your infix expression.");
        String x = s.nextLine();
        System.out.println("Infix: " + x);
        System.out.print("Postfix conversion: ");
        
        for(int i = 0; i< x.length(); i++)
        {
            if (isOperand(x.charAt(i))==true)
                System.out.print(x.charAt(i));//Wasn't paren or operation so just print
                
            else if ((x.charAt(i) == '('))  //If left paren, push onto stack
                stack.push(x.charAt(i));
                
            else if(x.charAt(i) == ')') //if right paren, pop until matching paren is discovered
            {
                while (stack.peek()!= '('){
                    System.out.print(stack.pop());
                }
                stack.pop();//Gets rid of ( on top of stack
            }//end else
            
            else if (isOperator(x.charAt(i))==true)
            {
                while(
                    !stack.isEmpty() &&
                    isOperator(stack.peek()) &&
                    precedenceOrder(stack.peek()) >= precedenceOrder(x.charAt(i)) ){
                    System.out.print(stack.pop());
                }
                stack.push(x.charAt(i)); 
            }
            
        }//end for
        
        while(!stack.isEmpty()){
            System.out.print(stack.pop());
        }
        
        System.out.println("");
        //System.out.println("Postfix conversion: " + stack);
    
    }//end main
}//end class program1