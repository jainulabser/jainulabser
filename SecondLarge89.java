package challenge;

public class SecondLarge89 extends ArrayMethods{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SecondLarge89 obj =new SecondLarge89();
		int a[];
		obj.getElement();
		a=obj.arr;
		obj.sortArray(a);
		obj.removeDublicate(a);
		System.out.print(a[a.length-2]);
	}


}
