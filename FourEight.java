package challenge;

import java.util.Scanner;

public class FourEight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("enter number to reverse it");
		int n = sc.nextInt();
		int n1 = n;
		int rev = 0;
		sc.close();
		while (n1 != 0) {
			rev = rev * 10 + n1 % 10;
			n1 /= 10;
		}
		System.out.print((rev == n) ? "Palintrom" : "Not Palintrom");
	}

}