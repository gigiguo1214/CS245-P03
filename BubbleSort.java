/*
 * Algorithm for bubble sort.
 * @Gigi Xiaowan Guo
 */

public class BubbleSort implements SortingAlgorithm {
	public void bubbleSort(int[] arr) {
	    for(int i = 0;i < arr.length - 1;++i)
	        for(int j = 0;j < arr.length-i-1;++j)
	            if(arr[j] > arr[j+1]){
	                int t = arr[j];
	                arr[i] = arr[j+1];
	                arr[j+1] = t;
	            }
    }

	@Override
	public void sort(int[] arr) {
		bubbleSort(arr);
	}
}
		
