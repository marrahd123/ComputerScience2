public class BubbleSortTest2{
  public static void main(String[] args)
  {
    int [] array = new int[200000];
    for(int i=0; i<200000; i++){
      array[i] = 200000-i;
    }
    System.out.println("expect:\ttrue");
    int [] result = BubbleSort.sort(array);
    System.out.println("got:\t"+isAscending(result));
    printArray(array);
  }

  public static void printArray(int[] array){
    for(int i=0; i<array.length; i++){
      System.out.print(array[i]+" ");
    }
    System.out.println();
  }

  public static boolean isAscending(int[] array){
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
}
