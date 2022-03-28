

public class SelectionSort extends BubbleSort {
	private int arr[];

	private void sorting() {
		arr=setArray(arr);
		int n=arr.length;
		boolean isIncrement;

		for (int i = 0; i < n - 1; i++) {
			isIncrement = true;
			for (int j = i; j < n - 1; j++) {
				if (arr[i] > arr[j + 1]) {
					int temp = arr[i];
					arr[i] = arr[j + 1];
					arr[j + 1] = temp;
					isIncrement = false;
				}
			}
			if (isIncrement)
				break;
		}
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		SelectionSort selection = new SelectionSort();
		selection.sorting();

	}

}
