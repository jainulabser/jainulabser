package challenge;

import java.util.Scanner;

public class FiveSix {
	public static void check(int n) {
		int count = 0;
		for (int pNum = 2; pNum <= n; pNum++) {

			if (((pNum % 5 != 0) && (pNum % 7 != 0)) && (pNum == 2 || pNum == 3 || (pNum % 6 == 1 || pNum % 6 == 5)))
				if (isPrime(n - pNum)) {
					System.out.println("Yes it is Expressed by Two Prime Numbers");
					System.out.print(n - pNum + " " + pNum);
					count++;
					break;
				}
		}
		if (count == 0)
			System.out.print("No it is Not Expressed by Two Prime Numbers");
	}

	public static boolean isPrime(int n) {
		if (n == 1)
			return false;

		else if (((n % 5 != 0) && (n % 7 != 0)) && (n == 2 || n == 3 || (n % 6 == 1 || n % 6 == 5)))
			return true;

		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number to check it compined by two prime numbers");
		int num = sc.nextInt();
		sc.close();
		if (num == 1 || num == 2)
			System.out.println("No it is not expressed by Two Prime Numbers");
		else
			check(num);
	}

}
