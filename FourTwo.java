package challenge;

import java.util.Scanner;

public class FourTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two Value to find GCD");
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		if (!(a > b)) {
			int temp = a;
			a = b;
			b = temp;
		}
		while (b != 0) {
			int c;
			c = a % b;
			a = b;
			b = c;
		}
		System.out.println(a);

	}

}
