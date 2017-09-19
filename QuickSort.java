/*
 * Algorithm for quick sort.
 * @Gigi Xiaowan Guo
 */
public class QuickSort implements SortingAlgorithm {
	int partition(int arr[], int low, int high) {
        int pivot = arr[high]; 
        int i = (low-1); 
        for (int j=low; j<high; j++) {
            
        	if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return i+1;
    }
 
    void qs(int arr[], int low, int high) {
        if (low < high) {
            int m = partition(arr, low, high);
            qs(arr, low, m-1);
            qs(arr, m+1, high);
        }
    }
	@Override
	public void sort(int[] a) {
		qs(a,0,a.length-1);
	}
}
