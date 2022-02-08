package challenge;

import java.util.Scanner;

public class TwoThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int x = sc.nextInt();
		sc.close();
		System.out.println("x is " + x + "\n" + "x++ * 2 + 3 * --x = " + (x++ * 2 + 3 * --x));

	}

}
