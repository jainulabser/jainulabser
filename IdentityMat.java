package challenge;

import java.util.Scanner;

public class IdentityMat extends SixFive {
	boolean isIdentityMat(int mat[][], int row, int col) {
		boolean flag = true;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (i == j && mat[i][j] != 1) {
					flag = false;
					break;
				}
				if (i != j && mat[i][j] != 0) {
					flag = false;
					break;
				}
			}
		}

		return flag;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		IdentityMat obj = new IdentityMat();
		System.out.print("Give rows and column");
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		int mat[][] = new int[a][b];

		if (a == b) {
			System.out.println("enter " + a * b + " values for mat ");
			mat = obj.getElementMat(a, b);
			sc.close();
			if (obj.isIdentityMat(mat, a, b)) {
				System.out.print("Yes given matrix Is identity");
			} else
				System.out.print("No it is not");
		} else
			System.out.print("enter same number of col and rows");

	}

}
