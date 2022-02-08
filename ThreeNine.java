package challenge;

import java.util.Scanner;

public class ThreeNine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value to find factorial");
		long n = sc.nextInt();
		sc.close();
		for (int i = (int) (n - 1); i >= 1; i--)
			n *= i;
		System.out.println(n);

	}

}
