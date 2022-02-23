package challenge;

public class LowerTriangleMat extends SixFive{

	void printTriangle(int mat[][],int row,int col)
	{
         
        for(int i = 0; i < row; i++){    
            for(int j = 0; j < col; j++){    
              if(j > i)    
                System.out.print("0 ");    
              else    
                System.out.print(mat[i][j] + " ");    
          }    
          System.out.println();    
      }  
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LowerTriangleMat obj = new LowerTriangleMat();
		System.out.print("Give rows and column");
		int a, b;
		a = obj.sc.nextInt();
		b = obj.sc.nextInt();
		int mat[][] = obj.getElementMat(a, b);
		 System.out.println("Lower triangular matrix: ");  
		obj.printTriangle(mat,a,b);

	}

}
