package challenge;

import java.util.Scanner;

public class FourOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to find Fibonacci Series");
		int num = sc.nextInt();
		sc.close();
		for (int i = 0, j = 1; i <= num; j += i) {
			System.out.print(i + " " + j + " ");
			i += j;
		}
	}
}
