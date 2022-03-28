import java.util.Scanner;

public class QuickSort extends MergeSort {
	private int arr[]= {5,4,3,2,1};
	private int minArray[]=new int[10];
	private int maxArray[]=new int[10];

	private void sorting() {
		quickSort();
	}

	private void quickSort() {
		int pivot,i,j,k;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Your pivot value between" + (arr.length - 1));
		pivot = scanner.nextInt();
		scanner.close();

		for ( i = 0, j = 0, k = 0; k < arr.length;) {
			if (arr[i] < arr[pivot]) {
				minArray[i] = arr[k];
				i++;
				k++;
			} else {
				maxArray[j] = arr[k];
				j++;
				k++;
			}

		}
		merging(minArray, 0, minArray.length - 1);
		merging(maxArray, 0, minArray.length - 1);
		
	}

	public static void main(String[] args) {
		QuickSort quick = new QuickSort();
		quick.sorting();

	}

}
