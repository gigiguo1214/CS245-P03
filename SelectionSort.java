/*
 * Algorithm for selection sort.
 * @Gigi Xiaowan Guo
 */
public class SelectionSort implements SortingAlgorithm {
	public void selectionSort(int[] arr){
         
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[index]) 
                    index = j;
      
            int smallerNumber = arr[index];  
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
    }

	@Override
	public void sort(int[] a) {	
        selectionSort(a);
	}

}


