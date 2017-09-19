/*
 * Algorithm for insertion sort.
 * @Gigi Xiaowan Guo
 */
public class InsertionSort implements SortingAlgorithm {
	
	public void insertionsort(int[] a) {
		for(int i = 1; i < a.length; i++) {
			int temp = a[i];
			int j = i - 1;
			while(j >= 0 && temp < a[j]) {
				a[j+1] = a[i];
				j--;
			}
			a[j+1] = temp;
		}
	}
	public void sort(int[] a) {
	    insertionsort(a);	
	}
	
}
