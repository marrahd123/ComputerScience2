package tests;
import maze.MyStack;

public class MyStackTest
{
    public static void main (String [] args)
    {
        MyStack<String> stack = new MyStack<String>();
        stack.add("A");
        stack.add("B");
        stack.add("C");
        System.out.println(stack.remove());
        System.out.println(stack.remove());
        System.out.println(stack.remove());
    }//end main
}//end class
