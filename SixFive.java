package challenge;

import java.util.*;

public class SixFive {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Give rows and column");
		short a, b;
		a = sc.nextShort();
		b = sc.nextShort();
		short mat1[][] = new short[a][b];
		short mat2[][] = new short[a][b];

		if (a == b) {
			System.out.println("enter " + a * b + " values for mat 1");
			for (int i = 0; i < a; i++)
				for (int j = 0; j < b; j++)
					mat1[i][j] = sc.nextShort();

			System.out.println("enter " + a * b + " values for mat 2");
			for (int i = 0; i < a; i++)
				for (int j = 0; j < b; j++)
					mat2[i][j] = sc.nextShort();
			System.out.println("After adding");
			sc.close();

			for (int i = 0; i < a; i++) {
				for (int j = 0; j < b; j++) {
					System.out.print(mat1[i][j] + mat2[i][j] + " ");
				}
				System.out.println();
			}
		} else
			System.out.print("enter same number of col and rows");

	}

}
