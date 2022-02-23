package challenge;



public class PrintArrOdd79 extends PrintArrayEven78{

	 void printOdd(int[] s) {
		int i = 1;
		do {
			System.out.print(s[i] + " ");
		} while ((i += 2) < s.length);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintArrOdd79 obj=new PrintArrOdd79(); 
		int[] s ;
		obj.getElement();
		s=obj.arr;
		obj.printOdd(s);

	}
}
