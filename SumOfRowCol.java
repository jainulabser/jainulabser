package challenge;

public class SumOfRowCol extends SixFive {

	void sumOfRowCol(int mat[][],int rows)
	{
		int sumRow,sumCol;
		  for(int i = 0; i < rows; i++){    
	            sumRow = 0;    
	            for(int j = 0; j < mat[0].length; j++){    
	              sumRow = sumRow + mat[i][j];    
	            }    
	            System.out.println("Sum of " + (i+1) +" row: " + sumRow);    
	        }    
	            
	        //Calculates sum of each column of given matrix    
	        for(int i = 0; i < mat[0].length; i++){    
	            sumCol = 0;    
	            for(int j = 0; j < rows; j++){    
	              sumCol = sumCol + mat[j][i];    
	            }    
	            System.out.println("Sum of " + (i+1) +" column: " + sumCol);    
	        }    
	    }  
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumOfRowCol obj=new SumOfRowCol();
		System.out.println("Enter row and Col");
		int a=obj.sc.nextInt();
		int b=obj.sc.nextInt();
		int mat[][]=obj.getElementMat(a, b);
		obj.sumOfRowCol(mat, mat.length);
	}

}
