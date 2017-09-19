/*
 * Algorithm for merge sort.
 * @Gigi Xiaowan Guo
 */
public class MergeSort implements SortingAlgorithm {
	
	//l = left, r= right m = middle
	public void merge(int arr[], int l, int m, int r) {
		
		// n1 = length of left side
		//n2 = length of right side 
		int n1 = m - l + 1;
		int n2 = r - m;

		int L[] = new int [n1];
		int R[] = new int [n2];

		for (int i=0; i<n1; ++i)
			L[i] = arr[l + i];
		for (int j=0; j<n2; ++j)
			R[j] = arr[m + 1+ j];

		int i = 0, j = 0;
		int k = l;
		
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			}
			else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}
		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}

		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}
	void ms(int arr[], int l, int r) {
	
		if (l < r) {
			int m = (l+r)/2;
			ms(arr, l, m);
			ms(arr , m+1, r);
			merge(arr, l, m, r);
		}
	}

	@Override
	public void sort(int[] a) {
		ms(a,0,a.length-1);
	}

}
