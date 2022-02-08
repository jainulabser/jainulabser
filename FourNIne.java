package challenge;

import java.util.Scanner;

public class FourNIne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to check prime or not");
		int n = sc.nextInt();
		sc.close();

		if (n == 1)
			System.out.print("1 is not Prime");

		else if ((n % 5 != 0) && (n % 7 != 0) && (n == 2 || n == 3 || (n % 6 == 1 || n % 6 == 5)))
			System.out.print("Prime");

		else
			System.out.print("Not Prime");

	}
}
