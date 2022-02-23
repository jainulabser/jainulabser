package challenge;

import java.util.Scanner;

class ArrayMethods {

	Scanner sc = new Scanner(System.in);
	int arr[];
	int sum[][];
	int matrix[][];
	int oddEvenCount = 0;

	void getElement() {
		System.out.print("Enter how many elements to print");
		arr = new int[sc.nextInt()];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
	}

	void print(int arr[]) {
		for (int elements : arr) {
			System.out.print(elements + " ");
		}
	}

	void printMat(int[][] mat, int rows, int column) {
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < column; j++)
				System.out.print(mat[i][j] + " ");
			System.out.println();
		}
	}

	void large(int[] s) {

		int max = Integer.MIN_VALUE;
		int i = 0;
		do {
			s[i] = sc.nextInt();
			if (max < s[i])
				max = s[i];
		} while (++i < s.length);
		System.out.print(max);
	}

	void frequency(int arr[]) {

		for (int i = 0; i < arr.length; i++) {
			int max = arr[i];
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (max == arr[j])
					count++;

			}
			System.out.println(arr[i] + " : " + count);
		}
	}

	void oddNum(int a[]) {

		for (int i = 0; i < a.length; i++)
			if (a[i] % 2 == 0)
				continue;
			else {
				oddEvenCount++;
				System.out.print(a[i] + " ");
			}
	}

	void evenNum(int a[]) {
		for (int i = 0; i < a.length; i++)
			if (a[i] % 2 == 0) {
				oddEvenCount++;
				System.out.print(a[i] + " ");

			} else
				continue;
	}

	void leftRotate(int arr[]) {
		System.out.println("enter how many elements want rotate");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int j, first;

			first = arr[0];
			for (j = 0; j < arr.length - 1; j++) {

				arr[j] = arr[j + 1];
			}

			arr[j] = first;
		}

		System.out.println("Array after left rotation: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	void rightRotate(int arr[]) {
		System.out.println("enter how many elements want rotate");
		int n = sc.nextInt();
		int length = arr.length;
		for (int i = 0; i < n; i++) {
			int j, last;

			last = arr[length - 1];

			for (j = length - 1; j > 0; j--) {

				arr[j] = arr[j - 1];
			}

			arr[0] = last;
		}

		System.out.println("Array after right rotation: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	void dublicateElement(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			int max = arr[i];
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (max == arr[j])
					count++;

			}
			if (count > 1)
				System.out.println(arr[i] + "  ");
		}

	}

	void sortArray(int a[]) {
		int temp = 0;
		int total = arr.length;
		for (int i = 0; i < total; i++) {
			for (int j = i + 1; j < total; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
	}

	int removeDublicate(int a[]) {

		int n = a.length;
		int temp[] = new int[n];
		int j = 0;
		for (int i = 0; i < n - 1; i++) {
			if (a[i] != a[i + 1]) {
				temp[j++] = a[i];
			}
		}

		temp[j++] = a[n - 1];

		for (int i = 0; i < j; i++) {
			a[i] = temp[i];
		}
		return j;
	}

	void sumOfArray(int arr[]) {
		int sum = 0;
		for (int x : arr)
			sum += x;
		System.out.print(sum);
	}

	void sub(int[][] a, int[][] b, int rows, int column) {
		sum = new int[rows][column];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print(sum[i][j] = a[i][j] - b[i][j]);
			}
			System.out.println();
		}

	}

	int[][] productMat(int a[][], int b[][], int arow, int acol, int bcol) {
		sum = new int[arow][bcol];
		for (int i = 0; i < arow; i++) {
			for (int j = 0; j < bcol; j++) {
				sum[i][j] = 0;
				for (int k = 0; k < acol; k++) {
					sum[i][j] = sum[i][j] + a[i][k] * b[k][j];
				}
			}
		}
		return sum;
	}

}