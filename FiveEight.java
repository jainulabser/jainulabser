package challenge;

import java.util.Scanner;

public class FiveEight {
	public static long factorial(long n) {
		if (n == 1)
			return 1;
		else
			return n * (factorial(n - 1));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number to Find Sum of Natural Numbers");
		long n = sc.nextInt();
		sc.close();
		System.out.print(factorial(n));
	}

}
