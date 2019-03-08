package maze;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Maze
{
  private int rows;
  private int cols;
  private Square start;
  private Square[][] grid;

  public Maze(String fileName) throws FileNotFoundException
  {
    Scanner scan = new Scanner(new File(fileName));
    cols = Integer.parseInt(scan.next());
    rows = Integer.parseInt(scan.next());

    grid = new Square[rows][cols];

    // remove line break;
    scan.nextLine();

    // read maze configuration
    for(int i=0; i<rows; i++)
    {
      String row = scan.nextLine();
      for(int j=0; j<cols; j++)
      {
        // create a square from the char representation
        SquareType type = SquareType.fromChar(row.charAt(j));
        Square s = new Square(type, i, j);
        grid[i][j] = s;

        // remember the square as "start" if it is the starting point
        if(type == SquareType.START)
        {
          start = s;
        }//if
        //System.out.print(row.charAt(j));
      }//for
      //System.out.println();
    }//for
  }//end maze

  public int getRows()
  {
    return rows;
  }//end getRows

  public int getColumns()
  {
    return cols;
  }//end getColumns

  public Square getStart()
  {
    return start;
  }//end getStart

  // return null if the location is out of bounds.
  public Square getSquare(int row, int col)
  {
    if(row < 0 || row >= rows || col < 0 || col >= cols)
    {
      return null;
    }//if
    else
    {
      return grid[row][col];
    }//else
  }//end getSquare

  public String toString()
  {
    String result = "";
    for(int i=0; i<rows; i++)
    {
      for(int j=0; j<cols; j++)
      {
        result += grid[i][j];
      }
      result += "\n";
    }//end for

    return result;
  }//end toString
  
}//end class