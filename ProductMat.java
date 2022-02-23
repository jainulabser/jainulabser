package challenge;

import java.util.Scanner;

public class ProductMat extends SixFive{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		AddMatrices obj=new AddMatrices();
		System.out.println("Give rows and column for Matrix 1");
		int arow, acol,brow,bcol;
		arow = sc.nextInt();
		acol = sc.nextInt();
		System.out.println("Give rows and column for Matrix 2");
		brow=sc.nextInt();
		bcol=sc.nextInt();
		int mat1[][] = new int[arow][acol];
	    int mat2[][] = new int[brow] [bcol];
		int mul[][]=new int[arow][bcol];

		if (acol == brow) {
			System.out.println("enter " + arow * acol + " values for mat 1");
			mat1 = obj.getElementMat(arow, acol);
			System.out.println("enter " + brow * bcol + " values for mat 1");
			mat2 = obj.getElementMat(brow, bcol);
			sc.close();
			mul = obj.productMat(mat1, mat2, arow,acol, bcol);
			obj.printMat(mul, arow, bcol);
		} else
			System.out.print("enter same number of col and rows");



	}

}
