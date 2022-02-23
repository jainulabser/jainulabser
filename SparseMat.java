package challenge;

public class SparseMat extends SixFive{
	int isSparse(int mat[][],int row,int col)
	{
		int count=0;
        for(int i = 0; i < row; i++){    
            for(int j = 0; j < col; j++){    
                if(mat[i][j] == 0)    
                    count++;    
                }    
            }   
		
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SparseMat obj = new SparseMat();
		System.out.print("Give rows and column");
		int a, b;
		a = obj.sc.nextInt();
		b = obj.sc.nextInt();
		int mat[][] = obj.getElementMat(a, b);
		if(obj.isSparse(mat,a,b)>a*b/2)
		{
			System.out.print("Yes it is Sparse Matrix");
		}
		else
			System.out.print("No it is not Sparse");
				
	}

}
