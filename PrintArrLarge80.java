package challenge;

import java.util.Scanner;

public class PrintArrLarge80 {

	static Scanner sc = new Scanner(System.in);

	public static void printLarge(int[] s) {
		int max = Integer.MIN_VALUE;
		int i = 0;
		do {
			s[i] = sc.nextInt();
			if (max < s[i])
				max = s[i];
		} while (++i < s.length);
		System.out.print(max);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("enter how many elements in array");
		int[] s = new int[sc.nextInt()];
		printLarge(s);

	}

}
