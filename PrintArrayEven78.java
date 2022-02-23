package challenge;

public class PrintArrayEven78 extends ArrayMethods{

	void printEven(int[] s) {
		int i = 0;
		for (; i < s.length; i++) {
			s[i] = sc.nextInt();
		}
		i = 0;
		do {
			System.out.print(s[i] + " ");
		} while ((i += 2) < s.length);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintArrayEven78 obj=new PrintArrayEven78();

		System.out.println("enter how many elements in array");
		int[] s = new int[obj.sc.nextInt()];
		obj.printEven(s);

	}

}
