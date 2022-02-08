package challenge;

import java.util.Scanner;

public class FiveFour {
	private static void getPrime(int start, int end) {
		// TODO Auto-generated method stub
		for (int n = start; n <= end; n++) {
			if (n == 1)
				continue;
			if ((n % 5 != 0) && (n % 7 != 0) && (n == 2 || n == 3 || (n % 6 == 1 || n % 6 == 5))) {
				System.out.print(n + " ");
			}
		}

	}

	public static void main(String[] args) {
		{
		}
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Intevals to print prime in between");
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		getPrime(a, b);
	}

}
