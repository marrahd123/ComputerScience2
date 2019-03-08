//Lab 8 main
import java.util.*;
import java.io.*;
public class Lab8
{
  public static void main(String[] args) throws InterruptedException, IOException
  {
    Scanner scan = new Scanner(new File("maze.txt"));
    int cols = Integer.parseInt(scan.next());
    int rows = Integer.parseInt(scan.next());
    char[][] maze = new char[rows][cols];

    for (int i=10; i>=0; i--)
    {
      System.out.println(i);
      Thread.sleep(1000);
      System.out.print("\033\143");
    }//for
    for(int row = 0; row < rows; row++)
    {
      for(int col = 0; col < cols; col++)
      {
        System.out.print(maze[row][col]);
      }//for
    System.out.println();
    }//for

  }//end main
}//end class

