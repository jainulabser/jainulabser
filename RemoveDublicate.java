package challenge;

public class RemoveDublicate extends ArrayMethods {
	void print(int arr[], int end) {
		for (int i = 0; i < end; i++)
			System.out.print(arr[i] + " ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveDublicate obj = new RemoveDublicate();

		int a[];
		obj.getElement();
		a = obj.arr;
		obj.sortArray(a);
		int end = obj.removeDublicate(a);
		obj.print(a, end);

	}
}
