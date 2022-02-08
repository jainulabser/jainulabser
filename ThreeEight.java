package challenge;

import java.util.Scanner;

public class ThreeEight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to find sum of natural Numbers");
		int n = sc.nextInt();
		sc.close();
		System.out.println((n * (n + 1)) / 2);

	}

}
