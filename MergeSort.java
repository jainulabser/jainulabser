
public class MergeSort extends BubbleSort {

	private int arr[];

	private void sorting() {
		arr = setArray(arr);
		merging(arr, 0, arr.length - 1);
		print(arr);
	}

	protected void merging(int arr[], int left, int right) {

		if (left < right) {
			int mid = left + (right - left) / 2;
			merging(arr, left, mid);
			merging(arr, mid + 1, right);
			merge(arr, left, mid, right);
		}
	}

	protected void merge(int arr[], int left, int mid, int right) {
		int i, j, k;
		int nLeft = mid - left + 1;
		int nRight = right - mid;
		int leftArr[] = new int[nLeft];
		int rightArr[] = new int[nRight];

		for (i = 0; i < nLeft; i++) {
			leftArr[i] = arr[left + i];
		}
		for (j = 0; j < nRight; j++) {
			rightArr[j] = arr[mid + j + 1];
		}
		i = 0;
		j = 0;
		k = left;

		while (i < nLeft && j < nRight) {
			if (leftArr[i] <= rightArr[j]) {
				arr[k] = leftArr[i];
				i++;

			} else {
				arr[k] = rightArr[j];
				j++;
			}
			k++;
		}
		while (i < nLeft) {
			arr[k] = leftArr[i];
			i++;
			k++;
		}
		while (j < nRight) {
			arr[k] = rightArr[j];
			j++;
			k++;

		}
	}

	private void print(int arr[]) {
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
	}

	public static void main(String[] args) {
		MergeSort merge = new MergeSort();
		merge.sorting();

	}

}
