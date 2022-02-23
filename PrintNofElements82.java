package challenge;

import java.util.Scanner;

public class PrintNofElements82 {

	void printNofElements(int[] n) {
		int count = 0;
		for (int i=0;i<n.length;i++)
			count++;
		System.out.print(count);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		PrintNofElements82 obj = new PrintNofElements82();

		System.out.println("enter max in array");
		int[] s = new int[sc.nextInt()];
		for (int i = 0; i < s.length; i++)
			s[i] = sc.nextInt();

		obj.printNofElements(s);
		sc.close();

	}

}
