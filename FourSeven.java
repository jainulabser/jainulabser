package challenge;

import java.util.Scanner;

public class FourSeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter base and exponent to find power of that");
		System.out.print("Enter Base :");
		int base = sc.nextInt();
		System.out.print("Enter Expo :");
		int expo = sc.nextInt();
		sc.close();
		long pow = 1;
		while (expo-- != 0) {
			pow *= base;
		}
		System.out.print(pow);
	}

}
