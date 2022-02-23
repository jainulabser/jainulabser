package challenge;

public class PrintOddEven extends ArrayMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintOddEven obj=new PrintOddEven();
		int a[];
		obj.getElement();
		a=obj.arr;
		System.out.println("Odd Numbers: ");
		obj.oddNum(a);
		System.out.println();
		System.out.println("Even Numbers: ");
		obj.evenNum(a);
		
	}

}
