package challenge;

import java.util.*;

public class SixSeven {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Give rows and column");
		short a, b;
		a = sc.nextShort();
		b = sc.nextShort();
		short mat1[][] = new short[a][b];
		short mat2[][] = new short[b][a];

		System.out.println("enter " + a * b + " values for matrix");
		for (int i = 0; i < a; i++)
			for (int j = 0; j < b; j++)
				mat1[i][j] = sc.nextShort();
		sc.close();

		for (int i = 0; i < b; i++) {
			for (int j = 0; j < a; j++) {
				System.out.print((mat2[i][j] = mat1[j][i]) + " ");
			}
			System.out.println();
		}
	}
}
