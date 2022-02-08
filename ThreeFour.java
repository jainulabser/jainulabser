package challenge;

import java.util.Scanner;

public class ThreeFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Three Values check which is greater");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();
		System.out.print(((a > b && a > c) ? a : b > c ? b : c) + " is greater");
	}

}
