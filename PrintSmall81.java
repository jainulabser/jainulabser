package challenge;

import java.util.Scanner;
class PrintSmall {

	static Scanner sc = new Scanner(System.in);

	public static void printSmall(int[] s) {
		int min = Integer.MAX_VALUE;
		int i = 0;
		do {
			s[i] = sc.nextInt();
			if (min > s[i])
				min = s[i];
		} while (++i < s.length);
		System.out.print(min);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter how many elements in array");
		int[] s = new int[sc.nextInt()];
		printSmall(s);
	}

}
