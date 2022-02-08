package challenge;

import java.util.*;

public class SixSix {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Give mar1 rows and column");
		short arow, acol, brow, bcol;
		arow = sc.nextShort();
		acol = sc.nextShort();
		System.out.print("Give mar2 rows and column");
		brow = sc.nextShort();
		bcol = sc.nextShort();
		short mat1[][] = new short[arow][acol];
		short mat2[][] = new short[brow][bcol];
		short mat3[][] = new short[arow][bcol];

		if (acol == brow) {
			System.out.println("enter " + arow * acol + " values for mat 1");
			for (int i = 0; i < arow; i++)
				for (int j = 0; j < acol; j++)
					mat1[i][j] = sc.nextShort();

			System.out.println("enter " + brow * bcol + " values for mat 2");
			for (int i = 0; i < brow; i++)
				for (int j = 0; j < bcol; j++)
					mat2[i][j] = sc.nextShort();
			sc.close();

			for (int i = 0; i < arow; i++) {
				for (int j = 0; j < bcol; j++) {
					mat3[i][j] = 0;
					for (int k = 0; k < acol; k++) {
						mat3[i][j] += mat1[i][k] * mat2[k][j];
					}
				}
			}
			for (int i = 0; i < arow; i++) {
				for (int j = 0; j < bcol; j++)
					System.out.print(mat3[i][j] + " ");

				System.out.println();
			}
		} else
			System.out.print("first matrix col not equal to second matrix rows");

	}
}
