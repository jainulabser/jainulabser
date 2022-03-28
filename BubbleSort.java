import java.util.Scanner;

public class BubbleSort {
	private int arr[];
	private int n;
	public int[] setArray(int arr[])
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many Numbers want to Sort");
		n = scanner.nextInt();
		arr = new int[n];
		System.out.println("Enter " + n + " Numbers");
		for (int i = 0; i < n; i++) { // insert all values to arr named array
			arr[i] = scanner.nextInt();
		}
		scanner.close();	
		return arr;
	}

	private void sorting() {
		arr=setArray(arr);
		boolean flag;
		for (int i = 0; i < n - 1; i++) {
			flag = true;
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j + 1] < arr[j]) {
					int temp;
					temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
					flag = false;
				}
			}
			if (flag)
				break;
		}
		System.out.println("After Bubble Sorting");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		BubbleSort bubble = new BubbleSort();
		bubble.sorting();
	}
}
