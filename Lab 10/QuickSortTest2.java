public class QuickSortTest2
{
  public static void main(String[] args)
  {
    int array[] = new int[500000];
    for(int i=0; i<500000; i++)
    {
      array[i] = 500000-i;
    }
    System.out.println("expect:\ttrue");
    int []result = QuickSort.sort(array);
    System.out.println("got:\t"+isAscending(result));
    printArray(array);
    
  }//main
  
  public static boolean isAscending(int[] array)
  {
    boolean result = true;
    for(int i=0; i<array.length-1; i++){
      if(array[i] > array[i+1]){
        // not sorted
        result = false;
        break;
      }
    }
    return result;
  }
  
  public static void printArray(int[] array)
  {
    for(int i=0; i<array.length; i++)
    {
      System.out.print(array[i]+" ");
    }
    System.out.println();
  }
  
}//class

