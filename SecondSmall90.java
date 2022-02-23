package challenge;

public class SecondSmall90 extends ArrayMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SecondSmall90 obj =new SecondSmall90();
		int a[];
		obj.getElement();
		a=obj.arr;
		obj.sortArray(a);
		obj.removeDublicate(a);
		System.out.print(a[1]);

	}
}
