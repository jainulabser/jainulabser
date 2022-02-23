package challenge;

public class TranspostMat95 extends SixSeven{
	
	int[][] getElementMat(int rows, int column) {
		matrix = new int[rows][column];
		for (int i = 0; i < rows; i++)
			for (int j = 0; j < column; j++)
				matrix[i][j] = sc.nextInt();

		return matrix;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TranspostMat95 obj=new TranspostMat95();
		System.out.println("enter rows and Column");
		int a[][];
		int row,col;
		row=obj.sc.nextInt();
		col=obj.sc.nextInt();
		a=obj.getElementMat(row, col);
		System.out.println("Enter "+row*col+" numbers");
		obj.transposeMat(a, row, col);

	}

}
