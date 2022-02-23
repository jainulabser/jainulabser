package challenge;

import java.util.*;

public class SixSeven extends ArrayMethods {
	void transposeMat(int a[][],int r,int c) {
		int b[][]=new int[c][r];
		for (int i = 0; i < c; i++) {
			for (int j = 0; j < r; j++) {
				System.out.print((b[i][j] = a[j][i]) + " ");
			}
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		SixSeven obj=new SixSeven();
		System.out.print("Give rows and column");
		short a, b;
		a = sc.nextShort();
		b = sc.nextShort();
		int mat1[][] = new int[a][b];

		System.out.println("enter " + a * b + " values for matrix");
		for (int i = 0; i < a; i++)
			for (int j = 0; j < b; j++)
				mat1[i][j] = sc.nextShort();
		sc.close();
		obj.transposeMat(mat1, a, b);

		
	}
}
