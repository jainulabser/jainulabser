package challenge;

public class EqualMatrices extends SixFive {
	boolean isEqualMat(int mat1[][], int mat2[][], int rows, int column) {
		boolean flag = true;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < column; j++) {
				if (mat1[i][j] != mat2[i][j]) {
					flag = false;
					break;
				}
			}
		}
		return flag;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EqualMatrices obj = new EqualMatrices();
		System.out.print("Enter row and Column");
		int a = obj.sc.nextInt();
		int b = obj.sc.nextInt();
		int mat1[][], mat2[][];
		if (a == b) {
			System.out.println("Matrix 1:");
			mat1 = obj.getElementMat(a, b);
			System.out.println("Matrix 2:");
			mat2 = obj.getElementMat(a, b);
			System.out.print(obj.isEqualMat(mat1, mat2, a, b) ? "Equal" : "Not Equal");

		} else
			System.out.print("not Equal");
	}

}
