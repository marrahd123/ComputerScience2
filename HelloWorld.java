public class HelloWorld
{
  public static void main (String [] args)
  {
    System.out.println("Hello World!");
    /////FOR LOOP///////
     for (int i = 9; i>0; i--)
     {
      System.out.println(i);
     }//for
    
    ////WHILE LOOP////////
     int a = 111;
    while (a>= 104)
    {
      System.out.println (a + " ");
      a--;
    }//while1
   ////////DO WHILE LOOP/////// 
     int x = 4;
    do 
    {
      System.out.println(x);
      x+=5;
    }//do
    while (x<=24);

  /////////WHILE / IF LOOP///////
    int z = 2;
    while (z<7)
    {
      System.out.println(z + " 0 ");
      z++;
      if (z==7)
      {
      System.out.println("7");
      }//if
    }//while2
  }//main
}//HelloWorld


