public class QuickSortTest {
	public static void main (String[] args) {
 		int n = Integer.parseInt(args[0]);
 		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = n - i;
 		}
	 	// sort
		QuickSort.sort(array);
		//printArray(array);
	}

	public static void printArray(int[] array){
		for(int i=0; i<array.length; i++){
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}
}
