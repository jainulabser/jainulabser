package challenge;
import java.util.Scanner;
public class AddMatrices extends SixFive{

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		AddMatrices obj=new AddMatrices();
		System.out.print("Give rows and column");
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		int mat1[][] = new int[a][b];
	    int mat2[][] = new int[a][b];
		int add[][]=new int[a][b];

		if (a == b) {
			System.out.println("enter " + a * b + " values for mat 1");
			mat1 = obj.getElementMat(a, b);
			System.out.println("enter " + a * b + " values for mat 1");
			mat2 = obj.getElementMat(a, b);
			sc.close();
			obj.sum(mat1, mat2, a, b);
			obj.printMat(add, a, b);
		} else
			System.out.print("enter same number of col and rows");


		
	}
}
