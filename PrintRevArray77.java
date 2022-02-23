package challenge;


public class PrintRevArray77 extends ArrayMethods {

	 void printrev(int[] s) {
		for (int i = s.length - 1; i >= 0; i--) {
			System.out.print(s[i] + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintRevArray77 obj=new PrintRevArray77();

		System.out.println("enter how many elements in array");
		int[] s = new int[obj.sc.nextInt()];
		for (int i = 0; i< s.length; i++) {
			s[i] = obj.sc.nextInt();
		}
		obj.printrev(s);

	}

}
