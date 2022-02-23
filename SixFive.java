package challenge;

import java.util.*;

public class SixFive extends ArrayMethods{
	Scanner sc = new Scanner(System.in);

	int[][] getElementMat(int rows, int column) {
		matrix = new int[rows][column];
		System.out.println("Enter "+ rows*column + " values");
		for (int i = 0; i < rows; i++)
			for (int j = 0; j < column; j++)
				matrix[i][j] = sc.nextInt();

		return matrix;

	}

	void sum(int[][] a, int[][] b, int rows, int column) {
		sum = new int[rows][column];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print((sum[i][j] = a[i][j] + b[i][j]) + " ");
			}
		System.out.println();
		}

	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SixFive obj = new SixFive();
		System.out.print("Give rows and column");
		int a, b;
		a = obj.sc.nextInt();
		b = obj.sc.nextInt();
		int mat1[][] = new int[a][b];
		int mat2[][] = new int[a][b];
		int sum[][] = new int[a][b];

		if (a == b) {
			System.out.println("enter " + a * b + " values for mat 1");
			mat1 = obj.getElementMat(a, b);
			System.out.println("enter " + a * b + " values for mat 1");
			mat2 = obj.getElementMat(a, b);
			obj.sc.close();
			obj.sum(mat1, mat2, a, b);
			obj.printMat(sum, a, b);

		} else
			System.out.print("enter same number of col and rows");

	}

}
