package challenge;

import java.util.Scanner;

public class FiveNine {
	public static int findGcd(int a, int b) {
		if (a == b || b == 0)
			return a;
		else if (a == 0) {
			return b;
		} else if (b > a) {
			return findGcd(a, b - a);
		} else
			return findGcd(a - b, b);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Give Two Number to find GCD");
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		System.out.print(findGcd(a, b));
	}
}
