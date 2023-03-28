public class BubbleSort{

  public static int[] sort(int[] array){
    for (int i=0; i< array.length; i++){
      for (int j=0; j< array.length-i-1; j++){
        if (array[j] > array[j+1]){
          swap(array, j, j+1);
        }
      }
    }
    return array;
  }


  // helper: swap two elements in an array.
  public static void swap(int[] array, int one, int other){
    int temp = array[one];
    array[one] = array[other];
    array[other] = temp;
  }
}
