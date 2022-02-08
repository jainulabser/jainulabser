package challenge;

import java.util.Scanner;

public class SevenThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many lines want to print");
		short line = sc.nextShort();
		sc.close();
		for (int i = 1; i <= line; i++) {
			for (int j = 1; j <= line; j++) {
				if (j == line - i + 1) {
					int k;
					for (k = j; k <= j + i - 1; k++)
						System.out.print(" " + k + " ");
					for (k = j + i - 2; k >= j; k--)
						System.out.print(" " + k + " ");

				} else
					System.out.print("   ");
			}
			System.out.println();
		}

	}

}
