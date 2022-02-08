package challenge;

import java.util.Scanner;

public class OneEight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Give a number find biggest using ternary");
		Scanner sc=new Scanner(System.in);
		System.out.println("a");
		int a = sc.nextInt();
		System.out.println("b");
		int b=sc.nextInt();
		System.out.print((a>b)?a:b);
		sc.close();
	}

}
