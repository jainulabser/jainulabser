

public class InsertionSort extends BubbleSort {
	private int arr[];

	private void sorting() {
		arr=setArray(arr);
		int n=arr.length;
		int min;
		for (int i = 0; i < n - 1; i++) {
			int j = i;
			while (j < n - 1) {
				if (arr[i] > arr[++j]) {
					min = arr[j];
					for (int k = j; k > i; k--) {
						arr[k] = arr[k - 1];
					}
					arr[i] = min;
				}
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	public static void main(String[] args) {
		InsertionSort insertion = new InsertionSort();
		insertion.sorting();
	}
}
